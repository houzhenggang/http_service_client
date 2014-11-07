package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ա��ͱ����Ա
 *
 * @author auto create
 * @since 1.0, 2011-04-15 14:57:26.0
 */
public class TaobaokeReportMember extends TaobaoObject {

	private static final long serialVersionUID = 4528326882589851257L;

	/**
	 * Ӧ����Ȩ��
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * ��������Ʒ����ĿID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ��������Ʒ����Ŀ����
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * �û���õ�Ӷ��
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * Ӷ����ʡ����磺0.01����1%
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * ��Ʒ�ַ���ID(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ��Ʒ�ɽ�����
	 */
	@ApiField("item_num")
	private Long itemNum;

	/**
	 * ��Ʒ����
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * ��ƷID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �ƹ�����
	 */
	@ApiField("outer_code")
	private String outerCode;

	/**
	 * �ɽ��۸�
	 */
	@ApiField("pay_price")
	private String payPrice;

	/**
	 * �ɽ�ʱ��
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ʵ��֧�����
	 */
	@ApiField("real_pay_fee")
	private String realPayFee;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ��������
	 */
	@ApiField("shop_title")
	private String shopTitle;

	/**
	 * �Ա����׺�
	 */
	@ApiField("trade_id")
	private Long tradeId;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Long getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterCode() {
		return this.outerCode;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getPayPrice() {
		return this.payPrice;
	}
	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRealPayFee() {
		return this.realPayFee;
	}
	public void setRealPayFee(String realPayFee) {
		this.realPayFee = realPayFee;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public Long getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

}
