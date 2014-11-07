package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemDeleteResponse;

/**
 * TOP API: taobao.wlb.item.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbItemDeleteRequest implements TaobaoRequest<WlbItemDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* ��Ʒ�������Ա�nick
	 */
	private String userNick;

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
		return "taobao.wlb.item.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<WlbItemDeleteResponse> getResponseClass() {
		return WlbItemDeleteResponse.class;
	}
}
