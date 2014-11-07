package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCoupondetailGetResponse;

/**
 * TOP API: taobao.promotion.coupondetail.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class PromotionCoupondetailGetRequest implements TaobaoRequest<PromotionCoupondetailGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ǳ�
	 */
	private String buyerNick;

	/** 
	* �Ż�ȯ��id
	 */
	private Long couponId;

	/** 
	* ��ѯ��ҳ�ţ�������Ƿ�ҳ���صģ�ÿҳ20��
	 */
	private Long pageNo;

	/** 
	* ÿҳ����
	 */
	private Long pageSize;

	/** 
	* �Ż�ȯʹ�����unused������δʹ��using������ʹ����used��������ʹ�á�������unused��using��used
	 */
	private String state;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public Long getCouponId() {
		return this.couponId;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return this.state;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupondetail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("coupon_id", this.couponId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("state", this.state);
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

	public Class<PromotionCoupondetailGetResponse> getResponseClass() {
		return PromotionCoupondetailGetResponse.class;
	}
}
