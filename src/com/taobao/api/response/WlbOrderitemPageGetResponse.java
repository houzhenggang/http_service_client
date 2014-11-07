package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbOrderItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.orderitem.page.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderitemPageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1784782977689115462L;

	/** 
	 * ������������Ʒ�б�
	 */
	@ApiListField("order_item_list")
	@ApiField("wlb_order_item")
	private List<WlbOrderItem> orderItemList;

	/** 
	 * ������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setOrderItemList(List<WlbOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	public List<WlbOrderItem> getOrderItemList( ) {
		return this.orderItemList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
