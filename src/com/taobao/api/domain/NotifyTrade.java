package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����֪ͨ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-12-08 13:22:22.0
 */
public class NotifyTrade extends TaobaoObject {

	private static final long serialVersionUID = 7783894279156193451L;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * �����޸�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ���ʵ�����
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ���ײ�������Ӧ�Ľ���������Ϣ״̬����Ӧ��NotifyTrade��status�ֶ� 

��ѡֵ 
TradeCreate���������ף� 
TradeModifyFee���޸Ľ��׷��ã� 
TradeCloseAndModifyDetailOrder���رջ��޸��Ӷ����� 
TradeClose���رս��ף� 
TradeBuyerPay����Ҹ�� 
TradeSellerShip�����ҷ����� 
TradeDelayConfirmPay���ӳ��ջ�ʱ�䣩 
TradePartlyRefund���Ӷ����˿�ɹ��� 
TradePartlyConfirmPay���Ӷ������ɹ��� 
TradeSuccess�����׳ɹ��� 
TradeTimeoutRemind�����׳�ʱ���ѣ� 
TradeRated���������۱���� 
TradeMemoModified�����ױ�ע�޸ģ� 
TradeLogisticsAddressChanged���޸Ľ����ջ���ַ�� 
TradeChanged���޸Ķ�����Ϣ��SKU�ȣ���
	 */
	@ApiField("status")
	private String status;

	/**
	 * ���ױ��
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ������Ϣ�з����û����ĵ�attributes��ǵ�key1name:value1name;key2name:value2name;������Ǵ���������SubscribeMessage��attributes�ж��Ĺ��ı�ǣ����ҽ������д˱�ǲŻ᷵�أ�������ֶ�Ϊ�ա�����ֵ��keyname��valuename�����û����Զ����key���ƺ�valueֵ�������ء�
	 */
	@ApiField("trade_mark")
	private String tradeMark;

	/**
	 * �������͡����˽��׳�ʱ������Ϣû���������⣬������Ϣ���н������͡�

��������У� 

��ѡֵ 
ec��ֱ�壩 
guarantee_trade��һ�ڼۡ������� 
auto_delivery���Զ������� 
cod��������� 
independent_shop_trade�������׼�潻�ף� 
independent_simple_trade���������Ű潻�ף� 
shopex_trade��ShopEX��) 
netcn_trade���Ա����������������� 
travel�����β�Ʒ���ף� 
fenxiao������ƽ̨���ף� 
game_equipment���������⽻�ף�
	 */
	@ApiField("type")
	private String type;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTradeMark() {
		return this.tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
