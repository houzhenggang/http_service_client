package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountsGetResponse;

/**
 * TOP API: taobao.fenxiao.discounts.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:37.0
 */
public class FenxiaoDiscountsGetRequest implements TaobaoRequest<FenxiaoDiscountsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ۿ�ID
	 */
	private Long discountId;

	/** 
	* ָ����ѯ�������Ϣ����ѡֵ��DETAIL����ѯ�ۿ����飩�������ѡֵ�ö��ŷָ��ֻ����ָ���ۿ�ID�����ʹ�ã�
	 */
	private String extFields;

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId() {
		return this.discountId;
	}

	public void setExtFields(String extFields) {
		this.extFields = extFields;
	}
	public String getExtFields() {
		return this.extFields;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.discounts.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("discount_id", this.discountId);
		txtParams.put("ext_fields", this.extFields);
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

	public Class<FenxiaoDiscountsGetResponse> getResponseClass() {
		return FenxiaoDiscountsGetResponse.class;
	}
}
