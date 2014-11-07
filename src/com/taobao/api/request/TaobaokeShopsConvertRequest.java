package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeShopsConvertResponse;

/**
 * TOP API: taobao.taobaoke.shops.convert request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class TaobaokeShopsConvertRequest implements TaobaoRequest<TaobaokeShopsConvertResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:TaobaokeShop�Ա�����Ʒ�ṹ���е�user_id,shop_title,click_url,commission_rate;�ֶ�֮����","�ָ�.
	 */
	private String fields;

	/** 
	* �ƹ��ߵ��Ա���Ա�ǳ�.ע������ָ�����Ա��ĵ�¼��Ա��
	 */
	private String nick;

	/** 
	* �Զ������봮.��ʽ:Ӣ�ĺ��������;���Ȳ��ܴ���12���ַ�,���ֲ�ͬ���ƹ�����,��:bbs,��ʾbbsΪ�ƹ�����;blog,��ʾblogΪ�ƹ�����.
	 */
	private String outerCode;

	/** 
	* �Կ��û���pid,�������ɵ����.nick��pid������Ļ�,��pidΪ׼
	 */
	private Long pid;

	/** 
	* ����id��.�������10��.��ʽ��:"value1,value2,value3" ��" , "�ŷָ�����id.
	 */
	private String sids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
	}

	public void setSids(String sids) {
		this.sids = sids;
	}
	public String getSids() {
		return this.sids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.shops.convert";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("pid", this.pid);
		txtParams.put("sids", this.sids);
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

	public Class<TaobaokeShopsConvertResponse> getResponseClass() {
		return TaobaokeShopsConvertResponse.class;
	}
}
