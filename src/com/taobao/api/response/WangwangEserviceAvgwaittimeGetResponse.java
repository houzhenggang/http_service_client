package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WaitingTimesOnDay;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.avgwaittime.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceAvgwaittimeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7235619612767884298L;

	/** 
	 * ƽ���ȴ�ʱ��
	 */
	@ApiListField("waiting_time_list_on_days")
	@ApiField("waiting_times_on_day")
	private List<WaitingTimesOnDay> waitingTimeListOnDays;

	public void setWaitingTimeListOnDays(List<WaitingTimesOnDay> waitingTimeListOnDays) {
		this.waitingTimeListOnDays = waitingTimeListOnDays;
	}
	public List<WaitingTimesOnDay> getWaitingTimeListOnDays( ) {
		return this.waitingTimeListOnDays;
	}

}
