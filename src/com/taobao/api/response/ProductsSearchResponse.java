package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Product;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.products.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class ProductsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4211683128398282496L;

	/** 
	 * ���ؾ�����ϢΪ���fields������ֶ���Ϣ
	 */
	@ApiListField("products")
	@ApiField("product")
	private List<Product> products;

	/** 
	 * �������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Product> getProducts( ) {
		return this.products;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
