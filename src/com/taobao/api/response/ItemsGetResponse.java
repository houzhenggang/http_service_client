package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5313513796434651876L;

	/** 
	 * ����������Ʒ�б������ֶθ���Ȩ�޺��趨��fields����
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	/** 
	 * ���������������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
