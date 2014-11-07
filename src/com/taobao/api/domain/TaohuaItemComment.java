package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ָ����Ʒ����
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:18:47.0
 */
public class TaohuaItemComment extends TaobaoObject {

	private static final long serialVersionUID = 5749254382138984983L;

	/**
	 * ��Ʒ���۵ľ�������
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * ���۷���ʱ��
	 */
	@ApiField("comment_date")
	private Date commentDate;

	/**
	 * ������
	 */
	@ApiField("user_nick")
	private String userNick;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return this.commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
