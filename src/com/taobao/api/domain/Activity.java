package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-28 11:57:51.0
 */
public class Activity extends TaobaoObject {

	private static final long serialVersionUID = 6865639543762197357L;

	/**
	 * �id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * �����Ż�ȯ������
	 */
	@ApiField("activity_url")
	private String activityUrl;

	/**
	 * �Ѿ���ȡ���Ż�ȯ������
	 */
	@ApiField("applied_count")
	private Long appliedCount;

	/**
	 * ���Ӧ���Ż�ȯID
	 */
	@ApiField("coupon_id")
	private Long couponId;

	/**
	 * self�����Լ�������other���˴���
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * ÿ���������ȡ�Ż�ȯ��������1��5��
	 */
	@ApiField("person_limit_count")
	private Long personLimitCount;

	/**
	 * enabled������Ч��invalid����ʧЧ������ǿմ�������
	 */
	@ApiField("status")
	private String status;

	/**
	 * ���������Ż�ȯ��ȡ����������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getActivityUrl() {
		return this.activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public Long getAppliedCount() {
		return this.appliedCount;
	}
	public void setAppliedCount(Long appliedCount) {
		this.appliedCount = appliedCount;
	}

	public Long getCouponId() {
		return this.couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Long getPersonLimitCount() {
		return this.personLimitCount;
	}
	public void setPersonLimitCount(Long personLimitCount) {
		this.personLimitCount = personLimitCount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
