package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TradeRate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderates.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-21 17:32:25.0
 */
public class TraderatesSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2419486924195657635L;

	/** 
	 * ����������������
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * �����б�
	 */
	@ApiListField("trade_rates")
	@ApiField("trade_rate")
	private List<TradeRate> tradeRates;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeRates(List<TradeRate> tradeRates) {
		this.tradeRates = tradeRates;
	}
	public List<TradeRate> getTradeRates( ) {
		return this.tradeRates;
	}

}
