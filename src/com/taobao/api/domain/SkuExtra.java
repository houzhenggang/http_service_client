package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Sku��չ�����չsku��¼
 *
 * @author auto create
 * @since 1.0, 2011-04-19 22:12:32.0
 */
public class SkuExtra extends TaobaoObject {

	private static final long serialVersionUID = 2735974421112494277L;

	/**
	 * sku��������
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ����
	 */
	@ApiField("extra_id")
	private Long extraId;

	/**
	 * ��ע�����ܴ���1000���ֽ�
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * sku����޸�����
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �������sku����Ʒ�ļ۸� ȡֵ��Χ:0-100000000;��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֡�
	 */
	@ApiField("price")
	private String price;

	/**
	 * sku��������������ַ�������ɫ����С���ȵȣ�,����taobao.itemprops.get��ȡ��Ŀ���ԣ������������ɫ���ԣ�����taobao.itempropvalues.getȡ��vid����ʽ:pid:vid;pid:vid��
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * �������sku����Ʒ������,ȡֵ��Χ����0������
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * ��չsku��id
	 */
	@ApiField("sku_id")
	private Long skuId;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getExtraId() {
		return this.extraId;
	}
	public void setExtraId(Long extraId) {
		this.extraId = extraId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

}
