package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �鼰���Ա�б�
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:18:03.0
 */
public class GroupMember extends TaobaoObject {

	private static final long serialVersionUID = 6882393249381168133L;

	/**
	 * ����
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * ������
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * ���Ա�б����ŷָ�
	 */
	@ApiField("member_list")
	private String memberList;

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMemberList() {
		return this.memberList;
	}
	public void setMemberList(String memberList) {
		this.memberList = memberList;
	}

}
