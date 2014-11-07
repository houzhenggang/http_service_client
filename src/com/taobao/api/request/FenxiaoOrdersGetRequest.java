package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrdersGetResponse;

/**
 * TOP API: taobao.fenxiao.orders.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class FenxiaoOrdersGetRequest implements TaobaoRequest<FenxiaoOrdersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ʱ�� ��ʽ yyyy-MM-dd HH:mm:ss.֧�ֵ���Ĳ�ѯ��������ʱ���룬Ĭ��Ϊ0ʱ0��0�롣��purchase_order_idû������˲����ش���
	 */
	private Date endCreated;

	/** 
	* ҳ�롣������0��������Ĭ��Ϊ1��
	 */
	private Long pageNo;

	/** 
	* ÿҳ��������ÿҳ����������50����
	 */
	private Long pageSize;

	/** 
	* �ɹ�����Ż������ˮ�ţ�����������û������˲����ش���
	 */
	private Long purchaseOrderId;

	/** 
	* ��ʼʱ�� ��ʽ yyyy-MM-dd HH:mm:ss.֧�ֵ���Ĳ�ѯ��������ʱ���룬Ĭ��Ϊ0ʱ0��0�롣��purchase_order_idû������˲����ش���
	 */
	private Date startCreated;

	/** 
	* ����״̬������Ĭ�ϲ�ѯ���вɹ������������ѡ������״̬����ѡֵ:<br>

 *��Ӧ�̣�<br>
WAIT_SELLER_SEND_GOODS(�ȴ�����)<br>
WAIT_SELLER_CONFIRM_PAY(��ȷ���տ�)<br>
WAIT_BUYER_PAY(�ȴ�����)<br>
WAIT_BUYER_CONFIRM_GOODS(�ѷ���)<br>
TRADE_REFUNDING(�˿���)<br>
TRADE_FINISHED(�ɹ��ɹ�)<br>
TRADE_CLOSED(�ѹر�)��<br>
       *�����̣�<br>
WAIT_BUYER_PAY(�ȴ�����)<br>
WAIT_BUYER_CONFIRM_GOODS(���ջ�ȷ��)<br>
TRADE_FOR_PAY(�Ѹ���)<br>
TRADE_REFUNDING(�˿���)<br>
TRADE_FINISHED(�ɹ��ɹ�)<br>
TRADE_CLOSED(�ѹر�)��
	 */
	private String status;

	/** 
	* ��ѡֵ��trade_time_type(�ɹ������ճɽ�ʱ�䷶Χ��ѯ),update_time_type(�ɹ������ո���ʱ�䷶Χ��ѯ)
	 */
	private String timeType;

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	public Date getEndCreated() {
		return this.endCreated;
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

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public Date getStartCreated() {
		return this.startCreated;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}
	public String getTimeType() {
		return this.timeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.orders.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_created", this.endCreated);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("time_type", this.timeType);
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

	public Class<FenxiaoOrdersGetResponse> getResponseClass() {
		return FenxiaoOrdersGetResponse.class;
	}
}
