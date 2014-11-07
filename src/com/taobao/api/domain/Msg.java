package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������Ϣ����
 *
 * @author auto create
 * @since 1.0, 2010-04-22 17:25:09.0
 */
public class Msg extends TaobaoObject {

	private static final long serialVersionUID = 5871895492919924136L;

	/**
	 * ��Ϣ����
	 */
	@ApiField("content")
	private String content;

	/**
	 * direction=0Ϊfrom_id������Ϣ��to_id��direction=1Ϊto_id������Ϣ��from_id
	 */
	@ApiField("direction")
	private Long direction;

	/**
	 * ��Ϣ����
	 */
	@ApiField("time")
	private String time;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getDirection() {
		return this.direction;
	}
	public void setDirection(Long direction) {
		this.direction = direction;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
