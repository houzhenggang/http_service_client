package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeAmountGetResponse;

/**
 * TOP API: taobao.trade.amount.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TradeAmountGetRequest implements TaobaoRequest<TradeAmountGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��������������Ҫ���ص��ֶ���Ϣ����ѡֵ���£�
1. TradeAmount�п�ָ����fields��
tid,alipay_no,created,pay_time,end_time,total_fee,payment,post_fee,cod_fee,commission_fee,buyer_obtain_point_fee
2. OrderAmount�п�ָ����fields��order_amounts.oid,order_amounts.title,order_amounts.num_iid,
order_amounts.sku_properties_name,order_amounts.sku_id,order_amounts.num,order_amounts.price,order_amounts.discount_fee,order_amounts.adjust_fee,order_amounts.payment,order_amounts.promotion_name
3. order_amounts(����OrderAmount����������)
4. promotion_details(ָ����ֵ�᷵����������promotion_details�г�id֮��������ֶ�)
	 */
	private String fields;

	/** 
	* �������ױ��
	 */
	private Long tid;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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
		return "taobao.trade.amount.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
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

	public Class<TradeAmountGetResponse> getResponseClass() {
		return TradeAmountGetResponse.class;
	}
}
