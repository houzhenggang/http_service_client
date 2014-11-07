package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductsGetResponse;

/**
 * TOP API: taobao.products.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class ProductsGetRequest implements TaobaoRequest<ProductsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:Product���ݽṹ�е������ֶ�;����ֶ�֮����","�ָ�
	 */
	private String fields;

	/** 
	* �û��ǳ�
	 */
	private String nick;

	/** 
	* ҳ��.����ֵΪ1�����һҳ,����ֵΪ2����ڶ�ҳ,��������.Ĭ�Ϸ��ص������Ǵӵ�һҳ��ʼ.
	 */
	private Long pageNo;

	/** 
	* ÿҳ����.ÿҳ������෵��100��,Ĭ��ֵΪ40
	 */
	private Long pageSize;

	/** 
	* ���Դ�pid:vid
	 */
	private String props;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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
		return "taobao.products.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<ProductsGetResponse> getResponseClass() {
		return ProductsGetResponse.class;
	}
}
