package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOfflineSendResponse;

/**
 * TOP API: taobao.logistics.offline.send request
 * 
 * @author auto create
 * @since 1.0, 2011-07-25 13:49:41.0
 */
public class LogisticsOfflineSendRequest implements TaobaoRequest<LogisticsOfflineSendResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������ϵ�˵�ַ��ID������ͨ��taobao.logistics.address.search�ӿڲ�ѯ����ַ��ID��<br><font color='red'>���Ϊ�գ�ȡ�����ҵ�Ĭ���˻���ַ</font><br>
	 */
	private Long cancelId;

	/** 
	* ������˾����.��"POST"�ʹ����й�����,"ZJS"�ʹ���լ����.���� taobao.logistics.companies.get ��ȡ�����Ա��ٷ�����������˾����д����������
	 */
	private String companyCode;

	/** 
	* �˵���.����һ��������˾����ʵ�˵����롣�Ա��ٷ�������У�飬��������룻��company_code�д���Ĵ�����Ա��ٷ�����������˾���˴��˵��Ų�У�顣
	 */
	private String outSid;

	/** 
	* ������ϵ�˵�ַ��ID������ͨ��taobao.logistics.address.search�ӿڲ�ѯ����ַ��ID��<font color='red'>���Ϊ�գ�ȡ�����ҵ�Ĭ��ȡ����ַ</font>
	 */
	private Long senderId;

	/** 
	* �Ա�����ID
	 */
	private Long tid;

	public void setCancelId(Long cancelId) {
		this.cancelId = cancelId;
	}
	public Long getCancelId() {
		return this.cancelId;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public String getOutSid() {
		return this.outSid;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}
	public Long getSenderId() {
		return this.senderId;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.offline.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cancel_id", this.cancelId);
		txtParams.put("company_code", this.companyCode);
		txtParams.put("out_sid", this.outSid);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("tid", this.tid);
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

	public Class<LogisticsOfflineSendResponse> getResponseClass() {
		return LogisticsOfflineSendResponse.class;
	}
}
