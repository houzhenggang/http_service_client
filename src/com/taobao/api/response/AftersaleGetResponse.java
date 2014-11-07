package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.AfterSale;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.aftersale.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class AftersaleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2463521756759864858L;

	/** 
	 * �ۺ���񷵻ض���
	 */
	@ApiListField("after_sales")
	@ApiField("after_sale")
	private List<AfterSale> afterSales;

	public void setAfterSales(List<AfterSale> afterSales) {
		this.afterSales = afterSales;
	}
	public List<AfterSale> getAfterSales( ) {
		return this.afterSales;
	}

}
