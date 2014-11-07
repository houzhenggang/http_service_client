package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsDeliverySendResponse;

/**
 * TOP API: taobao.topats.delivery.send request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:50.0
 */
public class TopatsDeliverySendRequest implements TaobaoRequest<TopatsDeliverySendResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ÿ��tid����Ӧ��������˾���롣���Բ�������ʾ���е�������˾��Ϊ"����"������ֻҪ��һ��������Ҫָ��������˾�����еĶ�������Ҫָ��������˾,ÿ������֮����";"���ӡ�����Ҫ��tid˳��һ�£�����Ҫָ��������˾�Ķ�������λ���Ϸ���һ�����ַ���""�����Բ��������˳��Ⱥ�λ��Ҫ��tid����һ�¡�

ÿ��company_code��ʾ������˾����.��"POST"�ʹ����й�����,"ZJS"�ʹ���լ����.���� taobao.logisticcompanies.get ��ȡ���紫��Ĵ�����Ա��ٷ�����������˾��Ĭ���ǡ������������ķ�ʽ�����Ա�����ʾ����������ȣ��ʴ�������������orderTypeΪdelivery_needed����ش�
	 */
	private String companyCodes;

	/** 
	* ÿ��tid����Ӧ�����ұ�ע�����Բ�������ʾ���еķ�������������Ҫ���ұ�ע������ֻҪ��һ��������Ҫָ�����ұ�ע�����еĶ�������Ҫָ�����ұ�ע,ÿ�����ұ�ע֮����";"���ӡ�����Ҫ��tid˳��һ�£�����Ҫָ�����ұ�ע�Ķ�������λ���Ϸ���һ�����ַ���""�����Բ��������˳��Ⱥ�λ��Ҫ��tid����һ�¡����ұ�ע.��󳤶�Ϊ250���ַ������orderTypeΪdelivery_needed����ش�
	 */
	private String memos;

	/** 
	* ÿ��tid����Ӧ�������������͡����Բ�������ʾ���еķ������Ͷ�Ϊ"delivery_needed"������ֻҪ��һ��������Ҫָ���������ͣ����еĶ�������Ҫָ����������,ÿ������֮����";"���ӡ�����Ҫ��tid˳��һ�£�����Ҫָ���������͵Ķ�������λ���Ϸ���һ�����ַ���""�����Բ��������˳��Ⱥ�λ��Ҫ��tid����һ�¡� ÿ�����Ϳ�ѡ( delivery_needed(������������),virtual_goods(������Ʒ����). ) ע:ѡ��virtual_goods���ͽ��з����Ļ�����Ĳ������Բ�����д�����ѡ��delivery_needed ������Ĳ�������Ҫ��д
	 */
	private String orderTypes;

	/** 
	* ÿ��tid����Ӧ��������˾�˵��š����Բ�������ʾ���е�����������û�ж����ţ�����ֻҪ��һ��������Ҫ�ж����ţ����еĶ�������Ҫָ��������,ÿ��������֮����";"���ӡ�����Ҫ��tid˳��һ�£�����Ҫָ�������ŵĶ�������λ���Ϸ���һ�����ַ���""�����Բ��������˳��Ⱥ�λ��Ҫ��tid����һ�¡�
����һ��������˾����ʵ�˵����롣�Ա��ٷ�������У�飬��������룻��company_codes�д���Ĵ�����Ա��ٷ�����������˾���˴��˵��Ų�У�顣���orderTypeΪdelivery_needed����ش�
	 */
	private String outSids;

	/** 
	* ���ҵ�ַ(��ϸ��ַ).��:XXX�ֵ�XXX����,ʡ��������Ҫ�ṩ�����orderTypeΪdelivery_needed����ش�
	 */
	private String sellerAddress;

	/** 
	* �������ڵع��ҹ����ı�׼������.�ο�:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm ���ߵ��� taobao.areas.get ��ȡ�����orderTypeΪdelivery_needed����ش�
	 */
	private Long sellerAreaId;

	/** 
	* �����ֻ�����
	 */
	private String sellerMobile;

	/** 
	* �������������orderTypeΪdelivery_needed����ش�
	 */
	private String sellerName;

	/** 
	* ���ҹ̶��绰.��������,�绰,�ֻ���,�м��� " �C "; ���ҹ̶��绰�������ֻ�����,������дһ��.
	 */
	private String sellerPhone;

	/** 
	* �����ʱࡣ���orderTypeΪdelivery_needed����ش�
	 */
	private String sellerZip;

	/** 
	* ���������Ķ���id�б�ÿ������id�����ǺϷ����������͵�tid��ÿ��tid֮����";"�ָ�������Ҫָ��һ��tid����಻����40��tid
	 */
	private String tids;

	public void setCompanyCodes(String companyCodes) {
		this.companyCodes = companyCodes;
	}
	public String getCompanyCodes() {
		return this.companyCodes;
	}

	public void setMemos(String memos) {
		this.memos = memos;
	}
	public String getMemos() {
		return this.memos;
	}

	public void setOrderTypes(String orderTypes) {
		this.orderTypes = orderTypes;
	}
	public String getOrderTypes() {
		return this.orderTypes;
	}

	public void setOutSids(String outSids) {
		this.outSids = outSids;
	}
	public String getOutSids() {
		return this.outSids;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerAddress() {
		return this.sellerAddress;
	}

	public void setSellerAreaId(Long sellerAreaId) {
		this.sellerAreaId = sellerAreaId;
	}
	public Long getSellerAreaId() {
		return this.sellerAreaId;
	}

	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}
	public String getSellerMobile() {
		return this.sellerMobile;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public String getSellerPhone() {
		return this.sellerPhone;
	}

	public void setSellerZip(String sellerZip) {
		this.sellerZip = sellerZip;
	}
	public String getSellerZip() {
		return this.sellerZip;
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
		return "taobao.topats.delivery.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("company_codes", this.companyCodes);
		txtParams.put("memos", this.memos);
		txtParams.put("order_types", this.orderTypes);
		txtParams.put("out_sids", this.outSids);
		txtParams.put("seller_address", this.sellerAddress);
		txtParams.put("seller_area_id", this.sellerAreaId);
		txtParams.put("seller_mobile", this.sellerMobile);
		txtParams.put("seller_name", this.sellerName);
		txtParams.put("seller_phone", this.sellerPhone);
		txtParams.put("seller_zip", this.sellerZip);
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

	public Class<TopatsDeliverySendResponse> getResponseClass() {
		return TopatsDeliverySendResponse.class;
	}
}
