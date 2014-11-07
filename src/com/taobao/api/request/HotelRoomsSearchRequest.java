package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomsSearchResponse;

/**
 * TOP API: taobao.hotel.rooms.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class HotelRoomsSearchRequest implements TaobaoRequest<HotelRoomsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƶ귿����Ʒgid�б����gid��Ӣ�Ķ��Ÿ�����һ�β�����20����gids��hids��rids������봫һ�ͬʱ���ݵ�����£���Ϊ��ѯ���������ȼ��ɸߵ�������Ϊgids��hids��rids��
	 */
	private String gids;

	/** 
	* �Ƶ�hid�б����hid��Ӣ�Ķ��Ÿ�����һ�β�����5����gids��hids��rids������봫һ�ͬʱ���ݵ�����£���Ϊ��ѯ���������ȼ��ɸߵ�������Ϊgids��hids��rids��
	 */
	private String hids;

	/** 
	* �Ƿ���Ҫ���ظ���Ʒ�ľƵ���Ϣ����ѡֵ��true��false��
	 */
	private Boolean needHotel;

	/** 
	* �Ƿ���Ҫ���ظ���Ʒ�ı�����������ѡֵ��true��false��
	 */
	private Boolean needRoomDesc;

	/** 
	* �Ƿ���Ҫ���ظ���Ʒ�ķ�̬�б���ѡֵ��true��false��
	 */
	private Boolean needRoomQuotas;

	/** 
	* �Ƿ���Ҫ���ظ���Ʒ�ķ�����Ϣ����ѡֵ��true��false��
	 */
	private Boolean needRoomType;

	/** 
	* ��ҳҳ�롣ȡֵ��Χ���������������Ĭ��ֵ1�������ص�һҳ�����ݡ�ҳ���СΪ20
	 */
	private Long pageNo;

	/** 
	* ����rid�б����rid��Ӣ�Ķ��Ÿ�����һ�β�����20����gids��hids��rids������봫һ�ͬʱ���ݵ�����£���Ϊ��ѯ���������ȼ��ɸߵ�������Ϊgids��hids��rids��
	 */
	private String rids;

	public void setGids(String gids) {
		this.gids = gids;
	}
	public String getGids() {
		return this.gids;
	}

	public void setHids(String hids) {
		this.hids = hids;
	}
	public String getHids() {
		return this.hids;
	}

	public void setNeedHotel(Boolean needHotel) {
		this.needHotel = needHotel;
	}
	public Boolean getNeedHotel() {
		return this.needHotel;
	}

	public void setNeedRoomDesc(Boolean needRoomDesc) {
		this.needRoomDesc = needRoomDesc;
	}
	public Boolean getNeedRoomDesc() {
		return this.needRoomDesc;
	}

	public void setNeedRoomQuotas(Boolean needRoomQuotas) {
		this.needRoomQuotas = needRoomQuotas;
	}
	public Boolean getNeedRoomQuotas() {
		return this.needRoomQuotas;
	}

	public void setNeedRoomType(Boolean needRoomType) {
		this.needRoomType = needRoomType;
	}
	public Boolean getNeedRoomType() {
		return this.needRoomType;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setRids(String rids) {
		this.rids = rids;
	}
	public String getRids() {
		return this.rids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.rooms.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gids", this.gids);
		txtParams.put("hids", this.hids);
		txtParams.put("need_hotel", this.needHotel);
		txtParams.put("need_room_desc", this.needRoomDesc);
		txtParams.put("need_room_quotas", this.needRoomQuotas);
		txtParams.put("need_room_type", this.needRoomType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("rids", this.rids);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<HotelRoomsSearchResponse> getResponseClass() {
		return HotelRoomsSearchResponse.class;
	}
}
