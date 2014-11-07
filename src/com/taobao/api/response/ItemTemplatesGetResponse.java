package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ItemTemplate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.templates.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class ItemTemplatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8191593965733812334L;

	/** 
	 * 返回宝贝模板对象。包含模板id，模板name，还有模板的类别（0表示外店，1表示内店）
	 */
	@ApiListField("item_template_list")
	@ApiField("item_template")
	private List<ItemTemplate> itemTemplateList;

	public void setItemTemplateList(List<ItemTemplate> itemTemplateList) {
		this.itemTemplateList = itemTemplateList;
	}
	public List<ItemTemplate> getItemTemplateList( ) {
		return this.itemTemplateList;
	}

}
