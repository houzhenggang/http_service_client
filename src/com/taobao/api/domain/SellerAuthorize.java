package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ȩ
 *
 * @author auto create
 * @since 1.0, 2010-09-08 13:38:15.0
 */
public class SellerAuthorize extends TaobaoObject {

	private static final long serialVersionUID = 5886432922961464338L;

	/**
	 * Ʒ���б�
	 */
	@ApiListField("brands")
	@ApiField("brand")
	private List<Brand> brands;

	/**
	 * ��Ŀ�б�
	 */
	@ApiListField("item_cats")
	@ApiField("item_cat")
	private List<ItemCat> itemCats;

	public List<Brand> getBrands() {
		return this.brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public List<ItemCat> getItemCats() {
		return this.itemCats;
	}
	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}

}
