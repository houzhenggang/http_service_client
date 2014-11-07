package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaSearchItems;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.items.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class TaohuaItemsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8252325477658144653L;

	/** 
	 * ��Ʒ�����б����ݽṹ
	 */
	@ApiField("search_items_result")
	private TaohuaSearchItems searchItemsResult;

	public void setSearchItemsResult(TaohuaSearchItems searchItemsResult) {
		this.searchItemsResult = searchItemsResult;
	}
	public TaohuaSearchItems getSearchItemsResult( ) {
		return this.searchItemsResult;
	}

}
