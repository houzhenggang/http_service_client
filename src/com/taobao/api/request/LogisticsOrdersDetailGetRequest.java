package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrdersDetailGetResponse;

/**
 * TOP API: taobao.logistics.orders.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class LogisticsOrdersDetailGetRequest implements TaobaoRequest<LogisticsOrdersDetailGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ǳ�
	 */
	private String buyerNick;

	/** 
	* ����ʱ�����.��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date endCreated;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:Shipping �������ݽṹ�������ֶ�.fileds�п���ָ��������������һ�����߶���ֶ�,��","�ָ�.
	 */
	private String fields;

	/** 
	* ˭�е��˷�.��ѡֵ:buyer(���),seller(����).��:buyer
	 */
	private String freightPayer;

	/** 
	* ҳ��.���ֶ�û�� �� ֵ<1 ,��Ĭ��page_noΪ1
	 */
	private Long pageNo;

	/** 
	* ÿҳ����.���ֶ�û�� �� ֵ<1 ����Ĭ��page_sizeΪ40
	 */
	private Long pageSize;

	/** 
	* �ջ�������
	 */
	private String receiverName;

	/** 
	* �����Ƿ񷢻�.��ѡֵ:yes(��),no(��).��:yes.
	 */
	private String sellerConfirm;

	/** 
	* ����ʱ�俪ʼ.��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date startCreated;

	/** 
	* ����״̬.�ɲ鿴���ݽṹ Shipping �е�status�ֶ�.
	 */
	private String status;

	/** 
	* ����ID.�������tid�����Ļ�,���ô������Ĳ���,���ǽ��᷵��һ������������Ϣ.
	 */
	private Long tid;

	/** 
	* ������ʽ.��ѡֵ:post(ƽ��),express(���),ems(EMS).��:post
	 */
	private String type;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}
	public String getFreightPayer() {
		return this.freightPayer;
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

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName() {
		return this.receiverName;
	}

	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}
	public String getSellerConfirm() {
		return this.sellerConfirm;
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

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.orders.detail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("freight_payer", this.freightPayer);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("seller_confirm", this.sellerConfirm);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("tid", this.tid);
		txtParams.put("type", this.type);
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

	public Class<LogisticsOrdersDetailGetResponse> getResponseClass() {
		return LogisticsOrdersDetailGetResponse.class;
	}
}
