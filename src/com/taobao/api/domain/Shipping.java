package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-27 16:57:07.0
 */
public class Shipping extends TaobaoObject {

	private static final long serialVersionUID = 7519322369679465279L;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ������˾����
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * �˵�����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ԤԼȡ������ʱ��
	 */
	@ApiField("delivery_end")
	private Date deliveryEnd;

	/**
	 * ԤԼȡ����ʼʱ��
	 */
	@ApiField("delivery_start")
	private Date deliveryStart;

	/**
	 * ˭�е��˷�.��ѡֵ:buyer(��ҳе�),seller(���ҳе��˷�).
	 */
	@ApiField("freight_payer")
	private String freightPayer;

	/**
	 * ���ط����Ƿ�ɹ���
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/**
	 * ��������
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * �ռ��˵�ַ��Ϣ(�ڴ����������Fields�ֶ�ʱ������ʹ�á�receiver_location�����ܷ��ش��ֶ�)
	 */
	@ApiField("location")
	private Location location;

	/**
	 * �˵��޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����������
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * �˵���.����һ��������˾���˵�����.
	 */
	@ApiField("out_sid")
	private String outSid;

	/**
	 * �ռ����ֻ�����
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * �ռ�������
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * �ռ��˵绰
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * �����Ƿ�ȷ�Ϸ���.��ѡֵ:yes(��),no(��).
	 */
	@ApiField("seller_confirm")
	private String sellerConfirm;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ��������״̬,��ѡֵ:
CREATED(�����Ѵ���) 
RECREATED(�������´���) 
CANCELLED(������ȡ��) 
CLOSED(�����ر�) 
SENDING(�Ⱥ��͸�������˾) 
ACCEPTING(�ѷ��͸�������˾,�ȴ��ӵ�) 
ACCEPTED(������˾�ѽӵ�) 
REJECTED(������˾���ӵ�) 
PICK_UP(������˾���ճɹ�) 
PICK_UP_FAILED(������˾����ʧ��) 
LOST(������˾����) 
REJECTED_BY_RECEIVER(�Է���ǩ) 
ACCEPTED_BY_RECEIVER(�Է���ǩ��)
	 */
	@ApiField("status")
	private String status;

	/**
	 * ����ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ������ʽ.��ѡֵ:free(���Ұ���),post(ƽ��),express(���),ems(EMS).
	 */
	@ApiField("type")
	private String type;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDeliveryEnd() {
		return this.deliveryEnd;
	}
	public void setDeliveryEnd(Date deliveryEnd) {
		this.deliveryEnd = deliveryEnd;
	}

	public Date getDeliveryStart() {
		return this.deliveryStart;
	}
	public void setDeliveryStart(Date deliveryStart) {
		this.deliveryStart = deliveryStart;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOutSid() {
		return this.outSid;
	}
	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getSellerConfirm() {
		return this.sellerConfirm;
	}
	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
