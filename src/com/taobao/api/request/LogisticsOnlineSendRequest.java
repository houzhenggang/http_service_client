package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineSendResponse;

/**
 * TOP API: taobao.logistics.online.send request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class LogisticsOnlineSendRequest implements TaobaoRequest<LogisticsOnlineSendResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。<br><font color='red'>如果为空，取的卖家的默认退货地址</font><br>
	 */
	private Long cancelId;

	/** 
	* 物流公司代码.如"POST"就代表中国邮政,"ZJS"就代表宅急送.调用 taobao.logistics.companies.get 获取。
<br><font color='red'>如果是货到付款订单，选择的物流公司必须支持货到付款发货方式</font>
	 */
	private String companyCode;

	/** 
	* 运单号.具体一个物流公司的真实运单号码。淘宝官方物流会校验，请谨慎传入；
	 */
	private String outSid;

	/** 
	* 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。<font color='red'>如果为空，取的卖家的默认取货地址</font>
	 */
	private Long senderId;

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setCancelId(Long cancelId) {
		this.cancelId = cancelId;
	}
	public Long getCancelId() {
		return this.cancelId;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public String getOutSid() {
		return this.outSid;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}
	public Long getSenderId() {
		return this.senderId;
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
		return "taobao.logistics.online.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cancel_id", this.cancelId);
		txtParams.put("company_code", this.companyCode);
		txtParams.put("out_sid", this.outSid);
		txtParams.put("sender_id", this.senderId);
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

	public Class<LogisticsOnlineSendResponse> getResponseClass() {
		return LogisticsOnlineSendResponse.class;
	}
}
