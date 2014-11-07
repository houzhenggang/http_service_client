package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.online.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class LogisticsOnlineConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2672315416712275224L;

	/** 
	 * ֻ����is_success���Ƿ�ɹ���
	 */
	@ApiField("shipping")
	private Shipping shipping;

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Shipping getShipping( ) {
		return this.shipping;
	}

}
