package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���׵��Ż���Ϣ����
 *
 * @author auto create
 * @since 1.0, 2010-11-23 13:21:03.0
 */
public class PromotionDetail extends TaobaoObject {

	private static final long serialVersionUID = 7799351374254541727L;

	/**
	 * �Żݽ����˷ѡ���ʱ����ʱΪ�գ�,��λ��Ԫ
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * ��������Ʒʱ��������Ʒ������
	 */
	@ApiField("gift_item_name")
	private String giftItemName;

	/**
	 * ���׵����������Ӷ�����
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �Ż���Ϣ������
	 */
	@ApiField("promotion_name")
	private String promotionName;

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getGiftItemName() {
		return this.giftItemName;
	}
	public void setGiftItemName(String giftItemName) {
		this.giftItemName = giftItemName;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

}
