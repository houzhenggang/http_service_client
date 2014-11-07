package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����첽�������������
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:29:08.0
 */
public class Subtask extends TaobaoObject {

	private static final long serialVersionUID = 7517217817547559326L;

	/**
	 * ����������Ƿ�ɹ���Ϊtrue��ʾ������ɹ����û����԰�����ȷִ�еĽ����ʽ����sub_task_result��Ϊfalse��ʾ������ʧ���ˣ��û���Ҫ����ʧ�ܵĽ����ʽ����sub_task_result������ֻ��sub_code��sub_msg��
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/**
	 * ���������Ч�����������json��ʽ����key:value�����
	 */
	@ApiField("sub_task_request")
	private String subTaskRequest;

	/**
	 * �����񷵻صĽ������json��ʽ����key:value��ϣ����Ժ͵���api�������������á��Ի�ȡ���׶�������Ϊ����������ִ�гɹ����صĽ����ʽΪ��{��trade��:{"tid":123456,"seller_nick":"�Ա�����"}}��������ִ��ʧ�ܽ����ʽΪ{"sub_code":"isv.trade-not-exist","sub_msg":"���׶���������"}
	 */
	@ApiField("sub_task_result")
	private String subTaskResult;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getSubTaskRequest() {
		return this.subTaskRequest;
	}
	public void setSubTaskRequest(String subTaskRequest) {
		this.subTaskRequest = subTaskRequest;
	}

	public String getSubTaskResult() {
		return this.subTaskResult;
	}
	public void setSubTaskResult(String subTaskResult) {
		this.subTaskResult = subTaskResult;
	}

}
