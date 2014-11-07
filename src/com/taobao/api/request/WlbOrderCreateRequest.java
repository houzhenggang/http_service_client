package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderCreateResponse;

/**
 * TOP API: taobao.wlb.order.create request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderCreateRequest implements TaobaoRequest<WlbOrderCreateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ֧�������׺�
	 */
	private String alipayNo;

	/** 
	* ���ֶ���ʱ����
	 */
	private String attributes;

	/** 
	* ����س�
	 */
	private String buyerNick;

	/** 
	* ��������ʱ�䣬����ⵥ��ʹ�õ�
	 */
	private Date expectEndTime;

	/** 
	* �ƻ���ʼ�ʹ�ʱ��  ����ⵥ�п��ܻ�ʹ��
	 */
	private Date expectStartTime;

	/** 
	* {"invoince_info": [{"bill_type":"��Ʊ���ͣ���ѡ", "bill_title":"��Ʊ̧ͷ����ѡ", "bill_amount":"��Ʊ���(��λ�Ƿ�)����ѡ","bill_content":"��Ʊ���ݣ���ѡ"}]}
	 */
	private String invoinceInfo;

	/** 
	* �������������Ƿ�����ɣ�������������Ϊtrue�����Ϊfalse������Ҫ�ȴ���������������Ʒ��Ϣ��
	 */
	private Boolean isFinished;

	/** 
	* ������������ţ��ýӿ�Լ��ÿ�����ֻ�ܴ�50��order_item_list�����һ����������������50����Ʒ��ʱ����Ҫ���������øýӿڣ���һ�ε��õ�ʱ��wlb_order_codeΪ�գ������һ�δ����ɹ����ýӿڷ���wlb_order_code���������ٸö����������Ʒ��Ŀ����Ҫ����wlb_order_code��out_biz_code��order_item_list,is_finished�ĸ��ֶΡ�
	 */
	private String orderCode;

	/** 
	* ���ַ�����ʽ����ʾ��������б�����COD^PRESELL^SPLIT^LIMIT �ȣ��м��á�^�������� ---------------------------------------- �������list��������ĸȫ����д���� 1: COD �C�������� 2: LIMIT-��ʱ���� 3: PRESELL-Ԥ�� 5:COMPLAIN-��Ͷ�� 7:SPLIT-�𵥣� 8:EXCHANGE-������ 9:VISIT-���� �� 10: MODIFYTRANSPORT-�Ƿ�ɸ����ͷ�ʽ��
: �Ƿ�ɸ����ͷ�ʽ  Ĭ�Ͽɸ���
11 CONSIGN ������������,�Զ����ķ���״̬
12: SELLER_AFFORD �Ƿ����ҳе��˷� Ĭ���ǣ���û 13: SYNC_RETURN_BILL��ͬʱ�˻ط�Ʊ
	 */
	private String orderFlag;

	/** 
	* ������Ʒ�б� {"order_item_list":[{"trade_code":"��ѡ,�Ա����׶��������Ҳ�����Ʒ������Ҫ��������Դ���"," sub_trade_code ":"��ѡ,�Ա��ӽ��׺�","item_id":"����,��ƷId","item_code":"����,�̼ұ���","item_name":"��ѡ,��������Ʒ����","item_quantity":"��ѡ,�ƻ�����","item_price":"��ѡ,��Ʒ�۸�,��λΪ��","owner_user_nick
":"��ѡ,����nick ����ģʽ�»����","flag":"�ж��Ƿ�Ϊ��Ʒ0 ����1��","remarks":"��ѡ,��ע","batch_remark":"��ѡ������������Ϣ��������Ϣ����WMS�����������������������"��"inventory_type":"�������1 �����ۿ�� 101 ������������д�Ʒ 201 �������Ϳ�� 301 ��;���","picture_url":"ͼƬUrl","distributor_user_nick": "������NICK","ext_order_item_code":"��ѡ���ⲿ��Ʒ���̼ұ���"]} ======================================== ��������е���Ʒ��Ŀ������50����ʱ�����ǻ�У�飬���ܴ����ɹ�����Ҫ�㰴��50��һ��������������Ҫ�������øýӿڣ��ڶ��δ���ʱ����Ҫ����wlb_order_code��is_finished��order_item_list�����ֶ��Ǳش��ģ�is_finishedΪtrue��ʾ������ϣ�Ϊfalse��ʾ��û��ȫ���ꡣ
	 */
	private String orderItemList;

	/** 
	* ���������ͣ�
��1��OTHER�� ����
��2��TAOBAO_TRADE�� �Ա�����
��3��OTHER_TRADE����������
��4��ALLCOATE�� ����
��5��PURCHASE:�ɹ�
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
	* �ⲿ����ҵ��ID���ñ����isv����Ψһ��ţ� �������Ʋ�����ȥ����
	 */
	private String outBizCode;

	/** 
	* ������������ⵥ�ͳ��ⵥ�л��õ�
	 */
	private Long packageCount;

	/** 
	* Ӧ�ս�cod������ѡ
	 */
	private Long payableAmount;

	/** 
	* Դ�������
	 */
	private String prevOrderCode;

	/** 
	* ���շ���������Ϣ��ѡ��һ �ֻ��͵绰��ѡ��һ
�ջ�����Ϣ
�ʱ�^^^ʡ^^^��^^^��^^^�����ַ^^^�ռ�������^^^�ֻ�^^^�绰

���ĳһ���ֶε�����Ϊ��ʱ�����봫NA
	 */
	private String receiverInfo;

	/** 
	* ��ע
	 */
	private String remark;

	/** 
	* Ͷ��ʱ�䷶ΧҪ��,��ʽ'15:20'�÷ֺŸ���
	 */
	private String scheduleEnd;

	/** 
	* Ͷ��ʱ�䷶ΧҪ��,��ʽ'13:20'�÷ֺŸ���
	 */
	private String scheduleStart;

	/** 
	* Ͷ��ʱ��Ҫ��: 
��1��INSTANT_ARRIVED�� ���մ� 
��2��TOMMORROY_MORNING_ARRIVED���γ���
��3��TOMMORROY_ARRIVED�����մ�
��4�������գ�WORK_DAY 
��5���ڼ��գ�WEEKED_DAY
	 */
	private String scheduleType;

	/** 
	* ��������Ϣ�����շ���������Ϣ��ѡ��һ �ֻ��͵绰��ѡ��һ
�ʱ�^^^ʡ^^^��^^^��^^^�����ַ^^^�ռ�������^^^�ֻ�^^^�绰
���ĳһ���ֶε�����Ϊ��ʱ�����봫NA
	 */
	private String senderInfo;

	/** 
	* cod����ѣ�ֻ��cod������ʱ�򣬲���Ҫ����ֶ�
	 */
	private Long serviceFee;

	/** 
	* �ֿ����
	 */
	private String storeCode;

	/** 
	* ���ⵥ�п��ܻ��õ�
���乫˾����^^^���乫˾��ϵ��^^^���乫˾�˵���^^^���乫˾�绰^^^���乫˾��ϵ�����֤��

========================================
���ĳһ���ֶε�����Ϊ��ʱ�����봫NA
	 */
	private String tmsInfo;

	/** 
	* �˵���ţ��˻���ʱ���ܻ�ʹ��
	 */
	private String tmsOrderCode;

	/** 
	* ������˾����
	 */
	private String tmsServiceCode;

	/** 
	* �ܽ��
	 */
	private Long totalAmount;

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}
	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public String getAttributes() {
		return this.attributes;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setExpectEndTime(Date expectEndTime) {
		this.expectEndTime = expectEndTime;
	}
	public Date getExpectEndTime() {
		return this.expectEndTime;
	}

	public void setExpectStartTime(Date expectStartTime) {
		this.expectStartTime = expectStartTime;
	}
	public Date getExpectStartTime() {
		return this.expectStartTime;
	}

	public void setInvoinceInfo(String invoinceInfo) {
		this.invoinceInfo = invoinceInfo;
	}
	public String getInvoinceInfo() {
		return this.invoinceInfo;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
	public Boolean getIsFinished() {
		return this.isFinished;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}
	public String getOrderFlag() {
		return this.orderFlag;
	}

	public void setOrderItemList(String orderItemList) {
		this.orderItemList = orderItemList;
	}
	public String getOrderItemList() {
		return this.orderItemList;
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

	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}
	public String getOutBizCode() {
		return this.outBizCode;
	}

	public void setPackageCount(Long packageCount) {
		this.packageCount = packageCount;
	}
	public Long getPackageCount() {
		return this.packageCount;
	}

	public void setPayableAmount(Long payableAmount) {
		this.payableAmount = payableAmount;
	}
	public Long getPayableAmount() {
		return this.payableAmount;
	}

	public void setPrevOrderCode(String prevOrderCode) {
		this.prevOrderCode = prevOrderCode;
	}
	public String getPrevOrderCode() {
		return this.prevOrderCode;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}
	public String getReceiverInfo() {
		return this.receiverInfo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark() {
		return this.remark;
	}

	public void setScheduleEnd(String scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}
	public String getScheduleEnd() {
		return this.scheduleEnd;
	}

	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}
	public String getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}
	public String getSenderInfo() {
		return this.senderInfo;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Long getServiceFee() {
		return this.serviceFee;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTmsInfo(String tmsInfo) {
		this.tmsInfo = tmsInfo;
	}
	public String getTmsInfo() {
		return this.tmsInfo;
	}

	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}
	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}

	public void setTmsServiceCode(String tmsServiceCode) {
		this.tmsServiceCode = tmsServiceCode;
	}
	public String getTmsServiceCode() {
		return this.tmsServiceCode;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount() {
		return this.totalAmount;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alipay_no", this.alipayNo);
		txtParams.put("attributes", this.attributes);
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("expect_end_time", this.expectEndTime);
		txtParams.put("expect_start_time", this.expectStartTime);
		txtParams.put("invoince_info", this.invoinceInfo);
		txtParams.put("is_finished", this.isFinished);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_flag", this.orderFlag);
		txtParams.put("order_item_list", this.orderItemList);
		txtParams.put("order_sub_type", this.orderSubType);
		txtParams.put("order_type", this.orderType);
		txtParams.put("out_biz_code", this.outBizCode);
		txtParams.put("package_count", this.packageCount);
		txtParams.put("payable_amount", this.payableAmount);
		txtParams.put("prev_order_code", this.prevOrderCode);
		txtParams.put("receiver_info", this.receiverInfo);
		txtParams.put("remark", this.remark);
		txtParams.put("schedule_end", this.scheduleEnd);
		txtParams.put("schedule_start", this.scheduleStart);
		txtParams.put("schedule_type", this.scheduleType);
		txtParams.put("sender_info", this.senderInfo);
		txtParams.put("service_fee", this.serviceFee);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("tms_info", this.tmsInfo);
		txtParams.put("tms_order_code", this.tmsOrderCode);
		txtParams.put("tms_service_code", this.tmsServiceCode);
		txtParams.put("total_amount", this.totalAmount);
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

	public Class<WlbOrderCreateResponse> getResponseClass() {
		return WlbOrderCreateResponse.class;
	}
}
