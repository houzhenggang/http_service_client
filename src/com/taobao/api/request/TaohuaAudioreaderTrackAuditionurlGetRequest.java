package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaAudioreaderTrackAuditionurlGetResponse;

/**
 * TOP API: taobao.taohua.audioreader.track.auditionurl.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:58.0
 */
public class TaohuaAudioreaderTrackAuditionurlGetRequest implements TaobaoRequest<TaohuaAudioreaderTrackAuditionurlGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������ƷID
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.audioreader.track.auditionurl.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
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

	public Class<TaohuaAudioreaderTrackAuditionurlGetResponse> getResponseClass() {
		return TaohuaAudioreaderTrackAuditionurlGetResponse.class;
	}
}
