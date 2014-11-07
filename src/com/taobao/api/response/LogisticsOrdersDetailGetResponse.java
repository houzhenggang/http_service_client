package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.orders.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class LogisticsOrdersDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2117614484212578941L;

	/** 
	 * ��ȡ���������������б�.���ص�Shipping�����ľ�����ϢΪ���fields������ֶ���Ϣ.
	 */
	@ApiListField("shippings")
	@ApiField("shipping")
	private List<Shipping> shippings;

	/** 
	 * �����������������б�����
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
	public List<Shipping> getShippings( ) {
		return this.shippings;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
