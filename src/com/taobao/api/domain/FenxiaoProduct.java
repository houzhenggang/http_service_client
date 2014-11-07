package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ������Ʒ
 *
 * @author auto create
 * @since 1.0, 2011-06-29 10:19:50.0
 */
public class FenxiaoProduct extends TaobaoObject {

	private static final long serialVersionUID = 3862728557551188315L;

	/**
	 * ������
	 */
	@ApiField("alarm_number")
	private Long alarmNumber;

	/**
	 * ���ڵأ���
	 */
	@ApiField("city")
	private String city;

	/**
	 * �ɹ��۸񣬵�λ��Ԫ��
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��Ʒ����·����ͨ��http�����ȡ
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * �ۿ�ID������������
	 */
	@ApiField("discount_id")
	private Long discountId;

	/**
	 * �Ƿ��б��ޣ���ѡֵ��false���񣩡�true���ǣ�
	 */
	@ApiField("have_guarantee")
	private Boolean haveGuarantee;

	/**
	 * �Ƿ��з�Ʊ����ѡֵ��false���񣩡�true���ǣ�
	 */
	@ApiField("have_invoice")
	private Boolean haveInvoice;

	/**
	 * ��������
	 */
	@ApiField("items_count")
	private Long itemsCount;

	/**
	 * ����ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ʒ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * �ۼƲɹ�����
	 */
	@ApiField("orders_count")
	private Long ordersCount;

	/**
	 * �̼ұ���
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * ��ƷͼƬ·��
	 */
	@ApiField("pictures")
	private String pictures;

	/**
	 * ��ƷID
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * ems���ã���λ��Ԫ
	 */
	@ApiField("postage_ems")
	private String postageEms;

	/**
	 * ��ݷ��ã���λ��Ԫ
	 */
	@ApiField("postage_fast")
	private String postageFast;

	/**
	 * �˷�ģ��ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * ƽ�ʷ��ã���λ��Ԫ
	 */
	@ApiField("postage_ordinary")
	private String postageOrdinary;

	/**
	 * �˷����ͣ���ѡֵ��seller����Ӧ�̳е��˷ѣ���buyer�������̳е��˷ѣ�
	 */
	@ApiField("postage_type")
	private String postageType;

	/**
	 * ��Ʒ��ID
	 */
	@ApiField("productcat_id")
	private Long productcatId;

	/**
	 * ���ڵأ�ʡ
	 */
	@ApiField("prov")
	private String prov;

	/**
	 * ��Ʒ���
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * ������ۼۣ���λ���֡�
	 */
	@ApiField("retail_price_high")
	private String retailPriceHigh;

	/**
	 * ������ۼۣ���λ���֡�
	 */
	@ApiField("retail_price_low")
	private String retailPriceLow;

	/**
	 * sku�б�
	 */
	@ApiListField("skus")
	@ApiField("fenxiao_sku")
	private List<FenxiaoSku> skus;

	/**
	 * �г��۸񣬵�λ��Ԫ��
	 */
	@ApiField("standard_price")
	private String standardPrice;

	/**
	 * ����״̬����ѡֵ��up���ϼܣ���down���¼ܣ�
	 */
	@ApiField("status")
	private String status;

	/**
	 * ������ʽ��AGENT��ֻ��������Ĭ��ֵ����DEALER��ֻ����������ALL�������;���������
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * �̻�ʱ��
	 */
	@ApiField("upshelf_time")
	private Date upshelfTime;

	public Long getAlarmNumber() {
		return this.alarmNumber;
	}
	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescPath() {
		return this.descPath;
	}
	public void setDescPath(String descPath) {
		this.descPath = descPath;
	}

	public Long getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Boolean getHaveGuarantee() {
		return this.haveGuarantee;
	}
	public void setHaveGuarantee(Boolean haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}

	public Boolean getHaveInvoice() {
		return this.haveInvoice;
	}
	public void setHaveInvoice(Boolean haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public Long getItemsCount() {
		return this.itemsCount;
	}
	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOrdersCount() {
		return this.ordersCount;
	}
	public void setOrdersCount(Long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPictures() {
		return this.pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPostageEms() {
		return this.postageEms;
	}
	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}

	public String getPostageFast() {
		return this.postageFast;
	}
	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}
	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}

	public String getPostageType() {
		return this.postageType;
	}
	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}
	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}
	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}

	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}
	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}

	public List<FenxiaoSku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<FenxiaoSku> skus) {
		this.skus = skus;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Date getUpshelfTime() {
		return this.upshelfTime;
	}
	public void setUpshelfTime(Date upshelfTime) {
		this.upshelfTime = upshelfTime;
	}

}
