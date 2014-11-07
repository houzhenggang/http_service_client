package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradesBoughtGetResponse;

/**
 * TOP API: taobao.trades.bought.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class TradesBoughtGetRequest implements TaobaoRequest<TradesBoughtGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ѯ���״���ʱ���������ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date endCreated;

	/** 
	* ��Ҫ���ص��ֶΡ�Ŀǰ֧���У�

   1. Trade�п���ָ�����ص�fields��
seller_nick, buyer_nick, title, type, created, sid, tid, seller_rate, buyer_rate, status, payment, discount_fee, adjust_fee, post_fee, total_fee, pay_time, end_time, modified, consign_time, buyer_obtain_point_fee, point_fee, real_point_fee, received_payment, commission_fee, pic_path, num_iid, num, price, cod_fee, cod_status, shipping_type, receiver_name, receiver_state, receiver_city, receiver_district, receiver_address, receiver_zip, receiver_mobile, receiver_phone            
   
2. Order�п���ָ������fields��
orders.title, orders.pic_path, orders.price, orders.num, orders.num_iid, orders.sku_id, orders.refund_status, orders.status, orders.oid, orders.total_fee, orders.payment, orders.discount_fee, orders.adjust_fee, orders.sku_properties_name, orders.item_meal_name, orders.buyer_rate, orders.seller_rate, orders.outer_iid, orders.outer_sku_id, orders.refund_id, orders.seller_type                          
  
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
	* �����Ƿ�����.Ĭ�ϲ�ѯ��������״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬��
��ѡֵ�� RATE_UNBUYER(���δ��) RATE_UNSELLER(����δ��) RATE_BUYER_UNSELLER(�������������δ��) RATE_UNBUYER_SELLER(���δ������������)
	 */
	private String rateStatus;

	/** 
	* �����ǳ�
	 */
	private String sellerNick;

	/** 
	* ��ѯ���״���ʱ�俪ʼ����ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date startCreated;

	/** 
	* ����״̬��Ĭ�ϲ�ѯ���н���״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬��
 ����״̬��ѡֵ

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
	* ���������б�ͬʱ��ѯ���ֽ������Ϳ��ö��ŷָ���Ĭ��ͬʱ��ѯguarantee_trade, auto_delivery, ec, cod��4�ֽ������͵�����
�������Ϳ�ѡֵ
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
external_trade(ͳһ�ⲿ����
instant_trade (��ʱ����)
b2c_cod(���̼һ�������)
hotel_trade(�Ƶ����ͽ���)
super_market_trade(�̳�����)
super_market_cod_trade(�̳����������)
	 */
	private String type;

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

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerNick() {
		return this.sellerNick;
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
		return "taobao.trades.bought.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rate_status", this.rateStatus);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
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

	public Class<TradesBoughtGetResponse> getResponseClass() {
		return TradesBoughtGetResponse.class;
	}
}
