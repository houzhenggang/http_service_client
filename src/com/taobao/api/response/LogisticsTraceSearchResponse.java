package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TransitStepInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.trace.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class LogisticsTraceSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7625129243528796211L;

	/** 
	 * ������˾����
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * �˵���
	 */
	@ApiField("out_sid")
	private String outSid;

	/** 
	 * ����������״̬
* �Ⱥ��͸�������˾
*���ύ��������˾,�ȴ�������˾�ӵ�
*�Ѿ�ȷ����Ϣ���գ��ȴ�������˾�ӵ�
*������˾�ѽӵ�
*������˾���ӵ�
*������˾����ʧ��
*������˾���ճɹ�
*ǩ��ʧ��
*�Է���ǩ��
*�Է��ܾ�ǩ��
	 */
	@ApiField("status")
	private String status;

	/** 
	 * ���׺�
	 */
	@ApiField("tid")
	private Long tid;

	/** 
	 * ��ת��Ϣ�б�
	 */
	@ApiListField("trace_list")
	@ApiField("transit_step_info")
	private List<TransitStepInfo> traceList;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public String getOutSid( ) {
		return this.outSid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid( ) {
		return this.tid;
	}

	public void setTraceList(List<TransitStepInfo> traceList) {
		this.traceList = traceList;
	}
	public List<TransitStepInfo> getTraceList( ) {
		return this.traceList;
	}

}
