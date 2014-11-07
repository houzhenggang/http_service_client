package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Sku�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-08-19 15:33:20.0
 */
public class Sku extends TaobaoObject {

	private static final long serialVersionUID = 4782928971614853533L;

	/**
	 * sku�������� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private String created;

	/**
	 * sku����޸����� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private String modified;

	/**
	 * sku������Ʒ����id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �̼����õ��ⲿid
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * �������sku����Ʒ�ļ۸� ȡֵ��Χ:0-100000000;��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֡�
	 */
	@ApiField("price")
	private String price;

	/**
	 * sku��������������ַ�������ɫ����С���ȵȣ���ͨ����ĿAPI��ȡĳ��Ŀ�µ��������ԣ�,��ʽ��p1:v1;p2:v2
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * �������sku����Ʒ��������
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku��id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * sku״̬�� normal:���� ��delete:ɾ��
	 */
	@ApiField("status")
	private String status;

	public String getCreated() {
		return this.created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return this.modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
