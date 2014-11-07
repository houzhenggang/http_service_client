package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPropimgUploadResponse;

/**
 * TOP API: taobao.item.propimg.upload request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItemPropimgUploadRequest implements TaobaoUploadRequest<ItemPropimgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ͼƬID���������������Ҫ��д
	 */
	private Long id;

	/** 
	* ����ͼƬ���ݡ�����:JPG,GIF;��󳤶�:500K;ͼƬ��С������:1M
	 */
	private FileItem image;

	/** 
	* ��Ʒ����ID����ѡ
	 */
	private Long numIid;

	/** 
	* ͼƬλ��
	 */
	private Long position;

	/** 
	* �����б�����taobao.itemprops.get��ȡ��Ŀ���ԣ����Ա�������ɫ���ԣ�����taobao.itempropvalues.getȡ��vid����ʽ:pid:vid��
	 */
	private String properties;

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
		return "taobao.item.propimg.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("position", this.position);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

	public Class<ItemPropimgUploadResponse> getResponseClass() {
		return ItemPropimgUploadResponse.class;
	}
}
