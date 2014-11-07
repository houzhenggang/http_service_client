package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.GroupMember;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.groupmember.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceGroupmemberGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3581248323466494864L;

	/** 
	 * �鼰���Ա�б�
	 */
	@ApiListField("group_member_list")
	@ApiField("group_member")
	private List<GroupMember> groupMemberList;

	public void setGroupMemberList(List<GroupMember> groupMemberList) {
		this.groupMemberList = groupMemberList;
	}
	public List<GroupMember> getGroupMemberList( ) {
		return this.groupMemberList;
	}

}
