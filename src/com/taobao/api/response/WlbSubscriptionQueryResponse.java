package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbSellerSubscription;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.subscription.query response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbSubscriptionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4616469195929183123L;

	/** 
	 * ���Ҷ����ķ����б�
	 */
	@ApiListField("seller_subscription_list")
	@ApiField("wlb_seller_subscription")
	private List<WlbSellerSubscription> sellerSubscriptionList;

	/** 
	 * �������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setSellerSubscriptionList(List<WlbSellerSubscription> sellerSubscriptionList) {
		this.sellerSubscriptionList = sellerSubscriptionList;
	}
	public List<WlbSellerSubscription> getSellerSubscriptionList( ) {
		return this.sellerSubscriptionList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
