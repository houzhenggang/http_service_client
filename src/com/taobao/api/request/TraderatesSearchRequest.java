package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderatesSearchResponse;

/**
 * TOP API: taobao.traderates.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-21 17:32:25.0
 */
public class TraderatesSearchRequest implements TaobaoRequest<TraderatesSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ������id
	 */
	private Long numIid;

	/** 
	* ��ǰҳ
	 */
	private Long pageNo;

	/** 
	* ÿҳ��ʾ������������ֵ��5��10��20��40
	 */
	private Long pageSize;

	/** 
	* ��Ʒ����������nick
	 */
	private String sellerNick;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
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

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerNick() {
		return this.sellerNick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.traderates.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("seller_nick", this.sellerNick);
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

	public Class<TraderatesSearchResponse> getResponseClass() {
		return TraderatesSearchResponse.class;
	}
}
