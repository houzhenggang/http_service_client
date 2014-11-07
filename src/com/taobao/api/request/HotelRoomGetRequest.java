package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomGetResponse;

/**
 * TOP API: taobao.hotel.room.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class HotelRoomGetRequest implements TaobaoRequest<HotelRoomGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƶ귿����Ʒgid������Ϊ���֡�
	 */
	private Long gid;

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

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
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

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gid", this.gid);
		txtParams.put("need_hotel", this.needHotel);
		txtParams.put("need_room_desc", this.needRoomDesc);
		txtParams.put("need_room_quotas", this.needRoomQuotas);
		txtParams.put("need_room_type", this.needRoomType);
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

	public Class<HotelRoomGetResponse> getResponseClass() {
		return HotelRoomGetResponse.class;
	}
}
