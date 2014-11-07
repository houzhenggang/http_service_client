package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuAddResponse;

/**
 * TOP API: taobao.item.sku.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ItemSkuAddRequest implements TaobaoRequest<ItemSkuAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* sku������Ʒ�ļ۸񡣵��û�����sku��ʹ��Ʒ�۸�����sku�۸�֮���ʱ�������޸���Ʒ�ļ۸�ʹsku�ܹ���ӳɹ�
	 */
	private String itemPrice;

	/** 
	* Sku���ֵİ汾����ѡֵ:zh_HK(����),zh_CN(����);Ĭ��ֵ:zh_CN
	 */
	private String lang;

	/** 
	* Sku������Ʒ����id����ͨ�� taobao.item.get ��ȡ����ѡ
	 */
	private Long numIid;

	/** 
	* Sku���̼��ⲿid
	 */
	private String outerId;

	/** 
	* Sku�����ۼ۸���Ʒ�ļ۸�Ҫ����Ʒ���е�sku�ļ۸�֮�䡣��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	private String price;

	/** 
	* Sku���Դ�����ʽ:pid:vid;pid:vid,��:1627207:3232483;1630696:3284570,��ʾ:������ɫ:����ɫ;�ֻ��ײ�:һ��һ��
	 */
	private String properties;

	/** 
	* Sku�Ŀ��������sku��������Ӧ��С�ڵ�����Ʒ������(Item��NUM)��ȡֵ��Χ:�����������
	 */
	private Long quantity;

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLang() {
		return this.lang;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return this.price;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getProperties() {
		return this.properties;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return this.quantity;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("lang", this.lang);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("properties", this.properties);
		txtParams.put("quantity", this.quantity);
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

	public Class<ItemSkuAddResponse> getResponseClass() {
		return ItemSkuAddResponse.class;
	}
}
