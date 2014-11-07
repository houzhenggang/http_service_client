package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class FenxiaoProductUpdateRequest implements TaobaoRequest<FenxiaoProductUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����������0��29999��
	 */
	private Long alarmNumber;

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
	* ��ƷID
	 */
	private Long pid;

	/** 
	* ems���ã���λ��Ԫ��������10.56������СΪ0.01Ԫ��999999Ԫ֮�䡣����ʱ����ָ���˷�����Ϊbuyer�����򲻸��¡�
	 */
	private String postageEms;

	/** 
	* ��ݷ��ã���λ��Ԫ��������10.56������СΪ0.01Ԫ��999999Ԫ֮�䡣����ʱ����ָ���˷�����Ϊbuyer�����򲻸��¡�
	 */
	private String postageFast;

	/** 
	* �˷�ģ��ID���ο�taobao.postages.get������ʱ����ָ���˷�����Ϊ buyer�����򲻸��¡�
	 */
	private Long postageId;

	/** 
	* ƽ�ʷ��ã���λ��Ԫ��������10.56������СΪ0.01Ԫ��999999Ԫ֮�䡣����ʱ����ָ���˷�����Ϊbuyer�����򲻸��¡�
	 */
	private String postageOrdinary;

	/** 
	* �˷����ͣ���ѡֵ��seller����Ӧ�̳е��˷ѣ���buyer�������̳е��˷ѣ���Ĭ��seller��
	 */
	private String postageType;

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
	* sku�ɹ��۸񣬵�λԪ������"10.50,11.00,20.50"���ֶα���������sku_ids��sku_properties����һ�¡�
	 */
	private String skuCostPrices;

	/** 
	* sku id�б�����1001,1002,1003���������sku_properties�����Դ˲�����
	 */
	private String skuIds;

	/** 
	* sku�̼ұ��� ����λԪ������"S1000,S1002,S1003"���ֶα���������id��sku_properties����һ�£����û�п���д��",,"
	 */
	private String skuOuterIds;

	/** 
	* sku���ԡ���ʽ:pid:vid;pid:vid,��ʾһ��������:1627207:3232483;1630696:3284570,��ʾһ��:������ɫ:����ɫ;�ֻ��ײ�:һ��һ�䡣����֮���ö��š�,�����֡�(���Ե�pid����taobao.itemprops.getȡ�ã�����ֵ��vid��taobao.itempropvalues.getȡ��vid)
ͨ�����ֶο������͸���sku���������ֵ������sku_ids�ֶΡ�sku�����ֶ����ֵ����һ�¡�
	 */
	private String skuProperties;

	/** 
	* ����sku����ɾ��sku��Ϣ����Ҫ����ɾ�����ԡ�
	 */
	private String skuPropertiesDel;

	/** 
	* sku��棬��λԪ������"10,20,30"���ֶα����sku_ids��sku_properties����һ�¡�
	 */
	private String skuQuantitys;

	/** 
	* sku�г��ۣ���λԪ������"10.50,11.00,20.50"���ֶα���������sku_ids��sku_properties����һ�¡�
	 */
	private String skuStandardPrices;

	/** 
	* ��׼�۸񣬵�λ��Ԫ��������10.56����������0.01Ԫ��10000000Ԫ֮�䡣
	 */
	private String standardPrice;

	/** 
	* ����״̬����ѡֵ��up���ϼܣ���down���¼ܣ���delete��ɾ����������Ƿ��ַ�����ԡ�
	 */
	private String status;

	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}
	public Long getAlarmNumber() {
		return this.alarmNumber;
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

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
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

	public void setSkuCostPrices(String skuCostPrices) {
		this.skuCostPrices = skuCostPrices;
	}
	public String getSkuCostPrices() {
		return this.skuCostPrices;
	}

	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}
	public String getSkuIds() {
		return this.skuIds;
	}

	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}
	public String getSkuOuterIds() {
		return this.skuOuterIds;
	}

	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}
	public String getSkuProperties() {
		return this.skuProperties;
	}

	public void setSkuPropertiesDel(String skuPropertiesDel) {
		this.skuPropertiesDel = skuPropertiesDel;
	}
	public String getSkuPropertiesDel() {
		return this.skuPropertiesDel;
	}

	public void setSkuQuantitys(String skuQuantitys) {
		this.skuQuantitys = skuQuantitys;
	}
	public String getSkuQuantitys() {
		return this.skuQuantitys;
	}

	public void setSkuStandardPrices(String skuStandardPrices) {
		this.skuStandardPrices = skuStandardPrices;
	}
	public String getSkuStandardPrices() {
		return this.skuStandardPrices;
	}

	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}
	public String getStandardPrice() {
		return this.standardPrice;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alarm_number", this.alarmNumber);
		txtParams.put("city", this.city);
		txtParams.put("cost_price", this.costPrice);
		txtParams.put("desc", this.desc);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("have_guarantee", this.haveGuarantee);
		txtParams.put("have_invoice", this.haveInvoice);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("pid", this.pid);
		txtParams.put("postage_ems", this.postageEms);
		txtParams.put("postage_fast", this.postageFast);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("postage_ordinary", this.postageOrdinary);
		txtParams.put("postage_type", this.postageType);
		txtParams.put("prov", this.prov);
		txtParams.put("quantity", this.quantity);
		txtParams.put("retail_price_high", this.retailPriceHigh);
		txtParams.put("retail_price_low", this.retailPriceLow);
		txtParams.put("sku_cost_prices", this.skuCostPrices);
		txtParams.put("sku_ids", this.skuIds);
		txtParams.put("sku_outer_ids", this.skuOuterIds);
		txtParams.put("sku_properties", this.skuProperties);
		txtParams.put("sku_properties_del", this.skuPropertiesDel);
		txtParams.put("sku_quantitys", this.skuQuantitys);
		txtParams.put("sku_standard_prices", this.skuStandardPrices);
		txtParams.put("standard_price", this.standardPrice);
		txtParams.put("status", this.status);
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

	public Class<FenxiaoProductUpdateResponse> getResponseClass() {
		return FenxiaoProductUpdateResponse.class;
	}
}
