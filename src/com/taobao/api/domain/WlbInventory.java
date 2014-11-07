package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������������а�������ID���ֿ���룬��棬������͵�����
 *
 * @author auto create
 * @since 1.0, 2011-05-12 14:02:15.0
 */
public class WlbInventory extends TaobaoObject {

	private static final long serialVersionUID = 3262437171137422948L;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����(����)�������������ٿ����м�״̬������ǰ̨������1����Ʒ����ʱlock��1������Ʒ�����ʱ��lock�ټ���ȥ
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * �������(��Ч����)
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * �ֿ���룬�������ֿ����ͷ���ı�����йܿ��(�����Լ�����Ŀ�棬���������ɼ��ֳ����п��)�����ڲֿ����: STORE_SYS_PRIVATE
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * VENDIBLE--�����ۿ��
FREEZE--������
ONWAY--��;���
DEFECT--�д�Ʒ���
	 */
	@ApiField("type")
	private String type;

	/**
	 * ����ID
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLockQuantity() {
		return this.lockQuantity;
	}
	public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
