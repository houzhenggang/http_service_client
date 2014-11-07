package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupsGetResponse;

/**
 * TOP API: taobao.crm.groups.get request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:28:55.0
 */
public class CrmGroupsGetRequest implements TaobaoRequest<CrmGroupsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ʾ�ڼ�ҳ�ķ��飬��������ҳ������ܹ���ҳ�����������ܹ�10ҳ������current_page��ֵΪ11���򷵻ؿհ�ҳ����Сҳ��Ϊ1
	 */
	private Long currentPage;

	/** 
	* ÿҳ��ʾ�ļ�¼���������ֵ���ܳ���100������СֵΪ1
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
		return "taobao.crm.groups.get";
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

	public Class<CrmGroupsGetResponse> getResponseClass() {
		return CrmGroupsGetResponse.class;
	}
}
