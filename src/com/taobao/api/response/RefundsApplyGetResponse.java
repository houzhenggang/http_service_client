package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Refund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refunds.apply.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class RefundsApplyGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2291674221716118551L;

	/** 
	 * ���������˿���Ϣ�б�
	 */
	@ApiListField("refunds")
	@ApiField("refund")
	private List<Refund> refunds;

	/** 
	 * �������Ľ�����Ϣ����
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}
	public List<Refund> getRefunds( ) {
		return this.refunds;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
