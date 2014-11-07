package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateAddResponse;

/**
 * TOP API: taobao.traderate.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TraderateAddRequest implements TaobaoRequest<TraderateAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƿ�����,������������������ѡֵ:true(����),false(������)��ע�⣺����ǿ�ѡֵ�����Զ�תΪfalse
	 */
	private Boolean anony;

	/** 
	* ��������,��󳤶�: 500������ .ע�⣺�����۽��Ϊgoodʱ�Ͳ���������������.��������Ϊneutral/bad��ʱ����Ҫ������������
	 */
	private String content;

	/** 
	* �Ӷ���ID
	 */
	private Long oid;

	/** 
	* ���۽��,��ѡֵ:good(����),neutral(����),bad(����)
	 */
	private String result;

	/** 
	* �����߽�ɫ,��ѡֵ:seller(����),buyer(���)
	 */
	private String role;

	/** 
	* ����ID
	 */
	private Long tid;

	public void setAnony(Boolean anony) {
		this.anony = anony;
	}
	public Boolean getAnony() {
		return this.anony;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	public Long getOid() {
		return this.oid;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult() {
		return this.result;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return this.role;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.traderate.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("anony", this.anony);
		txtParams.put("content", this.content);
		txtParams.put("oid", this.oid);
		txtParams.put("result", this.result);
		txtParams.put("role", this.role);
		txtParams.put("tid", this.tid);
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

	public Class<TraderateAddResponse> getResponseClass() {
		return TraderateAddResponse.class;
	}
}
