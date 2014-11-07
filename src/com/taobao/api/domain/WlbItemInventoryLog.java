package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������¼
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:45:16.0
 */
public class WlbItemInventoryLog extends TaobaoObject {

	private static final long serialVersionUID = 6191187849513866283L;

	/**
	 * ���κ�
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * ��������
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * �����ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * VENDIBLE  1-������;
FREEZE  201-������;
ONWAY  301-��;���;
DEFECT  101-�д�Ʒ;
ENGINE_DAMAGE 102-����;
BOX_DAMAGE 103-����
	 */
	@ApiField("invent_type")
	private String inventType;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ������������
CHU_KU 1-����
RU_KU 2-���
FREEZE 3-����
THAW 4-�ⶳ
CHECK_FREEZE 5-����ȷ��
CHANGE_KU 6-������ͱ��
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * ��������ID
	 */
	@ApiField("op_user_id")
	private Long opUserId;

	/**
	 * ������
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * ������ƷID
	 */
	@ApiField("order_item_id")
	private Long orderItemId;

	/**
	 * ���������仯ֵ
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * ��ע
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * ���ֵ
	 */
	@ApiField("result_quantity")
	private Long resultQuantity;

	/**
	 * �ֿ����
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * �û�ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInventType() {
		return this.inventType;
	}
	public void setInventType(String inventType) {
		this.inventType = inventType;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public Long getOpUserId() {
		return this.opUserId;
	}
	public void setOpUserId(Long opUserId) {
		this.opUserId = opUserId;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getResultQuantity() {
		return this.resultQuantity;
	}
	public void setResultQuantity(Long resultQuantity) {
		this.resultQuantity = resultQuantity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
