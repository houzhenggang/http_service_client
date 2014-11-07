package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �����첽������
 *
 * @author auto create
 * @since 1.0, 2011-07-26 17:25:22.0
 */
public class Task extends TaobaoObject {

	private static final long serialVersionUID = 3252973237185634944L;

	/**
	 * ���񴴽�ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �����������ص�ַ�����������������Ǵ�������������ʱ����ȡ����᷵�ش��ֶΣ�ͬʱsubtasks�б��Ϊ�ա�
ͨ�������ַ�������ص�����Ľṹ�壬��ʽͬ��ͨ�������ص�һ����
ÿ�λ�ȡ���ĵ�ַֻ������һ�Ρ����ص��ļ����Ϻ�׺��.zip�򿪡�
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * �����������ĸ�api������
	 */
	@ApiField("method")
	private String method;

	/**
	 * �첽������״̬��new����δ��ʼ������doing�������У���done�������������
	 */
	@ApiField("status")
	private String status;

	/**
	 * �������������������û�д����꣬���صĽ���б�Ϊ�ա������������ϣ��������������б�
	 */
	@ApiListField("subtasks")
	@ApiField("subtask")
	private List<Subtask> subtasks;

	/**
	 * �첽����id�������첽����ʱ���ص�����id��
	 */
	@ApiField("task_id")
	private Long taskId;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Subtask> getSubtasks() {
		return this.subtasks;
	}
	public void setSubtasks(List<Subtask> subtasks) {
		this.subtasks = subtasks;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
