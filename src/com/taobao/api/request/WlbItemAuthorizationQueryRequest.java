package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationQueryResponse;

/**
 * TOP API: taobao.wlb.item.authorization.query request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemAuthorizationQueryRequest implements TaobaoRequest<WlbItemAuthorizationQueryResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ȩ��ƷID
	 */
	private Long itemId;

	/** 
	* ��Ȩ����
	 */
	private String name;

	/** 
	* ��ǰҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ��¼����������û�����ļ�¼������50����һҳ��ʾ50����¼
	 */
	private Long pageSize;

	/** 
	* ��Ȩ����
	 */
	private String ruleCode;

	/** 
	* ״̬�� ֻ����������ֵ,��Χ���Ĭ�ϰ�VALID����;��ѡ���ѯ����; 
VALID -- 1 ��Ч�� INVALIDATION -- 2 ʧЧ
	 */
	private String status;

	/** 
	* ���ͣ����ɲ�ͬ��ɫ����ѯ��Ĭ��ֵOWNER,
OWNER -- ��Ȩ��,
ON_COMMISSION -- ����Ȩ��
	 */
	private String type;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
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

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}
	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.authorization.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rule_code", this.ruleCode);
		txtParams.put("status", this.status);
		txtParams.put("type", this.type);
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

	public Class<WlbItemAuthorizationQueryResponse> getResponseClass() {
		return WlbItemAuthorizationQueryResponse.class;
	}
}
