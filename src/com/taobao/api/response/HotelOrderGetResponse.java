package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.HotelOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.order.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class HotelOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3768926395471184787L;

	/** 
	 * �����ṹ���Ƿ񷵻���ס���б���ݲ�������
	 */
	@ApiField("hotel_order")
	private HotelOrder hotelOrder;

	public void setHotelOrder(HotelOrder hotelOrder) {
		this.hotelOrder = hotelOrder;
	}
	public HotelOrder getHotelOrder( ) {
		return this.hotelOrder;
	}

}
