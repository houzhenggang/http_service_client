package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmRulesGetResponse;

/**
 * TOP API: taobao.crm.rules.get request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:54.0
 */
public class CrmRulesGetRequest implements TaobaoRequest<CrmRulesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ǰ��ʾ�ڼ�ҳ�����current_page����ҳ�뷶Χ����С��ҳ�뷶Χ����ֱ�ӷ��ؿհ�ҳ
	 */
	private Long currentPage;

	/** 
	* һҳ���صļ�¼�ĸ���
	 */
	private Long pageSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
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
		return "taobao.crm.rules.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
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

	public Class<CrmRulesGetResponse> getResponseClass() {
		return CrmRulesGetResponse.class;
	}
}
