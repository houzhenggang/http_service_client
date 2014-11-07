package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.memo.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TradeMemoUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3524513231942772737L;

	/** 
	 * ���½��׵ı�ע��Ϣ�󷵻ص�Trade�����п����ֶ�Ϊtid��modified
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
