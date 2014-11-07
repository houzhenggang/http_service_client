package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.OutEntityItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.map.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemMapGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6152652569492517976L;

	/** 
	 * �ⲿ��Ʒʵ���б�
	 */
	@ApiListField("out_entity_item_list")
	@ApiField("out_entity_item")
	private List<OutEntityItem> outEntityItemList;

	public void setOutEntityItemList(List<OutEntityItem> outEntityItemList) {
		this.outEntityItemList = outEntityItemList;
	}
	public List<OutEntityItem> getOutEntityItemList( ) {
		return this.outEntityItemList;
	}

}
