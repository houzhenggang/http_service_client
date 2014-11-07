package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuCatitemidsGetResponse;

/**
 * TOP API: taobao.ju.catitemids.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class JuCatitemidsGetRequest implements TaobaoRequest<JuCatitemidsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ����ĿID����װ:100001,Ůװ:100002��������Ŀ��Ϣ��ȡ������ϵ�ۻ���PD����
	 */
	private Long childCategoryid;

	/** 
	* ��ҳ��ȡ��Ʒ��Ϣҳ��ţ�����ڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ÿ�λ�ȡ��Ʒ�б������
	 */
	private Long pageSize;

	/** 
	* ��Ʒ����ĿID����װ:100000,����:1000000��������Ŀ��Ϣ��ȡ������ϵ�ۻ���PD����
	 */
	private Long parentCategoryid;

	/** 
	* ƽ̨ID���ѹ�:1008,�ۻ���:1001,�̳�:1002,����WAP:1007,֧����:1003,�Ա�����:1004,����:1006
	 */
	private Long platformId;

	/** 
	* IPHONE,WAP,ANDROID,SINA,163 �����ն�����
	 */
	private String terminalType;

	public void setChildCategoryid(Long childCategoryid) {
		this.childCategoryid = childCategoryid;
	}
	public Long getChildCategoryid() {
		return this.childCategoryid;
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

	public void setParentCategoryid(Long parentCategoryid) {
		this.parentCategoryid = parentCategoryid;
	}
	public Long getParentCategoryid() {
		return this.parentCategoryid;
	}

	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}
	public Long getPlatformId() {
		return this.platformId;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getTerminalType() {
		return this.terminalType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.catitemids.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_categoryid", this.childCategoryid);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("parent_categoryid", this.parentCategoryid);
		txtParams.put("platform_id", this.platformId);
		txtParams.put("terminal_type", this.terminalType);
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

	public Class<JuCatitemidsGetResponse> getResponseClass() {
		return JuCatitemidsGetResponse.class;
	}
}
