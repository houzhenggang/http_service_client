package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CollectItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.favorite.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class FavoriteSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2713895825778716427L;

	/** 
	 * ���ز�ѯ������Ʒ����̵�����id�б�
	 */
	@ApiListField("collect_items")
	@ApiField("collect_item")
	private List<CollectItem> collectItems;

	/** 
	 * ��ѯ���ı������ղ�����
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCollectItems(List<CollectItem> collectItems) {
		this.collectItems = collectItems;
	}
	public List<CollectItem> getCollectItems( ) {
		return this.collectItems;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
