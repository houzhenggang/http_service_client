package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * (ĳ��)�ظ�ͳ���б�
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:22:20.0
 */
public class ReplyStatOnDay extends TaobaoObject {

	private static final long serialVersionUID = 1679478645969619221L;

	/**
	 * ĳ�죨�Ļظ�ͳ�ƣ�
	 */
	@ApiField("reply_date")
	private Date replyDate;

	/**
	 * �ͷ��ظ�ͳ��
	 */
	@ApiListField("reply_stat_by_ids")
	@ApiField("reply_stat_by_id")
	private List<ReplyStatById> replyStatByIds;

	public Date getReplyDate() {
		return this.replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	public List<ReplyStatById> getReplyStatByIds() {
		return this.replyStatByIds;
	}
	public void setReplyStatByIds(List<ReplyStatById> replyStatByIds) {
		this.replyStatByIds = replyStatByIds;
	}

}
