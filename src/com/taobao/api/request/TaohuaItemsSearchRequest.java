package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaItemsSearchResponse;

/**
 * TOP API: taobao.taohua.items.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class TaohuaItemsSearchRequest implements TaobaoRequest<TaohuaItemsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ļ���Сsize,��λbyte��
	 */
	private String beginSize;

	/** 
	* ��Ŀid
	 */
	private Long cid;

	/** 
	* �ļ����size,��λbyte��
	 */
	private String endSize;

	/** 
	* �����ļ�����������
	 */
	private String fileType;

	/** 
	* �Ƿ���ѣ����Ϊtrue���ʾֻ������ѵ���Ʒ��
	 */
	private Boolean free;

	/** 
	* ��ѯ�ؼ���,����60���ַ����Զ��ض�Ϊ60���ַ�.  Ĭ������Ϊnull
	 */
	private String keywords;

	/** 
	* ��ҳ������Ʒ��Ϣ��page_no������ǵڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ������Ʒ��Ϣ��page_size����ÿҳ��ʾ���������ݡ�  Ŀǰ����5�������30�����ݡ�
	 */
	private Long pageSize;

	/** 
	* ����ֵ:

1. ��������ratescoredesc,
2. �۸�����: priceasc,
3. �۸���: pricedesc,
4. ʱ������: shelvesdate,
5. �������viewcount,
6. ��������saleasc,
7. Ĭ������default,
	 */
	private String sort;

	public void setBeginSize(String beginSize) {
		this.beginSize = beginSize;
	}
	public String getBeginSize() {
		return this.beginSize;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndSize(String endSize) {
		this.endSize = endSize;
	}
	public String getEndSize() {
		return this.endSize;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}
	public Boolean getFree() {
		return this.free;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getKeywords() {
		return this.keywords;
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
		return "taobao.taohua.items.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("begin_size", this.beginSize);
		txtParams.put("cid", this.cid);
		txtParams.put("end_size", this.endSize);
		txtParams.put("file_type", this.fileType);
		txtParams.put("free", this.free);
		txtParams.put("keywords", this.keywords);
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

	public Class<TaohuaItemsSearchResponse> getResponseClass() {
		return TaohuaItemsSearchResponse.class;
	}
}
