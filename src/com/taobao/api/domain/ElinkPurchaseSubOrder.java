package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ɹ�����ϸ
 *
 * @author auto create
 * @since 1.0, 2011-04-08 15:39:37.0
 */
public class ElinkPurchaseSubOrder extends TaobaoObject {

	private static final long serialVersionUID = 4867185218125562972L;

	/**
	 * ʵ�ʲɹ�����
	 */
	@ApiField("actual_num")
	private Long actualNum;

	/**
	 * ��������ڣ�����ϸ��Ϊ׼��
	 */
	@ApiField("inventory_lockdays")
	private Long inventoryLockdays;

	/**
	 * ���ϱ��ID
	 */
	@ApiField("materials_id")
	private String materialsId;

	/**
	 * ��Ʒ����ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �̼ұ���
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * �ƻ��ɹ�����
	 */
	@ApiField("plans_num")
	private Long plansNum;

	/**
	 * �������������ϸ��Ϊ׼��
	 */
	@ApiField("priceloss_scale")
	private String pricelossScale;

	/**
	 * ��Ʒ����
	 */
	@ApiField("product_description")
	private String productDescription;

	/**
	 * ��Ʒ����
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * �ɹ���ϸID
	 */
	@ApiField("purchase_detailsid")
	private String purchaseDetailsid;

	/**
	 * �ɹ�����ţ����ɹ�������������
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * ������
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * ��������ڽ���ʱ��
	 */
	@ApiField("stock_end")
	private Date stockEnd;

	/**
	 * ��������ڿ�ʼʱ��
	 */
	@ApiField("stock_start")
	private Date stockStart;

	/**
	 * �ɹ���ϸ���ܽ��(������*�ƻ��ɹ�����)
	 */
	@ApiField("total_price")
	private String totalPrice;

	public Long getActualNum() {
		return this.actualNum;
	}
	public void setActualNum(Long actualNum) {
		this.actualNum = actualNum;
	}

	public Long getInventoryLockdays() {
		return this.inventoryLockdays;
	}
	public void setInventoryLockdays(Long inventoryLockdays) {
		this.inventoryLockdays = inventoryLockdays;
	}

	public String getMaterialsId() {
		return this.materialsId;
	}
	public void setMaterialsId(String materialsId) {
		this.materialsId = materialsId;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Long getPlansNum() {
		return this.plansNum;
	}
	public void setPlansNum(Long plansNum) {
		this.plansNum = plansNum;
	}

	public String getPricelossScale() {
		return this.pricelossScale;
	}
	public void setPricelossScale(String pricelossScale) {
		this.pricelossScale = pricelossScale;
	}

	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPurchaseDetailsid() {
		return this.purchaseDetailsid;
	}
	public void setPurchaseDetailsid(String purchaseDetailsid) {
		this.purchaseDetailsid = purchaseDetailsid;
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

	public Date getStockEnd() {
		return this.stockEnd;
	}
	public void setStockEnd(Date stockEnd) {
		this.stockEnd = stockEnd;
	}

	public Date getStockStart() {
		return this.stockStart;
	}
	public void setStockStart(Date stockStart) {
		this.stockStart = stockStart;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}