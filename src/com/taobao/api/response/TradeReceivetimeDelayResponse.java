package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.receivetime.delay response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class TradeReceivetimeDelayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3794623357682322374L;

	/** 
	 * ���º�Ľ������ݣ�ֻ����tid��modified�����ֶΡ�
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
