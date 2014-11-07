package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceChatpeersGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatpeers.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class WangwangEserviceChatpeersGetRequest implements TaobaoRequest<WangwangEserviceChatpeersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ַ���
	 */
	private String charset;

	/** 
	* �����û�ID��cntaobao+�Ա�nick������cntaobaotest
	 */
	private String chatId;

	/** 
	* ��ѯ�������ڡ���2010-03-24������ʼ���ڿ�Ȳ��ܳ���7��
	 */
	private String endDate;

	/** 
	* ��ѯ��ʼ���ڡ���2010-02-01���뵱ǰ���ڼ��С��3���¡�
	 */
	private String startDate;

	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getCharset() {
		return this.charset;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getChatId() {
		return this.chatId;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.chatpeers.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("charset", this.charset);
		txtParams.put("chat_id", this.chatId);
		txtParams.put("end_date", this.endDate);
		txtParams.put("start_date", this.startDate);
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

	public Class<WangwangEserviceChatpeersGetResponse> getResponseClass() {
		return WangwangEserviceChatpeersGetResponse.class;
	}
}
