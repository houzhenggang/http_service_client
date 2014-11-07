package com.taobao.api;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.WebUtils;

/**
 * ����REST��TOP�ͻ��ˡ�
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class DefaultTaobaoClient implements TaobaoClient {

	private static final String APP_KEY = "app_key";
	private static final String FORMAT = "format";
	private static final String METHOD = "method";
	private static final String TIMESTAMP = "timestamp";
	private static final String VERSION = "v";
	private static final String SIGN = "sign";
	private static final String SIGN_METHOD = "sign_method";
	private static final String PARTNER_ID = "partner_id";
	private static final String SESSION = "session";

	private String serverUrl;
	private String appKey;
	private String appSecret;
	private String format = Constants.FORMAT_JSON;
	private String signMethod = Constants.SIGN_METHOD_HMAC;

	private int connectTimeout = 0;
	private int readTimeout = 0;

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.serverUrl = serverUrl;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format) {
		this(serverUrl, appKey, appSecret);
		this.format = format;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, appKey, appSecret, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
		this(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
		this.signMethod = signMethod;
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws ApiException {
		return execute(request, null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
		TaobaoParser<T> parser;
		if (Constants.FORMAT_XML.equals(this.format)) {
			parser = new ObjectXmlParser<T>(request.getResponseClass());
		} else {
			parser = new ObjectJsonParser<T>(request.getResponseClass());
		}
		return _execute(request, parser, session);
	}

	private <T extends TaobaoResponse> T _execute(TaobaoRequest<T> request, TaobaoParser<T> parser, String session) throws ApiException {
		Map<String, Object> rt = doPost(request, session);
		if (rt == null) return null;

		T tRsp = null;
		try {
			tRsp = parser.parse((String) rt.get("rsp"));
			tRsp.setBody((String) rt.get("rsp"));
		} catch (RuntimeException e) {
			TaobaoLogger.logBizError((String) rt.get("rsp"));
			throw e;
		}

		tRsp.setParams((TaobaoHashMap) rt.get("textParams"));
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logErrorScene(rt, tRsp, appSecret);
		}
		return tRsp;
	}

	private <T extends TaobaoResponse> Map<String, Object> doPost(TaobaoRequest<T> request, String session) throws ApiException {
		Map<String, Object> result = new HashMap<String, Object>();
		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// ���Э�鼶�������
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(METHOD, request.getApiMethodName());
		protocalMustParams.put(VERSION, "2.0");
		protocalMustParams.put(APP_KEY, appKey);
		Long timestamp = request.getTimestamp();// �����û�����ʱ���
		if (timestamp == null) {
			timestamp = new Date().getTime();
		}
		DateFormat df = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
		df.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
		protocalMustParams.put(TIMESTAMP, df.format(new Date(timestamp)));// ��Ϊɳ��Ŀǰֻ֧��ʱ���ַ�����������ʱ��Date��ʽ
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(FORMAT, format);
		protocalOptParams.put(SIGN_METHOD, signMethod);
		protocalOptParams.put(SESSION, session);
		protocalOptParams.put(PARTNER_ID, Constants.SDK_VERSION);
		requestHolder.setProtocalOptParams(protocalOptParams);

		// ���ǩ������
		try {
			if (Constants.SIGN_METHOD_MD5.equals(signMethod)) {
				protocalMustParams.put(SIGN, TaobaoUtils.signTopRequestNew(requestHolder, appSecret, false));
			} else if (Constants.SIGN_METHOD_HMAC.equals(signMethod)) {
				protocalMustParams.put(SIGN, TaobaoUtils.signTopRequestNew(requestHolder, appSecret, true));
			} else {
				protocalMustParams.put(SIGN, TaobaoUtils.signTopRequest(requestHolder, appSecret));
			}
		} catch (IOException e) {
			throw new ApiException(e);
		}

		StringBuffer urlSb = new StringBuffer(serverUrl);
		try {
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), WebUtils.DEFAULT_CHARSET);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), WebUtils.DEFAULT_CHARSET);

			urlSb.append("?");
			urlSb.append(sysMustQuery);
			if (sysOptQuery != null & sysOptQuery.length() > 0) {
				urlSb.append("&");
				urlSb.append(sysOptQuery);
			}
		} catch (IOException e) {
			throw new ApiException(e);
		}

		String rsp = null;
		try {
			// �Ƿ���Ҫ�ϴ��ļ�
			if (request instanceof TaobaoUploadRequest) {
				TaobaoUploadRequest<T> uRequest = (TaobaoUploadRequest<T>) request;
				Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
				rsp = WebUtils.doPost(urlSb.toString(), appParams, fileParams, connectTimeout, readTimeout);
			} else {
				rsp = WebUtils.doPost(urlSb.toString(), appParams, connectTimeout, readTimeout);
			}
		} catch (IOException e) {
			throw new ApiException(e);
		}
		result.put("rsp", rsp);
		result.put("textParams", appParams);
		result.put("protocalMustParams", protocalMustParams);
		result.put("protocalOptParams", protocalOptParams);
		result.put("url", urlSb.toString());
		return result;
	}

}
