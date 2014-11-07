package com.taobao.api.internal.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.taobao.api.Constants;
import com.taobao.api.internal.util.codec.Base64;
import com.taobao.api.internal.util.json.JSONReader;

/**
 * ϵͳ�����ࡣ
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class TaobaoUtils {

	private TaobaoUtils() {}

	/**
	 * ��TOP����ǩ����
	 * 
	 * @param requestHolder �����ַ��͵�TOP�������
	 * @param secret ǩ����Կ
	 * @return ǩ��
	 * @throws IOException
	 */
	public static String signTopRequest(RequestParametersHolder requestHolder, String secret)
			throws IOException {
		// ��һ�������ֵ䰴Key����ĸ˳������
		Map<String, String> sortedParams = new TreeMap<String, String>(requestHolder.getApplicationParams());
		sortedParams.putAll(requestHolder.getProtocalMustParams());
		sortedParams.putAll(requestHolder.getProtocalOptParams());
		
		Set<Entry<String, String>> paramSet = sortedParams.entrySet();

		// �ڶ����������в������Ͳ���ֵ����һ��
		StringBuilder query = new StringBuilder(secret);
		for (Entry<String, String> param : paramSet) {
			if (StringUtils.areNotEmpty(param.getKey(), param.getValue())) {
				query.append(param.getKey()).append(param.getValue());
			}
		}

		// ��������ʹ��MD5����
		byte[] bytes = encryptMD5(query.toString());

		// ���Ĳ����Ѷ�����ת��Ϊ��д��ʮ������
		return byte2hex(bytes);
	}

	/**
	 * ��TOP����ǩ����
	 * 
	 * @param requestHolder �����ַ��͵�TOP�������
	 * @param secret ǩ����Կ
	 * @param isHmac �Ƿ�ΪHMAC��ʽ����
	 * @return ǩ��
	 * @throws IOException
	 */
	public static String signTopRequestNew(RequestParametersHolder requestHolder, String secret, boolean isHmac)
			throws IOException {
		// ��һ�������ֵ䰴Key����ĸ˳������
		Map<String, String> sortedParams = new TreeMap<String, String>(requestHolder.getApplicationParams());
		sortedParams.putAll(requestHolder.getProtocalMustParams());
		sortedParams.putAll(requestHolder.getProtocalOptParams());

		Set<Entry<String, String>> paramSet = sortedParams.entrySet();

		// �ڶ����������в������Ͳ���ֵ����һ��
		StringBuilder query = new StringBuilder();
		if (!isHmac) {
			query.append(secret);
		}
		for (Entry<String, String> param : paramSet) {
			if (StringUtils.areNotEmpty(param.getKey(), param.getValue())) {
				query.append(param.getKey()).append(param.getValue());
			}
		}

		// ��������ʹ��MD5/HMAC����
		byte[] bytes;
		if (isHmac) {
			bytes = encryptHMAC(query.toString(), secret);
		} else {
			query.append(secret);
			bytes = encryptMD5(query.toString());
		}

		// ���Ĳ����Ѷ�����ת��Ϊ��д��ʮ������
		return byte2hex(bytes);
	}

	private static byte[] encryptHMAC(String data, String secret) throws IOException {
		byte[] bytes = null;
		try {
			SecretKey secretKey = new SecretKeySpec(secret.getBytes(Constants.CHARSET_UTF8), "HmacMD5");
			Mac mac = Mac.getInstance(secretKey.getAlgorithm());
			mac.init(secretKey);
			bytes = mac.doFinal(data.getBytes(Constants.CHARSET_UTF8));
		} catch (GeneralSecurityException gse) {
			throw new IOException(gse.getMessage());
		}
		return bytes;
	}

	private static byte[] encryptMD5(String data) throws IOException {
		byte[] bytes = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			bytes = md.digest(data.getBytes(Constants.CHARSET_UTF8));
		} catch (GeneralSecurityException gse) {
			throw new IOException(gse.getMessage());
		}
		return bytes;
	}

	private static String byte2hex(byte[] bytes) {
		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				sign.append("0");
			}
			sign.append(hex.toUpperCase());
		}
		return sign.toString();
	}

	/**
	 * ��֤TOP�ص���ַ��ǩ���Ƿ�Ϸ���Ҫ�����в�����Ϊ��URL������ġ�
	 * 
	 * @param topParams TOP˽�в�����δ��BASE64���ܣ�
	 * @param topSession TOP˽�лỰ��
	 * @param topSign TOP�ص�ǩ��
	 * @param appKey Ӧ�ù�Կ
	 * @param appSecret Ӧ����Կ
	 * @return ��֤�ɹ�����true�����򷵻�false
	 * @throws IOException
	 */
	public static boolean verifyTopResponse(String topParams, String topSession, String topSign,
			String appKey, String appSecret) throws IOException {
		StringBuilder result = new StringBuilder();
		result.append(appKey).append(topParams).append(topSession).append(appSecret);
		byte[] bytes = encryptMD5(result.toString());
		Base64 encoder = new Base64();
		return new String(encoder.encode(bytes)).equals(topSign);
	}

	/**
	 * ��ȡTOP�����ص������ģ���������ʽ�����µĿͻ���Ӧ�á�
	 * 
	 * @param authCode ��Ȩ��
	 * @return TOP����������
	 * @throws IOException �����Ȩ���Ѿ����ڻ����������ɷ���
	 */
	public static TaobaoContext getTopContext(String authCode) throws IOException {
		String url = getProductClientSessionUrl(authCode);
		String rsp = WebUtils.doGet(url, null, Constants.CHARSET_UTF8);
		if (StringUtils.isEmpty(rsp)) {
			return null;
		}

		TaobaoContext context = new TaobaoContext();

		Set<Entry<String, String>> paramSet = WebUtils.splitUrlQuery(rsp).entrySet();
		for (Entry<String, String> param : paramSet) {
			if (TaobaoContext.PARAMETERS.equals(param.getKey())) {
				context.addParameters(decodeTopParams(param.getValue()));
			} else {
				context.addParameter(param.getKey(), param.getValue());
			}
		}

		return context;
	}

	/**
	 * ����TOP�ص�����Ϊ��ֵ�ԡ�
	 * 
	 * @param topParams ����BASE64������ַ���
	 * @return ��ֵ��
	 * @throws IOException
	 */
	public static Map<String, String> decodeTopParams(String topParams) throws IOException {
		if (StringUtils.isEmpty(topParams)) {
			return null;
		}

		Base64 decoder = new Base64();		
		byte[] buffer = decoder.decode(WebUtils.decode(topParams).getBytes());
		String originTopParams = new String(buffer, Constants.CHARSET_GBK);

		return WebUtils.splitUrlQuery(originTopParams);
	}

	/**
	 * ��ȡɳ�价���¿ͻ���Ӧ�õ������ġ�
	 * 
	 * @param appKey Ӧ�ñ���
	 * @param nick �û��ǳ�
	 * @return Ӧ�õ�������
	 * @throws IOException
	 
	public static TaobaoContext getSandboxContext(String appKey, String nick) throws IOException {
		Map<String, String> authParams = new HashMap<String, String>();
		authParams.put("appkey", appKey);
		authParams.put("nick", nick);
		authParams.put("zhxz", "1");

		String response = WebUtils.doPost(Constants.SANDBOX_AUTHORIZE_URL, authParams);
		String authRegex = "<input type=\"text\" id=\"autoInput\" value=\"(.+?)\" style=\".+?\">";
		Pattern pattern = Pattern.compile(authRegex);
		Matcher matcher = pattern.matcher(response);
		if (matcher.find()) {
			String authCode = matcher.group(1);
			String sessionUrl = getSandboxSessionUrl(authCode);
			String rsp = WebUtils.doGet(sessionUrl, null);

			TaobaoContext context = new TaobaoContext();
			context.setCallbackUrl(rsp);

			Set<Entry<String, String>> paramSet = WebUtils.splitUrlQuery(rsp).entrySet();
			for (Entry<String, String> param : paramSet) {
				if (TaobaoContext.PARAMETERS.equals(param.getKey())) {
					context.addParameters(decodeTopParams(param.getValue()));
				} else {
					context.addParameter(param.getKey(), param.getValue());
				}
			}

			return context;
		} else {
			return null;
		}
	}
*/
	/**
	 * ������Ȩ���ȡɳ�价��SessionKey�ĵ�ַ��
	 * 
	 * @param authCode ��Ȩ��
	 * @return ��ַ
	 
	public static String getSandboxSessionUrl(String authCode) {
		StringBuilder url = new StringBuilder(Constants.SANDBOX_CONTAINER_URL);
		url.append("?authcode=").append(authCode);
		return url.toString();
	}
*/
	/**
	 * ����Ӧ�ñ�Ż�ȡ��ʽ����WEBӦ��SessionKey�ĵ�ַ��
	 * 
	 * @param appKey Ӧ�ñ��
	 * @return ��ַ
	 */
	public static String getProductWebSessionUrl(String appKey) {
		StringBuilder url = new StringBuilder(Constants.PRODUCT_CONTAINER_URL);
		url.append("?appkey=").append(appKey);
		return url.toString();
	}

	/**
	 * ����Ӧ�ñ�Ż�ȡ��ʽ�����ͻ���Ӧ��SessionKey�ĵ�ַ��
	 * 
	 * @param authCode ��Ȩ��
	 * @return ��ַ
	 */
	public static String getProductClientSessionUrl(String authCode) {
		StringBuilder url = new StringBuilder(Constants.PRODUCT_CONTAINER_URL);
		url.append("?authcode=").append(authCode);
		return url.toString();
	}

	/**
	 * ��ȡ�ļ�����ʵ��׺����Ŀǰֻ֧��JPG, GIF, PNG, BMP����ͼƬ�ļ���
	 * 
	 * @param bytes �ļ��ֽ���
	 * @return JPG, GIF, PNG or null
	 */
	public static String getFileSuffix(byte[] bytes) {
		if (bytes == null || bytes.length < 10) {
			return null;
		}

		if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
			return "GIF";
		} else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
			return "PNG";
		} else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
			return "JPG";
		} else if (bytes[0] == 'B' && bytes[1] == 'M') {
			return "BMP";
		} else {
			return null;
		}
	}

	/**
	 * ��ȡ�ļ�����ʵý�����͡�Ŀǰֻ֧��JPG, GIF, PNG, BMP����ͼƬ�ļ���
	 * 
	 * @param bytes �ļ��ֽ���
	 * @return ý������(MEME-TYPE)
	 */
	public static String getMimeType(byte[] bytes) {
		String suffix = getFileSuffix(bytes);
		String mimeType;

		if ("JPG".equals(suffix)) {
			mimeType = "image/jpeg";
		} else if ("GIF".equals(suffix)) {
			mimeType = "image/gif";
		} else if ("PNG".equals(suffix)) {
			mimeType = "image/png";
		} else if ("BMP".equals(suffix)) {
			mimeType = "image/bmp";
		}else {
			mimeType = "application/octet-stream";
		}

		return mimeType;
	}

	/**
	 * ����ֵ���ֵΪ�յ��
	 * 
	 * @param <V> ����
	 * @param map ��������ֵ�
	 * @return �������ֵ�
	 */
	public static <V> Map<String, V> cleanupMap(Map<String, V> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, V> result = new HashMap<String, V>(map.size());
		Set<Entry<String, V>> entries = map.entrySet();

		for (Entry<String, V> entry : entries) {
			if (entry.getValue() != null) {
				result.put(entry.getKey(), entry.getValue());
			}
		}

		return result;
	}

	/**
	 * ��JSON�ַ���ת��ΪMap�ṹ��
	 * 
	 * @param body JSON�ַ���
	 * @return Map�ṹ
	 */
	public static Map<?, ?> parseJson(String body) {
		JSONReader jr = new JSONReader();
		Object obj = jr.read(body);
		if (obj instanceof Map<?, ?>) {
			return (Map<?, ?>) obj;
		} else {
			return null;
		}
	}

}
