package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CouponResult;
import com.taobao.api.domain.ErrorMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.send response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class PromotionCouponSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3776744791688598679L;

	/** 
	 * ���ͳɹ�����ҵ��ǳƺ��Ż�ȯ��number
	 */
	@ApiListField("coupon_results")
	@ApiField("coupon_result")
	private List<CouponResult> couponResults;

	/** 
	 * û�з��ͳɹ������
	 */
	@ApiListField("failure_buyers")
	@ApiField("error_message")
	private List<ErrorMessage> failureBuyers;

	/** 
	 * true �ɹ���falseʧ��
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setCouponResults(List<CouponResult> couponResults) {
		this.couponResults = couponResults;
	}
	public List<CouponResult> getCouponResults( ) {
		return this.couponResults;
	}

	public void setFailureBuyers(List<ErrorMessage> failureBuyers) {
		this.failureBuyers = failureBuyers;
	}
	public List<ErrorMessage> getFailureBuyers( ) {
		return this.failureBuyers;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
