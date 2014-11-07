package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.RefundMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.messages.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class RefundMessagesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3279826921158319698L;

	/** 
	 * ������������ƾ֤��Ϣ�б�
	 */
	@ApiListField("refund_messages")
	@ApiField("refund_message")
	private List<RefundMessage> refundMessages;

	/** 
	 * ������������ƾ֤����
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRefundMessages(List<RefundMessage> refundMessages) {
		this.refundMessages = refundMessages;
	}
	public List<RefundMessage> getRefundMessages( ) {
		return this.refundMessages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
