package com.taobao.api;

import java.util.Map;

/**
 * TOP����ӿڡ�
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TaobaoRequest<T extends TaobaoResponse> {

	/**
	 * ��ȡTOP��API���ơ�
	 * 
	 * @return API����
	 */
	public String getApiMethodName();

	/**
	 * ��ȡ���е�Key-Value��ʽ���ı�����������ϡ����У�
	 * <ul>
	 * <li>Key: ���������</li>
	 * <li>Value: �������ֵ</li>
	 * </ul>
	 * 
	 * @return �ı������������
	 */
	public Map<String, String> getTextParams();

	/**
	 * @return ָ����Ĭ�ϵ�ʱ���
	 */
	public Long getTimestamp();

	/**
	 * ����ʱ��������������,��������ʱ��ʹ�õ�ʱ��ʱ�䡣
	 * 
	 * @param timestamp ʱ���
	 */
	public void setTimestamp(Long timestamp);

	public Class<T> getResponseClass();

}
