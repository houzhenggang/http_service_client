package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RoomType�����ͣ��ṹ�����ֶ���ϸ˵���ɲο��ӿڶ��壬�磺���ͷ����ӿڡ�
 *
 * @author auto create
 * @since 1.0, 2011-05-30 10:06:12.0
 */
public class RoomType extends TaobaoObject {

	private static final long serialVersionUID = 7857214496126495794L;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �Ƶ�id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * ״̬��0������ˣ�1�����������ͨ������2����˷����3��ͣ��
	 */
	@ApiField("status")
	private Long status;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
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

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
