package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˻�����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-23 14:46:09.0
 */
public class Passenger extends TaobaoObject {

	private static final long serialVersionUID = 4564485297391367195L;

	/**
	 * �˻�������
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * ��������ѣ���λ��
	 */
	@ApiField("build_price")
	private Long buildPrice;

	/**
	 * ֤�����룬ֻ��ʾǰ��λ�ͺ���λ�����ಿ������
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * ��0�����֤��1�����գ�2��ѧ��֤��3������֤��4������֤��5��̨��֤��6���۰�̨����7�����ʺ�Ա��8����������þ���֤��9��������
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * ȼ�͸���˰����λ��
	 */
	@ApiField("oil_price")
	private Long oilPrice;

	/**
	 * �˻��˱�ʶ
	 */
	@ApiField("passenger_id")
	private Long passengerId;

	/**
	 * �˻�������
	 */
	@ApiField("passenger_name")
	private String passengerName;

	/**
	 * �˻�����ϵ�绰
	 */
	@ApiField("passenger_phone")
	private String passengerPhone;

	/**
	 * PNR��Ϣ
	 */
	@ApiField("pnr")
	private String pnr;

	/**
	 * Ʊ��
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * Ʊ�ۣ���λ��
	 */
	@ApiField("ticket_price")
	private Long ticketPrice;

	/**
	 * Ʊ���ͣ�0�������Ʊ��1�����ͯƱ
	 */
	@ApiField("ticket_type")
	private Long ticketType;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getBuildPrice() {
		return this.buildPrice;
	}
	public void setBuildPrice(Long buildPrice) {
		this.buildPrice = buildPrice;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public Long getOilPrice() {
		return this.oilPrice;
	}
	public void setOilPrice(Long oilPrice) {
		this.oilPrice = oilPrice;
	}

	public Long getPassengerId() {
		return this.passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerPhone() {
		return this.passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPnr() {
		return this.pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Long getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(Long ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Long getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(Long ticketType) {
		this.ticketType = ticketType;
	}

}
