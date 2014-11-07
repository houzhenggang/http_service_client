package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbOrderScheduleRule;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.orderschedulerule.query response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbOrderscheduleruleQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6877982349633611583L;

	/** 
	 * �������ȹ����б�
	 */
	@ApiListField("order_schedule_rule_list")
	@ApiField("wlb_order_schedule_rule")
	private List<WlbOrderScheduleRule> orderScheduleRuleList;

	/** 
	 * �������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setOrderScheduleRuleList(List<WlbOrderScheduleRule> orderScheduleRuleList) {
		this.orderScheduleRuleList = orderScheduleRuleList;
	}
	public List<WlbOrderScheduleRule> getOrderScheduleRuleList( ) {
		return this.orderScheduleRuleList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
