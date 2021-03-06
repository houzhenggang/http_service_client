package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.AuthorizeMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.authorizemessages.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class IncrementAuthorizemessagesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7832535192375456822L;

	/** 
	 * 用户授权信息列表
	 */
	@ApiListField("authorize_messages")
	@ApiField("authorize_message")
	private List<AuthorizeMessage> authorizeMessages;

	/** 
	 * 符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setAuthorizeMessages(List<AuthorizeMessage> authorizeMessages) {
		this.authorizeMessages = authorizeMessages;
	}
	public List<AuthorizeMessage> getAuthorizeMessages( ) {
		return this.authorizeMessages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
