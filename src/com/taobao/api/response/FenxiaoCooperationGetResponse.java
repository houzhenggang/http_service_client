package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Cooperation;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class FenxiaoCooperationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4865383838393276772L;

	/** 
	 * ����������ϵ
	 */
	@ApiListField("cooperations")
	@ApiField("cooperation")
	private List<Cooperation> cooperations;

	/** 
	 * �����¼��
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCooperations(List<Cooperation> cooperations) {
		this.cooperations = cooperations;
	}
	public List<Cooperation> getCooperations( ) {
		return this.cooperations;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
