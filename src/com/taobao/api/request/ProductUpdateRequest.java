package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductUpdateResponse;

/**
 * TOP API: taobao.product.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ProductUpdateRequest implements TaobaoUploadRequest<ProductUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ǹؼ�����.����taobao.itemprops.get��ȡpid,����taobao.itempropvalues.get��ȡvid;��ʽ:pid:vid;pid:vid
	 */
	private String binds;

	/** 
	* ��Ʒ����.���25000���ֽ�
	 */
	private String desc;

	/** 
	* ��Ʒ��ͼ.���500K,Ŀǰ��֧��GIF,JPG
	 */
	private FileItem image;

	/** 
	* �Ƿ�����ͼ
	 */
	private Boolean major;

	/** 
	* ��Ʒ����.���60���ֽ�
	 */
	private String name;

	/** 
	* �Զ���ǹؼ�����
	 */
	private String nativeUnkeyprops;

	/** 
	* �ⲿ��ƷID
	 */
	private String outerId;

	/** 
	* ��Ʒ�г���.��ȷ��2λС��;��λΪԪ.��:200.07
	 */
	private String price;

	/** 
	* ��ƷID
	 */
	private Long productId;

	/** 
	* ��������.����taobao.itemprops.get��ȡpid,����taobao.itempropvalues.get��ȡvid;��ʽ:pid:vid;pid:vid
	 */
	private String saleProps;

	public void setBinds(String binds) {
		this.binds = binds;
	}
	public String getBinds() {
		return this.binds;
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

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setNativeUnkeyprops(String nativeUnkeyprops) {
		this.nativeUnkeyprops = nativeUnkeyprops;
	}
	public String getNativeUnkeyprops() {
		return this.nativeUnkeyprops;
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

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId() {
		return this.productId;
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
		return "taobao.product.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("binds", this.binds);
		txtParams.put("desc", this.desc);
		txtParams.put("major", this.major);
		txtParams.put("name", this.name);
		txtParams.put("native_unkeyprops", this.nativeUnkeyprops);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("product_id", this.productId);
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

	public Class<ProductUpdateResponse> getResponseClass() {
		return ProductUpdateResponse.class;
	}
}
