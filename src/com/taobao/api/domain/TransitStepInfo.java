package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����������Ϣ��һ��
 *
 * @author auto create
 * @since 1.0, 2010-12-20 17:41:12.0
 */
public class TransitStepInfo extends TaobaoObject {

	private static final long serialVersionUID = 8455126864644452815L;

	/**
	 * ״̬����
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * ״̬������ʱ��
	 */
	@ApiField("status_time")
	private String statusTime;

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStatusTime() {
		return this.statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

}
