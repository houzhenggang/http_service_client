package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeShippingaddressUpdateResponse;

/**
 * TOP API: taobao.trade.shippingaddress.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TradeShippingaddressUpdateRequest implements TaobaoRequest<TradeShippingaddressUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ջ���ַ����󳤶�Ϊ228���ֽڡ�
	 */
	private String receiverAddress;

	/** 
	* ���С���󳤶�Ϊ32���ֽڡ��磺����
	 */
	private String receiverCity;

	/** 
	* ��/�ء���󳤶�Ϊ32���ֽڡ��磺������
	 */
	private String receiverDistrict;

	/** 
	* �ƶ��绰����󳤶�Ϊ30���ֽڡ�
	 */
	private String receiverMobile;

	/** 
	* �ջ���ȫ������󳤶�Ϊ50���ֽڡ�
	 */
	private String receiverName;

	/** 
	* �̶��绰����󳤶�Ϊ30���ֽڡ�
	 */
	private String receiverPhone;

	/** 
	* ʡ�ݡ���󳤶�Ϊ32���ֽڡ��磺�㽭
	 */
	private String receiverState;

	/** 
	* �������롣������6��������ɡ�
	 */
	private String receiverZip;

	/** 
	* ���ױ�š�
	 */
	private Long tid;

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}
	public String getReceiverZip() {
		return this.receiverZip;
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
		return "taobao.trade.shippingaddress.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("receiver_address", this.receiverAddress);
		txtParams.put("receiver_city", this.receiverCity);
		txtParams.put("receiver_district", this.receiverDistrict);
		txtParams.put("receiver_mobile", this.receiverMobile);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("receiver_phone", this.receiverPhone);
		txtParams.put("receiver_state", this.receiverState);
		txtParams.put("receiver_zip", this.receiverZip);
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

	public Class<TradeShippingaddressUpdateResponse> getResponseClass() {
		return TradeShippingaddressUpdateResponse.class;
	}
}
