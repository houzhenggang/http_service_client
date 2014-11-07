package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemSynchronizeResponse;

/**
 * TOP API: taobao.wlb.item.synchronize request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbItemSynchronizeRequest implements TaobaoRequest<WlbItemSynchronizeResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ⲿʵ��ID
	 */
	private Long extEntityId;

	/** 
	* �ⲿʵ������.������ֵ
IC_ITEM   --��ʾIC��Ʒ
IC_SKU    --��ʾIC��С��λ��Ʒ
����������ֵ����IC_ITEM����
	 */
	private String extEntityType;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* ��Ʒ�������Ա�nick
	 */
	private String userNick;

	public void setExtEntityId(Long extEntityId) {
		this.extEntityId = extEntityId;
	}
	public Long getExtEntityId() {
		return this.extEntityId;
	}

	public void setExtEntityType(String extEntityType) {
		this.extEntityType = extEntityType;
	}
	public String getExtEntityType() {
		return this.extEntityType;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserNick() {
		return this.userNick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.synchronize";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ext_entity_id", this.extEntityId);
		txtParams.put("ext_entity_type", this.extEntityType);
		txtParams.put("item_id", this.itemId);
		txtParams.put("user_nick", this.userNick);
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

	public Class<WlbItemSynchronizeResponse> getResponseClass() {
		return WlbItemSynchronizeResponse.class;
	}
}
