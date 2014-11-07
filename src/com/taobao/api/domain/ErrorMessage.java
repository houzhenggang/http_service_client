package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * δ���ųɹ�����ǳƣ�����ʧ��ԭ��
 *
 * @author auto create
 * @since 1.0, 2011-03-28 11:57:32.0
 */
public class ErrorMessage extends TaobaoObject {

	private static final long serialVersionUID = 8555866128981479533L;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ����ʧ�ܵ�ԭ��
	 */
	@ApiField("reason")
	private String reason;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
