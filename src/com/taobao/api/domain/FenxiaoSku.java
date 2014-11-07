package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������Ʒ
 *
 * @author auto create
 * @since 1.0, 2011-06-09 14:14:13.0
 */
public class FenxiaoSku extends TaobaoObject {

	private static final long serialVersionUID = 2531877881315855195L;

	/**
	 * �ɹ��۸񣬵�λ��Ԫ
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * SkuID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * �̼ұ���
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * sku��������������ַ�������ʽ:pid:vid;pid:vid,��:1627207:3232483;1630696:3284570,��ʾ:������ɫ:����ɫ;�ֻ��ײ�:һ��һ�䡣
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * ���
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * �г���
	 */
	@ApiField("standard_price")
	private String standardPrice;

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
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

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

}
