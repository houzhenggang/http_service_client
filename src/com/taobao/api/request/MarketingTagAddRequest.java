package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingTagAddResponse;

/**
 * TOP API: taobao.marketing.tag.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingTagAddRequest implements TaobaoRequest<MarketingTagAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ǩ��;����
	 */
	private String description;

	/** 
	* ��ǩ����
	 */
	private String tagName;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getTagName() {
		return this.tagName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.marketing.tag.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("description", this.description);
		txtParams.put("tag_name", this.tagName);
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

	public Class<MarketingTagAddResponse> getResponseClass() {
		return MarketingTagAddResponse.class;
	}
}
