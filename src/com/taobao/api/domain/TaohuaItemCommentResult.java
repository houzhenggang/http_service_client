package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �Ի���Ʒ����
 *
 * @author auto create
 * @since 1.0, 2011-03-09 11:07:08.0
 */
public class TaohuaItemCommentResult extends TaobaoObject {

	private static final long serialVersionUID = 2516994245573373134L;

	/**
	 * �Ի���Ʒ�����б�
	 */
	@ApiListField("taohua_item_comments")
	@ApiField("taohua_item_comment")
	private List<TaohuaItemComment> taohuaItemComments;

	/**
	 * ��������
	 */
	@ApiField("total_comment_num")
	private Long totalCommentNum;

	public List<TaohuaItemComment> getTaohuaItemComments() {
		return this.taohuaItemComments;
	}
	public void setTaohuaItemComments(List<TaohuaItemComment> taohuaItemComments) {
		this.taohuaItemComments = taohuaItemComments;
	}

	public Long getTotalCommentNum() {
		return this.totalCommentNum;
	}
	public void setTotalCommentNum(Long totalCommentNum) {
		this.totalCommentNum = totalCommentNum;
	}

}
