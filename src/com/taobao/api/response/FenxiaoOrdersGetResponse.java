package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.PurchaseOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.orders.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class FenxiaoOrdersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1644851455785542183L;

	/** 
	 * �ɹ������Ӳɹ�����Ϣ������ PurchaseOrder �������ֶ���Ϣ��
	 */
	@ApiListField("purchase_orders")
	@ApiField("purchase_order")
	private List<PurchaseOrder> purchaseOrders;

	/** 
	 * �������Ĳɹ�����¼����
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	public List<PurchaseOrder> getPurchaseOrders( ) {
		return this.purchaseOrders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
