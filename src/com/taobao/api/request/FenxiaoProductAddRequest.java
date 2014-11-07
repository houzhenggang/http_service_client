package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductAddResponse;

/**
 * TOP API: taobao.fenxiao.product.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class FenxiaoProductAddRequest implements TaobaoRequest<FenxiaoProductAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����������0��29999��
	 */
	private Long alarmNumber;

	/** 
	* ������Ŀid���ο�Taobao.itemcats.get����֧�ֳ��˵���Ŀ�����������Ŀid������ʾ��Ŀ���Դ���
	 */
	private Long categoryId;

	/** 
	* ���ڵأ��У����������ݡ�
	 */
	private String city;

	/** 
	* �ɹ��۸񣬵�λ��Ԫ��������10.56����������0.01Ԫ��10000000Ԫ֮�䡣
	 */
	private String costPrice;

	/** 
	* ��Ʒ����������Ϊ5��25000�ַ���
	 */
	private String desc;

	/** 
	* �ۿ�ID
	 */
	private Long discountId;

	/** 
	* �Ƿ��б��ޣ���ѡֵ��false���񣩡�true���ǣ���Ĭ��false��
	 */
	private String haveGuarantee;

	/** 
	* �Ƿ��з�Ʊ����ѡֵ��false���񣩡�true���ǣ���Ĭ��false��
	 */
	private String haveInvoice;

	/** 
	* ��Ʒ���ƣ����Ȳ�����60���ֽڡ�
	 */
	private String name;

	/** 
	* �̼ұ��룬���Ȳ��ܳ���60���ֽڡ�
	 */
	private String outerId;

	/** 
	* ems���ã���λ��Ԫ��������10.56���� ��СΪ0.00Ԫ��999999Ԫ֮�䡣
	 */
	private String postageEms;

	/** 
	* ��ݷ��ã���λ��Ԫ��������10.56���� ��СΪ0.01Ԫ��999999Ԫ֮�䡣
	 */
	private String postageFast;

	/** 
	* �˷�ģ��ID���ο�taobao.postages.get��
	 */
	private Long postageId;

	/** 
	* ƽ�ʷ��ã���λ��Ԫ��������10.56���� ��СΪ0.01Ԫ��999999Ԫ֮�䡣
	 */
	private String postageOrdinary;

	/** 
	* �˷����ͣ���ѡֵ��seller����Ӧ�̳е��˷ѣ���buyer�������̳е��˷ѣ�,Ĭ��seller��
	 */
	private String postageType;

	/** 
	* ��Ʒ��ID
	 */
	private Long productcatId;

	/** 
	* ���ڵأ�ʡ���������㽭��
	 */
	private String prov;

	/** 
	* ��Ʒ��������1��999999��
	 */
	private Long quantity;

	/** 
	* ������ۼۣ���λ��Ԫ��������10.56����������0.01Ԫ��10000000Ԫ֮�䣬������ۼ۱������������ۼۡ�
	 */
	private String retailPriceHigh;

	/** 
	* ������ۼۣ���λ��Ԫ��������10.56����������0.01Ԫ��10000000Ԫ֮�䡣
	 */
	private String retailPriceLow;

	/** 
	* ��׼�۸񣬵�λ��Ԫ��������10.56����������0.01Ԫ��10000000Ԫ֮�䡣
	 */
	private String standardPrice;

	/** 
	* ������ʽ��AGENT��ֻ��������Ĭ��ֵ����DEALER��ֻ����������ALL�������;���������
	 */
	private String tradeType;

	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}
	public Long getAlarmNumber() {
		return this.alarmNumber;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	public String getCostPrice() {
		return this.costPrice;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId() {
		return this.discountId;
	}

	public void setHaveGuarantee(String haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}
	public String getHaveGuarantee() {
		return this.haveGuarantee;
	}

	public void setHaveInvoice(String haveInvoice) {
		this.haveInvoice = haveInvoice;
	}
	public String getHaveInvoice() {
		return this.haveInvoice;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}
	public String getPostageEms() {
		return this.postageEms;
	}

	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}
	public String getPostageFast() {
		return this.postageFast;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}
	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}

	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}
	public String getPostageType() {
		return this.postageType;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}
	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getProv() {
		return this.prov;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return this.quantity;
	}

	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}
	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}

	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}
	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}

	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}
	public String getStandardPrice() {
		return this.standardPrice;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType() {
		return this.tradeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alarm_number", this.alarmNumber);
		txtParams.put("category_id", this.categoryId);
		txtParams.put("city", this.city);
		txtParams.put("cost_price", this.costPrice);
		txtParams.put("desc", this.desc);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("have_guarantee", this.haveGuarantee);
		txtParams.put("have_invoice", this.haveInvoice);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("postage_ems", this.postageEms);
		txtParams.put("postage_fast", this.postageFast);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("postage_ordinary", this.postageOrdinary);
		txtParams.put("postage_type", this.postageType);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("prov", this.prov);
		txtParams.put("quantity", this.quantity);
		txtParams.put("retail_price_high", this.retailPriceHigh);
		txtParams.put("retail_price_low", this.retailPriceLow);
		txtParams.put("standard_price", this.standardPrice);
		txtParams.put("trade_type", this.tradeType);
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

	public Class<FenxiaoProductAddResponse> getResponseClass() {
		return FenxiaoProductAddResponse.class;
	}
}
