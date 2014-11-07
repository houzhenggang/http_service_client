package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ItemSearch;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItemsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8173345831853282317L;

	/** 
	 * ����������Ʒ�������ֶθ���Ȩ�޺��趨��fields����
	 */
	@ApiField("item_search")
	private ItemSearch itemSearch;

	/** 
	 * ���������������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setItemSearch(ItemSearch itemSearch) {
		this.itemSearch = itemSearch;
	}
	public ItemSearch getItemSearch( ) {
		return this.itemSearch;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
