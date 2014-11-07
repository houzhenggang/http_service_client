package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��¼�����û���Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-06-21 11:54:50.0
 */
public class LoginUser extends TaobaoObject {

	private static final long serialVersionUID = 5292739529884354994L;

	/**
	 * ��פʱ��
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * ��ԱNICK
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �����û�ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * �����û�����(1:�����̣�2:��Ӧ��)
	 */
	@ApiField("user_type")
	private String userType;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
