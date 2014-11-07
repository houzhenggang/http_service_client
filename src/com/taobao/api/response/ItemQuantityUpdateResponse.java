package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.quantity.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class ItemQuantityUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2676352761179773289L;

	/** 
	 * iid��numIid��num��modified��skus��ÿ��sku��skuId��quantity��modified
	 */
	@ApiField("item")
	private Item item;

	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}

}
