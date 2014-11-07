package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * δ�ظ�ͳ���б�(����)
 *
 * @author auto create
 * @since 1.0, 2011-01-05 19:54:52.0
 */
public class NonReplyStatOnDay extends TaobaoObject {

	private static final long serialVersionUID = 3647882761145653594L;

	/**
	 * ��ĳ��ģ�δ�ظ�ͳ��
	 */
	@ApiField("nonreply_date")
	private Date nonreplyDate;

	/**
	 * δ�ظ�ͳ���б�
	 */
	@ApiListField("nonreply_stat_by_ids")
	@ApiField("nonreply_stat_by_id")
	private List<NonreplyStatById> nonreplyStatByIds;

	public Date getNonreplyDate() {
		return this.nonreplyDate;
	}
	public void setNonreplyDate(Date nonreplyDate) {
		this.nonreplyDate = nonreplyDate;
	}

	public List<NonreplyStatById> getNonreplyStatByIds() {
		return this.nonreplyStatByIds;
	}
	public void setNonreplyStatByIds(List<NonreplyStatById> nonreplyStatByIds) {
		this.nonreplyStatByIds = nonreplyStatByIds;
	}

}
