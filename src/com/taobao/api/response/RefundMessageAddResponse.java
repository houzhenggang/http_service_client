package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RefundMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.message.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class RefundMessageAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7456459794139466772L;

	/** 
	 * �˿���Ϣ������id��created
	 */
	@ApiField("refund_message")
	private RefundMessage refundMessage;

	public void setRefundMessage(RefundMessage refundMessage) {
		this.refundMessage = refundMessage;
	}
	public RefundMessage getRefundMessage( ) {
		return this.refundMessage;
	}

}
