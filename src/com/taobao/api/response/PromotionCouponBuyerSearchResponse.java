package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.BuyerCouponDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.buyer.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:17:42.0
 */
public class PromotionCouponBuyerSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6851435242118178477L;

	/** 
	 * ���ص��Ż�ȯ��Ϣ
	 */
	@ApiListField("buyer_coupon_details")
	@ApiField("buyer_coupon_detail")
	private List<BuyerCouponDetail> buyerCouponDetails;

	/** 
	 * ��ѯ���������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setBuyerCouponDetails(List<BuyerCouponDetail> buyerCouponDetails) {
		this.buyerCouponDetails = buyerCouponDetails;
	}
	public List<BuyerCouponDetail> getBuyerCouponDetails( ) {
		return this.buyerCouponDetails;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
