package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �Ա��ͱ���
 *
 * @author auto create
 * @since 1.0, 2011-01-19 11:11:40.0
 */
public class TaobaokeReport extends TaobaoObject {

	private static final long serialVersionUID = 4447318345989278857L;

	/**
	 * �Ա��ͱ����Ա�б�
	 */
	@ApiListField("taobaoke_report_members")
	@ApiField("taobaoke_report_member")
	private List<TaobaokeReportMember> taobaokeReportMembers;

	/**
	 * �������Ľ����������
	 */
	@ApiField("total_results")
	private Long totalResults;

	public List<TaobaokeReportMember> getTaobaokeReportMembers() {
		return this.taobaokeReportMembers;
	}
	public void setTaobaokeReportMembers(List<TaobaokeReportMember> taobaokeReportMembers) {
		this.taobaokeReportMembers = taobaokeReportMembers;
	}

	public Long getTotalResults() {
		return this.totalResults;
	}
	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

}
