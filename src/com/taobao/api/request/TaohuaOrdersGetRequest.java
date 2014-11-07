package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaOrdersGetResponse;

/**
 * TOP API: taobao.taohua.orders.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class TaohuaOrdersGetRequest implements TaobaoRequest<TaohuaOrdersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ĭ��Ϊ��ǰʱ�䣬 ���ڸ�ʽ��ȷ������
	 */
	private String endDate;

	/** 
	* ��ҳ��ȡ�����б���Ϣ��page_no������ǵڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ��ȡ�����б���Ϣ��page_size����ÿҳ��ʾ��������  ע�⣺ÿҳ��ʾ��������С5�������30�������ǳ�����Χ�����������ᱻĬ��Ϊ10����
	 */
	private Long pageSize;

	/** 
	* ϵͳĬ��Ϊ����ǰʱ��-90�졣  ���ھ�ȷ����
	 */
	private String startDate;

	/** 
	* ��ѯ�Ľ���״̬��
1.	ȫ�� all
2.	�ȴ���Ҹ��� wait_pay
3.	���׳ɹ� trade_suc
4.	���׹ر� trade_close
	 */
	private String tradeStatus;

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
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

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.orders.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		txtParams.put("trade_status", this.tradeStatus);
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

	public Class<TaohuaOrdersGetResponse> getResponseClass() {
		return TaohuaOrdersGetResponse.class;
	}
}
