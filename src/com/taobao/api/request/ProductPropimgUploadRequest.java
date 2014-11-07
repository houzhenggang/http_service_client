package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductPropimgUploadResponse;

/**
 * TOP API: taobao.product.propimg.upload request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class ProductPropimgUploadRequest implements TaobaoUploadRequest<ProductPropimgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ����ͼƬID
	 */
	private Long id;

	/** 
	* ͼƬ����.ͼƬ���Ϊ2M,ֻ֧��JPG,GIF.
	 */
	private FileItem image;

	/** 
	* ͼƬ���
	 */
	private Long position;

	/** 
	* ��ƷID.Product��id
	 */
	private Long productId;

	/** 
	* ���Դ�.Ŀǰ��֧����ɫ����.����taobao.itemprops.get��ȡ��Ŀ����,ȡ����ɫ����pid,����taobao.itempropvalues.getȡ��vid;��ʽ:pid:vid,ֻ�ܴ���һ����ɫpid:vid��;
	 */
	private String props;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
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
		return "taobao.product.propimg.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("position", this.position);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

	public Class<ProductPropimgUploadResponse> getResponseClass() {
		return ProductPropimgUploadResponse.class;
	}
}
