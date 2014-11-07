package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.KfcKeywordSearchResponse;

/**
 * TOP API: taobao.kfc.keyword.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class KfcKeywordSearchRequest implements TaobaoRequest<KfcKeywordSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ӧ�õ㣬��Ϊһ��Ӧ�õ㡢����Ӧ�õ㡣����һ��Ӧ�õ�ͨ����ָĳһ��ϵͳ���Ʒ�������Ա�����ƷӦ�ã�taobao_auction��������Ӧ�õ㣬��ָһ��Ӧ�õ��µľ���ķ��࣬������Ʒ����(title)����Ʒ����(content)����ͬ�Ķ���Ӧ�ÿ������ò�ͬ�ؼ��ʡ�

�����apply��������һ��Ӧ�õ������Ӧ�õ���������ַ���һ��Ӧ�õ�+"."+����Ӧ�õ㣩����taobao_auction.title��


ͨ��apply�����ǲ���Ҫ���ݵġ������������󣨱�������Ĺ���������Ҫ�Լ�ά��һ���Լ��ʿ⣩���贫�ݴ˲�����
	 */
	private String apply;

	/** 
	* ��Ҫ���˵��ı���Ϣ
	 */
	private String content;

	/** 
	* ������Ϣ���Ա���Ա�������Բ���
	 */
	private String nick;

	public void setApply(String apply) {
		this.apply = apply;
	}
	public String getApply() {
		return this.apply;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
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
		return "taobao.kfc.keyword.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("apply", this.apply);
		txtParams.put("content", this.content);
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

	public Class<KfcKeywordSearchResponse> getResponseClass() {
		return KfcKeywordSearchResponse.class;
	}
}
