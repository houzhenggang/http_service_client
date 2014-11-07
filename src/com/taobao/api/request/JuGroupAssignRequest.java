package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuGroupAssignResponse;

/**
 * TOP API: taobao.ju.group.assign request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuGroupAssignRequest implements TaobaoRequest<JuGroupAssignResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��ItemData��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ��á�,���ָ������fieldsΪ�գ����߲����ò�������Ĭ�ϻ�����е��ֶ�
	 */
	private String fields;

	/** 
	* IPHONE,WAP,ANDROID,SINA,163 �����ն�����
	 */
	private String terminalType;

	/** 
	* �ն˵�Ψһ��ʶ��web������cookie���ֻ�ʹ���ֻ�����ȣ�ȷ��Ψһ�Լ��ɣ����ڷ�����Ʒ��
	 */
	private String uuid;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getTerminalType() {
		return this.terminalType;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUuid() {
		return this.uuid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.group.assign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("terminal_type", this.terminalType);
		txtParams.put("uuid", this.uuid);
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

	public Class<JuGroupAssignResponse> getResponseClass() {
		return JuGroupAssignResponse.class;
	}
}
