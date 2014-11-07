package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ItemData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.todayitems.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class JuTodayitemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5237223474261851316L;

	/** 
	 * �ۻ�����Ʒ�����б�
	 */
	@ApiListField("item_list")
	@ApiField("item_data")
	private List<ItemData> itemList;

	public void setItemList(List<ItemData> itemList) {
		this.itemList = itemList;
	}
	public List<ItemData> getItemList( ) {
		return this.itemList;
	}

}
