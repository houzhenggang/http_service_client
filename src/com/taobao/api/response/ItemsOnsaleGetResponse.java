package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.onsale.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class ItemsOnsaleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2631513273796573798L;

	/** 
	 * ����������Ʒ�б������ֶθ����趨��fields������������desc�ֶ�
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
