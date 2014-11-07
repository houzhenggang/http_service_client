package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.FenxiaoProduct;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.products.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class FenxiaoProductsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4665256773331767558L;

	/** 
	 * ��Ʒ�����¼�������� FenxiaoProduct �������ֶ���Ϣ��
	 */
	@ApiListField("products")
	@ApiField("fenxiao_product")
	private List<FenxiaoProduct> products;

	/** 
	 * ��ѯ�����¼��
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setProducts(List<FenxiaoProduct> products) {
		this.products = products;
	}
	public List<FenxiaoProduct> getProducts( ) {
		return this.products;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
