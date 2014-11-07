package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RoomImage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.room.img.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class HotelRoomImgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2772237152266947478L;

	/** 
	 * ��ƷͼƬ�ṹ
	 */
	@ApiField("room_image")
	private RoomImage roomImage;

	public void setRoomImage(RoomImage roomImage) {
		this.roomImage = roomImage;
	}
	public RoomImage getRoomImage( ) {
		return this.roomImage;
	}

}
