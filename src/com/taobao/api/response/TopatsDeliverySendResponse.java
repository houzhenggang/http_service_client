package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Task;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.topats.delivery.send response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:50.0
 */
public class TopatsDeliverySendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3669319427847738969L;

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
