package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����ͳ�ƽṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-26 16:34:46.0
 */
public class ProductProp extends TaobaoObject {

	private static final long serialVersionUID = 2451394853982389296L;

	/**
	 * ��Ŀ����ID
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * ����ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * ������
	 */
	@ApiField("prop_name")
	private String propName;

	/**
	 * ����ֵ�����б�
	 */
	@ApiField("prop_names")
	private String propNames;

	/**
	 * ����ֵ�б�
	 */
	@ApiField("prop_values")
	private String propValues;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getPropNames() {
		return this.propNames;
	}
	public void setPropNames(String propNames) {
		this.propNames = propNames;
	}

	public String getPropValues() {
		return this.propValues;
	}
	public void setPropValues(String propValues) {
		this.propValues = propValues;
	}

}
