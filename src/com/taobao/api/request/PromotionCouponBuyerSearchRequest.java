package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponBuyerSearchResponse;

/**
 * TOP API: taobao.promotion.coupon.buyer.search request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:17:42.0
 */
public class PromotionCouponBuyerSearchRequest implements TaobaoRequest<PromotionCouponBuyerSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѯ��Ч�����ڲ�ѯ���ڵ������Ż�ȯ
	 */
	private Date endTime;

	/** 
	* �ڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ÿҳ����
	 */
	private Long pageSize;

	/** 
	* ���̵����ƣ��������ҵ��ǳ�
	 */
	private String sellerNick;

	/** 
	* unused��δʹ�ã�using��ʹ����,used,�Ѿ�ʹ�ã�overdue���Ѿ����ڣ�transfered���Ѿ�ת��
	 */
	private String status;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
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

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupon.buyer.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("status", this.status);
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

	public Class<PromotionCouponBuyerSearchResponse> getResponseClass() {
		return PromotionCouponBuyerSearchResponse.class;
	}
}
