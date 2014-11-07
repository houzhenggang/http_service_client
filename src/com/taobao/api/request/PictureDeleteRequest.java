package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureDeleteResponse;

/**
 * TOP API: taobao.picture.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:22.0
 */
public class PictureDeleteRequest implements TaobaoRequest<PictureDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ͼƬID�ַ���,����һ��Ҳ����һ��,��Ӣ�Ķ��ż��,��450,120,155
	 */
	private String pictureIds;

	public void setPictureIds(String pictureIds) {
		this.pictureIds = pictureIds;
	}
	public String getPictureIds() {
		return this.pictureIds;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.picture.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("picture_ids", this.pictureIds);
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

	public Class<PictureDeleteResponse> getResponseClass() {
		return PictureDeleteResponse.class;
	}
}
