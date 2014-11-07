package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomImgDeleteResponse;

/**
 * TOP API: taobao.hotel.room.img.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class HotelRoomImgDeleteRequest implements TaobaoRequest<HotelRoomImgDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƶ귿����Ʒgid������Ϊ���֡�
	 */
	private Long gid;

	/** 
	* ͼƬ��ţ���ѡֵ��1��2��3��4��5��
���ԭͼƬ����С�ڵ���1���򱨴�����ɾ��ͼƬ��
���ԭͼƬ����С�ڴ�ɾ����ͼƬ��ţ��򱨴�ͼƬ��Ŵ���
	 */
	private Long position;

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.img.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gid", this.gid);
		txtParams.put("position", this.position);
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

	public Class<HotelRoomImgDeleteResponse> getResponseClass() {
		return HotelRoomImgDeleteResponse.class;
	}
}
