package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ArticleBizOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.order.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8127671646627423132L;

	/** 
	 * ��Ʒ��������
	 */
	@ApiListField("article_biz_orders")
	@ApiField("article_biz_order")
	private List<ArticleBizOrder> articleBizOrders;

	/** 
	 * �ܼ�¼��
	 */
	@ApiField("total_item")
	private Long totalItem;

	public void setArticleBizOrders(List<ArticleBizOrder> articleBizOrders) {
		this.articleBizOrders = articleBizOrders;
	}
	public List<ArticleBizOrder> getArticleBizOrders( ) {
		return this.articleBizOrders;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}

}