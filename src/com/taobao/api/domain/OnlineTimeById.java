package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����ʱ��
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:22:20.0
 */
public class OnlineTimeById extends TaobaoObject {

	private static final long serialVersionUID = 3456595957491299451L;

	/**
	 * �ͷ�����ʱ�䳤�ȣ��룩
	 */
	@ApiField("online_times")
	private Long onlineTimes;

	/**
	 * �ͷ���ԱID
	 */
	@ApiField("service_staff_id")
	private String serviceStaffId;

	public Long getOnlineTimes() {
		return this.onlineTimes;
	}
	public void setOnlineTimes(Long onlineTimes) {
		this.onlineTimes = onlineTimes;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}
	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

}
