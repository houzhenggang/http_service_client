package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ۻ�����Ʒ�����
 *
 * @author auto create
 * @since 1.0, 2011-01-05 15:22:28.0
 */
public class GroupData extends TaobaoObject {

	private static final long serialVersionUID = 4497469741247414912L;

	/**
	 * �Ž���ʱ��
	 */
	@ApiField("group_end_time")
	private Date groupEndTime;

	/**
	 * ��id��Ψһ��ʶһ���ۻ������
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * �������
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * �ſ�ʼʱ��
	 */
	@ApiField("group_start_time")
	private Date groupStartTime;

	/**
	 * �ۻ�����Ʒ�����б�
	 */
	@ApiListField("item_list")
	@ApiField("item_data")
	private List<ItemData> itemList;

	/**
	 * �����Ƿ��ھۻ���ƽ̨��ʾ
	 */
	@ApiField("ju_view")
	private Boolean juView;

	/**
	 * ��Ʒ������Ӧ��ƽ̨id��1001=�ۻ���
	 */
	@ApiField("platform_id")
	private Long platformId;

	public Date getGroupEndTime() {
		return this.groupEndTime;
	}
	public void setGroupEndTime(Date groupEndTime) {
		this.groupEndTime = groupEndTime;
	}

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

	public Date getGroupStartTime() {
		return this.groupStartTime;
	}
	public void setGroupStartTime(Date groupStartTime) {
		this.groupStartTime = groupStartTime;
	}

	public List<ItemData> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemData> itemList) {
		this.itemList = itemList;
	}

	public Boolean getJuView() {
		return this.juView;
	}
	public void setJuView(Boolean juView) {
		this.juView = juView;
	}

	public Long getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}

}
