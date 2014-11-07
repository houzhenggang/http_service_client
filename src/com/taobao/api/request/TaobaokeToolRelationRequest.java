package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeToolRelationResponse;

/**
 * TOP API: taobao.taobaoke.tool.relation request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:57.0
 */
public class TaobaokeToolRelationRequest implements TaobaoRequest<TaobaokeToolRelationResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �û���pubid �����ж����pubid�Ƿ���appkey�����Ŀ����ߵ�ע���û�
	 */
	private Long pubid;

	public void setPubid(Long pubid) {
		this.pubid = pubid;
	}
	public Long getPubid() {
		return this.pubid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.tool.relation";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("pubid", this.pubid);
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

	public Class<TaobaokeToolRelationResponse> getResponseClass() {
		return TaobaokeToolRelationResponse.class;
	}
}
