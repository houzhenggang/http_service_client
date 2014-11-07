package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMemberinfoUpdateResponse;

/**
 * TOP API: taobao.crm.memberinfo.update request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:38.0
 */
public class CrmMemberinfoUpdateRequest implements TaobaoRequest<CrmMemberinfoUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ǳ�
	 */
	private String buyerNick;

	/** 
	* ����
	 */
	private String city;

	/** 
	* ��Ա�ȼ���1����ͨ�ͻ���2���߼���Ա��3���߼���Ա ��4������vip
	 */
	private Long grade;

	/** 
	* ����=1,���=2,�ӱ�ʡ=3,ɽ��ʡ=4,���ɹ�������=5,����ʡ=6,����ʡ=7,������ʡ=8,�Ϻ�=9,����ʡ=10,�㽭ʡ=11,����ʡ=12,����ʡ=13,����ʡ=14,ɽ��ʡ=15,����ʡ=16,����ʡ=17,����ʡ=18, �㶫ʡ=19,����׳��������=20,����ʡ=21,����=22,�Ĵ�ʡ=23,����ʡ=24,����ʡ=25,����������26,����ʡ=27,����ʡ=28,�ຣʡ=29,���Ļ���������=30,�½�ά���������=31,̨��ʡ=32,����ر�������=33,�����ر�������=34,����=35��Լ��36Ϊ���Province����
	 */
	private String province;

	/** 
	* ����������Ա��״̬��normal��ʾ������delete��ʾ�����ɾ����blacklist��ʾ������
	 */
	private String status;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.memberinfo.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("city", this.city);
		txtParams.put("grade", this.grade);
		txtParams.put("province", this.province);
		txtParams.put("status", this.status);
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

	public Class<CrmMemberinfoUpdateResponse> getResponseClass() {
		return CrmMemberinfoUpdateResponse.class;
	}
}
