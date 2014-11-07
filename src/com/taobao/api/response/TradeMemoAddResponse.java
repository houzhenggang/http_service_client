package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.memo.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TradeMemoAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5884183168436269851L;

	/** 
	 * ��һ�ʽ�����ӱ�ע�󷵻����Ӧ��Trade��Trade�п��õķ����ֶ���tid��created
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
