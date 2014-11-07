package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemdetail.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaItemdetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6629861313159372595L;

	/** 
	 * �Ի���Ʒ���ݽṹ
	 */
	@ApiField("taohua_item_detail")
	private TaohuaItem taohuaItemDetail;

	public void setTaohuaItemDetail(TaohuaItem taohuaItemDetail) {
		this.taohuaItemDetail = taohuaItemDetail;
	}
	public TaohuaItem getTaohuaItemDetail( ) {
		return this.taohuaItemDetail;
	}

}
