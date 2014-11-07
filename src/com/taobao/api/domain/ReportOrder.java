package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������ϸ��
 *
 * @author auto create
 * @since 1.0, 2011-02-28 12:37:25.0
 */
public class ReportOrder extends TaobaoObject {

	private static final long serialVersionUID = 6772974198828581147L;

	/**
	 * ��Ʒ����
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ʣ������
	 */
	@ApiField("lave_count")
	private Long laveCount;

	/**
	 * �̼ұ���
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * ���۽��
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��������
	 */
	@ApiField("purchase_count")
	private Long purchaseCount;

	/**
	 * �ɹ������
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * ������
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * �ɹ�ʱ��
	 */
	@ApiField("purchase_time")
	private Date purchaseTime;

	/**
	 * ����������
	 */
	@ApiField("retailers_name")
	private String retailersName;

	/**
	 * ��������
	 */
	@ApiField("sale_count")
	private Long saleCount;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * ����ģʽ��*DISTRIBUTE(����)*VENDOR(����)
	 */
	@ApiField("tp_type")
	private String tpType;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getLaveCount() {
		return this.laveCount;
	}
	public void setLaveCount(Long laveCount) {
		this.laveCount = laveCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getPurchaseCount() {
		return this.purchaseCount;
	}
	public void setPurchaseCount(Long purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public String getPurchaseOid() {
		return this.purchaseOid;
	}
	public void setPurchaseOid(String purchaseOid) {
		this.purchaseOid = purchaseOid;
	}

	public String getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseTime() {
		return this.purchaseTime;
	}
	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public String getRetailersName() {
		return this.retailersName;
	}
	public void setRetailersName(String retailersName) {
		this.retailersName = retailersName;
	}

	public Long getSaleCount() {
		return this.saleCount;
	}
	public void setSaleCount(Long saleCount) {
		this.saleCount = saleCount;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTpType() {
		return this.tpType;
	}
	public void setTpType(String tpType) {
		this.tpType = tpType;
	}

}
