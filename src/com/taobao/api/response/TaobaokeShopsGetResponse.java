package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeShop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.shops.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class TaobaokeShopsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5627559273287146967L;

	/** 
	 * ��������б�
	 */
	@ApiListField("taobaoke_shops")
	@ApiField("taobaoke_shop")
	private List<TaobaokeShop> taobaokeShops;

	/** 
	 * ���������ĵ�������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaobaokeShops(List<TaobaokeShop> taobaokeShops) {
		this.taobaokeShops = taobaokeShops;
	}
	public List<TaobaokeShop> getTaobaokeShops( ) {
		return this.taobaokeShops;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
