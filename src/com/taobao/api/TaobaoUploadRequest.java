package com.taobao.api;

import java.util.Map;

/**
 * TOP�ϴ�����ӿڣ�֧��ͬʱ�ϴ�����ļ���
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TaobaoUploadRequest<T extends TaobaoResponse> extends TaobaoRequest<T> {

	/**
	 * ��ȡ���е�Key-Value��ʽ���ļ�����������ϡ����У�
	 * <ul>
	 * <li>Key: ���������</li>
	 * <li>Value: ��������ļ�Ԫ����</li>
	 * </ul>
	 * 
	 * @return �ļ������������
	 */
	public Map<String, FileItem> getFileParams();

}
