package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShopUpdateResponse;

/**
 * TOP API: taobao.shop.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class ShopUpdateRequest implements TaobaoRequest<ShopUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���̹��档������1024���ַ�
	 */
	private String bulletin;

	/** 
	* ����������10��2000���ַ�����
	 */
	private String desc;

	/** 
	* ���̱��⡣������30���ַ����������дʣ����Կ��ȡ�����Ͱ͵ȡ�title, bulletin��desc���ٱ��봫һ��
	 */
	private String title;

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}
	public String getBulletin() {
		return this.bulletin;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.shop.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bulletin", this.bulletin);
		txtParams.put("desc", this.desc);
		txtParams.put("title", this.title);
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

	public Class<ShopUpdateResponse> getResponseClass() {
		return ShopUpdateResponse.class;
	}
}
