package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ͷ��ظ�ͳ��
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:19:09.0
 */
public class ReplyStatById extends TaobaoObject {

	private static final long serialVersionUID = 6658928545954475654L;

	/**
	 * �ͷ��ظ���
	 */
	@ApiField("reply_num")
	private Long replyNum;

	/**
	 * �ͷ�ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getReplyNum() {
		return this.replyNum;
	}
	public void setReplyNum(Long replyNum) {
		this.replyNum = replyNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
