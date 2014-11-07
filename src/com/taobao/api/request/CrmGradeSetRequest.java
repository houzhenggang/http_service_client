package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGradeSetResponse;

/**
 * TOP API: taobao.crm.grade.set request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:27:44.0
 */
public class CrmGradeSetRequest implements TaobaoRequest<CrmGradeSetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��������һ���������Ҫ�Ľ��׶�,����ȫ����д.����1000,2000,3000������1000��ʾ��ͨ��Ա�������߼���Ա��Ҫ�ﵽ1000�Ľ��׶����VIPΪ��ߵȼ�������Ҫ��д����Ա�ȼ�Խ�ߣ����轻�׶����Խ�ߡ�
	 */
	private String amount;

	/** 
	* ��������һ���������Ҫ�Ľ�����,����ȫ����д. �Զ��ŷָ�,����100,200,300������100��ʾ��ͨ��Ա�������߼���Ա��Ҫ100�ʽ��ס�����VIPΪ��ߵȼ�������Ҫ��д����Ա�ȼ�Խ�ߣ�����������Խ�ߡ�
	 */
	private String count;

	/** 
	* ��Ա�����ۿ��ʡ���Ա�ȼ�Խ�ߣ��ۿ۱���Խ�͡�
	 */
	private String discount;

	/** 
	* ��Ա�ȼ�,����ȫ����д���ö��ŷָ�����һ�Ա���� 1����ͨ��Ա 2 ���߼���Ա 3��VIP��Ա 4������VIP
	 */
	private String grade;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount() {
		return this.count;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscount() {
		return this.discount;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.grade.set";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("count", this.count);
		txtParams.put("discount", this.discount);
		txtParams.put("grade", this.grade);
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

	public Class<CrmGradeSetResponse> getResponseClass() {
		return CrmGradeSetResponse.class;
	}
}
