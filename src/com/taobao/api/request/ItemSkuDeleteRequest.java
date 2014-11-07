package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuDeleteResponse;

/**
 * TOP API: taobao.item.sku.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:29.0
 */
public class ItemSkuDeleteRequest implements TaobaoRequest<ItemSkuDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* sku������Ʒ������,����0�����������û�ɾ��sku��ʹ��Ʒ����������sku����֮��ʱ�������޸���Ʒ��������ʹsku�ܹ�ɾ���ɹ����ر���ɾ�����һ��sku��ʱ��һ��Ҫ������Ʒ������������ֵ������ɾ��ʧ��
	 */
	private Long itemNum;

	/** 
	* sku������Ʒ�ļ۸񡣵��û�ɾ��sku��ʹ��Ʒ�۸�����sku�۸�֮���ʱ�������޸���Ʒ�ļ۸�ʹsku�ܹ�ɾ���ɹ�
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
	* Sku���Դ�����ʽ:pid:vid;pid:vid,��: 1627207:3232483;1630696:3284570,��ʾ������ɫ:����ɫ;�ֻ��ײ�:һ��һ��
	 */
	private String properties;

	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}
	public Long getItemNum() {
		return this.itemNum;
	}

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

	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getProperties() {
		return this.properties;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_num", this.itemNum);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("lang", this.lang);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("properties", this.properties);
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

	public Class<ItemSkuDeleteResponse> getResponseClass() {
		return ItemSkuDeleteResponse.class;
	}
}
