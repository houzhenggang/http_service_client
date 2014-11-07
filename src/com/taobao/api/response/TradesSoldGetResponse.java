package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trades.sold.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class TradesSoldGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8445487893291135197L;

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
