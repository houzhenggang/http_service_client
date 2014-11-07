package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ʒ����
 *
 * @author auto create
 * @since 1.0, 2010-04-23 17:58:52.0
 */
public class ItemSearch extends TaobaoObject {

	private static final long serialVersionUID = 6538515486839515742L;

	/**
	 * ��Ʒ��������
	 */
	@ApiListField("item_categories")
	@ApiField("item_category")
	private List<ItemCategory> itemCategories;

	/**
	 * ��Ʒ�б�
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	public List<ItemCategory> getItemCategories() {
		return this.itemCategories;
	}
	public void setItemCategories(List<ItemCategory> itemCategories) {
		this.itemCategories = itemCategories;
	}

	public List<Item> getItems() {
		return this.items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
