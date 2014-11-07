package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelsSearchResponse;

/**
 * TOP API: taobao.hotels.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class HotelsSearchRequest implements TaobaoRequest<HotelsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���б��롣�μ���http://kezhan.trip.taobao.com/area.html��
domesticΪtrueʱ��province,city,district����ͬʱΪ�ջ�Ϊ0
	 */
	private Long city;

	/** 
	* domesticΪtrueʱ���̶�China��
domesticΪfalseʱ�����봫����ĺ�����ұ���ֵ���Ǳ�����μ���http://kezhan.trip.taobao.com/countrys.html
	 */
	private String country;

	/** 
	* �����ؼ��У����롣�μ���http://kezhan.trip.taobao.com/area.html��
domesticΪtrueʱ��province,city,district����ͬʱΪ�ջ�Ϊ0
	 */
	private Long district;

	/** 
	* �Ƿ���ھƵꡣ��ѡֵ��true��false
	 */
	private Boolean domestic;

	/** 
	* �Ƶ����ơ����ܳ���60�ֽ�
	 */
	private String name;

	/** 
	* ��ҳҳ�롣ȡֵ��Χ���������������Ĭ��ֵ1�������ص�һҳ�����ݡ�ҳ���СΪ20
	 */
	private Long pageNo;

	/** 
	* ʡ�ݱ��롣�μ���http://kezhan.trip.taobao.com/area.html��
domesticΪtrueʱ��province,city,district����ͬʱΪ�ջ�Ϊ0
	 */
	private Long province;

	public void setCity(Long city) {
		this.city = city;
	}
	public Long getCity() {
		return this.city;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return this.country;
	}

	public void setDistrict(Long district) {
		this.district = district;
	}
	public Long getDistrict() {
		return this.district;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}
	public Boolean getDomestic() {
		return this.domestic;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getProvince() {
		return this.province;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotels.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("city", this.city);
		txtParams.put("country", this.country);
		txtParams.put("district", this.district);
		txtParams.put("domestic", this.domestic);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("province", this.province);
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

	public Class<HotelsSearchResponse> getResponseClass() {
		return HotelsSearchResponse.class;
	}
}
