package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderPageGetResponse;

/**
 * TOP API: taobao.wlb.order.page.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderPageGetRequest implements TaobaoRequest<WlbOrderPageGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѯ��ֹʱ��
	 */
	private Date endTime;

	/** 
	* �����������
	 */
	private String orderCode;

	/** 
	* ����״̬
	 */
	private Long orderStatus;

	/** 
	* ���������ͣ� 
��1��OTHER�� ���� 
��2��TAOBAO_TRADE�� �Ա����� 
��3��OTHER_TRADE����������
��4��ALLCOATE�� ����
��5��CHECK:  �̵㵥
��6��PURCHASE: �ɹ���
	 */
	private String orderSubType;

	/** 
	* ��������: 
��1��NORMAL_OUT ���������� 
��2��NORMAL_IN��������� 
��3��RETURN_IN���˻���� 
��4��EXCHANGE_OUT����������
	 */
	private String orderType;

	/** 
	* ��ҳ�ĵڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ÿҳ������
	 */
	private Long pageSize;

	/** 
	* ��ѯ��ʼʱ��
	 */
	private Date startTime;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Long getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}
	public String getOrderSubType() {
		return this.orderSubType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType() {
		return this.orderType;
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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime() {
		return this.startTime;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.page.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_status", this.orderStatus);
		txtParams.put("order_sub_type", this.orderSubType);
		txtParams.put("order_type", this.orderType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_time", this.startTime);
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

	public Class<WlbOrderPageGetResponse> getResponseClass() {
		return WlbOrderPageGetResponse.class;
	}
}
