package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������Ʒ���ؼ�¼
 *
 * @author auto create
 * @since 1.0, 2011-05-10 11:28:43.0
 */
public class FenxiaoItemRecord extends TaobaoObject {

	private static final long serialVersionUID = 4346845693194325412L;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ������ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��ƷID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * ������ʽ��AGENT��ֻ��������Ĭ��ֵ����DEALER��ֻ��������
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
