package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderConfirmPaidResponse;

/**
 * TOP API: taobao.fenxiao.order.confirm.paid request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class FenxiaoOrderConfirmPaidRequest implements TaobaoRequest<FenxiaoOrderConfirmPaidResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ȷ��֧����Ϣ������С��100��
	 */
	private String confirmRemark;

	/** 
	* �ɹ�����š�
	 */
	private Long purchaseOrderId;

	public void setConfirmRemark(String confirmRemark) {
		this.confirmRemark = confirmRemark;
	}
	public String getConfirmRemark() {
		return this.confirmRemark;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.order.confirm.paid";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("confirm_remark", this.confirmRemark);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
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

	public Class<FenxiaoOrderConfirmPaidResponse> getResponseClass() {
		return FenxiaoOrderConfirmPaidResponse.class;
	}
}
