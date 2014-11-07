package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionsGetResponse;

/**
 * TOP API: taobao.marketing.promotions.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingPromotionsGetRequest implements TaobaoRequest<MarketingPromotionsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��Żݲ��Խṹ�ֶ��б���ѡֵΪPromotion�������ֶΣ��磺promotion_id, promotion_title, item_id, status, tag_id�ȵ�
	 */
	private String fields;

	/** 
	* ��Ʒ����ID�����ݸ�ID��ѯ��Ʒ��ͨ���������������õ������Żݲ���
	 */
	private String numIid;

	/** 
	* �Żݲ���״̬����ѡֵ��ACTIVE(��Ч)��UNACTIVE(��Ч)�����������ߴ�������ֵ����Ĭ�ϲ�ѯȫ��
	 */
	private String status;

	/** 
	* ��ǩID
	 */
	private Long tagId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNumIid(String numIid) {
		this.numIid = numIid;
	}
	public String getNumIid() {
		return this.numIid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public Long getTagId() {
		return this.tagId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.marketing.promotions.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("status", this.status);
		txtParams.put("tag_id", this.tagId);
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

	public Class<MarketingPromotionsGetResponse> getResponseClass() {
		return MarketingPromotionsGetResponse.class;
	}
}
