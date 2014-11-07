package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderatesGetResponse;

/**
 * TOP API: taobao.traderates.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TraderatesGetRequest implements TaobaoRequest<TraderatesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���۽���ʱ��
	 */
	private Date endDate;

	/** 
	* �践�ص��ֶ��б���ѡֵ��TradeRate �ṹ�е������ֶΣ�����ֶ�֮���á�,���ָ�
	 */
	private String fields;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������; Ĭ��ֵ:40;���ֵ:200
	 */
	private Long pageSize;

	/** 
	* �������͡���ѡֵ:get(�õ�),give(����)
	 */
	private String rateType;

	/** 
	* ���۽������ѡֵ:good(����),neutral(����),bad(����)
	 */
	private String result;

	/** 
	* �����߽�ɫ����ѡֵ:seller(����),buyer(���)
	 */
	private String role;

	/** 
	* ���ۿ�ʼʱ��
	 */
	private Date startDate;

	/** 
	* ���׶���id�������Ǹ�����id�ţ�Ҳ�������Ӷ���id��
	 */
	private Long tid;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getRateType() {
		return this.rateType;
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

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
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
		return "taobao.traderates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rate_type", this.rateType);
		txtParams.put("result", this.result);
		txtParams.put("role", this.role);
		txtParams.put("start_date", this.startDate);
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

	public Class<TraderatesGetResponse> getResponseClass() {
		return TraderatesGetResponse.class;
	}
}
