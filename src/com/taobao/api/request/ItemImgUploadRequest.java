package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemImgUploadResponse;

/**
 * TOP API: taobao.item.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class ItemImgUploadRequest implements TaobaoUploadRequest<ItemImgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ƷͼƬid(����Ǹ���ͼƬ������Ҫ���ò���)
	 */
	private Long id;

	/** 
	* ��ƷͼƬ��������:JPG,GIF;��󳤶�:500K ��֧�ֵ��ļ����ͣ�gif,jpg,jpeg,png
	 */
	private FileItem image;

	/** 
	* �Ƿ񽫸�ͼƬ��Ϊ��ͼ,��ѡֵ:true,false;Ĭ��ֵ:false(����ͼ)
	 */
	private Boolean isMajor;

	/** 
	* ��Ʒ����ID���ò�������
	 */
	private Long numIid;

	/** 
	* ͼƬ���
	 */
	private Long position;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setIsMajor(Boolean isMajor) {
		this.isMajor = isMajor;
	}
	public Boolean getIsMajor() {
		return this.isMajor;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.img.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("is_major", this.isMajor);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("position", this.position);
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
		params.put("image", this.image);
		return params;
	}

	public Class<ItemImgUploadResponse> getResponseClass() {
		return ItemImgUploadResponse.class;
	}
}
