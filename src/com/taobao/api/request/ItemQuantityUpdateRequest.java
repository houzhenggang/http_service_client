package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemQuantityUpdateResponse;

/**
 * TOP API: taobao.item.quantity.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class ItemQuantityUpdateRequest implements TaobaoRequest<ItemQuantityUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ����ID���������
	 */
	private Long numIid;

	/** 
	* SKU���̼ұ��룬��ѡ���������������Ĭ���޸ı����Ŀ�棬������������̼ұ�����������Ӧ��SKU���޸Ŀ�档��sku_id�ͱ��ֶζ���дʱ��sku_idΪ׼������ӦSKU
	 */
	private String outerId;

	/** 
	* ����޸�ֵ����ѡ����ȫ�����¿��ʱ��quantity����Ϊ���ڵ���0�������������������¿��ʱ��quantityΪ��������С�ڵ���0������������ʱ����Ŀ��Ϊ�����Ҿ���ֵ���ڵ�ǰʵ�ʿ�棬�����Ϊ0�����統ǰʵ�ʿ��Ϊ1��������������quantity=-5������Ϊ0
	 */
	private Long quantity;

	/** 
	* Ҫ������SKU������ID����ѡ���������Ĭ���޸ı����Ŀ�棬����������޸ĸ�SKU�Ŀ��
	 */
	private Long skuId;

	/** 
	* �����·�ʽ����ѡ��1Ϊȫ�����£�2Ϊ�������¡�������Ĭ��Ϊȫ������
	 */
	private Long type;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return this.quantity;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId() {
		return this.skuId;
	}

	public void setType(Long type) {
		this.type = type;
	}
	public Long getType() {
		return this.type;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.quantity.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("quantity", this.quantity);
		txtParams.put("sku_id", this.skuId);
		txtParams.put("type", this.type);
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

	public Class<ItemQuantityUpdateResponse> getResponseClass() {
		return ItemQuantityUpdateResponse.class;
	}
}
