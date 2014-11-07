package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��֤��
 *
 * @author auto create
 * @since 1.0, 2010-08-23 20:11:08.0
 */
public class GuarantyFund extends TaobaoObject {

	private static final long serialVersionUID = 7818166721578968438L;

	/**
	 * Ͷ�߱�ţ��˿�ID��
	 */
	@ApiField("accuse_id")
	private Long accuseId;

	/**
	 * ��֤����
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * ��֤�����
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * ��ұ��
	 */
	@ApiField("buyer_id")
	private Long buyerId;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ��֤�𴴽�ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��֤�𴴽���
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * ��֤����
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ��ע��һ��Ϊ�������ͼ��ϲ���������
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * ��֤���޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��֤���������
	 */
	@ApiField("operation_action")
	private String operationAction;

	/**
	 * ��֤��������� (��פ�̳Ƕ���1�����ɱ�֤��2�����׾���3���˳��̳ǽⶳ4����߱�֤����5�����ͱ�֤����6���˹��ⶳ��֤��7���˹�ת�Ʊ�֤��8������9)
	 */
	@ApiField("operation_type")
	private Long operationType;

	/**
	 * ��֤�������
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * �Ա����׺ţ��������ı�ţ�
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * �̼ұ��
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * �̼��ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ��֤��״̬��ʧ��0���ɹ�1��
	 */
	@ApiField("status")
	private Long status;

	/**
	 * ��֤�����ͣ����ᱣ֤��1���ⶳ��֤��2��ת�Ʊ�֤��3��
	 */
	@ApiField("type")
	private Long type;

	public Long getAccuseId() {
		return this.accuseId;
	}
	public void setAccuseId(Long accuseId) {
		this.accuseId = accuseId;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getBalance() {
		return this.balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getOperationAction() {
		return this.operationAction;
	}
	public void setOperationAction(String operationAction) {
		this.operationAction = operationAction;
	}

	public Long getOperationType() {
		return this.operationType;
	}
	public void setOperationType(Long operationType) {
		this.operationType = operationType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
