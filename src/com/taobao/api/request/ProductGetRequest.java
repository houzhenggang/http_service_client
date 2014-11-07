package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductGetResponse;

/**
 * TOP API: taobao.product.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class ProductGetRequest implements TaobaoRequest<ProductGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ��Ŀid.����taobao.itemcats.get��ȡ;������Ҷ����Ŀid,���û�д�product_id,��ôcid��props����Ҫ��.
	 */
	private Long cid;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:Product���ݽṹ�е������ֶ�;����ֶ�֮����","�ָ�.
	 */
	private String fields;

	/** 
	* Product��id.���ַ�ʽ���鿴һ����Ʒ:1.����product_id����ѯ 2.����cid��props����ѯ
	 */
	private Long productId;

	/** 
	* ����:ŵ����N73�����Ʒ�Ĺؼ������б����:Ʒ��:ŵ����;�ͺ�:N73,��Ӧ��PVֵ����10005:10027;10006:29729.
	 */
	private String props;

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

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId() {
		return this.productId;
	}

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.product.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("fields", this.fields);
		txtParams.put("product_id", this.productId);
		txtParams.put("props", this.props);
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

	public Class<ProductGetResponse> getResponseClass() {
		return ProductGetResponse.class;
	}
}
