package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureGetResponse;

/**
 * TOP API: taobao.picture.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-29 20:30:37.0
 */
public class PictureGetRequest implements TaobaoRequest<PictureGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƿ�ɾ��,unfroze����û��ɾ��
	 */
	private String deleted;

	/** 
	* ��ѯ�ϴ�����ʱ���,��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date endDate;

	/** 
	* ͼƬ��ѯ�������,time:desc���ϴ�ʱ�������(Ĭ��), time:asc���ϴ�ʱ����絽��,sizes:desc��ͼƬ�Ӵ�С��sizes:asc��ͼƬ��С����,Ĭ��time:desc
	 */
	private String orderBy;

	/** 
	* ҳ��.����ֵΪ1�����һҳ,����ֵΪ2����ڶ�ҳ,��������,Ĭ��ֵΪ1
	 */
	private Long pageNo;

	/** 
	* ÿҳ����.ÿҳ������෵��100��,Ĭ��ֵ40
	 */
	private Long pageSize;

	/** 
	* ͼƬ����ID
	 */
	private Long pictureCategoryId;

	/** 
	* ͼƬID
	 */
	private Long pictureId;

	/** 
	* ��ѯ�ϴ���ʼʱ���,��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	private Date startDate;

	/** 
	* ͼƬ����,��󳤶�50�ַ�,��Ӣ�Ķ���һ�ַ�
	 */
	private String title;

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getDeleted() {
		return this.deleted;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderBy() {
		return this.orderBy;
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

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}
	public Long getPictureId() {
		return this.pictureId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
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
		return "taobao.picture.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("deleted", this.deleted);
		txtParams.put("end_date", this.endDate);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("picture_category_id", this.pictureCategoryId);
		txtParams.put("picture_id", this.pictureId);
		txtParams.put("start_date", this.startDate);
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

	public Class<PictureGetResponse> getResponseClass() {
		return PictureGetResponse.class;
	}
}
