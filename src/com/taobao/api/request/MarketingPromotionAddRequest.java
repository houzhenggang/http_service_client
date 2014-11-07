package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionAddResponse;

/**
 * TOP API: taobao.marketing.promotion.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingPromotionAddRequest implements TaobaoRequest<MarketingPromotionAddResponse> {

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
	* �Żݶ�ȣ����Ż�����Ϊ�ۿۣ�DISCOUNT�����������Ʒ���ۿ۱�������Чֵ��Χ��0.01-9.99��֧��С�����2λ��
���Ż�����Ϊ�Żݼ۸�(PRICE)���������Ʒ���Żݼۣ���λ��Ԫ��֧��С�����2λ
	 */
	private String discountValue;

	/** 
	* �Żݽ���ʱ��
	 */
	private Date endDate;

	/** 
	* �Żݲ������õ���Ʒ����ID�б�һ���������10����Ʒ���԰��','�ŷָ
	 */
	private String numIids;

	/** 
	* ����������30���ַ�
	 */
	private String promotionDesc;

	/** 
	* ����ƣ����5���ַ���Ĭ��Ϊ���Ҵ���
��ע�⣺Ϊ�����¼��ݣ�����5���ַ��͵������������������ݷ�����2011-6-28�ŷ����󱣳�15-20�죬ϣ��ISV�������ڼ䴦��ã�
	 */
	private String promotionTitle;

	/** 
	* �Żݿ�ʼʱ��
	 */
	private Date startDate;

	/** 
	* ��ǩID������ı�ǩ����ʹ��taobao.marketing.tag.add���API�����õ��ı�ǩID��Ҳ����ʹ���Ա��ṩ�Ĺ�����ǩ:1=ȫ����Ա
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

	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public String getNumIids() {
		return this.numIids;
	}

	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}
	public String getPromotionDesc() {
		return this.promotionDesc;
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
		return "taobao.marketing.promotion.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("decrease_num", this.decreaseNum);
		txtParams.put("discount_type", this.discountType);
		txtParams.put("discount_value", this.discountValue);
		txtParams.put("end_date", this.endDate);
		txtParams.put("num_iids", this.numIids);
		txtParams.put("promotion_desc", this.promotionDesc);
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

	public Class<MarketingPromotionAddResponse> getResponseClass() {
		return MarketingPromotionAddResponse.class;
	}
}
