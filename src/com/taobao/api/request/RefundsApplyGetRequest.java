package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundsApplyGetResponse;

/**
 * TOP API: taobao.refunds.apply.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class RefundsApplyGetRequest implements TaobaoRequest<RefundsApplyGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ���ص��ֶΡ�Ŀǰ֧���У�refund_id, tid, title, buyer_nick, seller_nick, total_fee, status, created, refund_fee
	 */
	private String fields;

	/** 
	* ҳ�롣����ֵΪ 1 �����һҳ������ֵΪ 2 ����ڶ�ҳ���������ơ�Ĭ�Ϸ��ص������Ǵӵ�һҳ��ʼ
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������; Ĭ��ֵ:40;���ֵ:100
	 */
	private Long pageSize;

	/** 
	* �����ǳ�
	 */
	private String sellerNick;

	/** 
	* �˿�״̬��Ĭ�ϲ�ѯ�����˿�״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬��
WAIT_SELLER_AGREE(����Ѿ������˿�ȴ�����ͬ��) 
WAIT_BUYER_RETURN_GOODS(�����Ѿ�ͬ���˿�ȴ�����˻�) 
WAIT_SELLER_CONFIRM_GOODS(����Ѿ��˻����ȴ�����ȷ���ջ�) 
SELLER_REFUSE_BUYER(���Ҿܾ��˿�) 
CLOSED(�˿�ر�) 
SUCCESS(�˿�ɹ�)
	 */
	private String status;

	/** 
	* ���������б�һ�β�ѯ�������Ϳ��ð�Ƕ��ŷָ���Ĭ��ͬʱ��ѯguarantee_trade, auto_delivery��2�����͵����ݡ�
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
	 */
	private String type;

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

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerNick() {
		return this.sellerNick;
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
		return "taobao.refunds.apply.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("seller_nick", this.sellerNick);
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

	public Class<RefundsApplyGetResponse> getResponseClass() {
		return RefundsApplyGetResponse.class;
	}
}
