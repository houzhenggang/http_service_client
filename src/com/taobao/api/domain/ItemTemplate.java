package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������ҳ����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-05-31 10:40:19.0
 */
public class ItemTemplate extends TaobaoObject {

	private static final long serialVersionUID = 2283241434797371354L;

	/**
	 * �������ֱ���ģ�������ڵ�����
	 */
	@ApiField("shop_type")
	private Long shopType;

	/**
	 * ����ģ���id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * ��������ģ�������
	 */
	@ApiField("template_name")
	private String templateName;

	public Long getShopType() {
		return this.shopType;
	}
	public void setShopType(Long shopType) {
		this.shopType = shopType;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
