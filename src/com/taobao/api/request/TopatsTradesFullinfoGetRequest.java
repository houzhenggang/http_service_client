package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsTradesFullinfoGetResponse;

/**
 * TOP API: taobao.topats.trades.fullinfo.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:50.0
 */
public class TopatsTradesFullinfoGetRequest implements TaobaoRequest<TopatsTradesFullinfoGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ָ�����ֶα�ʾ��ȡ�����ж�������������ֶ����������أ�ͬ��taobao.trade.fullinfo.get��fieldsһ������
1.Trade�п���ָ�����ص�fields��seller_nick, buyer_nick, title, type, created, sid, tid, seller_rate, buyer_rate, status, payment, discount_fee, adjust_fee, post_fee, total_fee, pay_time, end_time, modified, consign_time, buyer_obtain_point_fee, point_fee, real_point_fee, received_payment, commission_fee, buyer_memo, seller_memo, alipay_no, buyer_message, pic_path, num_iid, num, price, buyer_alipay_no, receiver_name, receiver_state, receiver_city, receiver_district, receiver_address, receiver_zip, receiver_mobile, receiver_phone, buyer_email, seller_alipay_no, seller_mobile, seller_phone, seller_name, seller_email, available_confirm_fee, has_post_fee, timeout_action_time, snapshot_url, cod_fee, cod_status, shipping_type, trade_memo, is_3D 2.Order�п���ָ������fields��orders.title, orders.pic_path, orders.price, orders.num, orders.num_iid, orders.sku_id, orders.refund_status, orders.status, orders.oid, orders.total_fee, orders.payment, orders.discount_fee, orders.adjust_fee, orders.snapshot_url, orders.timeout_action_time��orders.sku_properties_name, orders.item_meal_name, item_memo,orders.buyer_rate, orders.seller_rate, orders.outer_iid, orders.outer_sku_id, orders.refund_id, orders.seller_type 3.fields��orders������Order���������ݣ�
	 */
	private String fields;

	/** 
	* ������ȡ�Ķ���id�б�ÿ������id�����ǺϷ����������͵�tid��ÿ��tid֮����";"�ָ�������Ҫָ��һ��tid����಻����40��tid
	 */
	private String tids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setTids(String tids) {
		this.tids = tids;
	}
	public String getTids() {
		return this.tids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.topats.trades.fullinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("tids", this.tids);
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

	public Class<TopatsTradesFullinfoGetResponse> getResponseClass() {
		return TopatsTradesFullinfoGetResponse.class;
	}
}
