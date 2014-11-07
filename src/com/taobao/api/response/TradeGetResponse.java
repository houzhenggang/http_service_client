package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TradeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2325297911722964952L;

	/** 
	 * �������Ľ�����Ϣ�б����ص�Trade��Order�а����ľ�����ϢΪ���fields������ֶ���Ϣ
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
