package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����ṹ
 *
 * @author auto create
 * @since 1.0, 2011-05-20 15:20:33.0
 */
public class Order extends TaobaoObject {

	private static final long serialVersionUID = 1332418161956932749L;

	/**
	 * �ֹ��������.��ʽΪ:1.01;��λ:Ԫ;��ȷ��С�������λ.
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ����Ƿ������ۡ���ѡֵ��true(������)��false(δ����)
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * ������Ʒ��Ӧ����ĿID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * �����Żݽ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * ��Ʒ���ַ������(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * �Ƿ���
	 */
	@ApiField("is_oversold")
	private Boolean isOversold;

	/**
	 * �ײ�ID
	 */
	@ApiField("item_meal_id")
	private Long itemMealId;

	/**
	 * �ײ͵�ֵ���磺M8ԭװ���:��Я֧��:M8ר������:Ī��������
	 */
	@ApiField("item_meal_name")
	private String itemMealName;

	/**
	 * �����޸�ʱ�䣬Ŀǰֻ��taobao.trade.ordersku.update�᷵�ش��ֶΡ�
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ����������ȡֵ��Χ:�����������
	 */
	@ApiField("num")
	private Long num;

	/**
	 * ��Ʒ����ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �Ӷ������
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * �̼��ⲿ����(�����̼��ⲿϵͳ�Խ�)���ⲿ�̼��Լ��������ƷItem��id������ͨ��taobao.items.custom.get��ȡ��Ʒ��Item����Ϣ
	 */
	@ApiField("outer_iid")
	private String outerIid;

	/**
	 * �ⲿ�����Լ������Sku���
	 */
	@ApiField("outer_sku_id")
	private String outerSkuId;

	/**
	 * �Ӷ���ʵ������ȷ��2λС������λ:Ԫ����:200.07����ʾ:200Ԫ7�֡����㹫ʽ���£�payment = price * num + adjust_fee - discount_fee + post_fee(�ʷѣ������Ӷ���ʱ�Ӷ���ʵ���������ʷѣ�����Ӷ���ʱ�������ʷ�)�������˿�ɹ����Ӷ������������������Żݷ�̯������ɸ��ֶο��ܲ�Ϊ0.00Ԫ������ʹ���˿�ǰ��ʵ������ȥ�˿�е�ʵ���˿�����㡣
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * ��ƷͼƬ�ľ���·��
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * ��Ʒ�۸񡣾�ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("price")
	private String price;

	/**
	 * ����˿�ID
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * �˿�״̬���˿�״̬����ѡֵ WAIT_SELLER_AGREE(����Ѿ������˿�ȴ�����ͬ��) WAIT_BUYER_RETURN_GOODS(�����Ѿ�ͬ���˿�ȴ�����˻�) WAIT_SELLER_CONFIRM_GOODS(����Ѿ��˻����ȴ�����ȷ���ջ�) SELLER_REFUSE_BUYER(���Ҿܾ��˿�) CLOSED(�˿�ر�) SUCCESS(�˿�ɹ�)
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * �����Ƿ������ۡ���ѡֵ��true(������)��false(δ����)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * �������ͣ���ѡֵΪ��B���̳��̼ң���C����ͨ���ң�
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * ��Ʒ����С��浥λSku��id.����ͨ��taobao.item.sku.get��ȡ��ϸ��Sku��Ϣ
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * SKU��ֵ���磺������ɫ:��ɫ;�ֻ��ײ�:�ٷ�����
	 */
	@ApiField("sku_properties_name")
	private String skuPropertiesName;

	/**
	 * ����������ϸ��Ϣ
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * ��������URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * ����״̬�����ע��״̬�����ΪTRADE_CLOSED_BY_TAOBAO״̬����Ҫ�Դ˶������з������мǰ���������ѡֵ: 
<ul>
<li>TRADE_NO_CREATE_PAY(û�д���֧��������) 
<li>WAIT_BUYER_PAY(�ȴ���Ҹ���) 
<li>WAIT_SELLER_SEND_GOODS(�ȴ����ҷ���,��:����Ѹ���) 
<li>WAIT_BUYER_CONFIRM_GOODS(�ȴ����ȷ���ջ�,��:�����ѷ���) 
<li>TRADE_BUYER_SIGNED(�����ǩ��,��������ר��) 
<li>TRADE_FINISHED(���׳ɹ�) 
<li>TRADE_CLOSED(�����Ժ��û��˿�ɹ��������Զ��ر�) 
<li>TRADE_CLOSED_BY_TAOBAO(������ǰ�����һ���������رս���)
	 */
	@ApiField("status")
	private String status;

	/**
	 * ������ʱ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * Ӧ������Ʒ�۸� * ��Ʒ���� + �ֹ�������� - �����Żݽ�����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Boolean getIsOversold() {
		return this.isOversold;
	}
	public void setIsOversold(Boolean isOversold) {
		this.isOversold = isOversold;
	}

	public Long getItemMealId() {
		return this.itemMealId;
	}
	public void setItemMealId(Long itemMealId) {
		this.itemMealId = itemMealId;
	}

	public String getItemMealName() {
		return this.itemMealName;
	}
	public void setItemMealName(String itemMealName) {
		this.itemMealName = itemMealName;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getOuterIid() {
		return this.outerIid;
	}
	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}

	public String getOuterSkuId() {
		return this.outerSkuId;
	}
	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
