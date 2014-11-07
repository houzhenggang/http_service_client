package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.snapshot.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class TradeSnapshotGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6212417346293655983L;

	/** 
	 * ֻ����Trade�е�tid��snapshot���Ӷ���Order�е�oid��snapshot
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
