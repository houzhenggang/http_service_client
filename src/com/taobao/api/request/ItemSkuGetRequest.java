package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuGetResponse;

/**
 * TOP API: taobao.item.sku.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class ItemSkuGetRequest implements TaobaoRequest<ItemSkuGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ��Sku�ṹ���е������ֶΣ��ֶ�֮���á�,���ָ���
	 */
	private String fields;

	/** 
	* ����nick(num_iid��nick�ش�һ��)
	 */
	private String nick;

	/** 
	* ��Ʒ������IID��num_iid��nick�ش�һ�����Ƽ���num_iid��
	 */
	private Long numIid;

	/** 
	* Sku��id������ͨ��taobao.item.get�õ�
	 */
	private Long skuId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId() {
		return this.skuId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("sku_id", this.skuId);
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

	public Class<ItemSkuGetResponse> getResponseClass() {
		return ItemSkuGetResponse.class;
	}
}
