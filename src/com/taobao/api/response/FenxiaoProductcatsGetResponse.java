package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ProductCat;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.productcats.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class FenxiaoProductcatsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7219427797132111192L;

	/** 
	 * ��Ʒ���б����� ProductCat �������ֶ���Ϣ��
	 */
	@ApiListField("productcats")
	@ApiField("product_cat")
	private List<ProductCat> productcats;

	/** 
	 * ��ѯ�����¼��
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setProductcats(List<ProductCat> productcats) {
		this.productcats = productcats;
	}
	public List<ProductCat> getProductcats( ) {
		return this.productcats;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
