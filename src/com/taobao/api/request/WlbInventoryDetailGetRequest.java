package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventoryDetailGetResponse;

/**
 * TOP API: taobao.wlb.inventory.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbInventoryDetailGetRequest implements TaobaoRequest<WlbInventoryDetailGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��������б�ֵ������
VENDIBLE--�����ۿ��
FREEZE--������
ONWAY--��;���
DEFECT--�д�Ʒ���
ENGINE_DAMAGE--����
BOX_DAMAGE--����
	 */
	private String inventoryTypeList;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* �ֿ����
	 */
	private String storeCode;

	public void setInventoryTypeList(String inventoryTypeList) {
		this.inventoryTypeList = inventoryTypeList;
	}
	public String getInventoryTypeList() {
		return this.inventoryTypeList;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreCode() {
		return this.storeCode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.inventory.detail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("inventory_type_list", this.inventoryTypeList);
		txtParams.put("item_id", this.itemId);
		txtParams.put("store_code", this.storeCode);
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

	public Class<WlbInventoryDetailGetResponse> getResponseClass() {
		return WlbInventoryDetailGetResponse.class;
	}
}
