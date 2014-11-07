package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeOrderskuUpdateResponse;

/**
 * TOP API: taobao.trade.ordersku.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TradeOrderskuUpdateRequest implements TaobaoRequest<TradeOrderskuUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ӷ�����ţ����ڵ��ʶ����Ľ��׿��Դ����ױ�ţ���
	 */
	private Long oid;

	/** 
	* �������Ա�ţ�����ͨ��taobao.item.skus.get��ȡ������Ӧ����Ʒ�������������ԡ�
	 */
	private Long skuId;

	/** 
	* ����������ϴ�����ʽ��p1:v1;p2:v2���磺1627207:28329;20509:28314������ͨ��taobao.item.skus.get��ȡ������Ӧ����Ʒ�������������ԡ�
	 */
	private String skuProps;

	public void setOid(Long oid) {
		this.oid = oid;
	}
	public Long getOid() {
		return this.oid;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId() {
		return this.skuId;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}
	public String getSkuProps() {
		return this.skuProps;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.trade.ordersku.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("oid", this.oid);
		txtParams.put("sku_id", this.skuId);
		txtParams.put("sku_props", this.skuProps);
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

	public Class<TradeOrderskuUpdateResponse> getResponseClass() {
		return TradeOrderskuUpdateResponse.class;
	}
}
