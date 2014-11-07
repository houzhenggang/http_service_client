package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.custom.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class ItemsCustomGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6712811376531334775L;

	/** 
	 * ��Ʒ�б����巵���ֶ���fields����
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

}
