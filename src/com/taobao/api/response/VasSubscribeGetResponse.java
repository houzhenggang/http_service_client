package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ArticleUserSubscribe;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.subscribe.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasSubscribeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2689633929279917553L;

	/** 
	 * �û�������Ϣ
	 */
	@ApiListField("article_user_subscribes")
	@ApiField("article_user_subscribe")
	private List<ArticleUserSubscribe> articleUserSubscribes;

	public void setArticleUserSubscribes(List<ArticleUserSubscribe> articleUserSubscribes) {
		this.articleUserSubscribes = articleUserSubscribes;
	}
	public List<ArticleUserSubscribe> getArticleUserSubscribes( ) {
		return this.articleUserSubscribes;
	}

}
