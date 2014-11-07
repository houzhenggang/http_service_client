package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �û���Ȩ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-12-15 18:37:50.0
 */
public class AuthorizeMessage extends TaobaoObject {

	private static final long serialVersionUID = 6234485999789322467L;

	/**
	 * ISV��AppKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * �û�������Ȩ����ǰISV��ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �û�����Ȩ����ʱ��
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * �û�����Ȩ��Ϣ�޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ȩ�û����Ա��ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �û�����Ȩ��ʼʱ�䡣��Ȩ���쿪ʼ���㡣start_date��ÿ����Ȩ���ڿ�ʼ��ʱ�䣬����������û�н����û����ӳ����޸�����Ȩ���ڣ������ʼʱ���ǲ����ģ�����������ڽ����Ժ������¿�ʼ�µ����ڣ�����ֶβŻᱻ�ı�
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * �û�����Ȩ״̬��normal����������expired�����ڣ�
	 */
	@ApiField("status")
	private String status;

	/**
	 * �û�����Ȩ�Ƿ��Ѿ���Ч����Ч��ʾ�ܹ��յ������Ϣ��
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
