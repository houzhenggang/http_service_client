package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UserGetResponse;

/**
 * TOP API: taobao.user.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class UserGetRequest implements TaobaoRequest<UserGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ��User�ṹ���е������ֶΣ��԰�Ƕ���(,)�ָ�����֧�֣���ַ����ʵ���������֤���ֻ����绰
	 */
	private String fields;

	/** 
	* �û��ǳƣ�����ǳ�Ϊ���ģ���ʹ��UTF-8�ַ������ǳƽ���URL���롣
<br><font color="red">ע���ڴ���session�������,���Բ���nick����ʾȡ��ǰ�û���Ϣ������nick���봫.<br>
������Ӧ�ò���Ҫ����nick
</font>
	 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
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

	public Class<UserGetResponse> getResponseClass() {
		return UserGetResponse.class;
	}
}
