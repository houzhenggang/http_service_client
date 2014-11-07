package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbReplenish;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.replenish.statistics response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbReplenishStatisticsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6638944183323254237L;

	/** 
	 * ����ͳ���б�
	 */
	@ApiListField("replenish_list")
	@ApiField("wlb_replenish")
	private List<WlbReplenish> replenishList;

	/** 
	 * ��ѯ��¼����
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setReplenishList(List<WlbReplenish> replenishList) {
		this.replenishList = replenishList;
	}
	public List<WlbReplenish> getReplenishList( ) {
		return this.replenishList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
