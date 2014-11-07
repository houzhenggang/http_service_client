package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ʒ����
 *
 * @author auto create
 * @since 1.0, 2011-06-30 16:38:25.0
 */
public class ItemProp extends TaobaoObject {

	private static final long serialVersionUID = 8175852342195116559L;

	/**
	 * �����Ե�ģ�壨����������������ʱ��Ҫ�õ���
	 */
	@ApiField("child_template")
	private String childTemplate;

	/**
	 * �Ƿ������������ѡֵ��true���ǣ���false����
	 */
	@ApiField("is_allow_alias")
	private Boolean isAllowAlias;

	/**
	 * �Ƿ���ɫ���ԡ���ѡֵ:true(��),false(��)
	 */
	@ApiField("is_color_prop")
	private Boolean isColorProp;

	/**
	 * �Ƿ�ö�����ԡ���ѡֵ:true(��),false(��)���������true������ֵ��������ѡ�����룬�������false������ֵ���û������ֹ����롣
	 */
	@ApiField("is_enum_prop")
	private Boolean isEnumProp;

	/**
	 * ��is_enum_prop��true��ǰ���£��Ƿ������ҿ���������������ԣ�ע�����is_enum_prop����false���ò���ͳһ����false������ѡֵ:true(��),false(��)
	 */
	@ApiField("is_input_prop")
	private Boolean isInputProp;

	/**
	 * �Ƿ���Ʒ���ԡ���ѡֵ:true(��),false(��)
	 */
	@ApiField("is_item_prop")
	private Boolean isItemProp;

	/**
	 * �Ƿ�ؼ����ԡ���ѡֵ:true(��),false(��)
	 */
	@ApiField("is_key_prop")
	private Boolean isKeyProp;

	/**
	 * �Ƿ��������ԡ���ѡֵ:true(��),false(��)
	 */
	@ApiField("is_sale_prop")
	private Boolean isSaleProp;

	/**
	 * ������Ʒ����Ʒʱ�Ƿ���Զ�ѡ����ѡֵ:true(��),false(��)
	 */
	@ApiField("multi")
	private Boolean multi;

	/**
	 * ������Ʒ����Ʒʱ�Ƿ�Ϊ��ѡ���ԡ���ѡֵ:true(��),false(��)
	 */
	@ApiField("must")
	private Boolean must;

	/**
	 * ������
	 */
	@ApiField("name")
	private String name;

	/**
	 * �ϼ�����ID
	 */
	@ApiField("parent_pid")
	private Long parentPid;

	/**
	 * �ϼ�����ֵID
	 */
	@ApiField("parent_vid")
	private Long parentVid;

	/**
	 * ���� ID ����Ʒ�Ƶ�PID=20000
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * null
	 */
	@ApiListField("prop_values")
	@ApiField("prop_value")
	private List<PropValue> propValues;

	/**
	 * ������š�ȡֵ��Χ:���������������š�ȡֵ��Χ:�����������
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * ״̬����ѡֵ:normal(����),deleted(ɾ��)
	 */
	@ApiField("status")
	private String status;

	public String getChildTemplate() {
		return this.childTemplate;
	}
	public void setChildTemplate(String childTemplate) {
		this.childTemplate = childTemplate;
	}

	public Boolean getIsAllowAlias() {
		return this.isAllowAlias;
	}
	public void setIsAllowAlias(Boolean isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Boolean getIsInputProp() {
		return this.isInputProp;
	}
	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}

	public Boolean getIsItemProp() {
		return this.isItemProp;
	}
	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentPid() {
		return this.parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentVid() {
		return this.parentVid;
	}
	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public List<PropValue> getPropValues() {
		return this.propValues;
	}
	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
