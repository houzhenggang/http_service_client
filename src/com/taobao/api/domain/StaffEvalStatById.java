package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ͷ�����ͳ��
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:02:37.0
 */
public class StaffEvalStatById extends TaobaoObject {

	private static final long serialVersionUID = 4538482916961964534L;

	/**
	 * �ͷ�����
	 */
	@ApiListField("evaluations")
	@ApiField("evaluation")
	private List<Evaluation> evaluations;

	/**
	 * �ͷ���ԱID
	 */
	@ApiField("service_staff_id")
	private String serviceStaffId;

	public List<Evaluation> getEvaluations() {
		return this.evaluations;
	}
	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}
	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

}
