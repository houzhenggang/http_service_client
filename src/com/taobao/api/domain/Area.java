package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ַ����ṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 11:19:45.0
 */
public class Area extends TaobaoObject {

	private static final long serialVersionUID = 6881244217559149548L;

	/**
	 * ��׼�����������.�ο�:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm.
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ��������.�籱����,������,������,ÿһ��area_id ��������һ������ĵ���.
	 */
	@ApiField("name")
	private String name;

	/**
	 * ���ڵ������ʶ.�籱���е�area_id��110100,�������Ǳ����е�һ����,���Գ�������parent_id���Ǳ����е�area_id.
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * ��������.area���� 1:country/����;2:province/ʡ/������/ֱϽ��;3:city/����(ʡ����ĵؼ���);4:district/��/��(�ؼ���)/��;abroad:����. ���籱���е�area_type = 2,�������Ǳ����е�һ����,���Գ�������area_type = 4.
	 */
	@ApiField("type")
	private Long type;

	/**
	 * ����һ���������ʱ�
	 */
	@ApiField("zip")
	private String zip;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
