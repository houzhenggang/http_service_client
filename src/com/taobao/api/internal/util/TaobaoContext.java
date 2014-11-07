package com.taobao.api.internal.util;

import java.util.HashMap;
import java.util.Map;

/**
 * TAOBAO���������ġ�
 * 
 * @author carver.gu
 * @since 1.0, Oct 15, 2009
 */
public class TaobaoContext {

	public static final String APPKEY = "top_appkey";
	public static final String SESSION = "top_session";
	public static final String SIGNATURE = "top_sign";
	public static final String PARAMETERS = "top_parameters";
	public static final String USER_ID = "visitor_id";
	public static final String USER_NICK = "visitor_nick";

	private Map<String, String> parameters = new HashMap<String, String>();
	private String callbackUrl;

	/**
	 * ��ȡӦ�ñ�š�
	 * 
	 * @return Ӧ�ñ��
	 */
	public String getAppKey() {
		return getParameter(APPKEY);
	}

	/**
	 * ��ȡ��Ȩ�롣
	 * 
	 * @return ��Ȩ��
	 */
	public String getSessionKey() {
		return getParameter(SESSION);
	}

	/**
	 * ��ȡ�ص�ǩ����
	 * 
	 * @return �ص�ǩ��
	 */
	public String getSignature() {
		return getParameter(SIGNATURE);
	}

	/**
	 * ��ȡ�Ա��û���š�
	 * 
	 * @return �Ա��û����
	 */
	public Long getUserId() {
		String userId = getParameter(USER_ID);
		if (StringUtils.isEmpty(userId)) {
			return null;
		} else {
			return Long.valueOf(userId);
		}
	}

	/**
	 * ��ȡ�Ա��û��ǳơ�
	 * 
	 * @return �Ա��û��ǳ�
	 */
	public String getUserNick() {
		return getParameter(USER_NICK);
	}

	/**
	 * ��ȡָ��������ֵ��
	 * 
	 * @param key ������
	 * @return ����ֵ
	 */
	public String getParameter(String key) {
		return this.parameters.get(key);
	}

	/**
	 * ������Ӳ�����
	 * 
	 * @param parameters ����ӳ��
	 */
	public void addParameters(Map<String, String> parameters) {
		if (parameters != null && !parameters.isEmpty()) {
			this.parameters.putAll(parameters);
		}
	}

	/**
	 * ���һ��������
	 * 
	 * @param key ������
	 * @param value ����ֵ
	 */
	public void addParameter(String key, String value) {
		this.parameters.put(key, value);
	}

	/**
	 * ��ȡTOP�ص�������URL������
	 */
	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

}
