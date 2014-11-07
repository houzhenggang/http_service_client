package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ͻ��ȴ����ͷ���ƽ��ʱ���б�
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:11:32.0
 */
public class WaitingTimesOnDay extends TaobaoObject {

	private static final long serialVersionUID = 3649656965566629133L;

	/**
	 * �ȴ�ʱ����ͳ�ƣ�����
	 */
	@ApiField("waiting_date")
	private Date waitingDate;

	/**
	 * �ȴ�ʱ���б�
	 */
	@ApiListField("waiting_time_by_ids")
	@ApiField("waiting_time_by_id")
	private List<WaitingTimeById> waitingTimeByIds;

	public Date getWaitingDate() {
		return this.waitingDate;
	}
	public void setWaitingDate(Date waitingDate) {
		this.waitingDate = waitingDate;
	}

	public List<WaitingTimeById> getWaitingTimeByIds() {
		return this.waitingTimeByIds;
	}
	public void setWaitingTimeByIds(List<WaitingTimeById> waitingTimeByIds) {
		this.waitingTimeByIds = waitingTimeByIds;
	}

}
