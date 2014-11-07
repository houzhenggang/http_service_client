package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradesSoldGetResponse;

/**
 * TOP API: taobao.trades.sold.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class TradesSoldGetRequest implements TaobaoRequest<TradesSoldGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ǳ�
	 */
	private String buyerNick;

	/** 
	* ��ѯ���״���ʱ���������ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date endCreated;

	/** 
	* ��Ҫ���ص��ֶΡ�Ŀǰ֧���У�<br>
1. Trade�п���ָ�����ص�fields:<br>
seller_nick, buyer_nick, title, type, created,  tid, seller_rate, buyer_rate, status, payment, discount_fee, adjust_fee, post_fee, total_fee, pay_time, end_time, modified, consign_time, buyer_obtain_point_fee, point_fee, real_point_fee, received_payment, commission_fee, pic_path, num_iid, num, price, cod_fee, cod_status, shipping_type, receiver_name, receiver_state, receiver_city, receiver_district, receiver_address, receiver_zip, receiver_mobile, receiver_phone <br>
2. Order�п���ָ������fields��orders.title, orders.pic_path, orders.price, orders.num, orders.num_iid, orders.sku_id, orders.refund_status, orders.status, orders.oid, orders.total_fee, orders.payment, orders.discount_fee, orders.adjust_fee, orders.sku_properties_name, orders.item_meal_name, orders.buyer_rate, orders.seller_rate, orders.outer_iid, orders.outer_sku_id, orders.refund_id, orders.seller_type <br>
3. fields��orders������Order���������ݣ�
	 */
	private String fields;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������; Ĭ��ֵ:40;���ֵ:100
	 */
	private Long pageSize;

	/** 
	* ����״̬��Ĭ�ϲ�ѯ��������״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬��<br>
��ѡֵ��
RATE_UNBUYER(���δ��)
RATE_UNSELLER(����δ��)
RATE_BUYER_UNSELLER(�������������δ��)
RATE_UNBUYER_SELLER(���δ������������)
	 */
	private String rateStatus;

	/** 
	* ��ѯ�������ڽ��״���ʱ�俪ʼ����ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date startCreated;

	/** 
	* ����״̬��Ĭ�ϲ�ѯ���н���״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬��
��ѡֵ��
TRADE_NO_CREATE_PAY(û�д���֧��������)
WAIT_BUYER_PAY(�ȴ���Ҹ���)
WAIT_SELLER_SEND_GOODS(�ȴ����ҷ���,��:����Ѹ���)
WAIT_BUYER_CONFIRM_GOODS(�ȴ����ȷ���ջ�,��:�����ѷ���)
TRADE_BUYER_SIGNED(�����ǩ��,��������ר��)
TRADE_FINISHED(���׳ɹ�)
TRADE_CLOSED(���׹ر�)
TRADE_CLOSED_BY_TAOBAO(���ױ��Ա��ر�)
ALL_WAIT_PAY(������WAIT_BUYER_PAY��TRADE_NO_CREATE_PAY)
ALL_CLOSED(������TRADE_CLOSED��TRADE_CLOSED_BY_TAOBAO)
	 */
	private String status;

	/** 
	* ���ҶԽ��׵��Զ�������ǩ��Ŀǰ��ѡֵΪ��time_card���㿨������䣩��fee_card������������䣩
	 */
	private String tag;

	/** 
	* ���������б�ͬʱ��ѯ���ֽ������Ϳ��ö��ŷָ���Ĭ��ͬʱ��ѯguarantee_trade, auto_delivery, ec, cod��4�ֽ������͵����� ��
��ѡֵ��
fixed(һ�ڼ�)
auction(����)
guarantee_trade(һ�ڼۡ�����)
independent_simple_trade(�������Ű潻��)
independent_shop_trade(�����׼�潻��)
auto_delivery(�Զ�����)
ec(ֱ��)
cod(��������)
fenxiao(����)
game_equipment(��Ϸװ��)
shopex_trade(ShopEX����)
netcn_trade(��������)
external_trade(ͳһ�ⲿ����)
instant_trade (��ʱ����)
b2c_cod(���̼һ�������)
hotel_trade(�Ƶ����ͽ���)
super_market_trade(�̳�����)
super_market_cod_trade(�̳����������)
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

	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}
	public String getRateStatus() {
		return this.rateStatus;
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

	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTag() {
		return this.tag;
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
		return "taobao.trades.sold.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rate_status", this.rateStatus);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("tag", this.tag);
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

	public Class<TradesSoldGetResponse> getResponseClass() {
		return TradesSoldGetResponse.class;
	}
}
