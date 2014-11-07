package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaAudioreaderSearchResponse;

/**
 * TOP API: taobao.taohua.audioreader.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TaohuaAudioreaderSearchRequest implements TaobaoRequest<TaohuaAudioreaderSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ŀid
	 */
	private Long cid;

	/** 
	* �Ƿ���ѣ����Ϊtrue���ʾֻ������ѵ���Ʒ
	 */
	private Boolean free;

	/** 
	* ��ѯ�ؼ���,����60���ַ����Զ��ض�Ϊ60���ַ�. ����Ϊ��
	 */
	private String keyword;

	/** 
	* ��ǰҳ��
	 */
	private Long pageNo;

	/** 
	* ÿҳ����
	 */
	private Long pageSize;

	/** 
	* ����ֵ: 1. ��������ratescoredesc, 2. �۸�����priceasc, 3. �۸���pricedesc, 4. ���·�����shelvesdate, 5. ��������viewcount, 6. ��������saleasc, 7. ��������saledesc, 8. ���ܻ�ӭ��favoritedesc, 9. Ĭ������default
	 */
	private String sort;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}
	public Boolean getFree() {
		return this.free;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return this.keyword;
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

	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSort() {
		return this.sort;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.audioreader.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("free", this.free);
		txtParams.put("keyword", this.keyword);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("sort", this.sort);
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

	public Class<TaohuaAudioreaderSearchResponse> getResponseClass() {
		return TaohuaAudioreaderSearchResponse.class;
	}
}
