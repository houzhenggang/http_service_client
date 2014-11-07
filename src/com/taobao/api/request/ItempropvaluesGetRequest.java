package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItempropvaluesGetResponse;

/**
 * TOP API: taobao.itempropvalues.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class ItempropvaluesGetRequest implements TaobaoRequest<ItempropvaluesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ҷ����ĿID ,ͨ��taobao.itemcats.get���Ҷ����ĿID
	 */
	private Long cid;

	/** 
	* ���紫2005-01-01 00:00:00����ȡ���е����Ժ�������(״̬Ϊɾ��������ֵ������prop_name)
	 */
	private Date datetime;

	/** 
	* ��Ҫ���ص��ֶΡ�Ŀǰ֧���У�cid,pid,prop_name,vid,name,name_alias,status,sort_order
	 */
	private String fields;

	/** 
	* ���Ժ�����ֵ id������ʽ����(pid1;pid2)��(pid1:vid1;pid2:vid2)��(pid1;pid2:vid2)
	 */
	private String pvs;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
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

	public void setPvs(String pvs) {
		this.pvs = pvs;
	}
	public String getPvs() {
		return this.pvs;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.itempropvalues.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("pvs", this.pvs);
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

	public Class<ItempropvaluesGetResponse> getResponseClass() {
		return ItempropvaluesGetResponse.class;
	}
}
