package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������õĵȼ��Ż���Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:27:29.0
 */
public class GradePromotion extends TaobaoObject {

	private static final long serialVersionUID = 2693629431329885673L;

	/**
	 * ��һ�Ա���� general����ͨ��Ա senior ���߼���Ա vip��VIP��Ա king������VIP
	 */
	@ApiField("cur_grade")
	private String curGrade;

	/**
	 * ��ͨ��Ա ���߼���Ա��VIP��Ա������VIP
	 */
	@ApiField("cur_grade_name")
	private String curGradeName;

	/**
	 * ��Ա�����ۿ���û��С����990����9.9��
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * ��������һ���������Ҫ�Ľ��׶�÷ֱ�ʾ
	 */
	@ApiField("next_upgrade_amount")
	private Long nextUpgradeAmount;

	/**
	 * ��������һ���������Ҫ�Ľ�����
	 */
	@ApiField("next_upgrade_count")
	private Long nextUpgradeCount;

	public String getCurGrade() {
		return this.curGrade;
	}
	public void setCurGrade(String curGrade) {
		this.curGrade = curGrade;
	}

	public String getCurGradeName() {
		return this.curGradeName;
	}
	public void setCurGradeName(String curGradeName) {
		this.curGradeName = curGradeName;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Long getNextUpgradeAmount() {
		return this.nextUpgradeAmount;
	}
	public void setNextUpgradeAmount(Long nextUpgradeAmount) {
		this.nextUpgradeAmount = nextUpgradeAmount;
	}

	public Long getNextUpgradeCount() {
		return this.nextUpgradeCount;
	}
	public void setNextUpgradeCount(Long nextUpgradeCount) {
		this.nextUpgradeCount = nextUpgradeCount;
	}

}
