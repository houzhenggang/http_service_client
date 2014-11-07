package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HuabaoSpecialpostersGetResponse;

/**
 * TOP API: taobao.huabao.specialposters.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:57.0
 */
public class HuabaoSpecialpostersGetRequest implements TaobaoRequest<HuabaoSpecialpostersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ƶ��Id
	 */
	private String channelIds;

	/** 
	* ���صļ�¼����Ĭ��10�������20����������󳬹�20����С�ڵ���10����10������ typeΪNEWʱ�ò�����Ч,����Ϊָ��Ƶ�������µ�һ����¼
	 */
	private Long number;

	/** 
	* ���Ϳ�ѡ��HOT(���ţ���RECOMMEND���Ƽ�����NEW�����£�
	 */
	private String type;

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}
	public String getChannelIds() {
		return this.channelIds;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	public Long getNumber() {
		return this.number;
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
		return "taobao.huabao.specialposters.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_ids", this.channelIds);
		txtParams.put("number", this.number);
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

	public Class<HuabaoSpecialpostersGetResponse> getResponseClass() {
		return HuabaoSpecialpostersGetResponse.class;
	}
}
