package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CouponDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupondetail.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class PromotionCoupondetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8496254273789343871L;

	/** 
	 * �Ż�ȯ��ϸ��Ϣ
	 */
	@ApiListField("coupon_details")
	@ApiField("coupon_detail")
	private List<CouponDetail> couponDetails;

	/** 
	 * ��ѯ��������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCouponDetails(List<CouponDetail> couponDetails) {
		this.couponDetails = couponDetails;
	}
	public List<CouponDetail> getCouponDetails( ) {
		return this.couponDetails;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
