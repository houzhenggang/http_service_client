package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Room���Ƶ���Ʒ���ṹ�����ֶ���ϸ˵���ɲο��ӿڶ��壬�磺��Ʒ�����ӿڡ�
 *
 * @author auto create
 * @since 1.0, 2011-05-30 18:57:39.0
 */
public class Room extends TaobaoObject {

	private static final long serialVersionUID = 1217539726146824169L;

	/**
	 * ���
	 */
	@ApiField("area")
	private String area;

	/**
	 * �������
	 */
	@ApiField("bbn")
	private String bbn;

	/**
	 * ����
	 */
	@ApiField("bed_type")
	private String bedType;

	/**
	 * ���
	 */
	@ApiField("breakfast")
	private String breakfast;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ����
	 */
	@ApiField("deposit")
	private Long deposit;

	/**
	 * ��Ʒ����
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ������
	 */
	@ApiField("fee")
	private Long fee;

	/**
	 * �Ƶ���Ʒid
	 */
	@ApiField("gid")
	private Long gid;

	/**
	 * ������֪
	 */
	@ApiField("guide")
	private String guide;

	/**
	 * �Ƶ�id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * �Ƶ���Ϣ
	 */
	@ApiField("hotel")
	private Hotel hotel;

	/**
	 * �Ա���Ʒid
	 */
	@ApiField("iid")
	private Long iid;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ֧������
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * �Ƶ���ƷͼƬUrl�����url�ö��Ÿ���
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ����id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * ��̬��Ϣ��JSON��ʽ��
	 */
	@ApiField("room_quotas")
	private String roomQuotas;

	/**
	 * ������Ϣ
	 */
	@ApiField("room_type")
	private RoomType roomType;

	/**
	 * ��ʩ����JSON��ʽ��
	 */
	@ApiField("service")
	private String service;

	/**
	 * ����
	 */
	@ApiField("size")
	private String size;

	/**
	 * ״̬��1���ϼܡ�2���¼ܡ�3��ɾ��
	 */
	@ApiField("status")
	private Long status;

	/**
	 * ¥��
	 */
	@ApiField("storey")
	private String storey;

	/**
	 * �Ƶ���Ʒ����
	 */
	@ApiField("title")
	private String title;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getBbn() {
		return this.bbn;
	}
	public void setBbn(String bbn) {
		this.bbn = bbn;
	}

	public String getBedType() {
		return this.bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getBreakfast() {
		return this.breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDeposit() {
		return this.deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getFee() {
		return this.fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getGid() {
		return this.gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}

	public String getGuide() {
		return this.guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Hotel getHotel() {
		return this.hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Long getIid() {
		return this.iid;
	}
	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getRoomQuotas() {
		return this.roomQuotas;
	}
	public void setRoomQuotas(String roomQuotas) {
		this.roomQuotas = roomQuotas;
	}

	public RoomType getRoomType() {
		return this.roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStorey() {
		return this.storey;
	}
	public void setStorey(String storey) {
		this.storey = storey;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
