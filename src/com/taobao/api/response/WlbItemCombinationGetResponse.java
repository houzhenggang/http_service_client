package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.combination.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemCombinationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6543945928966237948L;

	/** 
	 * �������Ʒid�б�
	 */
	@ApiListField("item_id_list")
	@ApiField("number")
	private List<Long> itemIdList;

	public void setItemIdList(List<Long> itemIdList) {
		this.itemIdList = itemIdList;
	}
	public List<Long> getItemIdList( ) {
		return this.itemIdList;
	}

}
