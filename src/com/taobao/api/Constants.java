package com.taobao.api;

/**
 * ���ó����ࡣ
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class Constants {

	/** TOPĬ��ʱ���ʽ **/
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/** TOP DateĬ��ʱ�� **/
	public static final String DATE_TIMEZONE = "GMT+8";

	/** UTF-8�ַ��� **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** GBK�ַ��� **/
	public static final String CHARSET_GBK = "GBK";

	/** TOP JSON Ӧ��ʽ */
	public static final String FORMAT_JSON = "json";
	/** TOP XML Ӧ��ʽ */
	public static final String FORMAT_XML = "xml";

	/** MD5ǩ����ʽ */
	public static final String SIGN_METHOD_MD5 = "md5";
	/** HMACǩ����ʽ */
	public static final String SIGN_METHOD_HMAC = "hmac";

	/** TOP��ʽ������Ȩ��ص�ַ */
	public static final String PRODUCT_AUTHORIZE_URL = "http://auth.open.taobao.com/";
	public static final String PRODUCT_CONTAINER_URL = "http://container.open.taobao.com/container";

	/** TOPɳ�价����Ȩ��ص�ַ */
	public static final String SANDBOX_AUTHORIZE_URL = "http://open.taobao.com/isv/authorize.php";
	public static final String SANDBOX_CONTAINER_URL = "http://container.api.tbsandbox.com/container";

	/** SDK�汾�� */
	public static final String SDK_VERSION = "top-sdk-java-20110804";

}
