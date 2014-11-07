package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaAudioreaderRecommendGetResponse;

/**
 * TOP API: taobao.taohua.audioreader.recommend.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TaohuaAudioreaderRecommendGetRequest implements TaobaoRequest<TaohuaAudioreaderRecommendGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƽ�ר�������ͣ���������ѡ�recent:������£�hot:����
	 */
	private String itemType;

	/** 
	* ��ǰҳ��
	 */
	private Long pageNo;

	/** 
	* ÿҳ����
	 */
	private Long pageSize;

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType() {
		return this.itemType;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.audioreader.recommend.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_type", this.itemType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<TaohuaAudioreaderRecommendGetResponse> getResponseClass() {
		return TaohuaAudioreaderRecommendGetResponse.class;
	}
}
