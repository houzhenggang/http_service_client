package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:19:20.0
 */
public class PromotionCouponTransferResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8384975268866211466L;

	/** 
	 * false����ʧ�ܣ�true����ɹ�
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
