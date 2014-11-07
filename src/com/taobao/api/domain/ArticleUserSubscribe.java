package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �û�������Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-14 19:32:37.0
 */
public class ArticleUserSubscribe extends TaobaoObject {

	private static final long serialVersionUID = 4475538961517175178L;

	/**
	 * ������ϵ����ʱ��
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * �շ���Ŀ���룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ�����շ���Ŀ����
	 */
	@ApiField("item_code")
	private String itemCode;

	public Date getDeadline() {
		return this.deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
