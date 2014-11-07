package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-11-19 18:09:00.0
 */
public class AirSupplyUser extends TaobaoObject {

	private static final long serialVersionUID = 1517122721328367165L;

	/**
	 * Email
	 */
	@ApiField("email")
	private String email;

	/**
	 * 24Сʱ�ͻ��绰
	 */
	@ApiField("hotline24h")
	private String hotline24h;

	/**
	 * ������id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �ֻ���
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * �����̼��
	 */
	@ApiField("name")
	private String name;

	/**
	 * �������ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �绰
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * �ܵ�������
	 */
	@ApiField("score_order_num")
	private Long scoreOrderNum;

	/**
	 * �����ܻ��֣��ַ�����ʾ�� double ����
	 */
	@ApiField("total_score")
	private String totalScore;

	/**
	 * �����������ʺ�
	 */
	@ApiField("wangwang")
	private String wangwang;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getHotline24h() {
		return this.hotline24h;
	}
	public void setHotline24h(String hotline24h) {
		this.hotline24h = hotline24h;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getScoreOrderNum() {
		return this.scoreOrderNum;
	}
	public void setScoreOrderNum(Long scoreOrderNum) {
		this.scoreOrderNum = scoreOrderNum;
	}

	public String getTotalScore() {
		return this.totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public String getWangwang() {
		return this.wangwang;
	}
	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

}
