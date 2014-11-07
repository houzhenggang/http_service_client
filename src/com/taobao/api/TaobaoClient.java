package com.taobao.api;


/**
 * TAOBAO�ͻ��ˡ�
 * 
 * @author carver.gu <a href="mailto:opensupport@taobao.com">opensupport</a>
 * @since 1.0, Sep 12, 2009
 */
public interface TaobaoClient {
	
	/**
	 * ִ��TOP����API����
	 * @param <T>
	 * @param request �����TOP����
	 * @return
	 * @throws ApiException
	 */
	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws ApiException ;
	/**
	 * ִ��TOP��˽API����
	 * @param <T>
	 * @param request �����TOP����
	 * @param session �û��Ự��Ȩ��
	 * @return
	 * @throws ApiException
	 */
	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException ;
}
