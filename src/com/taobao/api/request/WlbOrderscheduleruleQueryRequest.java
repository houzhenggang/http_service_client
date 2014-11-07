package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderscheduleruleQueryResponse;

/**
 * TOP API: taobao.wlb.orderschedulerule.query request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbOrderscheduleruleQueryRequest implements TaobaoRequest<WlbOrderscheduleruleQueryResponse> {

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
		return "taobao.wlb.orderschedulerule.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<WlbOrderscheduleruleQueryResponse> getResponseClass() {
		return WlbOrderscheduleruleQueryResponse.class;
	}
}
