package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.HotelOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.orders.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:44.0
 */
public class HotelOrdersSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7575971334966239293L;

	/** 
	 * ��������ṹ���Ƿ񷵻���ס���б���ݲ�������
	 */
	@ApiListField("hotel_orders")
	@ApiField("hotel_order")
	private List<HotelOrder> hotelOrders;

	/** 
	 * ���������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setHotelOrders(List<HotelOrder> hotelOrders) {
		this.hotelOrders = hotelOrders;
	}
	public List<HotelOrder> getHotelOrders( ) {
		return this.hotelOrders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
