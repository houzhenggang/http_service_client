package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMealAddResponse;

/**
 * TOP API: taobao.promotion.meal.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class PromotionMealAddRequest implements TaobaoRequest<PromotionMealAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����ײ���Ʒ�б�item_idΪ��Ʒ��id(��������);item_show_nameΪ��Ʒ��ʾ�����������5����Ʒ���д��䣬������2����Ʒ����������Ʒ��������Ʒ���ܲμ��ײͻ����json��ʽ���롣item_show_name��󳤶�Ϊ8,����Ϊ�ա�
	 */
	private String itemList;

	/** 
	* �����ײ�������
	 */
	private String mealMemo;

	/** 
	* �����ײ����ơ�(30����������)
	 */
	private String mealName;

	/** 
	* �����ײ�һ�ڼۡ����ֵҪ����0.01��С����Ʒ�ļ�ֵ�ܺ͡�
	 */
	private String mealPrice;

	/** 
	* ��ͨ�˷�ģ��id����ƷAPI:taobao.postages.get��ȡ���ҵ��˷�ģ�塣��type_postageΪBUYʱ��Ϊ�������type_postageΪSELLʱ�����ֶκ��ԡ�
	 */
	private Long postageId;

	/** 
	* �˷�ģ�����͡����ұ�ʶ'SELL';��ұ�ʶ'BUY'����Ϊ'SELL',���ֶ�postage_id���ԡ���Ϊ'BUY'����postage_idΪ�˷�ģ��id��Ϊ�����
	 */
	private String typePostage;

	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	public String getItemList() {
		return this.itemList;
	}

	public void setMealMemo(String mealMemo) {
		this.mealMemo = mealMemo;
	}
	public String getMealMemo() {
		return this.mealMemo;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public String getMealName() {
		return this.mealName;
	}

	public void setMealPrice(String mealPrice) {
		this.mealPrice = mealPrice;
	}
	public String getMealPrice() {
		return this.mealPrice;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
	}

	public void setTypePostage(String typePostage) {
		this.typePostage = typePostage;
	}
	public String getTypePostage() {
		return this.typePostage;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.meal.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_list", this.itemList);
		txtParams.put("meal_memo", this.mealMemo);
		txtParams.put("meal_name", this.mealName);
		txtParams.put("meal_price", this.mealPrice);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("type_postage", this.typePostage);
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

	public Class<PromotionMealAddResponse> getResponseClass() {
		return PromotionMealAddResponse.class;
	}
}
