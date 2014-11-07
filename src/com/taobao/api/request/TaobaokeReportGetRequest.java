package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeReportGetResponse;

/**
 * TOP API: taobao.taobaoke.report.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class TaobaokeReportGetRequest implements TaobaoRequest<TaobaokeReportGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ��ѯ��������ڣ���Ч������Ϊ���3�����ڵ�ĳһ�죬��ʽΪ:yyyyMMdd,��20090520.
	 */
	private String date;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:TaobaokeReportMember�Ա��ͱ����Ա�ṹ���е������ֶ�;�ֶ�֮����","�ָ�.
	 */
	private String fields;

	/** 
	* ��ǰҳ��.ֻ�ܻ�ȡ1-99ҳ����
	 */
	private Long pageNo;

	/** 
	* ÿҳ���ؽ����,Ĭ����40��.���ÿҳ40
	 */
	private Long pageSize;

	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}

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

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.report.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("date", this.date);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<TaobaokeReportGetResponse> getResponseClass() {
		return TaobaokeReportGetResponse.class;
	}
}
