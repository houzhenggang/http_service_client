package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPropimgDeleteResponse;

/**
 * TOP API: taobao.item.propimg.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItemPropimgDeleteRequest implements TaobaoRequest<ItemPropimgDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ����ͼƬID
	 */
	private Long id;

	/** 
	* ��Ʒ����ID����ѡ
	 */
	private Long numIid;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.propimg.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("num_iid", this.numIid);
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

	public Class<ItemPropimgDeleteResponse> getResponseClass() {
		return ItemPropimgDeleteResponse.class;
	}
}
