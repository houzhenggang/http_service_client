package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionUpdateResponse;

/**
 * TOP API: taobao.marketing.promotion.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class MarketingPromotionUpdateRequest implements TaobaoRequest<MarketingPromotionUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���ۼ�����ֻ��discount_type=PRICE��Ч��1ֻ��һ����0��ʾ�������Ϊ1���������ֶ���0����discount_type=DISCOUNT�ò�����Ч��
	 */
	private Long decreaseNum;

	/** 
	* �ۿ����ͣ���ѡPRICE(�Żݼ۸�)��DISCOUNT(�ۿ�)����д����ֵ���ش���
	 */
	private String discountType;

	/** 
	* �Żݶ�ȣ����Ż�����Ϊ�ۿۣ�DISCOUNT�����������Ʒ���ۿ۱�������Чֵ��Χ��0.01-9.99��֧��С�����2λ�����Ż�����Ϊ�Żݼ۸�(PRICE)���������Ʒ���Żݼۣ���λ��Ԫ��֧��С�����2λ
	 */
	private String discountValue;

	/** 
	* �Żݽ���ʱ��
	 */
	private Date endDate;

	/** 
	* ����������30���ַ�
	 */
	private String promotionDesc;

	/** 
	* �Ż�ID
	 */
	private Long promotionId;

	/** 
	* ����ƣ����5���ַ�
	 */
	private String promotionTitle;

	/** 
	* �Żݿ�ʼʱ��
	 */
	private Date startDate;

	/** 
	* ��ǩID
	 */
	private Long tagId;

	public void setDecreaseNum(Long decreaseNum) {
		this.decreaseNum = decreaseNum;
	}
	public Long getDecreaseNum() {
		return this.decreaseNum;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getDiscountType() {
		return this.discountType;
	}

	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}
	public String getDiscountValue() {
		return this.discountValue;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}
	public String getPromotionDesc() {
		return this.promotionDesc;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}
	public Long getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}
	public String getPromotionTitle() {
		return this.promotionTitle;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public Long getTagId() {
		return this.tagId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.marketing.promotion.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("decrease_num", this.decreaseNum);
		txtParams.put("discount_type", this.discountType);
		txtParams.put("discount_value", this.discountValue);
		txtParams.put("end_date", this.endDate);
		txtParams.put("promotion_desc", this.promotionDesc);
		txtParams.put("promotion_id", this.promotionId);
		txtParams.put("promotion_title", this.promotionTitle);
		txtParams.put("start_date", this.startDate);
		txtParams.put("tag_id", this.tagId);
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

	public Class<MarketingPromotionUpdateResponse> getResponseClass() {
		return MarketingPromotionUpdateResponse.class;
	}
}
