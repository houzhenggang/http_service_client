package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ͷ�����
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:17:22.0
 */
public class Evaluation extends TaobaoObject {

	private static final long serialVersionUID = 6115348677824736299L;

	/**
	 * �ͷ���������
	 */
	@ApiField("evaluation_name")
	private String evaluationName;

	/**
	 * ��������
	 */
	@ApiField("evaluation_num")
	private String evaluationNum;

	public String getEvaluationName() {
		return this.evaluationName;
	}
	public void setEvaluationName(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public String getEvaluationNum() {
		return this.evaluationNum;
	}
	public void setEvaluationNum(String evaluationNum) {
		this.evaluationNum = evaluationNum;
	}

}
