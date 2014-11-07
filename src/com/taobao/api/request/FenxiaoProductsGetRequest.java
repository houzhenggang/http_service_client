package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductsGetResponse;

/**
 * TOP API: taobao.fenxiao.products.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class FenxiaoProductsGetRequest implements TaobaoRequest<FenxiaoProductsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����޸�ʱ��
	 */
	private Date endModified;

	/** 
	* ָ����ѯ�������Ϣ����ѡֵ��skus��sku���ݣ���images����ͼ���������ѡֵ�ö��ŷָ
	 */
	private String fields;

	/** 
	* �̼ұ���
	 */
	private String outerId;

	/** 
	* ҳ�루����0��������Ĭ��1��
	 */
	private Long pageNo;

	/** 
	* ÿҳ��¼����Ĭ��20�����50��
	 */
	private Long pageSize;

	/** 
	* ��ƷID�б��������30�����ö��ŷָ���磺��1001,1002,1003,1004,1005��
	 */
	private String pids;

	/** 
	* ��Ʒ��ID
	 */
	private Long productcatId;

	/** 
	* sku�̼ұ���
	 */
	private String skuNumber;

	/** 
	* ��ʼ�޸�ʱ��
	 */
	private Date startModified;

	/** 
	* ��Ʒ״̬����ѡֵ��up���ϼܣ���down���¼ܣ�������Ĭ�ϲ�ѯ����
	 */
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public Date getEndModified() {
		return this.endModified;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
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

	public void setPids(String pids) {
		this.pids = pids;
	}
	public String getPids() {
		return this.pids;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}
	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getSkuNumber() {
		return this.skuNumber;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public Date getStartModified() {
		return this.startModified;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.products.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("fields", this.fields);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pids", this.pids);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("sku_number", this.skuNumber);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
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

	public Class<FenxiaoProductsGetResponse> getResponseClass() {
		return FenxiaoProductsGetResponse.class;
	}
}
