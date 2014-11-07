package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.page.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderPageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2886924569415816938L;

	/** 
	 * ��ҳ��ѯ���ؽ��
	 */
	@ApiListField("order_list")
	@ApiField("wlb_order")
	private List<WlbOrder> orderList;

	/** 
	 * ������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setOrderList(List<WlbOrder> orderList) {
		this.orderList = orderList;
	}
	public List<WlbOrder> getOrderList( ) {
		return this.orderList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
