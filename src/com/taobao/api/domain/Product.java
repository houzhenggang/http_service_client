package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ʒ�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-11-23 13:31:22.0
 */
public class Product extends TaobaoObject {

	private static final long serialVersionUID = 7827434161956527792L;

	/**
	 * ��Ʒ�ķǹؼ������б�.��ʽ:pid:vid;pid:vid.
	 */
	@ApiField("binds")
	private String binds;

	/**
	 * ��Ʒ�ķǹؼ������ַ����б�.��ʽͬprops_str(<strong>ע��</strong><font color="red">���������е�ð��":"��ת��Ϊ��"#cln#";  
�ֺ�";"��ת��Ϊ��"#scln#"
</font>)
	 */
	@ApiField("binds_str")
	private String bindsStr;

	/**
	 * ��Ʒ��Ŀ����
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * ��Ʒ��ĿID.������Ҷ����ĿID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ��Ʒ��collect���������ṩ���ݣ�����0)
	 */
	@ApiField("collect_num")
	private Long collectNum;

	/**
	 * ����ʱ��.��ʽ:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �û��Զ�������,�ṹ��pid1:value1;pid2:value2 ���磺��20000:���¿⡱����ʾ��Ʒ��:���¿⡱
	 */
	@ApiField("customer_props")
	private String customerProps;

	/**
	 * ��Ʒ������.���25000���ֽ�
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ��Ʒ�ļ���level
	 */
	@ApiField("level")
	private Long level;

	/**
	 * �޸�ʱ��.��ʽ:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ʒ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * �ⲿ��ƷID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * ��Ʒ��Ӧ��ͼƬ·��
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * ��Ʒ����ͼƬ��ַ.(���Ե�ַ,��ʽ:http://host/image_path)
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ���г���.��λΪԪ.��ȷ��2λС��;��:200.07
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��ƷID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * ��Ʒ����ͼƬ.Ŀǰ���֧��4�š�fields������Ϊproduct_imgs.id��product_imgs.url��product_imgs.position ����ʽ�ͻ᷵����Ӧ���ֶ�
	 */
	@ApiListField("product_imgs")
	@ApiField("product_img")
	private List<ProductImg> productImgs;

	/**
	 * ��Ʒ������ͼƬ.����˵��ɫ��Ӧ�Ĳ�ƷͼƬ,��ɫ��Ӧ�Ĳ�ƷͼƬ��fields������Ϊproduct_prop_imgs.id�� 
product_prop_imgs.props��product_prop_imgs.url��product_prop_imgs.position����ʽ�ͻ᷵����Ӧ���ֶ�
	 */
	@ApiListField("product_prop_imgs")
	@ApiField("product_prop_img")
	private List<ProductPropImg> productPropImgs;

	/**
	 * ��������ֵ��������ʽΪpid1:vid1:alias1;pid1:vid2:alia2��
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * ��Ʒ�Ĺؼ������б�.��ʽ��pid:vid;pid:vid
	 */
	@ApiField("props")
	private String props;

	/**
	 * ��Ʒ�Ĺؼ������ַ����б�.����:Ʒ��:ŵ����;�ͺ�:N73(<strong>ע��</strong><font color="red">���������е�ð��":"��ת��Ϊ��"#cln#";  
�ֺ�";"��ת��Ϊ��"#scln#"
</font>)
	 */
	@ApiField("props_str")
	private String propsStr;

	/**
	 * ��Ʒ�����������б�.��ʽ:pid:vid;pid:vid
	 */
	@ApiField("sale_props")
	private String saleProps;

	/**
	 * ��Ʒ�����������ַ����б�.��ʽͬprops_str(<strong>ע��</strong><font color="red">���������е�ð��":"��ת��Ϊ��"#cln#";  
�ֺ�";"��ת��Ϊ��"#scln#"
</font>)
	 */
	@ApiField("sale_props_str")
	private String salePropsStr;

	/**
	 * ��ǰ״̬(0 �̼�ȷ�� 1 ���� 3 С��ȷ�� 2 δȷ�� -1 ɾ��)
	 */
	@ApiField("status")
	private Long status;

	/**
	 * �Ա���׼��Ʒ����
	 */
	@ApiField("tsc")
	private String tsc;

	/**
	 * ��ֱ�г�,�磺3��3C����4��Ь�ǣ�
	 */
	@ApiField("vertical_market")
	private Long verticalMarket;

	public String getBinds() {
		return this.binds;
	}
	public void setBinds(String binds) {
		this.binds = binds;
	}

	public String getBindsStr() {
		return this.bindsStr;
	}
	public void setBindsStr(String bindsStr) {
		this.bindsStr = bindsStr;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCollectNum() {
		return this.collectNum;
	}
	public void setCollectNum(Long collectNum) {
		this.collectNum = collectNum;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCustomerProps() {
		return this.customerProps;
	}
	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public List<ProductImg> getProductImgs() {
		return this.productImgs;
	}
	public void setProductImgs(List<ProductImg> productImgs) {
		this.productImgs = productImgs;
	}

	public List<ProductPropImg> getProductPropImgs() {
		return this.productPropImgs;
	}
	public void setProductPropImgs(List<ProductPropImg> productPropImgs) {
		this.productPropImgs = productPropImgs;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getPropsStr() {
		return this.propsStr;
	}
	public void setPropsStr(String propsStr) {
		this.propsStr = propsStr;
	}

	public String getSaleProps() {
		return this.saleProps;
	}
	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getSalePropsStr() {
		return this.salePropsStr;
	}
	public void setSalePropsStr(String salePropsStr) {
		this.salePropsStr = salePropsStr;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTsc() {
		return this.tsc;
	}
	public void setTsc(String tsc) {
		this.tsc = tsc;
	}

	public Long getVerticalMarket() {
		return this.verticalMarket;
	}
	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

}
