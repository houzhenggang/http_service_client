package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementItemsGetResponse;

/**
 * TOP API: taobao.increment.items.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class IncrementItemsGetRequest implements TaobaoRequest<IncrementItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ϣ����Ӧ�Ĳ���ʱ������ֵ����start_modified����ʹ���ܹ�����֪ͨ��Ϣ��ʱ��Ρ�����ʱ�����������start_modified��Ĭ��Ϊ��start_modifiedͬһ���23:59:59������Ĭ��Ϊ���ýӿڵ����23:59:59������ʽ��yyyy-MM-dd HH:mm:ss��<br>
<font color="red">ע�⣺start_modified��end_modified�����ڱ����ڱ�����ͬһ���ڣ����磺start_modified����2000-01-01 00:00:00����end_modified��������Ϊ2000-01-01�������</font>
	 */
	private Date endModified;

	/** 
	* ��Ϣ�����ڵ��û����ǳơ����ô˲��������ص���Ϣ����ݴ���nick�Ľ��й��ˡ�������AppKey���ǳ�Ĭ��Ϊ�Լ��İ��ǳƣ��˲�����Ч��
	 */
	private String nick;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������; Ĭ��ֵ:1,�����ص�һҳ���ݡ�
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������;���ֵ:200;Ĭ��ֵ:40��
	 */
	private Long pageSize;

	/** 
	* ��Ϣ����Ӧ�Ĳ���ʱ�����Сֵ��end_modified����ʹ���ܹ�����֪ͨ��Ϣ��ʱ��Ρ�����ʱ�����������end_modified��Ĭ��Ϊ�� end_modifiedͬһ���00:00:00������Ĭ��Ϊ���ýӿڵ����00:00:00������ʽ��yyyy-MM-dd HH:mm:ss��<br>
<font color="red">ע�⣺start_modified��end_modified�����ڱ����ڱ�����ͬһ���ڣ����磺start_modified����2000-01-01 00:00:00����end_modified��������Ϊ2000-01-01�������</font>
	 */
	private Date startModified;

	/** 
	* ��Ʒ����״̬��Ĭ�ϲ�ѯ����״̬�����ݣ�����Ĭ��ֵ��ÿ��ֻ�ܲ�ѯһ��״̬�����������б����
ItemAdd��������Ʒ�� 
ItemUpshelf���ϼ���Ʒ���Զ��ϼ���Ʒ���ܻ�ȡ��������Ϣ�� 
ItemDownshelf���¼���Ʒ�� 
ItemDelete��ɾ����Ʒ�� 
ItemUpdate��������Ʒ�� 
ItemRecommendDelete��ȡ�������Ƽ���Ʒ�� 
ItemRecommendAdd�������Ƽ���Ʒ�� 
ItemZeroStock����Ʒ���գ�
	 */
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public Date getEndModified() {
		return this.endModified;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
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
		return "taobao.increment.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<IncrementItemsGetResponse> getResponseClass() {
		return IncrementItemsGetResponse.class;
	}
}
