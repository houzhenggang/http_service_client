package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ƶ궩����ס�˽ṹ��
 *
 * @author auto create
 * @since 1.0, 2011-05-11 11:26:57.0
 */
public class OrderGuest extends TaobaoObject {

	private static final long serialVersionUID = 1767167648913352899L;

	/**
	 * ��ס������
	 */
	@ApiField("name")
	private String name;

	/**
	 * �Ƶ궩��id
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * ��ס�����
	 */
	@ApiField("person_pos")
	private Long personPos;

	/**
	 * �������
	 */
	@ApiField("room_pos")
	private Long roomPos;

	/**
	 * ��ס�˵绰
	 */
	@ApiField("tel")
	private String tel;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getPersonPos() {
		return this.personPos;
	}
	public void setPersonPos(Long personPos) {
		this.personPos = personPos;
	}

	public Long getRoomPos() {
		return this.roomPos;
	}
	public void setRoomPos(Long roomPos) {
		this.roomPos = roomPos;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
