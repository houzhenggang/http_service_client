package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercatsListUpdateResponse;

/**
 * TOP API: taobao.sellercats.list.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class SellercatsListUpdateRequest implements TaobaoRequest<SellercatsListUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����Զ�����Ŀ���
	 */
	private Long cid;

	/** 
	* �����Զ�����Ŀ���ơ�������20���ַ�
	 */
	private String name;

	/** 
	* ����ͼƬURL��ַ
	 */
	private String pictUrl;

	/** 
	* ����Ŀ��ҳ���ϵ�����λ��,ȡֵ��Χ:�����������
	 */
	private Long sortOrder;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}
	public String getPictUrl() {
		return this.pictUrl;
	}

	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Long getSortOrder() {
		return this.sortOrder;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.sellercats.list.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("name", this.name);
		txtParams.put("pict_url", this.pictUrl);
		txtParams.put("sort_order", this.sortOrder);
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

	public Class<SellercatsListUpdateResponse> getResponseClass() {
		return SellercatsListUpdateResponse.class;
	}
}
