package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundRefuseResponse;

/**
 * TOP API: taobao.refund.refuse request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class RefundRefuseRequest implements TaobaoUploadRequest<RefundRefuseResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �˿��¼��Ӧ�Ľ����Ӷ�����
	 */
	private Long oid;

	/** 
	* �˿��
	 */
	private Long refundId;

	/** 
	* �ܾ��˿�ʱ��˵����Ϣ������2-200
	 */
	private String refuseMessage;

	/** 
	* �ܾ��˿�ʱ���˿�ƾ֤��һ�������Ҿܾ��˿�ʱʹ�õķ���ƾ֤����󳤶�130000�ֽڣ�֧�ֵ�ͼƬ��ʽ��GIF, JPG, PNG
	 */
	private FileItem refuseProof;

	/** 
	* �˿��¼��Ӧ�Ľ��׶�����
	 */
	private Long tid;

	public void setOid(Long oid) {
		this.oid = oid;
	}
	public Long getOid() {
		return this.oid;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefuseMessage(String refuseMessage) {
		this.refuseMessage = refuseMessage;
	}
	public String getRefuseMessage() {
		return this.refuseMessage;
	}

	public void setRefuseProof(FileItem refuseProof) {
		this.refuseProof = refuseProof;
	}
	public FileItem getRefuseProof() {
		return this.refuseProof;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.refund.refuse";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("oid", this.oid);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refuse_message", this.refuseMessage);
		txtParams.put("tid", this.tid);
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
		params.put("refuse_proof", this.refuseProof);
		return params;
	}

	public Class<RefundRefuseResponse> getResponseClass() {
		return RefundRefuseResponse.class;
	}
}
