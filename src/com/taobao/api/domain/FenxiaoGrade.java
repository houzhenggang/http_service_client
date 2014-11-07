package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����̵ȼ�
 *
 * @author auto create
 * @since 1.0, 2011-03-17 14:15:48.0
 */
public class FenxiaoGrade extends TaobaoObject {

	private static final long serialVersionUID = 6516356193728367624L;

	/**
	 * ��¼����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ����
	 */
	@ApiField("grade_id")
	private Long gradeId;

	/**
	 * ��¼����޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����̵ȼ�����
	 */
	@ApiField("name")
	private String name;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getGradeId() {
		return this.gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
