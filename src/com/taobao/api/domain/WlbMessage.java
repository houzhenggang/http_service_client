package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ͨ����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:40:47.0
 */
public class WlbMessage extends TaobaoObject {

	private static final long serialVersionUID = 4342879854989566996L;

	/**
	 * ����ʱ��
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * ��Ϣͨ��ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ֪ͨ��Ϣ���룺 STOCK_IN_NOT_CONSISTENT---��ⵥ��һ�� CANCEL_ORDER_SUCCESS---ȡ�������ɹ� INVENTORY_CHECK---�̵�
	 */
	@ApiField("msg_code")
	private String msgCode;

	/**
	 * ֪ͨ���ݣ�msg_codeΪSTOCK_IN_NOT_CONSISTENTʱ,msg_contentΪ:orderCode:code;orderItemId:111;itemId:123;planQuantity:10;relQuantity:6;
msg_codeΪCANCEL_ORDER_SUCCESSʱ,msg_contentΪ��orderCode:code;
msg_codeΪINVENTORY_CHECKʱ��msg_contentΪorderCode:code;
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * ��Ϣ����
	 */
	@ApiField("msg_description")
	private String msgDescription;

	/**
	 * ��Ϣ״̬�� ����Ҫȷ�ϣ�NO_NEED_CONFIRM ��ȷ�ϣ�CONFIRMED ��ȷ�ϣ�TO_BE_CONFIRM
	 */
	@ApiField("status")
	private String status;

	/**
	 * �û�ID
	 */
	@ApiField("user_id")
	private Long userId;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMsgCode() {
		return this.msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgDescription() {
		return this.msgDescription;
	}
	public void setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
