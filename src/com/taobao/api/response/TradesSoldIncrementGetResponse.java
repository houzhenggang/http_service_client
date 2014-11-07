package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trades.sold.increment.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class TradesSoldIncrementGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5715528325921584364L;

	/** 
	 * �Ƿ������һҳ
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * �������Ľ�����Ϣ����
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * �������Ľ�����Ϣ�б����ص�Trade��Order�а����ľ�����ϢΪ���fields������ֶ���Ϣ
	 */
	@ApiListField("trades")
	@ApiField("trade")
	private List<Trade> trades;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	public List<Trade> getTrades( ) {
		return this.trades;
	}

}
