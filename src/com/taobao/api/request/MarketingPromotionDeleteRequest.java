package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionDeleteResponse;

/**
 * TOP API: taobao.marketing.promotion.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingPromotionDeleteRequest implements TaobaoRequest<MarketingPromotionDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����õ��Żݲ���ID
	 */
	private Long promotionId;

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}
	public Long getPromotionId() {
		return this.promotionId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.marketing.promotion.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("promotion_id", this.promotionId);
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

	public Class<MarketingPromotionDeleteResponse> getResponseClass() {
		return MarketingPromotionDeleteResponse.class;
	}
}
