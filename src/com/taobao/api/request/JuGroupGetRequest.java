package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuGroupGetResponse;

/**
 * TOP API: taobao.ju.group.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuGroupGetRequest implements TaobaoRequest<JuGroupGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��ItemData��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ��á�,���ָ������fieldsΪ�գ����߲����ò�������Ĭ�ϻ�����е��ֶ�
	 */
	private String fields;

	/** 
	* �ۻ�����ı��
	 */
	private Long groupId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId() {
		return this.groupId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.group.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("group_id", this.groupId);
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

	public Class<JuGroupGetResponse> getResponseClass() {
		return JuGroupGetResponse.class;
	}
}
