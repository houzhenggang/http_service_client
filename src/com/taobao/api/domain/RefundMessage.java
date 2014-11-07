package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ����/ƾ֤���ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-12 16:00:32.0
 */
public class RefundMessage extends TaobaoObject {

	private static final long serialVersionUID = 1295873944571795424L;

	/**
	 * �������ݡ���󳤶�: 400���ֽ�
	 */
	@ApiField("content")
	private String content;

	/**
	 * ���Դ���ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ���Ա��
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �˿����ͣ�NORMAL����ͨ���ԣ���RETURN_GOODS_APPROVED���������˻���ַʱ���ԣ������ΪRETURN_GOODS_APPROVED�����˿��������������ջ���ַ
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * �����߱��
	 */
	@ApiField("owner_id")
	private Long ownerId;

	/**
	 * �������ǳ�
	 */
	@ApiField("owner_nick")
	private String ownerNick;

	/**
	 * ���������
	 */
	@ApiField("owner_role")
	private String ownerRole;

	/**
	 * ƾ֤������ַ��ͼƬ��
	 */
	@ApiListField("pic_urls")
	@ApiField("pic_url")
	private List<PicUrl> picUrls;

	/**
	 * �˿��š�
	 */
	@ApiField("refund_id")
	private Long refundId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerNick() {
		return this.ownerNick;
	}
	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	public String getOwnerRole() {
		return this.ownerRole;
	}
	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}

	public List<PicUrl> getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(List<PicUrl> picUrls) {
		this.picUrls = picUrls;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

}
