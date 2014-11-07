package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductsSearchResponse;

/**
 * TOP API: taobao.products.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class ProductsSearchRequest implements TaobaoRequest<ProductsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ��ĿID.����taobao.itemcats.get��ȡ.
	 */
	private Long cid;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:Product���ݽṹ�е������ֶ�:product_id,name,pic_url,cid,props,price,tsc;����ֶ�֮����","�ָ�.�����ֶ�status(product�ĵ�ǰ״̬)
	 */
	private String fields;

	/** 
	* ҳ��.����ֵΪ1�����һҳ,����ֵΪ2����ڶ�ҳ,��������.Ĭ�Ϸ��ص������Ǵӵ�һҳ��ʼ.
	 */
	private Long pageNo;

	/** 
	* ÿҳ����.ÿҳ������෵��100��,Ĭ��ֵΪ40.
	 */
	private Long pageSize;

	/** 
	* ����,����ֵ�����.��ʽ:pid:vid;pid:vid;����taobao.itemprops.get��ȡ��Ŀ����pid 
,����taobao.itempropvalues.getȡ��vid.
	 */
	private String props;

	/** 
	* �����Ĺؼ���������������Ʒ��title�Լ��ؼ�����ֵ������.��:"���¿� 1234",����������ʾ��ѯ���¿����Ʒ���µĻ���Ϊ1234�Ĳ�Ʒ;��ע:q,cid��props���ٴ���һ��
	 */
	private String q;

	/** 
	* ��Ҫ��ȡ�Ĳ�Ʒ��״̬�б�֧�ֶ��״̬���л�ȡ�����״̬֮����","�ָ������ͬʱָ��5��״̬�����磬ֻ��ȡС��ȷ�ϵ�spu����"3",ֻҪ�̼�ȷ�ϵĴ���"0"����ҪС��ȷ����Ҫ�̼�ȷ�ϵĴ���"0,3"��Ŀǰֻ֧�����������͵�״̬��������������״̬��Ч��
	 */
	private String status;

	/** 
	* ����ֵΪ��3��ʾ3C��ʾ3C��ֱ�г���Ʒ��4��ʾЬ�Ǵ�ֱ�г���Ʒ��8��ʾ���δ�ֱ�г���Ʒ��һ��ֻ��ָ��һ�ִ�ֱ�г�����
	 */
	private Long verticalMarket;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public void setQ(String q) {
		this.q = q;
	}
	public String getQ() {
		return this.q;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}
	public Long getVerticalMarket() {
		return this.verticalMarket;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.products.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("props", this.props);
		txtParams.put("q", this.q);
		txtParams.put("status", this.status);
		txtParams.put("vertical_market", this.verticalMarket);
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

	public Class<ProductsSearchResponse> getResponseClass() {
		return ProductsSearchResponse.class;
	}
}
