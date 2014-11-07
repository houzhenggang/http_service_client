package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Hotel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class HotelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3851435351262824135L;

	/** 
	 * �Ƶ�ṹ
	 */
	@ApiField("hotel")
	private Hotel hotel;

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Hotel getHotel( ) {
		return this.hotel;
	}

}
