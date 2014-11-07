package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class ProductGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6818436996196761896L;

	/** 
	 * ���ؾ�����ϢΪ���fields������ֶ���Ϣ
	 */
	@ApiField("product")
	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}
	public Product getProduct( ) {
		return this.product;
	}

}
