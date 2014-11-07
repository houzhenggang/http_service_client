package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponAddResponse;

/**
 * TOP API: taobao.promotion.coupon.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-27 18:28:18.0
 */
public class PromotionCouponAddRequest implements TaobaoRequest<PromotionCouponAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����������Ԫ����������Ż�ȯ��500������500Ԫ����ʹ��
	 */
	private Long condition;

	/** 
	* �Ż�ȯ����������3��5��10��20��50��100
	 */
	private Long denominations;

	/** 
	* �Ż�ȯ�Ľ�ֹ����
	 */
	private Date endTime;

	public void setCondition(Long condition) {
		this.condition = condition;
	}
	public Long getCondition() {
		return this.condition;
	}

	public void setDenominations(Long denominations) {
		this.denominations = denominations;
	}
	public Long getDenominations() {
		return this.denominations;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupon.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("condition", this.condition);
		txtParams.put("denominations", this.denominations);
		txtParams.put("end_time", this.endTime);
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

	public Class<PromotionCouponAddResponse> getResponseClass() {
		return PromotionCouponAddResponse.class;
	}
}
