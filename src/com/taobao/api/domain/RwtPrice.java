package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����Խӿ�ר��Price���ݽṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-21 19:50:32.0
 */
public class RwtPrice extends TaobaoObject {

	private static final long serialVersionUID = 2414146821787464276L;

	/**
	 * ����ʱ������λ�£�һ���£�1�����ȣ�3�����ꣻ6��һ�꣺12��
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * ����۸��id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �Ƿ���Ĭ�ϼ۸�0 ���� ��1 ��
	 */
	@ApiField("is_default")
	private Long isDefault;

	/**
	 * �۸���������󳤶�64���ַ�
	 */
	@ApiField("price_desc")
	private String priceDesc;

	/**
	 * �۸� ��λ��Ԫ
	 */
	@ApiField("rent_price")
	private String rentPrice;

	/**
	 * ���ⵥλ ��:�¡��������ꡢ��
	 */
	@ApiField("rent_unit")
	private String rentUnit;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(Long isDefault) {
		this.isDefault = isDefault;
	}

	public String getPriceDesc() {
		return this.priceDesc;
	}
	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public String getRentPrice() {
		return this.rentPrice;
	}
	public void setRentPrice(String rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getRentUnit() {
		return this.rentUnit;
	}
	public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

}
