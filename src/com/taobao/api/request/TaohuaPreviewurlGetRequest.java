package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaPreviewurlGetResponse;

/**
 * TOP API: taobao.taohua.previewurl.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaPreviewurlGetRequest implements TaobaoRequest<TaohuaPreviewurlGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��������ҪԤ�����ĵ�����,Ŀǰ֧������
pre_epub Ԥ��epub�ĵ�
pre_pdf  Ԥ��pdf�ĵ�
	 */
	private String fileType;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* �ļ�λ��
	 */
	private String position;

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.previewurl.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("file_type", this.fileType);
		txtParams.put("item_id", this.itemId);
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

	public Class<TaohuaPreviewurlGetResponse> getResponseClass() {
		return TaohuaPreviewurlGetResponse.class;
	}
}
