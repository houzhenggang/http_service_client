package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentCreateResponse;

/**
 * TOP API: taobao.wlb.item.consignment.create request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemConsignmentCreateRequest implements TaobaoRequest<WlbItemConsignmentCreateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒid
	 */
	private Long itemId;

	/** 
	* ��������
	 */
	private Long number;

	/** 
	* ������Ʒid
	 */
	private Long ownerItemId;

	/** 
	* ����id
	 */
	private Long ownerUserId;

	/** 
	* ͨ��taobao.wlb.item.authorization.add�ӿڴ�����õ���rule_id���������趨�˴����̿��Դ�������Ʒ����
	 */
	private Long ruleId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	public Long getNumber() {
		return this.number;
	}

	public void setOwnerItemId(Long ownerItemId) {
		this.ownerItemId = ownerItemId;
	}
	public Long getOwnerItemId() {
		return this.ownerItemId;
	}

	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public Long getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId() {
		return this.ruleId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.consignment.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("number", this.number);
		txtParams.put("owner_item_id", this.ownerItemId);
		txtParams.put("owner_user_id", this.ownerUserId);
		txtParams.put("rule_id", this.ruleId);
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

	public Class<WlbItemConsignmentCreateResponse> getResponseClass() {
		return WlbItemConsignmentCreateResponse.class;
	}
}
