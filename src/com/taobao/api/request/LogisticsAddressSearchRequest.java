package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressSearchResponse;

/**
 * TOP API: taobao.logistics.address.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:58.0
 */
public class LogisticsAddressSearchRequest implements TaobaoRequest<LogisticsAddressSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѡ�������б����£�<br><font color='red'>
no_def:��ѯ��Ĭ�ϵ�ַ<br>
get_def:��ѯĬ��ȡ����ַ<br>
cancel_def:��ѯĬ���˻���ַ<br>
ȱʡ�˲���ʱ����ѯ���е�ǰ�û��ĵ�ַ��
</font>
	 */
	private String rdef;

	public void setRdef(String rdef) {
		this.rdef = rdef;
	}
	public String getRdef() {
		return this.rdef;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("rdef", this.rdef);
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

	public Class<LogisticsAddressSearchResponse> getResponseClass() {
		return LogisticsAddressSearchResponse.class;
	}
}
