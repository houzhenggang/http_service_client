package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Postage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.postages.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class PostagesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5639127996672888817L;

	/** 
	 * �˷�ģ���б�
	 */
	@ApiListField("postages")
	@ApiField("postage")
	private List<Postage> postages;

	/** 
	 * ��õ����������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setPostages(List<Postage> postages) {
		this.postages = postages;
	}
	public List<Postage> getPostages( ) {
		return this.postages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
