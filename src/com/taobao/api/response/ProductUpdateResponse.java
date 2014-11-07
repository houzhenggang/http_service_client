package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ProductUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5324868848457687966L;

	/** 
	 * ����product���ݽṹ�еģ�product_id,modified
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
