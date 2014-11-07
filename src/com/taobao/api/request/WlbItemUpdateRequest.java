package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemUpdateResponse;

/**
 * TOP API: taobao.wlb.item.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbItemUpdateRequest implements TaobaoRequest<WlbItemUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ��ɫ
	 */
	private String color;

	/** 
	* ��Ҫɾ������Ʒ����key�б�
	 */
	private String deletePropertyKeyList;

	/** 
	* ��Ʒ����
	 */
	private String goodsCat;

	/** 
	* ��Ʒ�߶ȣ���λ����
	 */
	private Long height;

	/** 
	* Ҫ�޸ĵ���Ʒid
	 */
	private Long id;

	/** 
	* �Ƿ�Σ��Ʒ
	 */
	private Boolean isDangerous;

	/** 
	* �Ƿ�����Ʒ
	 */
	private Boolean isFriable;

	/** 
	* ��Ʒ���ȣ���λ����
	 */
	private Long length;

	/** 
	* Ҫ�޸ĵ���Ʒ����
	 */
	private String name;

	/** 
	* ��Ʒ��װ��������
	 */
	private String packageMaterial;

	/** 
	* ��Ʒ�Ƽۻ���
	 */
	private String pricingCat;

	/** 
	* Ҫ�޸ĵ���Ʒ��ע
	 */
	private String remark;

	/** 
	* Ҫ�޸ĵ���Ʒ����
	 */
	private String title;

	/** 
	* ��Ҫ�޸ĵ���Ʒ����ֵ���б�������Բ����ڣ�����������
	 */
	private String updatePropertyKeyList;

	/** 
	* ��Ҫ�޸ĵ�����ֵ���б�
	 */
	private String updatePropertyValueList;

	/** 
	* ��Ʒ�������λ��������
	 */
	private Long volume;

	/** 
	* ��Ʒ��������λG
	 */
	private Long weight;

	/** 
	* ��Ʒ��ȣ���λ����
	 */
	private Long width;

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

	public void setDeletePropertyKeyList(String deletePropertyKeyList) {
		this.deletePropertyKeyList = deletePropertyKeyList;
	}
	public String getDeletePropertyKeyList() {
		return this.deletePropertyKeyList;
	}

	public void setGoodsCat(String goodsCat) {
		this.goodsCat = goodsCat;
	}
	public String getGoodsCat() {
		return this.goodsCat;
	}

	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getHeight() {
		return this.height;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsFriable(Boolean isFriable) {
		this.isFriable = isFriable;
	}
	public Boolean getIsFriable() {
		return this.isFriable;
	}

	public void setLength(Long length) {
		this.length = length;
	}
	public Long getLength() {
		return this.length;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPackageMaterial(String packageMaterial) {
		this.packageMaterial = packageMaterial;
	}
	public String getPackageMaterial() {
		return this.packageMaterial;
	}

	public void setPricingCat(String pricingCat) {
		this.pricingCat = pricingCat;
	}
	public String getPricingCat() {
		return this.pricingCat;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark() {
		return this.remark;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setUpdatePropertyKeyList(String updatePropertyKeyList) {
		this.updatePropertyKeyList = updatePropertyKeyList;
	}
	public String getUpdatePropertyKeyList() {
		return this.updatePropertyKeyList;
	}

	public void setUpdatePropertyValueList(String updatePropertyValueList) {
		this.updatePropertyValueList = updatePropertyValueList;
	}
	public String getUpdatePropertyValueList() {
		return this.updatePropertyValueList;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Long getVolume() {
		return this.volume;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getWeight() {
		return this.weight;
	}

	public void setWidth(Long width) {
		this.width = width;
	}
	public Long getWidth() {
		return this.width;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("color", this.color);
		txtParams.put("delete_property_key_list", this.deletePropertyKeyList);
		txtParams.put("goods_cat", this.goodsCat);
		txtParams.put("height", this.height);
		txtParams.put("id", this.id);
		txtParams.put("is_dangerous", this.isDangerous);
		txtParams.put("is_friable", this.isFriable);
		txtParams.put("length", this.length);
		txtParams.put("name", this.name);
		txtParams.put("package_material", this.packageMaterial);
		txtParams.put("pricing_cat", this.pricingCat);
		txtParams.put("remark", this.remark);
		txtParams.put("title", this.title);
		txtParams.put("update_property_key_list", this.updatePropertyKeyList);
		txtParams.put("update_property_value_list", this.updatePropertyValueList);
		txtParams.put("volume", this.volume);
		txtParams.put("weight", this.weight);
		txtParams.put("width", this.width);
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

	public Class<WlbItemUpdateResponse> getResponseClass() {
		return WlbItemUpdateResponse.class;
	}
}
