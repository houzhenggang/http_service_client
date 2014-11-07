package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUploadResponse;

/**
 * TOP API: taobao.picture.upload request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class PictureUploadRequest implements TaobaoUploadRequest<PictureUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������׺����ͼƬ����,����Ϊ�գ���Bule.jpg,��Щ����ϣ��ͼƬ�ϴ���ȡͼƬ�ļ���Ĭ����
	 */
	private String imageInputTitle;

	/** 
	* ͼƬ�������ļ���,����Ϊ��,����png��jpg��gifͼƬ��ʽ
	 */
	private FileItem img;

	/** 
	* ͼƬ����ID�����þ���ĳ������ID������0�ϴ���Ĭ�Ϸ��ֻ࣬�ܴ���һ������
	 */
	private Long pictureCategoryId;

	/** 
	* ͼƬ����,���Ϊ��,����ͼƬ�����ȡȥ����׺����image_input_title,����50�ַ����Ȼ��ȡ50�ַ�,�������ڱ���ĩβ��"(1)";����ĩβ�Ѿ���"(����)"�ˣ������ּ�1
	 */
	private String title;

	public void setImageInputTitle(String imageInputTitle) {
		this.imageInputTitle = imageInputTitle;
	}
	public String getImageInputTitle() {
		return this.imageInputTitle;
	}

	public void setImg(FileItem img) {
		this.img = img;
	}
	public FileItem getImg() {
		return this.img;
	}

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.picture.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("image_input_title", this.imageInputTitle);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("title", this.title);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("img", this.img);
		return params;
	}

	public Class<PictureUploadResponse> getResponseClass() {
		return PictureUploadResponse.class;
	}
}
