package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.map.get.by.extentity response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemMapGetByExtentityResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6561924561592786921L;

	/** 
	 * ��������Ʒid
	 */
	@ApiField("item_id")
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId( ) {
		return this.itemId;
	}

}
