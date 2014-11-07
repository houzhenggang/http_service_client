package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Task;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.topats.trades.fullinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:50.0
 */
public class TopatsTradesFullinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2523368676884335687L;

	/** 
	 * ����������Ϣ������ֻ����task_id��created
	 */
	@ApiField("task")
	private Task task;

	public void setTask(Task task) {
		this.task = task;
	}
	public Task getTask( ) {
		return this.task;
	}

}
