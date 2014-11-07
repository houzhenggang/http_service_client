package com.taobao.api.internal.mapping;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoResponse;

/**
 * ��̬��ʽת������
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Converter {

	/**
	 * ���ַ���ת��Ϊ��Ӧ����
	 * 
	 * @param <T> ������
	 * @param rsp ��Ӧ�ַ���
	 * @param clazz ��������
	 * @return ��Ӧ����
	 * @throws TopException
	 */
	public <T  extends TaobaoResponse> T toResponse(String rsp, Class<T> clazz) throws ApiException;

}
