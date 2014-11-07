package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.fullinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class TradeFullinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6495682713367427651L;

	/** 
	 * 搜索到的交易信息列表，返回的Trade和Order中包含的具体信息为入参fields请求的字段信息
	 */
	@ApiField("trade")
	private Trade trade;

	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}

}
