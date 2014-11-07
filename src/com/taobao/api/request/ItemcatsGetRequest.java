package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemcatsGetResponse;

/**
 * TOP API: taobao.itemcats.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class ItemcatsGetRequest implements TaobaoRequest<ItemcatsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ������ĿID�б��ð�Ƕ���(,)�ָ� ����:(18957,19562,) (cids��parent_cid���ٴ�һ��)
	 */
	private String cids;

	/** 
	* ʱ�������ʽ:yyyy-MM-dd HH:mm:ss
��������ֶ�û�д�����ȡ��ǰ���е���Ŀ��Ϣ,�������parent_cid����cids�������datetime��������ֶδ��ˣ���ô���Բ�ѯ����ʱ�䵽����Ϊֹ�������仯
	 */
	private Date datetime;

	/** 
	* ��Ҫ���ص��ֶ��б���ItemCat��Ĭ�Ϸ��أ�cid,parent_cid,name,is_parent
	 */
	private String fields;

	/** 
	* ����Ʒ��Ŀ id��0��ʾ���ڵ�, ����ò���������������Ŀ�� (cids��parent_cid���ٴ�һ��)
	 */
	private Long parentCid;

	public void setCids(String cids) {
		this.cids = cids;
	}
	public String getCids() {
		return this.cids;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public Date getDatetime() {
		return this.datetime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}
	public Long getParentCid() {
		return this.parentCid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.itemcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cids", this.cids);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("parent_cid", this.parentCid);
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

	public Class<ItemcatsGetResponse> getResponseClass() {
		return ItemcatsGetResponse.class;
	}
}
