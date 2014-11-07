package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryGetResponse;

/**
 * TOP API: taobao.picture.category.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-29 20:31:25.0
 */
public class PictureCategoryGetRequest implements TaobaoRequest<PictureCategoryGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ȡ��������ʱ����Ϊ��Ӧ������id
ȡһ������ʱ������id��Ϊ0
ȡȫ�������ʱ�������Ϊ-1
	 */
	private Long parentId;

	/** 
	* ͼƬ����ID
	 */
	private Long pictureCategoryId;

	/** 
	* ͼƬ����������֧��ģ����ѯ
	 */
	private String pictureCategoryName;

	/** 
	* ��������,fixed�������װ�޷������auction�������������user-define�����û��Զ���������
	 */
	private String type;

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getParentId() {
		return this.parentId;
	}

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}
	public String getPictureCategoryName() {
		return this.pictureCategoryName;
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
		return "taobao.picture.category.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("parent_id", this.parentId);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("picture_category_name", this.pictureCategoryName);
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

	public Class<PictureCategoryGetResponse> getResponseClass() {
		return PictureCategoryGetResponse.class;
	}
}
