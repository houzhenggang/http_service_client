package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.staffrecitems.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaStaffrecitemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4211133734592463911L;

	/** 
	 * �Ի���Ʒ���ݽṹ�б�
	 */
	@ApiListField("taohua_items")
	@ApiField("taohua_item")
	private List<TaohuaItem> taohuaItems;

	/** 
	 * ����Ʒ����
	 */
	@ApiField("total_items")
	private Long totalItems;

	public void setTaohuaItems(List<TaohuaItem> taohuaItems) {
		this.taohuaItems = taohuaItems;
	}
	public List<TaohuaItem> getTaohuaItems( ) {
		return this.taohuaItems;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

}
