package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersIncrementGetResponse;

/**
 * TOP API: taobao.crm.members.increment.get request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:06.0
 */
public class CrmMembersIncrementGetRequest implements TaobaoRequest<CrmMembersIncrementGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ʾ�ڼ�ҳ�Ļ�Ա����������ҳ������ܹ���ҳ�����������ܹ�10ҳ������current_page��ֵΪ11���򷵻ؿհ�ҳ����Сҳ��Ϊ1
	 */
	private Long currentPage;

	/** 
	* ����޸����ڣ��������д���ֶΣ�Ĭ��Ϊ��ǰʱ��
	 */
	private Date endModify;

	/** 
	* ��Ա�ȼ���1����ͨ�ͻ���2���߼���Ա��3���߼���Ա ��4������vip
	 */
	private Long grade;

	/** 
	* ÿҳ��ʾ�Ļ�Ա����page_size��ֵ���ܳ���100����СֵҪ����1
	 */
	private Long pageSize;

	/** 
	* �����޸�����
	 */
	private Date startModify;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setEndModify(Date endModify) {
		this.endModify = endModify;
	}
	public Date getEndModify() {
		return this.endModify;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartModify(Date startModify) {
		this.startModify = startModify;
	}
	public Date getStartModify() {
		return this.startModify;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.members.increment.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
		txtParams.put("end_modify", this.endModify);
		txtParams.put("grade", this.grade);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modify", this.startModify);
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

	public Class<CrmMembersIncrementGetResponse> getResponseClass() {
		return CrmMembersIncrementGetResponse.class;
	}
}
