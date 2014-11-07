package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Ʒ��
 *
 * @author auto create
 * @since 1.0, 2010-05-13 13:05:27.0
 */
public class Brand extends TaobaoObject {

	private static final long serialVersionUID = 3527342386748656459L;

	/**
	 * vid��ֵ
	 */
	@ApiField("name")
	private String name;

	/**
	 * Ʒ�Ƶ�����id
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * Ʒ�Ƶ�������
	 */
	@ApiField("prop_name")
	private String propName;

	/**
	 * ��Ӧ���Ե� pid:vid ���е�vid
	 */
	@ApiField("vid")
	private Long vid;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

}
