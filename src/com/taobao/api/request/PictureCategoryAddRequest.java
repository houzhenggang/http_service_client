package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryAddResponse;

/**
 * TOP API: taobao.picture.category.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-29 20:31:15.0
 */
public class PictureCategoryAddRequest implements TaobaoRequest<PictureCategoryAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ͼƬ����ĸ�����,һ�������parent_idΪ0,�����������Ϊ�丸�����picture_category_id
	 */
	private Long parentId;

	/** 
	* ͼƬ�������ƣ���󳤶�20�ַ�����Ӣ�Ķ���һ�ַ�������Ϊ��
	 */
	private String pictureCategoryName;

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getParentId() {
		return this.parentId;
	}

	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}
	public String getPictureCategoryName() {
		return this.pictureCategoryName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.picture.category.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("parent_id", this.parentId);
		txtParams.put("picture_category_name", this.pictureCategoryName);
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

	public Class<PictureCategoryAddResponse> getResponseClass() {
		return PictureCategoryAddResponse.class;
	}
}
