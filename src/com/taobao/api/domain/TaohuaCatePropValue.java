package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի���Ŀ����ֵ����ṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:22:18.0
 */
public class TaohuaCatePropValue extends TaobaoObject {

	private static final long serialVersionUID = 1321435251173153468L;

	/**
	 * ����ֵ
	 */
	@ApiField("prop_value")
	private String propValue;

	/**
	 * ����ֵid
	 */
	@ApiField("value_id")
	private Long valueId;

	public String getPropValue() {
		return this.propValue;
	}
	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}

	public Long getValueId() {
		return this.valueId;
	}
	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}

}
