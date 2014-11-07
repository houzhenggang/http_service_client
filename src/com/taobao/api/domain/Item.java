package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Item(��Ʒ)�ṹ
 *
 * @author auto create
 * @since 1.0, 2011-06-28 10:15:41.0
 */
public class Item extends TaobaoObject {

	private static final long serialVersionUID = 3778822945595161163L;

	/**
	 * �ۺ����ID,���ֶν���taobao.item.get�ӿ��з���
	 */
	@ApiField("after_sale_id")
	private Long afterSaleId;

	/**
	 * ��Ʒ�ϴ����״̬��onsale�����У�instock����
	 */
	@ApiField("approve_status")
	private String approveStatus;

	/**
	 * �������
	 */
	@ApiField("auction_point")
	private Long auctionPoint;

	/**
	 * ������Ʒ���͡�ֻ��������Ŀ�µ���Ʒ���Ա���ϴ��ֶΣ�������Щ��Ŀ�����ϴ�����ͨ��taobao.itemcat.features.get��á��ڴ�����Ʒ����Ŀ�£�������ʾ�������Ʒ���ͣ����������оͲ���ͨ������ѵ���صĽ����ˣ�����ѡ���ͣ�
time_card(�㿨�������)
fee_card(�����������)
	 */
	@ApiField("auto_fill")
	private String autoFill;

	/**
	 * ��Ʒ������Ҷ����Ŀ id
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ���������˷�ģ��ID
	 */
	@ApiField("cod_postage_id")
	private Long codPostageId;

	/**
	 * Item�ķ���ʱ�䣬Ŀǰ����taobao.item.add��taobao.item.get����
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �¼�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("delist_time")
	private Date delistTime;

	/**
	 * ��Ʒ����, ����Ҫ����5���ַ���С��25000���ַ�
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ��Ʒurl
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * ems����,��ʽ��5.00����λ��Ԫ����ȷ������
	 */
	@ApiField("ems_fee")
	private String emsFee;

	/**
	 * ��ݷ���,��ʽ��5.00����λ��Ԫ����ȷ������
	 */
	@ApiField("express_fee")
	private String expressFee;

	/**
	 * �˷ѳе���ʽ,seller�����ҳе�����buyer(��ҳе���
	 */
	@ApiField("freight_payer")
	private String freightPayer;

	/**
	 * ֧�ֻ�Ա����,true/false
	 */
	@ApiField("has_discount")
	private Boolean hasDiscount;

	/**
	 * �Ƿ��з�Ʊ,true/false
	 */
	@ApiField("has_invoice")
	private Boolean hasInvoice;

	/**
	 * �����Ƽ�,true/false
	 */
	@ApiField("has_showcase")
	private Boolean hasShowcase;

	/**
	 * �Ƿ��б���,true/false
	 */
	@ApiField("has_warranty")
	private Boolean hasWarranty;

	/**
	 * �Ӽ۷��ȡ����Ϊ0������ϵͳ������ȡ�
�ھ����У�Ϊ�˳�Խ��һ�����ۣ���Ա��Ҫ�ڵ�ǰ���������ӽ���������ǼӼ۷��ȡ������ڷ���������ʱ������Զ���Ӽ۷��ȣ�Ҳ������ϵͳ�Զ�����Ӽۡ�ϵͳ�Զ�����Ӽ۵ļӼ۷������ŵ�ǰ���۽������Ӷ����ӣ����ǽ����Աʹ��ϵͳ�Զ�����Ӽۣ���������ڳ���ǰ������Ӽ۷��ȵľ����������Ҫע���ǣ��˹���ֻ��������������Ʒ��
������ϵͳ�Զ�����Ӽ۷��ȱ�
��ǰ�ۣ��Ӽ۷��� ��
1-40�� 1 ����41-100�� 2 ����101-200��5 ����201-500 ��10����501-1001��15����001-2000��25����2001-5000��50����5001-10000��100��
10001����         200
	 */
	@ApiField("increment")
	private String increment;

	/**
	 * �û������������Ŀ����ID�����ṹ��"pid1,pid2,pid3"���磺"20000"����ʾƷ�ƣ� ע��ͨ��һ����Ŀ���û�������Ĺؼ����Բ�����1����
	 */
	@ApiField("input_pids")
	private String inputPids;

	/**
	 * �û������������������������ֵ���ṹ:"������ֵ;һ����������;һ��������ֵ;������������;�Զ�������ֵ,....",�磺���Ϳ�;�Ϳ�ϵ��;�Ʊ�ϵ��;�Ʊ�ϵ��;2K5����input_str��Ҫ��input_pidsһһ��Ӧ��ע��ͨ��һ����Ŀ���û�������Ĺؼ����Բ�����1�����������Ա������������ܳ��� 3999�ֽڡ�
	 */
	@ApiField("input_str")
	private String inputStr;

	/**
	 * �Ƿ���3D�Ա�����Ʒ
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * �Ƿ����ⲿ������ʾ
	 */
	@ApiField("is_ex")
	private Boolean isEx;

	/**
	 * �Ƿ�����Ʒ��0��������1��������2
	 */
	@ApiField("is_fenxiao")
	private Long isFenxiao;

	/**
	 * �Ƿ�24Сʱ���緢��
	 */
	@ApiField("is_lightning_consignment")
	private Boolean isLightningConsignment;

	/**
	 * ��Ʒ�Ƿ�Ϊ�����⸶
taobao.items.search��taobao.items.vip.searchר��
	 */
	@ApiField("is_prepay")
	private Boolean isPrepay;

	/**
	 * �Ƿ����Ա���ʾ
	 */
	@ApiField("is_taobao")
	private Boolean isTaobao;

	/**
	 * �Ƿ�ʱ�ϼ���Ʒ
	 */
	@ApiField("is_timing")
	private Boolean isTiming;

	/**
	 * ������Ʒ��״̬�ֶ�
	 */
	@ApiField("is_virtual")
	private Boolean isVirtual;

	/**
	 * ��ƷͼƬ�б�(������ͼ)��fields��ֻ����item_img���Է���ItemImg�ṹ���������ֶΣ��������Ϊitem_img.id��item_img.url��item_img.position����ʽ��ֻ�᷵����Ӧ���ֶ�
	 */
	@ApiListField("item_imgs")
	@ApiField("item_img")
	private List<ItemImg> itemImgs;

	/**
	 * �ϼ�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("list_time")
	private Date listTime;

	/**
	 * ��Ʒ���ڵ�
	 */
	@ApiField("location")
	private Location location;

	/**
	 * ��Ʒ�޸�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ��Ʒ����
	 */
	@ApiField("num")
	private Long num;

	/**
	 * ��Ʒ����id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �Ƿ���1վ��Ʒ
	 */
	@ApiField("one_station")
	private Boolean oneStation;

	/**
	 * �̼��ⲿ����(�����̼��ⲿϵͳ�Խ�)
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * ��Ʒ��ͼƬ��ַ
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ƽ�ʷ���,��ʽ��5.00����λ��Ԫ����ȷ������
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * �����������˷�ģ��ID�����û�з�����˵��û��ʹ���˷�ģ��
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * ��Ʒ�۸񣬸�ʽ��5.00����λ��Ԫ����ȷ������
	 */
	@ApiField("price")
	private String price;

	/**
	 * ����������Ʒ��id(����Ϊ��). ���ֶο���ͨ��taobao.products.search �õ�
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * �������ͣ����������,�ָ��ȡ����ֵ��
2����һ������4��7���������˻�����taobao.items.search��taobao.items.vip.searchר��
	 */
	@ApiField("promoted_service")
	private String promotedService;

	/**
	 * ��Ʒ����ͼƬ�б�fields��ֻ����prop_img���Է���PropImg�ṹ���������ֶΣ��������Ϊprop_img.id��prop_img.url��prop_img.properties��prop_img.position����ʽ��ֻ�᷵����Ӧ���ֶ�
	 */
	@ApiListField("prop_imgs")
	@ApiField("prop_img")
	private List<PropImg> propImgs;

	/**
	 * ����ֵ����
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * ��Ʒ���� ��ʽ��pid:vid;pid:vid
	 */
	@ApiField("props")
	private String props;

	/**
	 * ��Ʒ�������ơ���ʶ��props���������pid��vid����Ӧ�����ơ���ʽΪ��pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2����(<strong>ע��</strong><font color="red">���������е�ð��":"��ת��Ϊ��"#cln#";  
�ֺ�";"��ת��Ϊ��"#scln#"
</font>)
	 */
	@ApiField("props_name")
	private String propsName;

	/**
	 * ��Ʒ�������ҵ����õȼ�����1��ʾ1�ģ�2��ʾ2�ġ�����ֻ�е�����Ʒ����:taobao.items.get��taobao.items.search��ʱ����ܷ���
	 */
	@ApiField("score")
	private Long score;

	/**
	 * ��ɱ��Ʒ���͡�������ɱ��ǵ���Ʒ���û�ֻ���¼ܲ��������ϼܣ������κα༭��ɾ�����������ܽ��С�����û���ȡ����ɱ��ǣ���Ҫ��ϵС�����в����������ɱ������Ҫ���ɱ༭����ϵ������ˣ�С����ȥ����ɱ��ǡ���ѡ����
web_only(ֻ��ͨ��web������ɱ)
wap_only(ֻ��ͨ��wap������ɱ)
web_and_wap(����ͨ��web��ɱҲ��ͨ��wap��ɱ)
	 */
	@ApiField("second_kill")
	private String secondKill;

	/**
	 * �Ƿ��ŵ�˻�������!
	 */
	@ApiField("sell_promise")
	private Boolean sellPromise;

	/**
	 * ��Ʒ�����ĵ����������Զ�����Ŀ�б�
	 */
	@ApiField("seller_cids")
	private String sellerCids;

	/**
	 * <a href="http://open.taobao.com/dev/index.php/Sku">Sku</a>�б�fields��ֻ����sku���Է���Sku�ṹ���������ֶΣ��������Ϊsku.sku_id��sku.properties��sku.quantity����ʽ��ֻ�᷵����Ӧ���ֶ�
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;

	/**
	 * ��Ʒ�¾ɳ̶�(ȫ��:new������:unused�����֣�second)
	 */
	@ApiField("stuff_status")
	private String stuffStatus;

	/**
	 * ҳ��ģ��id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * ��Ʒ����,���ܳ���60�ֽ�
	 */
	@ApiField("title")
	private String title;

	/**
	 * ��Ʒ����(fixed:һ�ڼ�;auction:����)ע��ȡ���Ź�
	 */
	@ApiField("type")
	private String type;

	/**
	 * ��Ч��,7����14��Ĭ����14�죩
	 */
	@ApiField("valid_thru")
	private Long validThru;

	/**
	 * ��Ʒ��Ƶ�б�(Ŀǰֻ֧�ֵ�����Ƶ����)��fields��ֻ����video���Է���Video�ṹ���������ֶΣ��������Ϊvideo.id��video.video_id��
video.url����ʽ��ֻ�᷵����Ӧ���ֶ�
	 */
	@ApiListField("videos")
	@ApiField("video")
	private List<Video> videos;

	/**
	 * ��Ʒ�Ƿ�Υ�棬Υ�棺true , ��Υ�棺false
	 */
	@ApiField("violation")
	private Boolean violation;

	/**
	 * ��Ʒ30�콻������ֻ�е�����Ʒ����:taobao.items.get��taobao.items.search��ʱ����ܷ���
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * ����html��ǩ��desc�ı���Ϣ�����ֶ�ֻ��taobao.item.get�ӿ��з���
	 */
	@ApiField("wap_desc")
	private String wapDesc;

	/**
	 * �ʺ�wapӦ�õ���Ʒ����url �����ֶ�ֻ��taobao.item.get�ӿ��з���
	 */
	@ApiField("wap_detail_url")
	private String wapDetailUrl;

	/**
	 * ��Ʒ�������̼ҵ���������״����
taobao.items.search��taobao.items.vip.searchר��
	 */
	@ApiField("ww_status")
	private Boolean wwStatus;

	public Long getAfterSaleId() {
		return this.afterSaleId;
	}
	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Long getAuctionPoint() {
		return this.auctionPoint;
	}
	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getAutoFill() {
		return this.autoFill;
	}
	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCodPostageId() {
		return this.codPostageId;
	}
	public void setCodPostageId(Long codPostageId) {
		this.codPostageId = codPostageId;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDelistTime() {
		return this.delistTime;
	}
	public void setDelistTime(Date delistTime) {
		this.delistTime = delistTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getEmsFee() {
		return this.emsFee;
	}
	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public String getExpressFee() {
		return this.expressFee;
	}
	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}
	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}
	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getIncrement() {
		return this.increment;
	}
	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public String getInputPids() {
		return this.inputPids;
	}
	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public String getInputStr() {
		return this.inputStr;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Boolean getIsEx() {
		return this.isEx;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}

	public Long getIsFenxiao() {
		return this.isFenxiao;
	}
	public void setIsFenxiao(Long isFenxiao) {
		this.isFenxiao = isFenxiao;
	}

	public Boolean getIsLightningConsignment() {
		return this.isLightningConsignment;
	}
	public void setIsLightningConsignment(Boolean isLightningConsignment) {
		this.isLightningConsignment = isLightningConsignment;
	}

	public Boolean getIsPrepay() {
		return this.isPrepay;
	}
	public void setIsPrepay(Boolean isPrepay) {
		this.isPrepay = isPrepay;
	}

	public Boolean getIsTaobao() {
		return this.isTaobao;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}

	public Boolean getIsTiming() {
		return this.isTiming;
	}
	public void setIsTiming(Boolean isTiming) {
		this.isTiming = isTiming;
	}

	public Boolean getIsVirtual() {
		return this.isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public List<ItemImg> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<ItemImg> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public Date getListTime() {
		return this.listTime;
	}
	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Boolean getOneStation() {
		return this.oneStation;
	}
	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
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

	public String getPromotedService() {
		return this.promotedService;
	}
	public void setPromotedService(String promotedService) {
		this.promotedService = promotedService;
	}

	public List<PropImg> getPropImgs() {
		return this.propImgs;
	}
	public void setPropImgs(List<PropImg> propImgs) {
		this.propImgs = propImgs;
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

	public String getPropsName() {
		return this.propsName;
	}
	public void setPropsName(String propsName) {
		this.propsName = propsName;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSecondKill() {
		return this.secondKill;
	}
	public void setSecondKill(String secondKill) {
		this.secondKill = secondKill;
	}

	public Boolean getSellPromise() {
		return this.sellPromise;
	}
	public void setSellPromise(Boolean sellPromise) {
		this.sellPromise = sellPromise;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getValidThru() {
		return this.validThru;
	}
	public void setValidThru(Long validThru) {
		this.validThru = validThru;
	}

	public List<Video> getVideos() {
		return this.videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public Boolean getViolation() {
		return this.violation;
	}
	public void setViolation(Boolean violation) {
		this.violation = violation;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public String getWapDesc() {
		return this.wapDesc;
	}
	public void setWapDesc(String wapDesc) {
		this.wapDesc = wapDesc;
	}

	public String getWapDetailUrl() {
		return this.wapDetailUrl;
	}
	public void setWapDetailUrl(String wapDetailUrl) {
		this.wapDetailUrl = wapDetailUrl;
	}

	public Boolean getWwStatus() {
		return this.wwStatus;
	}
	public void setWwStatus(Boolean wwStatus) {
		this.wwStatus = wwStatus;
	}

}
