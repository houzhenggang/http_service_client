package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ⲿ��Ʒʵ��
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:44:32.0
 */
public class OutEntityItem extends TaobaoObject {

	private static final long serialVersionUID = 2522539897743925512L;

	/**
	 * entity_type��Ӧ��ʵ�����͵�id��
��entity_typeΪIC_ITEMʱ��entity_idΪic����Ʒid
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * �ⲿʵ�����ͣ�
IC_ITEM--ic��Ʒ
IC_SKU--ic���۵�Ԫ
	 */
	@ApiField("entity_type")
	private String entityType;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

}
