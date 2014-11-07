package com.taobao.api.internal.mapping;

import java.util.List;

import com.taobao.api.ApiException;

/**
 * ��ʽת������
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Reader {

	/**
	 * �жϷ��ؽ���Ƿ����ָ�������ԡ�
	 * 
	 * @param name ��������
	 * @return true/false
	 */
	public boolean hasReturnField(Object name);

	/**
	 * ��ȡ������������
	 * 
	 * @param name ӳ������
	 * @return ��������ֵ
	 */
	public Object getPrimitiveObject(Object name);

	/**
	 * ��ȡ�����Զ������
	 * 
	 * @param name ӳ������
	 * @param type ӳ������
	 * @return ӳ�����͵�ʵ��
	 * @throws TopException
	 */
	public Object getObject(Object name, Class<?> type) throws ApiException;

	/**
	 * ��ȡ��������ֵ��
	 * 
	 * @param listName �б�����
	 * @param itemName ӳ������
	 * @param subType Ƕ��ӳ������
	 * @return Ƕ��ӳ������ʵ���б�
	 * @throws TopException
	 */
	public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws ApiException;

}
