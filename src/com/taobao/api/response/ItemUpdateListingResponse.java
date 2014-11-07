package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.update.listing response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ItemUpdateListingResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3623971373335111422L;

	/** 
	 * �ϼܺ󷵻ص���Ʒ��Ϣ�����صĽ������:num_iid��modified
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