package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:28:55.0
 */
public class Group extends TaobaoObject {

	private static final long serialVersionUID = 2314715232955116858L;

	/**
	 * ����Ĵ���ʱ��
	 */
	@ApiField("group_create")
	private Date groupCreate;

	/**
	 * �����id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * ������޸�ʱ��
	 */
	@ApiField("group_modify")
	private Date groupModify;

	/**
	 * ���������
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * ������ӵ�еĻ�Ա����,�������ֵΪ-1����ʾ��ǰ����æ��
	 */
	@ApiField("member_count")
	private Long memberCount;

	/**
	 * �����״̬��normal������deleteɾ��
	 */
	@ApiField("status")
	private String status;

	public Date getGroupCreate() {
		return this.groupCreate;
	}
	public void setGroupCreate(Date groupCreate) {
		this.groupCreate = groupCreate;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Date getGroupModify() {
		return this.groupModify;
	}
	public void setGroupModify(Date groupModify) {
		this.groupModify = groupModify;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getMemberCount() {
		return this.memberCount;
	}
	public void setMemberCount(Long memberCount) {
		this.memberCount = memberCount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
