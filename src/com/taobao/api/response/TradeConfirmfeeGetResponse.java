package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeConfirmFee;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.confirmfee.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class TradeConfirmfeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3264319548294511387L;

	/** 
	 * ��ȡ���Ľ���ȷ���ջ�����
	 */
	@ApiField("trade_confirm_fee")
	private TradeConfirmFee tradeConfirmFee;

	public void setTradeConfirmFee(TradeConfirmFee tradeConfirmFee) {
		this.tradeConfirmFee = tradeConfirmFee;
	}
	public TradeConfirmFee getTradeConfirmFee( ) {
		return this.tradeConfirmFee;
	}

}
