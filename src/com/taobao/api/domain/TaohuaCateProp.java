package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի���Ŀ���Խṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:21:59.0
 */
public class TaohuaCateProp extends TaobaoObject {

	private static final long serialVersionUID = 1532975674716778344L;

	/**
	 * ��������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ���Խṹ
	 */
	@ApiField("prop_id")
	private Long propId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPropId() {
		return this.propId;
	}
	public void setPropId(Long propId) {
		this.propId = propId;
	}

}
