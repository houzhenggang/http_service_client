package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ��
 *
 * @author auto create
 * @since 1.0, 2011-06-09 14:10:59.0
 */
public class ProductCat extends TaobaoObject {

	private static final long serialVersionUID = 4718438198584571598L;

	/**
	 * ��Ʒ��ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ��Ʒ������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ��Ʒ����
	 */
	@ApiField("product_num")
	private Long productNum;

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

	public Long getProductNum() {
		return this.productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}

}
