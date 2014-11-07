package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * UMP�ж�Ԫ���ݲ����Ķ���
 *
 * @author auto create
 * @since 1.0, 2011-04-19 10:29:03.0
 */
public class ParameterDef extends TaobaoObject {

	private static final long serialVersionUID = 1392864121747595862L;

	/**
	 * �Ƿ�������
	 */
	@ApiField("array")
	private Boolean array;

	/**
	 * �߼�����,�������������ɽ��ܵ�ҵ�����͡�
�������ҽ������¼��֣�all,itemId,shopId,sellerId,skuId,categoryId,shopCategoryId
	 */
	@ApiField("logic_type")
	private String logicType;

	/**
	 * ��������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����ֵ�����͡�
�������ҽ������¼��֣�string,date,boolean,double,long,resource(��Դ��Ԫ����)
	 */
	@ApiField("value_type")
	private String valueType;

	public Boolean getArray() {
		return this.array;
	}
	public void setArray(Boolean array) {
		this.array = array;
	}

	public String getLogicType() {
		return this.logicType;
	}
	public void setLogicType(String logicType) {
		this.logicType = logicType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
