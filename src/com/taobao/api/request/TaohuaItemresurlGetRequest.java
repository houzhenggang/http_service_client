package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaItemresurlGetResponse;

/**
 * TOP API: taobao.taohua.itemresurl.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaItemresurlGetRequest implements TaobaoRequest<TaohuaItemresurlGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ��Դ�������ļ����ͣ���ѡֵ��1��pdf��2��epub��3��src��
dpf��������pdf���͵��ļ���epub��������epub���͵��ļ���src��������Դ�ļ�
	 */
	private String fileType;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* ��Ϊ���ص�ַ�漰���ϵ������Ĺ��ܣ�������Ҫ�ͻ��˸��ٷ������ˣ�Ӧ�ô��ĸ�byte��ʼ�����ļ�������ô����ֶ����þ������ڸ��߷���˴�ָ��λ�ö�ȡ�ļ���
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
		return "taobao.taohua.itemresurl.get";
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

	public Class<TaohuaItemresurlGetResponse> getResponseClass() {
		return TaohuaItemresurlGetResponse.class;
	}
}
