package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrdersSearchResponse;

/**
 * TOP API: taobao.hotel.orders.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:44.0
 */
public class HotelOrdersSearchRequest implements TaobaoRequest<HotelOrdersSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��סʱ���ѯ����ʱ�䣬��ʽΪ��yyyy-MM-dd����������checkin_date_start��������ܴ���30
	 */
	private Date checkinDateEnd;

	/** 
	* ��סʱ���ѯ��ʼʱ�䣬��ʽΪ��yyyy-MM-dd
	 */
	private Date checkinDateStart;

	/** 
	* ���ʱ���ѯ����ʱ�䣬��ʽΪ��yyyy-MM-dd����������checkout_date_start��������ܴ���30
	 */
	private Date checkoutDateEnd;

	/** 
	* ���ʱ���ѯ��ʼʱ�䣬��ʽΪ��yyyy-MM-dd
	 */
	private Date checkoutDateStart;

	/** 
	* ��������ʱ���ѯ����ʱ�䣬��ʽΪ��yyyy-MM-dd����������created_start��������ܴ���30
	 */
	private Date createdEnd;

	/** 
	* ��������ʱ���ѯ��ʼʱ�䣬��ʽΪ��yyyy-MM-dd
	 */
	private Date createdStart;

	/** 
	* ��Ʒgid�б����gid��Ӣ�Ķ��Ÿ�����һ�β�����5��
	 */
	private String gids;

	/** 
	* �Ƶ�hid�б����hid��Ӣ�Ķ��Ÿ�����һ�β�����5��
	 */
	private String hids;

	/** 
	* �Ƿ���Ҫ���ظö�������ס���б���ѡֵ��true��false��
	 */
	private Boolean needGuest;

	/** 
	* �Ƶ궩��oids�б����oid��Ӣ�Ķ��Ÿ�����һ�β�����20����oids��tids��hids��rids��gids����checkin_date_start��checkin_date_end������checkout_date_start��checkout_date_end������created_start��created_end�����봫��һ����ű�ʾ��ͬʱ���ڲ���Ϊ��ѯ������
oids��tids��hids��rids��gidsͬʱ����ʱ�����ȼ�����˳���ɸߵ���ֻȡһ�����ͬʱ����ʱ������ʹ�á�
	 */
	private String oids;

	/** 
	* ��ҳҳ�롣ȡֵ��Χ���������������Ĭ��ֵ1�������ص�һҳ�����ݡ�ҳ���СΪ20
	 */
	private Long pageNo;

	/** 
	* ����rid�б����rid��Ӣ�Ķ��Ÿ�����һ�β�����5��
	 */
	private String rids;

	/** 
	* ����״̬��A���ȴ���Ҹ��B������Ѹ�������ҷ�����C�������ѷ��������ȷ�ϡ�D�����׳ɹ���E�����׹ر�
	 */
	private String status;

	/** 
	* �Ա�����tid�б����tid��Ӣ�Ķ��Ÿ�����һ�β�����20����
	 */
	private String tids;

	public void setCheckinDateEnd(Date checkinDateEnd) {
		this.checkinDateEnd = checkinDateEnd;
	}
	public Date getCheckinDateEnd() {
		return this.checkinDateEnd;
	}

	public void setCheckinDateStart(Date checkinDateStart) {
		this.checkinDateStart = checkinDateStart;
	}
	public Date getCheckinDateStart() {
		return this.checkinDateStart;
	}

	public void setCheckoutDateEnd(Date checkoutDateEnd) {
		this.checkoutDateEnd = checkoutDateEnd;
	}
	public Date getCheckoutDateEnd() {
		return this.checkoutDateEnd;
	}

	public void setCheckoutDateStart(Date checkoutDateStart) {
		this.checkoutDateStart = checkoutDateStart;
	}
	public Date getCheckoutDateStart() {
		return this.checkoutDateStart;
	}

	public void setCreatedEnd(Date createdEnd) {
		this.createdEnd = createdEnd;
	}
	public Date getCreatedEnd() {
		return this.createdEnd;
	}

	public void setCreatedStart(Date createdStart) {
		this.createdStart = createdStart;
	}
	public Date getCreatedStart() {
		return this.createdStart;
	}

	public void setGids(String gids) {
		this.gids = gids;
	}
	public String getGids() {
		return this.gids;
	}

	public void setHids(String hids) {
		this.hids = hids;
	}
	public String getHids() {
		return this.hids;
	}

	public void setNeedGuest(Boolean needGuest) {
		this.needGuest = needGuest;
	}
	public Boolean getNeedGuest() {
		return this.needGuest;
	}

	public void setOids(String oids) {
		this.oids = oids;
	}
	public String getOids() {
		return this.oids;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setRids(String rids) {
		this.rids = rids;
	}
	public String getRids() {
		return this.rids;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTids(String tids) {
		this.tids = tids;
	}
	public String getTids() {
		return this.tids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.orders.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("checkin_date_end", this.checkinDateEnd);
		txtParams.put("checkin_date_start", this.checkinDateStart);
		txtParams.put("checkout_date_end", this.checkoutDateEnd);
		txtParams.put("checkout_date_start", this.checkoutDateStart);
		txtParams.put("created_end", this.createdEnd);
		txtParams.put("created_start", this.createdStart);
		txtParams.put("gids", this.gids);
		txtParams.put("hids", this.hids);
		txtParams.put("need_guest", this.needGuest);
		txtParams.put("oids", this.oids);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("rids", this.rids);
		txtParams.put("status", this.status);
		txtParams.put("tids", this.tids);
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

	public Class<HotelOrdersSearchResponse> getResponseClass() {
		return HotelOrdersSearchResponse.class;
	}
}
