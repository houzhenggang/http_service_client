package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ArticleSub;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.subsc.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasSubscSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2551585396742532769L;

	/** 
	 * ������ϵ����
	 */
	@ApiListField("article_subs")
	@ApiField("article_sub")
	private List<ArticleSub> articleSubs;

	/** 
	 * �ܼ�¼��
	 */
	@ApiField("total_item")
	private Long totalItem;

	public void setArticleSubs(List<ArticleSub> articleSubs) {
		this.articleSubs = articleSubs;
	}
	public List<ArticleSub> getArticleSubs( ) {
		return this.articleSubs;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}

}
