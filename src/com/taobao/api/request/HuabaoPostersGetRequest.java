package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HuabaoPostersGetResponse;

/**
 * TOP API: taobao.huabao.posters.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class HuabaoPostersGetRequest implements TaobaoRequest<HuabaoPostersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ƶ����Idֵ
	 */
	private Long channelId;

	/** 
	* ��ǰҳ��Ĭ��Ϊ1��������Ϊ�����㣬���߳���ҳ����Χʱ��ȡĬ��ֵ��
	 */
	private Long pageNo;

	/** 
	* ��ѯ���صļ�¼��
	 */
	private Long pageSize;

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public Long getChannelId() {
		return this.channelId;
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
		return "taobao.huabao.posters.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_id", this.channelId);
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

	public Class<HuabaoPostersGetResponse> getResponseClass() {
		return HuabaoPostersGetResponse.class;
	}
}
