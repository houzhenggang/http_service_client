package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscribeGetResponse;

/**
 * TOP API: taobao.vas.subscribe.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasSubscribeGetRequest implements TaobaoRequest<VasSubscribeGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ӧ���շѴ��룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ���ø�Ӧ�õ��շѴ���
	 */
	private String articleCode;

	/** 
	* �Ա���Ա��
	 */
	private String nick;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleCode() {
		return this.articleCode;
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
		return "taobao.vas.subscribe.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
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

	public Class<VasSubscribeGetResponse> getResponseClass() {
		return VasSubscribeGetResponse.class;
	}
}
