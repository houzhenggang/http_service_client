package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����ֵ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 14:16:42.0
 */
public class PropValue extends TaobaoObject {

	private static final long serialVersionUID = 4335416711423819138L;

	/**
	 * ��ĿID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * �Ƿ�Ϊ����Ŀ����
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * ����ֵ
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����ֵ����
	 */
	@ApiField("name_alias")
	private String nameAlias;

	/**
	 * ���� ID
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * ������
	 */
	@ApiField("prop_name")
	private String propName;

	/**
	 * ������š�ȡֵ��Χ:�����������
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * ״̬����ѡֵ:normal(����),deleted(ɾ��)
	 */
	@ApiField("status")
	private String status;

	/**
	 * ����ֵID
	 */
	@ApiField("vid")
	private Long vid;

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return this.nameAlias;
	}
	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

}
