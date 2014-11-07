package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbNotifyMessagePageGetResponse;

/**
 * TOP API: taobao.wlb.notify.message.page.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbNotifyMessagePageGetRequest implements TaobaoRequest<WlbNotifyMessagePageGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѯ��������¼����ʱ��
	 */
	private Date endDate;

	/** 
	* ֪ͨ��Ϣ���룺
STOCK_IN_NOT_CONSISTENT---��ⵥ��һ��
CANCEL_ORDER_SUCCESS---ȡ�������ɹ�
INVENTORY_CHECK---�̵�
CANCEL_ORDER_FAILURE---ȡ������ʧ��
ORDER_REJECT--wms�ܵ�
ORDER_CONFIRMED--��������ɹ�
	 */
	private String msgCode;

	/** 
	* ��ҳ��ѯҳ��
	 */
	private Long pageNo;

	/** 
	* ��ҳ��ѯ��ÿҳҳ��
	 */
	private Long pageSize;

	/** 
	* ��ѯ��������¼��ʼʱ��
	 */
	private Date startDate;

	/** 
	* ��Ϣ״̬��
����Ҫȷ�ϣ�NO_NEED_CONFIRM
��ȷ�ϣ�CONFIRMED
��ȷ�ϣ�TO_BE_CONFIRM
	 */
	private String status;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgCode() {
		return this.msgCode;
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

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
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
		return "taobao.wlb.notify.message.page.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("msg_code", this.msgCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
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

	public Class<WlbNotifyMessagePageGetResponse> getResponseClass() {
		return WlbNotifyMessagePageGetResponse.class;
	}
}
