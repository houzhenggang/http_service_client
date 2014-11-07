package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeAmount;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.amount.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TradeAmountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4421813299218986574L;

	/** 
	 * �������Ĳ�����Ϣ����
	 */
	@ApiField("trade_amount")
	private TradeAmount tradeAmount;

	public void setTradeAmount(TradeAmount tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public TradeAmount getTradeAmount( ) {
		return this.tradeAmount;
	}

}
