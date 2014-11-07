package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductAddResponse;

/**
 * TOP API: taobao.product.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class ProductAddRequest implements TaobaoUploadRequest<ProductAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ǹؼ����Խṹ:pid:vid;pid:vid.�ǹؼ����Բ������ؼ����ԡ��������ԡ��û��Զ������ԡ���Ʒ����;����taobao.itemprops.get��ȡpid,����taobao.itempropvalues.get��ȡvid.<br><font color=red>ע:֧����󳤶�Ϊ512�ֽ�</font>
	 */
	private String binds;

	/** 
	* ��Ʒ��ĿID.����taobao.itemcats.get��ȡ;ע��:������Ҷ����Ŀ id.
	 */
	private Long cid;

	/** 
	* �û��Զ�������,�ṹ��pid1:value1;pid2:value2��������ͺţ�ϵ��,���ŵ���: ���� ���磺��20000:���¿�:�ͺ�:001:632501:1234������ʾ��Ʒ��:���¿�:�ͺ�:001:����:1234��
	 */
	private String customerProps;

	/** 
	* ��Ʒ����.���25000���ֽ�
	 */
	private String desc;

	/** 
	* ��Ʒ��ͼƬ.���1M,Ŀǰ��֧��GIF,JPG.
	 */
	private FileItem image;

	/** 
	* �ǲ�����ͼ
	 */
	private Boolean major;

	/** 
	* ����ʱ�䡣Ŀǰֻ֧��Ь����Ŀ����˲���
	 */
	private Date marketTime;

	/** 
	* ��Ʒ����,���60���ֽ�.
	 */
	private String name;

	/** 
	* �ⲿ��ƷID
	 */
	private String outerId;

	/** 
	* ��Ʒ�г���.��ȷ��2λС��;��λΪԪ.�磺200.07
	 */
	private String price;

	/** 
	* ��������ֵ��������ʽΪpid1:vid1:alias1;pid1:vid2:alia2��ֻ��������������ֵ֧�ִ��������������ɫ�ͳߴ�
	 */
	private String propertyAlias;

	/** 
	* �ؼ����� �ṹ:pid:vid;pid:vid.����taobao.itemprops.get��ȡpid,����taobao.itempropvalues.get��ȡvid;��������û��Զ�������,����customer_props.
	 */
	private String props;

	/** 
	* �������Խṹ:pid:vid;pid:vid.����taobao.itemprops.get��ȡis_sale_prop��true��pid,����taobao.itempropvalues.get��ȡvid.
	 */
	private String saleProps;

	public void setBinds(String binds) {
		this.binds = binds;
	}
	public String getBinds() {
		return this.binds;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}
	public String getCustomerProps() {
		return this.customerProps;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setMajor(Boolean major) {
		this.major = major;
	}
	public Boolean getMajor() {
		return this.major;
	}

	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}
	public Date getMarketTime() {
		return this.marketTime;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return this.price;
	}

	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}
	public String getPropertyAlias() {
		return this.propertyAlias;
	}

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}
	public String getSaleProps() {
		return this.saleProps;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.product.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("binds", this.binds);
		txtParams.put("cid", this.cid);
		txtParams.put("customer_props", this.customerProps);
		txtParams.put("desc", this.desc);
		txtParams.put("major", this.major);
		txtParams.put("market_time", this.marketTime);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("property_alias", this.propertyAlias);
		txtParams.put("props", this.props);
		txtParams.put("sale_props", this.saleProps);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

	public Class<ProductAddResponse> getResponseClass() {
		return ProductAddResponse.class;
	}
}
