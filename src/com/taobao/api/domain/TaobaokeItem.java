package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ա�����Ʒ
 *
 * @author auto create
 * @since 1.0, 2011-07-06 19:20:18.0
 */
public class TaobaokeItem extends TaobaoObject {

	private static final long serialVersionUID = 5416173771276423934L;

	/**
	 * �ƹ���url
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * �Ա���Ӷ��
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * �ۼƳɽ���.ע�����ص�������30�����ۼ��ƹ���
	 */
	@ApiField("commission_num")
	private String commissionNum;

	/**
	 * �Ա���Ӷ����ʣ����磺1234.00����12.34%
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * �ۼ���֧��Ӷ����
	 */
	@ApiField("commission_volume")
	private String commissionVolume;

	/**
	 * �Ա�����Ʒid(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ��Ʒ���ڵ�
	 */
	@ApiField("item_location")
	private String itemLocation;

	/**
	 * �Ա��͹ؼ�������URL
	 */
	@ApiField("keyword_click_url")
	private String keywordClickUrl;

	/**
	 * �����ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �Ա�����Ʒ����id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * ͼƬurl
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ�۸�
	 */
	@ApiField("price")
	private String price;

	/**
	 * �������õȼ�
	 */
	@ApiField("seller_credit_score")
	private Long sellerCreditScore;

	/**
	 * ��Ʒ���ڵ��̵��ƹ���url
	 */
	@ApiField("shop_click_url")
	private String shopClickUrl;

	/**
	 * �Ա�����Ŀ�ƹ�URL
	 */
	@ApiField("taobaoke_cat_click_url")
	private String taobaokeCatClickUrl;

	/**
	 * ��Ʒtitle ��������
	 */
	@ApiField("title")
	private String title;

	/**
	 * 30���ڽ�����
	 */
	@ApiField("volume")
	private Long volume;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionNum() {
		return this.commissionNum;
	}
	public void setCommissionNum(String commissionNum) {
		this.commissionNum = commissionNum;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getCommissionVolume() {
		return this.commissionVolume;
	}
	public void setCommissionVolume(String commissionVolume) {
		this.commissionVolume = commissionVolume;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getItemLocation() {
		return this.itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

	public String getKeywordClickUrl() {
		return this.keywordClickUrl;
	}
	public void setKeywordClickUrl(String keywordClickUrl) {
		this.keywordClickUrl = keywordClickUrl;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getSellerCreditScore() {
		return this.sellerCreditScore;
	}
	public void setSellerCreditScore(Long sellerCreditScore) {
		this.sellerCreditScore = sellerCreditScore;
	}

	public String getShopClickUrl() {
		return this.shopClickUrl;
	}
	public void setShopClickUrl(String shopClickUrl) {
		this.shopClickUrl = shopClickUrl;
	}

	public String getTaobaokeCatClickUrl() {
		return this.taobaokeCatClickUrl;
	}
	public void setTaobaokeCatClickUrl(String taobaokeCatClickUrl) {
		this.taobaokeCatClickUrl = taobaokeCatClickUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
