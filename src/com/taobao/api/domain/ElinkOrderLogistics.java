package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ֶ�����ϸ��
 *
 * @author auto create
 * @since 1.0, 2011-07-12 13:48:04.0
 */
public class ElinkOrderLogistics extends TaobaoObject {

	private static final long serialVersionUID = 4123264299376432458L;

	/**
	 * ��Ʊ���
	 */
	@ApiField("invoice_price")
	private String invoicePrice;

	/**
	 * ���ϱ���
	 */
	@ApiField("materials_id")
	private String materialsId;

	/**
	 * ��Ʒ����
	 */
	@ApiField("num")
	private Long num;

	/**
	 * ��ƷID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �Ӷ������
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * �̼ұ���
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * �ɹ������
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * �ɹ���ϸ��ID
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	/**
	 * �����۸�
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * ����������
	 */
	@ApiField("retailers_message")
	private String retailersMessage;

	/**
	 * ��������
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	/**
	 * ��������״̬����ѡֵ��*WAIT_SEND_GOODS(�ȴ�����)��*WAIT_CONFIRM_GOODS(�ѷ���)
	 */
	@ApiField("status")
	private String status;

	/**
	 * �Ա�����ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * �������͡�*TRADE_GHS(�������跢������);
	 */
	@ApiField("type")
	private String type;

	public String getInvoicePrice() {
		return this.invoicePrice;
	}
	public void setInvoicePrice(String invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public String getMaterialsId() {
		return this.materialsId;
	}
	public void setMaterialsId(String materialsId) {
		this.materialsId = materialsId;
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

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPurchaseOid() {
		return this.purchaseOid;
	}
	public void setPurchaseOid(String purchaseOid) {
		this.purchaseOid = purchaseOid;
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public String getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getRetailersMessage() {
		return this.retailersMessage;
	}
	public void setRetailersMessage(String retailersMessage) {
		this.retailersMessage = retailersMessage;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
