package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������ȹ���
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:43:47.0
 */
public class WlbOrderScheduleRule extends TaobaoObject {

	private static final long serialVersionUID = 1616849535547187485L;

	/**
	 * �ջ���ַ��Χ: 6λ���ĵ�ַID���ö��ŷָ����硰140400,230500����ͬһ�����ҵĶ������ȹ����У����õ��ջ���ַ��Χ�����ظ���
	 */
	@ApiField("area_ids")
	private String areaIds;

	/**
	 * ������������ID
	 */
	@ApiField("backup_store_id")
	private Long backupStoreId;

	/**
	 * Ĭ����������ID
	 */
	@ApiField("default_store_id")
	private Long defaultStoreId;

	/**
	 * �������ȹ���ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ��������Ķ���������ã� ������ϣ��ö��Ÿ���.
REMARK_STOP--�ж������Բ��Զ��·�;
COD_STOP--������������Զ��·�;
CHECK_WAREHOUSE_DELIVER--���ֿ�����ͷ�Χ
	 */
	@ApiField("options")
	private String options;

	/**
	 * Ԥ����������ID��Ԥ������δʹ�ã�
	 */
	@ApiField("presell_store_id")
	private Long presellStoreId;

	/**
	 * wlb_base_rule���ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	/**
	 * �̼�userId
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * ��ƷuserNick
	 */
	@ApiField("user_nick")
	private String userNick;

	public String getAreaIds() {
		return this.areaIds;
	}
	public void setAreaIds(String areaIds) {
		this.areaIds = areaIds;
	}

	public Long getBackupStoreId() {
		return this.backupStoreId;
	}
	public void setBackupStoreId(Long backupStoreId) {
		this.backupStoreId = backupStoreId;
	}

	public Long getDefaultStoreId() {
		return this.defaultStoreId;
	}
	public void setDefaultStoreId(Long defaultStoreId) {
		this.defaultStoreId = defaultStoreId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOptions() {
		return this.options;
	}
	public void setOptions(String options) {
		this.options = options;
	}

	public Long getPresellStoreId() {
		return this.presellStoreId;
	}
	public void setPresellStoreId(Long presellStoreId) {
		this.presellStoreId = presellStoreId;
	}

	public Long getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
