package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Refund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-25 11:30:27.0
 */
public class RefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8352314343817833878L;

	/** 
	 * �������Ľ�����Ϣ�б�
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
