package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasOrderSearchResponse;

/**
 * TOP API: taobao.vas.order.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasOrderSearchRequest implements TaobaoRequest<VasOrderSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ӧ���շѴ��룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ���ø�Ӧ�õ��շѴ���
	 */
	private String articleCode;

	/** 
	* ������
	 */
	private Long bizOrderId;

	/** 
	* �������ͣ�1=�¶� 2=���� 3=���� 4=��̨���� 5=��̨�Զ����� 6=������˺����ɶ�����ϵ����ʱ�ò����� ��=ȫ��
	 */
	private Long bizType;

	/** 
	* ��������ʱ�䣨����ʱ�䣩����ֵ
	 */
	private Date endCreated;

	/** 
	* �շ���Ŀ���룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ�����շ���Ŀ����
	 */
	private String itemCode;

	/** 
	* �Ա���Ա��
	 */
	private String nick;

	/** 
	* �Ӷ�����
	 */
	private Long orderId;

	/** 
	* ҳ��
	 */
	private Long pageNo;

	/** 
	* һҳ�����ļ�¼��
	 */
	private Long pageSize;

	/** 
	* ��������ʱ�䣨����ʱ�䣩��ʼֵ
	 */
	private Date startCreated;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}
	public Long getBizType() {
		return this.bizType;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return this.itemCode;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getOrderId() {
		return this.orderId;
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

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public Date getStartCreated() {
		return this.startCreated;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.vas.order.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("end_created", this.endCreated);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("nick", this.nick);
		txtParams.put("order_id", this.orderId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_created", this.startCreated);
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

	public Class<VasOrderSearchResponse> getResponseClass() {
		return VasOrderSearchResponse.class;
	}
}
