package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PostageAddResponse;

/**
 * TOP API: taobao.postage.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class PostageAddRequest implements TaobaoRequest<PostageAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ĭ��EMS�Ӽ۷���.��ȷ��1λС��;��λ:Ԫ����:1.5
	 */
	private String emsIncrease;

	/** 
	* Ĭ��EMS����. ��ȷ��1λС��;��λ:Ԫ����:200.5
	 */
	private String emsPrice;

	/** 
	* Ĭ�Ͽ�ݼӼ۷���.��ȷ��1λС��;��λ:Ԫ����:1.5
	 */
	private String expressIncrease;

	/** 
	* Ĭ�Ͽ�ݷ���. ��ȷ��1λС��;��λ:Ԫ����:200.5
	 */
	private String expressPrice;

	/** 
	* �ʷ�ģ�屸ע,���ܳ���200���ֽ�
	 */
	private String memo;

	/** 
	* �ʷ�ģ������,���ܳ���50���ֽ�
	 */
	private String name;

	/** 
	* Ĭ��ƽ�ʼӼ۷���. ��ȷ��1λС��;��λ:Ԫ����:1.5
	 */
	private String postIncrease;

	/** 
	* Ĭ��ƽ�ʷ���. ע��:����ѡ��һ��Ĭ�ϵ��ʷ���,����:post_price,post_increase . ��ȷ��1λС��;��λ:Ԫ����:200.5
	 */
	private String postPrice;

	/** 
	* �ʷ������漰�ĵ���.�ṹ: value1;value2;value3 ��:110000;310000;320000,330000 �ʹ����ʷ������漰(����;�Ϻ�;����,�㽭)�ĸ�����. ������taobao.areas.get�ӿڻ�ȡ.���߲ο���http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm
	 */
	private String postageModeDests;

	/** 
	* �˷ѷ�ʽ�Ӽ�����.�ṹ: value1;value2;value3 ��: 1.5;2;4 .��ȷ��1λС��;��λ:Ԫ����:1.5
	 */
	private String postageModeIncreases;

	/** 
	* �˷ѷ�ʽ����. �ṹ: value1;value2;value3 ��: 11.2;14;6 .��ȷ��1λС��;��λ:Ԫ����:200.5
	 */
	private String postageModePrices;

	/** 
	* �˷ѷ�ʽ:ƽ�� (post),��ݹ�˾(express),EMS (ems) �ṹ:value1;value2;value3 ��: post;express;ems ע��:����Ӷ��PostageModeʱ,�ַ�����ʹ�� ";" �ֺ�����.postage_mode.type,postage_mode.dest,postage_mode.price,postage_mode.increase, ��������һ��.
	 */
	private String postageModeTypes;

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}
	public String getEmsIncrease() {
		return this.emsIncrease;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	public String getEmsPrice() {
		return this.emsPrice;
	}

	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}
	public String getExpressIncrease() {
		return this.expressIncrease;
	}

	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public String getExpressPrice() {
		return this.expressPrice;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}
	public String getPostIncrease() {
		return this.postIncrease;
	}

	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}
	public String getPostPrice() {
		return this.postPrice;
	}

	public void setPostageModeDests(String postageModeDests) {
		this.postageModeDests = postageModeDests;
	}
	public String getPostageModeDests() {
		return this.postageModeDests;
	}

	public void setPostageModeIncreases(String postageModeIncreases) {
		this.postageModeIncreases = postageModeIncreases;
	}
	public String getPostageModeIncreases() {
		return this.postageModeIncreases;
	}

	public void setPostageModePrices(String postageModePrices) {
		this.postageModePrices = postageModePrices;
	}
	public String getPostageModePrices() {
		return this.postageModePrices;
	}

	public void setPostageModeTypes(String postageModeTypes) {
		this.postageModeTypes = postageModeTypes;
	}
	public String getPostageModeTypes() {
		return this.postageModeTypes;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.postage.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ems_increase", this.emsIncrease);
		txtParams.put("ems_price", this.emsPrice);
		txtParams.put("express_increase", this.expressIncrease);
		txtParams.put("express_price", this.expressPrice);
		txtParams.put("memo", this.memo);
		txtParams.put("name", this.name);
		txtParams.put("post_increase", this.postIncrease);
		txtParams.put("post_price", this.postPrice);
		txtParams.put("postage_mode_dests", this.postageModeDests);
		txtParams.put("postage_mode_increases", this.postageModeIncreases);
		txtParams.put("postage_mode_prices", this.postageModePrices);
		txtParams.put("postage_mode_types", this.postageModeTypes);
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

	public Class<PostageAddResponse> getResponseClass() {
		return PostageAddResponse.class;
	}
}
