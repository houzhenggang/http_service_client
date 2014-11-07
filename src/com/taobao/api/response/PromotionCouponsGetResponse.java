package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Coupon;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupons.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class PromotionCouponsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3126989995773118219L;

	/** 
	 * 优惠券列表
	 */
	@ApiListField("coupons")
	@ApiField("coupon")
	private List<Coupon> coupons;

	/** 
	 * 查询的总数量
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	public List<Coupon> getCoupons( ) {
		return this.coupons;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
