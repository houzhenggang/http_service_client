package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.offline.send response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-25 13:49:41.0
 */
public class LogisticsOfflineSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1439852864193479781L;

	/** 
	 * ���ط����Ƿ�ɹ�is_success
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
