package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RoomImage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.room.img.upload response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class HotelRoomImgUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4825352771811832455L;

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
