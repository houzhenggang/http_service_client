package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Room;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.rooms.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class HotelRoomsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7154211534765888991L;

	/** 
	 * �����Ʒ�ṹ���Ƿ񷵻ؾƵ���Ϣ��������Ϣ����̬�б������������ݲ�������
	 */
	@ApiListField("rooms")
	@ApiField("room")
	private List<Room> rooms;

	/** 
	 * ���������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Room> getRooms( ) {
		return this.rooms;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
