package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.items.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class TaobaokeItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7189515176296839131L;

	/** 
	 * �Ա�����Ʒ�����б�.������taobaoke_cat_click_url��keyword_click_url�����ֶΡ�
	 */
	@ApiListField("taobaoke_items")
	@ApiField("taobaoke_item")
	private List<TaobaokeItem> taobaokeItems;

	/** 
	 * ���������������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaobaokeItems(List<TaobaokeItem> taobaokeItems) {
		this.taobaokeItems = taobaokeItems;
	}
	public List<TaobaokeItem> getTaobaokeItems( ) {
		return this.taobaokeItems;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
