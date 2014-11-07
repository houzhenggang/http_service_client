package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.BasicMember;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.members.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:46.0
 */
public class CrmMembersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6673758966271318653L;

	/** 
	 * ����һ��������ѯ�����ҵĻ�Ա
	 */
	@ApiListField("members")
	@ApiField("basic_member")
	private List<BasicMember> members;

	public void setMembers(List<BasicMember> members) {
		this.members = members;
	}
	public List<BasicMember> getMembers( ) {
		return this.members;
	}

}
