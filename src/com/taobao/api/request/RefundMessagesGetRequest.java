package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessagesGetResponse;

/**
 * TOP API: taobao.refund.messages.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class RefundMessagesGetRequest implements TaobaoRequest<RefundMessagesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ��RefundMessage�ṹ���е������ֶΣ��԰�Ƕ���(,)�ָ���
	 */
	private String fields;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������; Ĭ��ֵ:40;���ֵ:200
	 */
	private Long pageSize;

	/** 
	* �˿��
	 */
	private Long refundId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

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

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public Long getRefundId() {
		return this.refundId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.refund.messages.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("refund_id", this.refundId);
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

	public Class<RefundMessagesGetResponse> getResponseClass() {
		return RefundMessagesGetResponse.class;
	}
}
