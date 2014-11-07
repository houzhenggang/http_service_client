package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ƹ���
 *
 * @author auto create
 * @since 1.0, 2011-01-10 10:10:24.0
 */
public class ADGroup extends TaobaoObject {

	private static final long serialVersionUID = 3139334233893581645L;

	/**
	 * �ƹ���id
	 */
	@ApiField("adgroup_id")
	private Long adgroupId;

	/**
	 * �ƹ�ƻ�Id
	 */
	@ApiField("campaign_id")
	private Long campaignId;

	/**
	 * ��Ʒ��Ŀid���Ӹ���Ŀ������Ŀ���ÿո�ָ�
	 */
	@ApiField("category_ids")
	private String categoryIds;

	/**
	 * ����ʱ��
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * Ĭ�ϳ��ۣ���λΪ�֣�����С��5
	 */
	@ApiField("default_price")
	private Long defaultPrice;

	/**
	 * �������Ƿ�ʹ��Ĭ�ϳ��ۣ�false-���ã�true-ʹ�ã�Ĭ��Ϊtrue;
	 */
	@ApiField("is_nonsearch_default_price")
	private Boolean isNonsearchDefaultPrice;

	/**
	 * ����޸�ʱ��
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * �ƹ��������ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ���������ۣ���λΪ�֣�����С��5
	 */
	@ApiField("nonsearch_max_price")
	private Long nonsearchMaxPrice;

	/**
	 * ��Ʒ����id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * online-���ߣ�audit_offline-������ߣ�crm_offline-CRM���ߣ�Ĭ��Ϊonline
	 */
	@ApiField("offline_type")
	private String offlineType;

	/**
	 * �û����õ�������״̬��offline-����(��ͣ����)��online-���ߣ�Ĭ��Ϊonline
	 */
	@ApiField("online_status")
	private String onlineStatus;

	/**
	 * �������ԭ��
	 */
	@ApiField("reason")
	private String reason;

	public Long getAdgroupId() {
		return this.adgroupId;
	}
	public void setAdgroupId(Long adgroupId) {
		this.adgroupId = adgroupId;
	}

	public Long getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public String getCategoryIds() {
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDefaultPrice() {
		return this.defaultPrice;
	}
	public void setDefaultPrice(Long defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public Boolean getIsNonsearchDefaultPrice() {
		return this.isNonsearchDefaultPrice;
	}
	public void setIsNonsearchDefaultPrice(Boolean isNonsearchDefaultPrice) {
		this.isNonsearchDefaultPrice = isNonsearchDefaultPrice;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNonsearchMaxPrice() {
		return this.nonsearchMaxPrice;
	}
	public void setNonsearchMaxPrice(Long nonsearchMaxPrice) {
		this.nonsearchMaxPrice = nonsearchMaxPrice;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOfflineType() {
		return this.offlineType;
	}
	public void setOfflineType(String offlineType) {
		this.offlineType = offlineType;
	}

	public String getOnlineStatus() {
		return this.onlineStatus;
	}
	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
