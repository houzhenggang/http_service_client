package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementTradesGetResponse;

/**
 * TOP API: taobao.increment.trades.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class IncrementTradesGetRequest implements TaobaoRequest<IncrementTradesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ϣ����Ӧ�Ĳ���ʱ������ֵ����start_modified����ʹ���ܹ�����֪ͨ��Ϣ��ʱ��Ρ�����ʱ�����������start_modified��Ĭ��Ϊ��start_modifiedͬһ���23:59:59������Ĭ��Ϊ���ýӿڵ����23:59:59������ʽ��yyyy-MM-dd HH:mm:ss��<br>
<font color="red">ע�⣺start_modified��end_modified�����ڱ����ڱ�����ͬһ���ڣ����磺start_modified����2000-01-01 00:00:00����end_modified��������Ϊ2000-01-01�������</font>
	 */
	private Date endModified;

	/** 
	* ��Ϣ�����ڵ��û����ǳơ����ô˲��������ص���Ϣ����ݴ���nick�Ľ��й��ˡ�������appKey���ǳ�Ĭ��Ϊ�Լ��İ��ǳƣ��˲�����Ч��
	 */
	private String nick;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1,�����ص�һҳ���ݡ�
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������;���ֵ:200;Ĭ��ֵ:40��
	 */
	private Long pageSize;

	/** 
	* ��Ϣ����Ӧ�Ĳ���ʱ�����Сֵ����end_modified����ʹ���ܹ�����֪ͨ��Ϣ��ʱ��Ρ�����ʱ�����������end_modified��Ĭ��Ϊ��end_modifiedͬһ���00:00:00������Ĭ��Ϊ���ýӿڵ����00:00:00������ʽ��yyyy-MM-dd HH:mm:ss��<br>
<font color="red">ע�⣺start_modified��end_modified�����ڱ����ڱ�����ͬһ���ڣ����磺start_modified����2000-01-01 00:00:00����end_modified��������Ϊ2000-01-01�������</font>
	 */
	private Date startModified;

	/** 
	* ���׻����۵�״̬��Ĭ�ϲ�ѯ����״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬�����˽��׳�ʱ������Ϣû��type�������⣬���׵�������Ϣ����type���ࡣ
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
	private String status;

	/** 
	* �������������ͣ�Ĭ�ϲ�ѯ�������͵����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ�����͡����׳�ʱ�������͵���Ϣû����Ϣ���ͣ��̶����ء�timeout����
��ѡֵ��
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
	private String type;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public Date getEndModified() {
		return this.endModified;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
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

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public Date getStartModified() {
		return this.startModified;
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
		return "taobao.increment.trades.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modified", this.startModified);
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

	public Class<IncrementTradesGetResponse> getResponseClass() {
		return IncrementTradesGetResponse.class;
	}
}
