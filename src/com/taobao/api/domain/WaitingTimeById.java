package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ƽ���ȴ�ʱ��
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:08:31.0
 */
public class WaitingTimeById extends TaobaoObject {

	private static final long serialVersionUID = 8154253179299895274L;

	/**
	 * ƽ���ȴ�ʱ�䳤�ȣ��룩
	 */
	@ApiField("avg_waiting_times")
	private Long avgWaitingTimes;

	/**
	 * �ͷ���ԱID
	 */
	@ApiField("service_staff_id")
	private String serviceStaffId;

	public Long getAvgWaitingTimes() {
		return this.avgWaitingTimes;
	}
	public void setAvgWaitingTimes(Long avgWaitingTimes) {
		this.avgWaitingTimes = avgWaitingTimes;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}
	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

}
