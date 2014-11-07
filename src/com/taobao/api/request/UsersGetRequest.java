package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UsersGetResponse;

/**
 * TOP API: taobao.users.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class UsersGetRequest implements TaobaoRequest<UsersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѯ�ֶΣ�User���ݽṹ�Ĺ�����Ϣ�ֶ��б��԰�Ƕ���(,)�ָ�
	 */
	private String fields;

	/** 
	* �û��ǳƣ�����԰�Ƕ���(,)�ָ������40��
	 */
	private String nicks;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public String getNicks() {
		return this.nicks;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.users.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nicks", this.nicks);
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

	public Class<UsersGetResponse> getResponseClass() {
		return UsersGetResponse.class;
	}
}
