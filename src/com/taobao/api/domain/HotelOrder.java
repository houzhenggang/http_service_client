package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * HotelOrder���Ƶ궩�����ṹ�����ֶ���ϸ˵���ɲο��ӿڶ��塣
ע�⣺trade_status��refund_status��logistics_status�����ϸ�׼ȷ�ģ����Խ���API������API�ȵõ��Ķ���״̬������״̬Ϊ׼ȷ���ݡ�
 *
 * @author auto create
 * @since 1.0, 2011-05-30 09:58:07.0
 */
public class HotelOrder extends TaobaoObject {

	private static final long serialVersionUID = 5231344661584239286L;

	/**
	 * ֧�������׺�
	 */
	@ApiField("alipay_no")
	private Long alipayNo;

	/**
	 * ����Ա��˺�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ��סʱ��
	 */
	@ApiField("checkin_date")
	private Date checkinDate;

	/**
	 * ���ʱ��
	 */
	@ApiField("checkout_date")
	private Date checkoutDate;

	/**
	 * ��ϵ������
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * ��ϵ�˵绰
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * ������ϵ�˵绰
	 */
	@ApiField("contact_phone_bak")
	private String contactPhoneBak;

	/**
	 * ��������ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ����ʱ��
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ��Ʒid
	 */
	@ApiField("gid")
	private Long gid;

	/**
	 * ��ס����Ϣ
	 */
	@ApiListField("guests")
	@ApiField("order_guest")
	private List<OrderGuest> guests;

	/**
	 * �Ƶ�id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * ����״̬��STATUS_UNCONSIGNED��δ���� -> �ȴ����ҷ�����STATUS_CONSIGNED���ѷ��� -> �ȴ����ȷ���ջ���STATUS_DELIVERED�����ջ� -> ���׳ɹ���STATUS_REVERT���Ѿ��˻� -> ����ʧ�ܡ�STATUS_DELIVERED_PART�����ַ��� -> ���׳ɹ���STATUS_NO_OUT_ORDER����δ������������
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * �����޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ����
	 */
	@ApiField("nights")
	private Long nights;

	/**
	 * �Ƶ궩��id
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * ����ʱ��
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ʵ����֣�
	 */
	@ApiField("payment")
	private Long payment;

	/**
	 * �˿�״̬��STATUS_WAIT_SELLER_AGREE������Ѿ������˿�ȴ�����ͬ�⡣STATUS_WAIT_BUYER_RETURN_GOODS�������Ѿ�ͬ���˿�ȴ�����˻���STATUS_WAIT_SELLER_CONFIRM_GOODS������Ѿ��˻����ȴ�����ȷ���ջ���STATUS_CLOSED���˿�رա�STATUS_SUCCESS���˿�ɹ���STATUS_SELLER_REFUSE_BUYER�����Ҿܾ��˿STATUS_WAIT_OUT_PAY_SYSTEM_REFUND���ȴ��ⲿ����ϵͳ�˿STATUS_NO_REFUND��û�������˿STATUS_ACTIVE_REFUND���л�˿STATUS_END_REFUND���˿������
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * ����id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * ������
	 */
	@ApiField("room_number")
	private Long roomNumber;

	/**
	 * �����Ա��˺�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * �Ա�����id
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * �ܷ��ۣ��֣�
	 */
	@ApiField("total_room_price")
	private Long totalRoomPrice;

	/**
	 * ����״̬��WAIT_BUYER_PAY��δ����/δ���� -> �ȴ���Ҹ��WAIT_SELLER_SEND_GOODS���Ѷ���/�Ѹ��� -> �ȴ����ҷ�����TRADE_CLOSED�����˿� -> ���׹رա�TRADE_FINISHED����ת���� -> ���׳ɹ���TRADE_NO_CREATE_PAY��û�д���֧�������ס�TRADE_CLOSED_BY_TAOBAO�����ױ��Ա��ر�
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * ֧�����͡�A��ȫ��֧����B�����֧���������ѡ�C�����֧��������D�����֧����������/��ҹ
	 */
	@ApiField("type")
	private String type;

	public Long getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(Long alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getCheckinDate() {
		return this.checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return this.checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPhoneBak() {
		return this.contactPhoneBak;
	}
	public void setContactPhoneBak(String contactPhoneBak) {
		this.contactPhoneBak = contactPhoneBak;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getGid() {
		return this.gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}

	public List<OrderGuest> getGuests() {
		return this.guests;
	}
	public void setGuests(List<OrderGuest> guests) {
		this.guests = guests;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNights() {
		return this.nights;
	}
	public void setNights(Long nights) {
		this.nights = nights;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Long getPayment() {
		return this.payment;
	}
	public void setPayment(Long payment) {
		this.payment = payment;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getRoomNumber() {
		return this.roomNumber;
	}
	public void setRoomNumber(Long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTotalRoomPrice() {
		return this.totalRoomPrice;
	}
	public void setTotalRoomPrice(Long totalRoomPrice) {
		this.totalRoomPrice = totalRoomPrice;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
