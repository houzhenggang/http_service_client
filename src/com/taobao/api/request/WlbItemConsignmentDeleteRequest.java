package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentDeleteResponse;

/**
 * TOP API: taobao.wlb.item.consignment.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemConsignmentDeleteRequest implements TaobaoRequest<WlbItemConsignmentDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒid
	 */
	private Long itemId;

	/** 
	* ������Ʒid�б�(֧�ֶ����)
	 */
	private String ownerItemList;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setOwnerItemList(String ownerItemList) {
		this.ownerItemList = ownerItemList;
	}
	public String getOwnerItemList() {
		return this.ownerItemList;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.consignment.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("owner_item_list", this.ownerItemList);
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

	public Class<WlbItemConsignmentDeleteResponse> getResponseClass() {
		return WlbItemConsignmentDeleteResponse.class;
	}
}
