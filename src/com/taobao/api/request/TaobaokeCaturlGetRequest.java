package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeCaturlGetResponse;

/**
 * TOP API: taobao.taobaoke.caturl.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TaobaokeCaturlGetRequest implements TaobaoRequest<TaobaokeCaturlGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ŀid.ע�⣺�������Ŀid���Ա���̨������Ʒ����Ŀid.
	 */
	private Long cid;

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
	* �ؼ���
	 */
	private String q;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
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

	public void setQ(String q) {
		this.q = q;
	}
	public String getQ() {
		return this.q;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.caturl.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("nick", this.nick);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("pid", this.pid);
		txtParams.put("q", this.q);
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

	public Class<TaobaokeCaturlGetResponse> getResponseClass() {
		return TaobaokeCaturlGetResponse.class;
	}
}
