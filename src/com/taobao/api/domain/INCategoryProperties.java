package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ŀ���Զ���
 *
 * @author auto create
 * @since 1.0, 2011-07-07 17:23:35.0
 */
public class INCategoryProperties extends TaobaoObject {

	private static final long serialVersionUID = 4841371495324734125L;

	/**
	 * ��Ŀ���Զ�������
	 */
	@ApiField("properties_desc")
	private String propertiesDesc;

	/**
	 * ��Ŀ���Զ���ID
	 */
	@ApiField("properties_id")
	private Long propertiesId;

	/**
	 * ��Ŀ��������
	 */
	@ApiField("properties_name")
	private String propertiesName;

	public String getPropertiesDesc() {
		return this.propertiesDesc;
	}
	public void setPropertiesDesc(String propertiesDesc) {
		this.propertiesDesc = propertiesDesc;
	}

	public Long getPropertiesId() {
		return this.propertiesId;
	}
	public void setPropertiesId(Long propertiesId) {
		this.propertiesId = propertiesId;
	}

	public String getPropertiesName() {
		return this.propertiesName;
	}
	public void setPropertiesName(String propertiesName) {
		this.propertiesName = propertiesName;
	}

}
