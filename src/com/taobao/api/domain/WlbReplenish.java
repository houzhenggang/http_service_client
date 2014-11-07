package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����������ͳ�ƶ���
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:38:11.0
 */
public class WlbReplenish extends TaobaoObject {

	private static final long serialVersionUID = 6395957243258111932L;

	/**
	 * ������ʷͳ��ֵ���������Ԥ��ֵ
WarnByLast3Days=1; ByLast3Days=3;
ByLast10Days=10;
ByLast30Days=30;
ByLast90Days=90
WarnByLast3DaysΪ���չ�ȥ3��ķ����ļ�����ͳ�ƵĴﵽ��ȫ��������������4��ֱ�Ϊ���չ�ȥ3��10��30��90�췢������Ʒ���������п�����ά�ֵ�����
	 */
	@ApiField("estimate_value")
	private String estimateValue;

	/**
	 * ������ʷͳ��ֵ
Last3DaysTotal=3; Last10DaysTotal=10;
Last30DaysTotal=30; Last90DaysTotal=90
�ֱ�Ϊ��ȥ3��10��30��90�췢������Ʒ����
	 */
	@ApiField("history_value")
	private String historyValue;

	/**
	 * ��Ʒid
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * �������ڣ���λ���죩
	 */
	@ApiField("retrieval_count")
	private Long retrievalCount;

	/**
	 * �����ۿ����
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * �ֿ����
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * ��;�����
	 */
	@ApiField("transport_count")
	private Long transportCount;

	/**
	 * �û�id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * ��ȫ���
	 */
	@ApiField("warn_count")
	private Long warnCount;

	public String getEstimateValue() {
		return this.estimateValue;
	}
	public void setEstimateValue(String estimateValue) {
		this.estimateValue = estimateValue;
	}

	public String getHistoryValue() {
		return this.historyValue;
	}
	public void setHistoryValue(String historyValue) {
		this.historyValue = historyValue;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getRetrievalCount() {
		return this.retrievalCount;
	}
	public void setRetrievalCount(Long retrievalCount) {
		this.retrievalCount = retrievalCount;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getTransportCount() {
		return this.transportCount;
	}
	public void setTransportCount(Long transportCount) {
		this.transportCount = transportCount;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getWarnCount() {
		return this.warnCount;
	}
	public void setWarnCount(Long warnCount) {
		this.warnCount = warnCount;
	}

}
