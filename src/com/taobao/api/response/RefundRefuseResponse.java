package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Refund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.refuse response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class RefundRefuseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1399291299877212399L;

	/** 
	 * �ܾ��˿�ɹ��󣬻᷵��Refund���ݽṹ�е�refund_id, status, modified�ֶ�
	 */
	@ApiField("refund")
	private Refund refund;

	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	public Refund getRefund( ) {
		return this.refund;
	}

}
