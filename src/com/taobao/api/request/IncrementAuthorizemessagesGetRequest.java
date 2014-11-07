package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementAuthorizemessagesGetResponse;

/**
 * TOP API: taobao.increment.authorizemessages.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class IncrementAuthorizemessagesGetRequest implements TaobaoRequest<IncrementAuthorizemessagesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ���ص��ֶΡ������ֶμ�AuthorizeMessage˵��
	 */
	private String fields;

	/** 
	* �û��ǳ��б�ÿ��nick֮����","�����һ�β�����20��
	 */
	private String nicks;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1,�����ص�һҳ���ݡ�
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������;���ֵ:200;Ĭ��ֵ:40��ע��ֻ�в�ָ��nick����ʱ��ҳ�������á�
	 */
	private Long pageSize;

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
		return "taobao.increment.authorizemessages.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nicks", this.nicks);
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

	public Class<IncrementAuthorizemessagesGetResponse> getResponseClass() {
		return IncrementAuthorizemessagesGetResponse.class;
	}
}
