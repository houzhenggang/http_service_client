package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsInventoryGetResponse;

/**
 * TOP API: taobao.items.inventory.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class ItemsInventoryGetRequest implements TaobaoRequest<ItemsInventoryGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����ֶΡ���ѡֵ:

regular_shelved(��ʱ�ϼ�)
never_on_shelf(��δ�ϼ�)
sold_out(ȫ������)
off_shelf(���¼ܵ�)
for_shelved(�ȴ������ϼ�)
violation_off_shelf(Υ���¼ܵ�)
Ĭ�ϲ�ѯ����for_shelved(�ȴ������ϼ�)���״̬����Ʒ
	 */
	private String banner;

	/** 
	* ��Ʒ��ĿID��ItemCat�е�cid�ֶΡ�����ͨ��taobao.itemcats.getȡ��
	 */
	private Long cid;

	/** 
	* ��Ʒ�����޸�ʱ��
	 */
	private Date endModified;

	/** 
	* �践�ص��ֶ��б���ѡֵ��Item��Ʒ�ṹ���е������ֶΣ� 
approve_status,num_iid,title,nick,type,cid,pic_url,num,props,valid_thru, 

list_time,price,has_discount,has_invoice,has_warranty,has_showcase, 

modified,delist_time,postage_id,seller_cids,outer_id���ֶ�֮���á�,���ָ��� 

��֧�������ֶΣ������Ҫ��ȡ�����ֶ����ݣ�����taobao.item.get��
	 */
	private String fields;

	/** 
	* �Ƿ�����Ա�ۿۡ���ѡֵ��true��false��Ĭ�ϲ����˸�����
	 */
	private Boolean hasDiscount;

	/** 
	* ��Ʒ�Ƿ����ⲿ������ʾ
	 */
	private Boolean isEx;

	/** 
	* ��Ʒ�Ƿ����Ա���ʾ
	 */
	private Boolean isTaobao;

	/** 
	* ����ʽ����ʽΪcolumn:asc/desc ��column��ѡֵ:list_time(�ϼ�ʱ��),delist_time(�¼�ʱ��),num(��Ʒ����)��modified(����޸�ʱ��);Ĭ���ϼ�ʱ�併��(�������ϼ�����ǰ��)���簴���ϼ�ʱ�併������ʽΪlist_time:desc
	 */
	private String orderBy;

	/** 
	* ҳ�롣ȡֵ��Χ:�����������;Ĭ��ֵΪ1�������ص�һҳ���ݡ��ô˽ӿڻ�ȡ���ݣ�����ҳ��ȡ��������page_no*page_size������10����,Ϊ�˱�����̨�������棬�ӿڽ��������Ҿ����ܵ�ϸ���Լ���������������������޸�ʱ��ֶλ�ȡ��Ʒ
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������;���ֵ��200��Ĭ��ֵ��40��
	 */
	private Long pageSize;

	/** 
	* �����ֶΡ�������Ʒ��title��
	 */
	private String q;

	/** 
	* ���ҵ������Զ�����ĿID�����֮���á�,���ָ������Ը���taobao.sellercats.list.get���.(<font color="red">ע��Ŀǰ���֧��32��ID�Ŵ���</font>)
	 */
	private String sellerCids;

	/** 
	* ��Ʒ��ʼ�޸�ʱ��
	 */
	private Date startModified;

	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getBanner() {
		return this.banner;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

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

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}

	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}
	public Boolean getIsEx() {
		return this.isEx;
	}

	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}
	public Boolean getIsTaobao() {
		return this.isTaobao;
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

	public void setQ(String q) {
		this.q = q;
	}
	public String getQ() {
		return this.q;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}
	public String getSellerCids() {
		return this.sellerCids;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public Date getStartModified() {
		return this.startModified;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.items.inventory.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("banner", this.banner);
		txtParams.put("cid", this.cid);
		txtParams.put("end_modified", this.endModified);
		txtParams.put("fields", this.fields);
		txtParams.put("has_discount", this.hasDiscount);
		txtParams.put("is_ex", this.isEx);
		txtParams.put("is_taobao", this.isTaobao);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("q", this.q);
		txtParams.put("seller_cids", this.sellerCids);
		txtParams.put("start_modified", this.startModified);
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

	public Class<ItemsInventoryGetResponse> getResponseClass() {
		return ItemsInventoryGetResponse.class;
	}
}
