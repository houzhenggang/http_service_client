package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.SellerCat;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercats.list.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class SellercatsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3458281986177121811L;

	/** 
	 * �����Զ�����Ŀ
	 */
	@ApiListField("seller_cats")
	@ApiField("seller_cat")
	private List<SellerCat> sellerCats;

	public void setSellerCats(List<SellerCat> sellerCats) {
		this.sellerCats = sellerCats;
	}
	public List<SellerCat> getSellerCats( ) {
		return this.sellerCats;
	}

}
