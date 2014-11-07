package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbAuthorization;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.authorization.query response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemAuthorizationQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8648139279991129529L;

	/** 
	 * ��Ȩ��ϵ�б�
	 */
	@ApiListField("authorization_list")
	@ApiField("wlb_authorization")
	private List<WlbAuthorization> authorizationList;

	/** 
	 * �������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAuthorizationList(List<WlbAuthorization> authorizationList) {
		this.authorizationList = authorizationList;
	}
	public List<WlbAuthorization> getAuthorizationList( ) {
		return this.authorizationList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
