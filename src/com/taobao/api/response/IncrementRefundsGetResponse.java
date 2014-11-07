package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NotifyRefund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.refunds.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class IncrementRefundsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3393111911621523369L;

	/** 
	 * ��ȡ���˿�֪ͨ��Ϣ�� �������ֶμ�NotifyRefund���ݽṹ
	 */
	@ApiListField("notify_refunds")
	@ApiField("notify_refund")
	private List<NotifyRefund> notifyRefunds;

	/** 
	 * ���������������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setNotifyRefunds(List<NotifyRefund> notifyRefunds) {
		this.notifyRefunds = notifyRefunds;
	}
	public List<NotifyRefund> getNotifyRefunds( ) {
		return this.notifyRefunds;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
