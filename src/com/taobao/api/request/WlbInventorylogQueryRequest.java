package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventorylogQueryResponse;

/**
 * TOP API: taobao.wlb.inventorylog.query request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbInventorylogQueryRequest implements TaobaoRequest<WlbInventorylogQueryResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����޸�ʱ��,С�ڵ��ڸ�ʱ��
	 */
	private Date gmtEnd;

	/** 
	* ��ʼ�޸�ʱ��,���ڵ��ڸ�ʱ��
	 */
	private Date gmtStart;

	/** 
	* ��ƷID
	 */
	private Long itemId;

	/** 
	* ������������(����Ϊ��)
CHU_KU 1-����
RU_KU 2-���
FREEZE 3-����
THAW 4-�ⶳ
CHECK_FREEZE 5-����ȷ��
CHANGE_KU 6-������ͱ��
��ֵ���ڷ�Χ�ڣ���CHU_KU����
	 */
	private String opType;

	/** 
	* ��ָ����Ȩ���û�����ѯ
	 */
	private Long opUserId;

	/** 
	* ����
	 */
	private String orderCode;

	/** 
	* ��ǰҳ
	 */
	private Long pageNo;

	/** 
	* ��ҳ��¼����
	 */
	private Long pageSize;

	/** 
	* �ֿ����
	 */
	private String storeCode;

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Date getGmtEnd() {
		return this.gmtEnd;
	}

	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}
	public Date getGmtStart() {
		return this.gmtStart;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getOpType() {
		return this.opType;
	}

	public void setOpUserId(Long opUserId) {
		this.opUserId = opUserId;
	}
	public Long getOpUserId() {
		return this.opUserId;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode() {
		return this.orderCode;
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

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreCode() {
		return this.storeCode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.inventorylog.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gmt_end", this.gmtEnd);
		txtParams.put("gmt_start", this.gmtStart);
		txtParams.put("item_id", this.itemId);
		txtParams.put("op_type", this.opType);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("store_code", this.storeCode);
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

	public Class<WlbInventorylogQueryResponse> getResponseClass() {
		return WlbInventorylogQueryResponse.class;
	}
}
