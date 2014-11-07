package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessageAddResponse;

/**
 * TOP API: taobao.refund.message.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class RefundMessageAddRequest implements TaobaoUploadRequest<RefundMessageAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �������ݡ���󳤶�: 400���ֽ�
	 */
	private String content;

	/** 
	* ͼƬ��ƾ֤��������: JPG,GIF,PNG;���Ϊ: 500K
	 */
	private FileItem image;

	/** 
	* �˿��š�
	 */
	private Long refundId;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public Long getRefundId() {
		return this.refundId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.refund.message.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("refund_id", this.refundId);
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

	public Class<RefundMessageAddResponse> getResponseClass() {
		return RefundMessageAddResponse.class;
	}
}
