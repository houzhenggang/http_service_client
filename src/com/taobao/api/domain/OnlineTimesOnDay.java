package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ĳ��Ŀͷ�����ʱ���б�
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:12:14.0
 */
public class OnlineTimesOnDay extends TaobaoObject {

	private static final long serialVersionUID = 3179164682461124194L;

	/**
	 * ��������
	 */
	@ApiField("online_date")
	private Date onlineDate;

	/**
	 * ����ʱ���б�
	 */
	@ApiListField("online_time_by_ids")
	@ApiField("online_time_by_id")
	private List<OnlineTimeById> onlineTimeByIds;

	public Date getOnlineDate() {
		return this.onlineDate;
	}
	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}

	public List<OnlineTimeById> getOnlineTimeByIds() {
		return this.onlineTimeByIds;
	}
	public void setOnlineTimeByIds(List<OnlineTimeById> onlineTimeByIds) {
		this.onlineTimeByIds = onlineTimeByIds;
	}

}
