package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ŀ����
 *
 * @author auto create
 * @since 1.0, 2011-07-07 17:23:35.0
 */
public class INCategoryChildTop extends TaobaoObject {

	private static final long serialVersionUID = 6447722966533566528L;

	/**
	 * ��Ŀ��������
	 */
	@ApiField("category_desc")
	private String categoryDesc;

	/**
	 * ��Ŀ����id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ��Ŀ����
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * ��Ŀ���Զ����б�
	 */
	@ApiListField("category_properties_list")
	@ApiField("i_n_category_properties")
	private List<INCategoryProperties> categoryPropertiesList;

	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<INCategoryProperties> getCategoryPropertiesList() {
		return this.categoryPropertiesList;
	}
	public void setCategoryPropertiesList(List<INCategoryProperties> categoryPropertiesList) {
		this.categoryPropertiesList = categoryPropertiesList;
	}

}
