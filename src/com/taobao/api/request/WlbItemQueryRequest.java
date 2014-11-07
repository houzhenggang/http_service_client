package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemQueryResponse;

/**
 * TOP API: taobao.wlb.item.query request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbItemQueryRequest implements TaobaoRequest<WlbItemQueryResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƿ�����С��浥Ԫ��ֻ����С��浥Ԫ����Ʒ�ſ����п��,ֵֻ�ܸ�"true","false"����ʾ;
��ֵ���ڷ�Χ�ڣ���true����
	 */
	private String isSku;

	/** 
	* �̼ұ���
	 */
	private String itemCode;

	/** 
	* ITEM����(ֻ������������Ӣ�Ļ��)
NORMAL  0:��ͨ��Ʒ; 
COMBINE  1:�Ƿ��������Ʒ 
DISTRIBUTION  2:�Ƿ��Ƿ�����Ʒ(�����Ǳ���)
��ֵ���ڷ�Χ�ڣ���NORMAL����
	 */
	private String itemType;

	/** 
	* ��Ʒ����
	 */
	private String name;

	/** 
	* ��ǰҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ��¼����������û�����ļ�¼������50����һҳ��ʾ50����¼
	 */
	private Long pageSize;

	/** 
	* ��ID,ֻ��is_sku=1ʱ�����и�ID����ƷҲ����û�и���Ʒ
	 */
	private Long parentId;

	/** 
	* ֻ����������ֵ��գ�
ITEM_STATUS_VALID -- 1 ��ʾ ��Ч��
ITEM_STATUS_LOCK  -- 2 ��ʾ��ס��
��ֵ���ڷ�Χ�ڣ���ITEM_STATUS_VALID����
	 */
	private String status;

	/** 
	* ��Ʒǰ̨��������
	 */
	private String title;

	public void setIsSku(String isSku) {
		this.isSku = isSku;
	}
	public String getIsSku() {
		return this.isSku;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType() {
		return this.itemType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
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

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getParentId() {
		return this.parentId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_sku", this.isSku);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("item_type", this.itemType);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("status", this.status);
		txtParams.put("title", this.title);
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

	public Class<WlbItemQueryResponse> getResponseClass() {
		return WlbItemQueryResponse.class;
	}
}
