package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ִ���Ʒ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 14:15:29.0
 */
public class WarehouseItem extends TaobaoObject {

	private static final long serialVersionUID = 7471742278132334617L;

	/**
	 * ������/���š���󳤶�Ϊ64���ַ���һ�������������ַ�
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * ��Ʒid
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ��Ʒ���ơ���󳤶�Ϊ256�ַ���һ�������������ַ�
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * �Զ������ԡ���󳤶�Ϊ256�ַ���һ�������������ַ�
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * �̼ұ��롣�����ҷ�����Ʒ���̼ұ��뱣��һ�£��̼ұ���Ψһ����󳤶�Ϊ64���ַ�
	 */
	@ApiField("outer_id")
	private String outerId;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

}
