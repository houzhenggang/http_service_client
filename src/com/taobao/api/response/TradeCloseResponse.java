package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.close response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class TradeCloseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2826583817643738567L;

	/** 
	 * �رս���ʱ���ص�Trade��Ϣ�������ֶ���tid��modified
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
