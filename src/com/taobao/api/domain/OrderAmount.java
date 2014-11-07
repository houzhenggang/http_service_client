package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ӷ������������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:16:42.0
 */
public class OrderAmount extends TaobaoObject {

	private static final long serialVersionUID = 4367958489881775274L;

	/**
	 * �����ֹ��������Ӷ������Żݽ��.��ʽΪ:1.01;��λ:Ԫ;��ȷ��С�������λ.
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * �Ӷ�����ϵͳ�Żݽ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * �ӽ��׶����й�����Ʒ������
	 */
	@ApiField("num")
	private Long num;

	/**
	 * �Ӷ�����Ӧ����Ʒ����id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �ӽ��׶������
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * �Ӷ���ʵ������ȷ��2λС������λ:Ԫ����:200.07����ʾ:200Ԫ7�֡����㹫ʽ���£�payment = price * num + adjust_fee - discount_fee + post_fee(�ʷѣ������Ӷ���ʱ�Ӷ���ʵ���������ʷѣ�����Ӷ���ʱ�������ʷ�)�������˿�ɹ����Ӷ������������������Żݷ�̯������ɸ��ֶο��ܲ�Ϊ0.00Ԫ������ʹ���˿�ǰ��ʵ������ȥ�˿�е�ʵ���˿�����㡣
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * ��Ʒ�۸񡣾�ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("price")
	private String price;

	/**
	 * �Ӷ�����ϵͳ�Żݵ����ƣ���Ӧ��discount_fee������
	 */
	@ApiField("promotion_name")
	private String promotionName;

	/**
	 * �Ӷ�����Ӧ����Ʒ��sku_id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * SKU��ֵ���磺������ɫ:��ɫ;�ֻ��ײ�:�ٷ�����
	 */
	@ApiField("sku_properties_name")
	private String skuPropertiesName;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
