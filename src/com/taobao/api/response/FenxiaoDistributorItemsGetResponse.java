package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.FenxiaoItemRecord;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.distributor.items.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class FenxiaoDistributorItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7412251673299229553L;

	/** 
	 * ���ؼ�¼����
	 */
	@ApiListField("records")
	@ApiField("fenxiao_item_record")
	private List<FenxiaoItemRecord> records;

	/** 
	 * ��ѯ�����¼��
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRecords(List<FenxiaoItemRecord> records) {
		this.records = records;
	}
	public List<FenxiaoItemRecord> getRecords( ) {
		return this.records;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
