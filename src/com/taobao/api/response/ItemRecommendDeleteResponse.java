package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.recommend.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class ItemRecommendDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4686563255564231447L;

	/** 
	 * ��ȡ�������Ƽ�����Ʒ��Ϣ
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
