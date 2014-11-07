package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointImgResponse;

/**
 * TOP API: taobao.item.joint.img request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class ItemJointImgRequest implements TaobaoRequest<ItemJointImgResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ƷͼƬid(����Ǹ���ͼƬ������Ҫ���ò���)
	 */
	private Long id;

	/** 
	* �ϴ���ͼƬ�Ƿ����Ϊ��Ʒ��ͼ
	 */
	private Boolean isMajor;

	/** 
	* ��Ʒ����ID����ѡ
	 */
	private Long numIid;

	/** 
	* ͼƬURL,ͼƬ�ռ�ͼƬ����Ե�ַ
	 */
	private String picPath;

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

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getPicPath() {
		return this.picPath;
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
		return "taobao.item.joint.img";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("is_major", this.isMajor);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("pic_path", this.picPath);
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

	public Class<ItemJointImgResponse> getResponseClass() {
		return ItemJointImgResponse.class;
	}
}
