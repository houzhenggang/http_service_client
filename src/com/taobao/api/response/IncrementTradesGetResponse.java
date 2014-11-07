package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NotifyTrade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.trades.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class IncrementTradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5143566962277635256L;

	/** 
	 * ��ȡ�Ľ���֪ͨ��Ϣ�� �������ֶμ�NotifyTrade���ݽṹ
	 */
	@ApiListField("notify_trades")
	@ApiField("notify_trade")
	private List<NotifyTrade> notifyTrades;

	/** 
	 * ���������������Ľ������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setNotifyTrades(List<NotifyTrade> notifyTrades) {
		this.notifyTrades = notifyTrades;
	}
	public List<NotifyTrade> getNotifyTrades( ) {
		return this.notifyTrades;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
