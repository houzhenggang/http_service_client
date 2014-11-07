package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrderGetResponse;

/**
 * TOP API: taobao.hotel.order.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class HotelOrderGetRequest implements TaobaoRequest<HotelOrderGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƿ���Ҫ���ظö�������ס���б���ѡֵ��true��false��
	 */
	private Boolean needGuest;

	/** 
	* �Ƶ궩��oid������Ϊ���֡�oid��tid���봫һ�ͬʱ���ݵ�����£���Ϊ��ѯ���������ȼ��ɸߵ�������Ϊoid��tid��
	 */
	private Long oid;

	/** 
	* �Ա�����tid������Ϊ���֡�oid��tid���봫һ�ͬʱ���ݵ�����£���Ϊ��ѯ���������ȼ��ɸߵ�������Ϊoid��tid��
	 */
	private Long tid;

	public void setNeedGuest(Boolean needGuest) {
		this.needGuest = needGuest;
	}
	public Boolean getNeedGuest() {
		return this.needGuest;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	public Long getOid() {
		return this.oid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.order.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("need_guest", this.needGuest);
		txtParams.put("oid", this.oid);
		txtParams.put("tid", this.tid);
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

	public Class<HotelOrderGetResponse> getResponseClass() {
		return HotelOrderGetResponse.class;
	}
}
