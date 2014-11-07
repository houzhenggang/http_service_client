package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ִ������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-12-13 12:45:24.0
 */
public class Inventory extends TaobaoObject {

	private static final long serialVersionUID = 4866981133286464541L;

	/**
	 * �ֿ���ƷID��ͬitem_id��Ŀǰֻ��taobao.warehouse.items.page.get���ص���auction_id
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * ���ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �ִ���ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����Ʒ����
	 */
	@ApiField("junk_count")
	private Long junkCount;

	/**
	 * �̼ұ��� ��������ʶ���Ա��������ⲿ����֮���Ʒ����Ʒһ���Ե��Զ�����뷽ʽ��ҵ�񳡾�������ͨ�����̼ұ��붨ʱ���ⲿ�������Ʒ�����������µ��Ա����̡�
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * �����ۿ������
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * �̼ұ�ʶ
	 */
	@ApiField("seller_code")
	private String sellerCode;

	/**
	 * �Զ���ֿ��ʶ
	 */
	@ApiField("sellerstore_id")
	private Long sellerstoreId;

	/**
	 * ״̬: ����1����ASYNCHRONISM(δͬ��) ����2����SYCHRONISM(ͬ��) ����3����DELETED(ɾ��)
	 */
	@ApiField("status")
	private Long status;

	/**
	 * �ⲿ�ֿ����
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * �ܿ������
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * ��澯��ֵ
	 */
	@ApiField("warn_line")
	private Long warnLine;

	public Long getAuctionId() {
		return this.auctionId;
	}
	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

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

	public Long getJunkCount() {
		return this.junkCount;
	}
	public void setJunkCount(Long junkCount) {
		this.junkCount = junkCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	public String getSellerCode() {
		return this.sellerCode;
	}
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public Long getSellerstoreId() {
		return this.sellerstoreId;
	}
	public void setSellerstoreId(Long sellerstoreId) {
		this.sellerstoreId = sellerstoreId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getWarnLine() {
		return this.warnLine;
	}
	public void setWarnLine(Long warnLine) {
		this.warnLine = warnLine;
	}

}
