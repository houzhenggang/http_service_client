package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductPropImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.propimg.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class ProductPropimgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4174239682211857436L;

	/** 
	 * ����product_prop_img���ݽṹ�еģ�product_id,id
	 */
	@ApiField("product_prop_img")
	private ProductPropImg productPropImg;

	public void setProductPropImg(ProductPropImg productPropImg) {
		this.productPropImg = productPropImg;
	}
	public ProductPropImg getProductPropImg( ) {
		return this.productPropImg;
	}

}
