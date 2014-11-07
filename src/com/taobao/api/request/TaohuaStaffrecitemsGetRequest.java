package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaStaffrecitemsGetResponse;

/**
 * TOP API: taobao.taohua.staffrecitems.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaStaffrecitemsGetRequest implements TaobaoRequest<TaohuaStaffrecitemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƽ�����Ʒ����:
1. free:��ȡ�Ƽ��������Ʒ
2. charges:��ȡ�Ƽ����շ���Ʒ
	 */
	private String itemType;

	/** 
	* ��ǰҳ��������0��������Ĭ��ֵ1�������һҳ
	 */
	private Long pageNo;

	/** 
	* ÿҳ��ʾ���������Ҫ�󣺴���0��������Ĭ��Ϊ5������ÿҳ��ʾ5��
	 */
	private Long pageSize;

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType() {
		return this.itemType;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.staffrecitems.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_type", this.itemType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<TaohuaStaffrecitemsGetResponse> getResponseClass() {
		return TaohuaStaffrecitemsGetResponse.class;
	}
}
