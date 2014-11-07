package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbSubscriptionQueryResponse;

/**
 * TOP API: taobao.wlb.subscription.query request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbSubscriptionQueryRequest implements TaobaoRequest<WlbSubscriptionQueryResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ǰҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ��¼����������û�����ļ�¼������50����һҳ��ʾ50����¼
	 */
	private Long pageSize;

	/** 
	* ״̬ 
AUDITING 1-�����; 
CANCEL 2-���� ;
CHECKED 3-���ͨ�� ;
FAILED 4-���δͨ�� ;
SYNCHRONIZING 5-ͬ����;
ֻ������������ָ����ֵ���ҿ���Ϊ�գ�Ϊ��ʱ��ѯ����״̬��������ˣ���AUDITING����
	 */
	private String status;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.subscription.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("status", this.status);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<WlbSubscriptionQueryResponse> getResponseClass() {
		return WlbSubscriptionQueryResponse.class;
	}
}
