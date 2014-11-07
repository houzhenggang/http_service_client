package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemUpdateResponse;

/**
 * TOP API: taobao.item.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ItemUpdateRequest implements TaobaoUploadRequest<ItemUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ۺ����˵��ģ��id
	 */
	private Long afterSaleId;

	/** 
	* ��Ʒ�ϴ����״̬����ѡֵ:onsale�������У�,instock�����У�
	 */
	private String approveStatus;

	/** 
	* ��Ʒ�Ļ��ַ���������磺5 ��ʾ�������0.5%. ע�⣺�������������>0�����������������90,��Ϊ9%.B�̼��ڷ�����������Ʒʱ����������� 5�ı�������0.5%�ı�����������1�ı�������0.1%�ı�����������Ʒ�̼ҷ�����Ʒʱ�����ø��ֶμ�¼���ֱ������������������Ƕ�Ӧ��Ŀ�ķ��㲽������������Ĭ����5����0.5%��ע���ʱ���ֶ�ֵ���ɱ�����>0��������ע���ʱ���ֶ�ֵ���ɱ�����>0�����������ֵ������500����50%
	 */
	private Long auctionPoint;

	/** 
	* ������Ʒ���͡�ֻ��������Ŀ�µ���Ʒ���Ա���ϴ��ֶΣ�������Щ��Ŀ�����ϴ�����ͨ��taobao.itemcat.features.get��á��ڴ�����Ʒ����Ŀ�£�������ʾ�������Ʒ���ͣ����������оͲ���ͨ������ѵ���صĽ����ˣ�����ѡ���ͣ� 
no_mark(�������ͱ��) 
time_card(�㿨�������) 
fee_card(�����������)
	 */
	private String autoFill;

	/** 
	* Ҷ����Ŀid
	 */
	private Long cid;

	/** 
	* ���������˷�ģ��ID
	 */
	private Long codPostageId;

	/** 
	* ��Ʒ����. ����Ҫ����5���ַ���С��25000���ַ� ����Υ���ʿ���
	 */
	private String desc;

	/** 
	* ems���á�ȡֵ��Χ:0.01-999999.00;��ȷ��2λС��;��λ:Ԫ����:25.07����ʾ:25Ԫ7��
	 */
	private String emsFee;

	/** 
	* ��ݷ��á�ȡֵ��Χ:0-100000000;��ȷ��2λС��;��λ:Ԫ����:15.07����ʾ:15Ԫ7��
	 */
	private String expressFee;

	/** 
	* �˷ѳе���ʽ���˷ѳе���ʽ����ѡֵ:seller�����ҳе���,buyer(��ҳе�);
	 */
	private String freightPayer;

	/** 
	* ֧�ֻ�Ա���ۡ���ѡֵ:true,false;
	 */
	private Boolean hasDiscount;

	/** 
	* �Ƿ��з�Ʊ����ѡֵ:true,false (�̳����Ҵ��ֶα���Ϊtrue)
	 */
	private Boolean hasInvoice;

	/** 
	* �����Ƽ�����ѡֵ:true,false;
	 */
	private Boolean hasShowcase;

	/** 
	* �Ƿ��б��ޡ���ѡֵ:true,false;
	 */
	private Boolean hasWarranty;

	/** 
	* ��ƷͼƬ������:JPG,GIF;��󳤶�:500k
	 */
	private FileItem image;

	/** 
	* �Ӽ۷��� ���Ϊ0������ϵͳ�������
	 */
	private String increment;

	/** 
	* �û������������Ŀ����ID�����ṹ��"pid1,pid2,pid3"���磺"20000"����ʾƷ�ƣ� ע��ͨ��һ����Ŀ���û�������Ĺؼ����Բ�����1����
	 */
	private String inputPids;

	/** 
	* �û������������������������ֵ���ṹ:"������ֵ;һ����������;һ��������ֵ;������������;�Զ�������ֵ,....",�磺���Ϳ�;�Ϳ�ϵ��;�Ʊ�ϵ��;�Ʊ�ϵ��;2K5,Nike�ǵ�Ь;�ǵ�ϵ��;�ǵ�Ьϵ��;�ǵ�Ьϵ��;json5��������Զ���������','�ָinput_str��Ҫ��input_pidsһһ��Ӧ��ע��ͨ��һ����Ŀ���û�������Ĺؼ����Բ�����1�����������Ա������������ܳ���3999�ֽڡ��˴�������ʹ�á������������������͡��������������ʡ�
	 */
	private String inputStr;

	/** 
	* �Ƿ���3D
	 */
	private Boolean is3D;

	/** 
	* �Ƿ��������ʾ
	 */
	private Boolean isEx;

	/** 
	* ʵ�����緢����ע�⣺���۵����緢����Ʒ������ȡ�����緢������Ҫ���¼���Ʒ����ȡ�����緢�����
	 */
	private Boolean isLightningConsignment;

	/** 
	* �Ƿ��滻sku
	 */
	private Boolean isReplaceSku;

	/** 
	* �Ƿ����Ա�����ʾ
	 */
	private Boolean isTaobao;

	/** 
	* ��Ʒ���ֵİ汾�����崫�롱zh_HK�������崫�롱zh_CN��
	 */
	private String lang;

	/** 
	* �ϼ�ʱ�䡣��2008-05-26 09:12:00
	 */
	private Date listTime;

	/** 
	* ���ڵس��С��纼�� �����������http://dl.open.taobao.com/sdk/��Ʒ�����б�.rar ȡ��
	 */
	private String locationCity;

	/** 
	* ���ڵ�ʡ�ݡ����㽭 �����������http://dl.open.taobao.com/sdk/��Ʒ�����б�.rar ȡ��
	 */
	private String locationState;

	/** 
	* ��Ʒ������ȡֵ��Χ:0-999999������������Ҫ����Sku���������ĺ�
	 */
	private Long num;

	/** 
	* ��Ʒ����ID���ò�������
	 */
	private Long numIid;

	/** 
	* �̼ұ���
	 */
	private String outerId;

	/** 
	* ��Ʒ��ͼ��Ҫ������ͼƬ�ռ�����url�����url����Ӧ��ͼƬ����Ҫ���ڵ�ǰ�û���pic_path��imageֻ��Ҫ����һ��,�������������Ĭ��ѡ��pic_path
	 */
	private String picPath;

	/** 
	* ƽ�ʷ��á�ȡֵ��Χ:0.01-999999.00;��ȷ��2λС��;��λ:Ԫ����:5.07����ʾ:5Ԫ7��, ע:post_fee,express_fee,ems_fee��һ����д
	 */
	private String postFee;

	/** 
	* �����������˷�ģ��ID��ȡֵ��Χ�������ұ����Ǹ����ҵ��˷�ģ���ID����ͨ��taobao.postages.get��õ�ǰ�Ự�û��������ʷ�ģ�壩
	 */
	private Long postageId;

	/** 
	* ��Ʒ�۸�ȡֵ��Χ:0-100000000;��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֡���Ҫ����ȷ�ļ۸������ڡ�
	 */
	private String price;

	/** 
	* ��Ʒ�����Ĳ�ƷID(B�̼ҷ�����Ʒ��Ҫ��)
	 */
	private Long productId;

	/** 
	* ����ֵ��������pid:vid:����;pid1:vid1:����1�� pid:����id vid:ֵid���ܳ��Ȳ�����512�ֽ�
	 */
	private String propertyAlias;

	/** 
	* ��Ʒ�����б���ʽ:pid:vid;pid:vid�����Ե�pid����taobao.itemprops.getȡ�ã�����ֵ��vid��taobao.itempropvalues.getȡ��vid�� �������Ŀ����û�����ԣ����Բ�����д����������ԣ���ѡ���Ա�������Ǳ�ѡ���Կ���ѡ����д.���Բ��ܳ���35�ԡ��������Լ����������ָ�����ܳ���549�ֽڣ���������û�����ơ� ����������ǿ�����Ļ��������ֶ�input_str�������Ե�ֵ��
	 */
	private String props;

	/** 
	* �Ƿ��ŵ�˻�������!������Ʒ�������ô���!
	 */
	private Boolean sellPromise;

	/** 
	* ���¹�����Ʒ�������Ŀ���ṹ:",cid1,cid2,...,"�����������Ŀ���ڶ�����Ŀ�����봫������Ŀcids��
	 */
	private String sellerCids;

	/** 
	* Sku���ⲿid�����ṹ�磺1234,1342,�� sku_properties, sku_quantities, sku_prices, sku_outer_ids����������ʱҪһһ��Ӧ�����û��sku_outer_idsҲҪд����������������","(���������sku��ʾ�У�������Ӧ����sku������1)���ò�����󳤶���512���ֽ�
	 */
	private String skuOuterIds;

	/** 
	* ���µ�Sku�ļ۸񴮣��ṹ�磺10.00,5.00,�� ��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	private String skuPrices;

	/** 
	* ���µ�Sku�����Դ�������taobao.itemprops.get��ȡ��Ŀ���ԣ�����������������ԣ�����taobao.itempropvalues.getȡ��vid����ʽ:pid:vid;pid:vid�����ֶ��ڵ���������Ҳ��Ҫ��props�ֶ���д . ���������SKU���ھ���Ʒ�����޸ģ���������Sku���������ʱ�ж�Sku���в�������Sku��propertiesһ��Ҫ���롣
	 */
	private String skuProperties;

	/** 
	* ���µ�Sku�����������ṹ�磺num1,num2,num3 ��:2,3,4
	 */
	private String skuQuantities;

	/** 
	* ��Ʒ�¾ɳ̶ȡ���ѡֵ:new��ȫ�£�,unused�����ã�,second�����֣���
	 */
	private String stuffStatus;

	/** 
	* ��������. ���ܳ���60�ַ�,��Υ���ʿ���
	 */
	private String title;

	/** 
	* ��Ч�ڡ���ѡֵ:7,14;��λ:��;
	 */
	private Long validThru;

	/** 
	* ��Ʒ������(�̳�����ר���ֶ�)
	 */
	private Long weight;

	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}
	public Long getAfterSaleId() {
		return this.afterSaleId;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}
	public Long getAuctionPoint() {
		return this.auctionPoint;
	}

	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}
	public String getAutoFill() {
		return this.autoFill;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setCodPostageId(Long codPostageId) {
		this.codPostageId = codPostageId;
	}
	public Long getCodPostageId() {
		return this.codPostageId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}
	public String getEmsFee() {
		return this.emsFee;
	}

	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}
	public String getExpressFee() {
		return this.expressFee;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}
	public String getFreightPayer() {
		return this.freightPayer;
	}

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}

	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}
	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}

	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}
	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}

	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}
	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setIncrement(String increment) {
		this.increment = increment;
	}
	public String getIncrement() {
		return this.increment;
	}

	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}
	public String getInputPids() {
		return this.inputPids;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}
	public String getInputStr() {
		return this.inputStr;
	}

	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}
	public Boolean getIs3D() {
		return this.is3D;
	}

	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}
	public Boolean getIsEx() {
		return this.isEx;
	}

	public void setIsLightningConsignment(Boolean isLightningConsignment) {
		this.isLightningConsignment = isLightningConsignment;
	}
	public Boolean getIsLightningConsignment() {
		return this.isLightningConsignment;
	}

	public void setIsReplaceSku(Boolean isReplaceSku) {
		this.isReplaceSku = isReplaceSku;
	}
	public Boolean getIsReplaceSku() {
		return this.isReplaceSku;
	}

	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}
	public Boolean getIsTaobao() {
		return this.isTaobao;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLang() {
		return this.lang;
	}

	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}
	public Date getListTime() {
		return this.listTime;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLocationCity() {
		return this.locationCity;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public String getLocationState() {
		return this.locationState;
	}

	public void setNum(Long num) {
		this.num = num;
	}
	public Long getNum() {
		return this.num;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getPicPath() {
		return this.picPath;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}
	public String getPostFee() {
		return this.postFee;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
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

	public void setSellPromise(Boolean sellPromise) {
		this.sellPromise = sellPromise;
	}
	public Boolean getSellPromise() {
		return this.sellPromise;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}
	public String getSellerCids() {
		return this.sellerCids;
	}

	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}
	public String getSkuOuterIds() {
		return this.skuOuterIds;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}
	public String getSkuPrices() {
		return this.skuPrices;
	}

	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}
	public String getSkuProperties() {
		return this.skuProperties;
	}

	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}
	public String getSkuQuantities() {
		return this.skuQuantities;
	}

	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}
	public String getStuffStatus() {
		return this.stuffStatus;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setValidThru(Long validThru) {
		this.validThru = validThru;
	}
	public Long getValidThru() {
		return this.validThru;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getWeight() {
		return this.weight;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("after_sale_id", this.afterSaleId);
		txtParams.put("approve_status", this.approveStatus);
		txtParams.put("auction_point", this.auctionPoint);
		txtParams.put("auto_fill", this.autoFill);
		txtParams.put("cid", this.cid);
		txtParams.put("cod_postage_id", this.codPostageId);
		txtParams.put("desc", this.desc);
		txtParams.put("ems_fee", this.emsFee);
		txtParams.put("express_fee", this.expressFee);
		txtParams.put("freight_payer", this.freightPayer);
		txtParams.put("has_discount", this.hasDiscount);
		txtParams.put("has_invoice", this.hasInvoice);
		txtParams.put("has_showcase", this.hasShowcase);
		txtParams.put("has_warranty", this.hasWarranty);
		txtParams.put("increment", this.increment);
		txtParams.put("input_pids", this.inputPids);
		txtParams.put("input_str", this.inputStr);
		txtParams.put("is_3D", this.is3D);
		txtParams.put("is_ex", this.isEx);
		txtParams.put("is_lightning_consignment", this.isLightningConsignment);
		txtParams.put("is_replace_sku", this.isReplaceSku);
		txtParams.put("is_taobao", this.isTaobao);
		txtParams.put("lang", this.lang);
		txtParams.put("list_time", this.listTime);
		txtParams.put("location.city", this.locationCity);
		txtParams.put("location.state", this.locationState);
		txtParams.put("num", this.num);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("pic_path", this.picPath);
		txtParams.put("post_fee", this.postFee);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("price", this.price);
		txtParams.put("product_id", this.productId);
		txtParams.put("property_alias", this.propertyAlias);
		txtParams.put("props", this.props);
		txtParams.put("sell_promise", this.sellPromise);
		txtParams.put("seller_cids", this.sellerCids);
		txtParams.put("sku_outer_ids", this.skuOuterIds);
		txtParams.put("sku_prices", this.skuPrices);
		txtParams.put("sku_properties", this.skuProperties);
		txtParams.put("sku_quantities", this.skuQuantities);
		txtParams.put("stuff_status", this.stuffStatus);
		txtParams.put("title", this.title);
		txtParams.put("valid_thru", this.validThru);
		txtParams.put("weight", this.weight);
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

	public Class<ItemUpdateResponse> getResponseClass() {
		return ItemUpdateResponse.class;
	}
}
