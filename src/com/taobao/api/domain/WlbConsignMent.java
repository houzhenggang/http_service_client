package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������������ϵ
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:39:19.0
 */
public class WlbConsignMent extends TaobaoObject {

	private static final long serialVersionUID = 7481171412817639122L;

	/**
	 * ������ϵid
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �������û���Ʒid
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ��������
	 */
	@ApiField("number")
	private Long number;

	/**
	 * ��Ӧ����Ʒid
	 */
	@ApiField("tgt_item_id")
	private Long tgtItemId;

	/**
	 * ��Ӧ���û�id
	 */
	@ApiField("tgt_user_id")
	private Long tgtUserId;

	/**
	 * �������û�id
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getTgtItemId() {
		return this.tgtItemId;
	}
	public void setTgtItemId(Long tgtItemId) {
		this.tgtItemId = tgtItemId;
	}

	public Long getTgtUserId() {
		return this.tgtUserId;
	}
	public void setTgtUserId(Long tgtUserId) {
		this.tgtUserId = tgtUserId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
