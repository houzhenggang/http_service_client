package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ���׽ṹ
 *
 * @author auto create
 * @since 1.0, 2011-05-20 15:12:10.0
 */
public class Trade extends TaobaoObject {

	private static final long serialVersionUID = 1143217388372219191L;

	/**
	 * �����ֹ���������ȷ��2λС������λ��Ԫ���磺200.07����ʾ��200Ԫ7��
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * ֧�������׺ţ��磺2009112081173831
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * �������׽ӿڳɹ��󣬷��ص�֧��url
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * �Ա��µ��ɹ���,������ĳ�ִ���֧��������û�д���ʱ���ص���Ϣ��taobao.trade.add�ӿ�ר��
	 */
	@ApiField("alipay_warn_msg")
	private String alipayWarnMsg;

	/**
	 * ������ʣ���ȷ���ջ���������������Ӷ���ȷ���ջ������ϼ��٣����׳ɹ�����Ϊ�㣩����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200 Ԫ7��
	 */
	@ApiField("available_confirm_fee")
	private String availableConfirmFee;

	/**
	 * ���֧�����˺�
	 */
	@ApiField("buyer_alipay_no")
	private String buyerAlipayNo;

	/**
	 * ��һ����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("buyer_cod_fee")
	private String buyerCodFee;

	/**
	 * ����ʼ���ַ
	 */
	@ApiField("buyer_email")
	private String buyerEmail;

	/**
	 * ��ұ�ע���ģ����Ա����϶�������ұ�ע���Ķ�Ӧ��ֻ����Ҳ��ܲ鿴���ֶΣ�
	 */
	@ApiField("buyer_flag")
	private Long buyerFlag;

	/**
	 * ��ұ�ע�����Ա����϶�������ұ�ע��Ӧ��ֻ����Ҳ��ܲ鿴���ֶΣ�
	 */
	@ApiField("buyer_memo")
	private String buyerMemo;

	/**
	 * �������
	 */
	@ApiField("buyer_message")
	private String buyerMessage;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ��һ�û���,����Ļ��֡���ʽ:100;��λ:��
	 */
	@ApiField("buyer_obtain_point_fee")
	private Long buyerObtainPointFee;

	/**
	 * ����Ƿ������ۡ���ѡֵ:true(������),false(δ����)
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * �����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("cod_fee")
	private String codFee;

	/**
	 * ������������״̬��
	 */
	@ApiField("cod_status")
	private String codStatus;

	/**
	 * ����Ӷ�𡣾�ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("commission_fee")
	private String commissionFee;

	/**
	 * ���ҷ���ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * ���״���ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ϵͳ�Żݽ�����ۣ�VIP�������͵ȣ�����ȷ��2λС������λ��Ԫ���磺200.07����ʾ��200Ԫ7��
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * ���׽���ʱ�䡣���׳ɹ�ʱ��(���½���״̬Ϊ�ɹ���ͬʱ����)/ȷ���ջ�ʱ����߽��׹ر�ʱ�� ����ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ��ݴ��տ��ȷ��2λС��;��λ:Ԫ����:212.07����ʾ:212Ԫ7��
	 */
	@ApiField("express_agency_fee")
	private String expressAgencyFee;

	/**
	 * �Ƿ�����ʷѡ���available_confirm_feeͬʱʹ�á���ѡֵ:true(����),false(������)
	 */
	@ApiField("has_post_fee")
	private Boolean hasPostFee;

	/**
	 * ��Ʒ�ַ������(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ��Ʊ̧ͷ
	 */
	@ApiField("invoice_name")
	private String invoiceName;

	/**
	 * �Ƿ���3D�Ա�����
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * �����޸�ʱ��(�û��Զ������κ��޸Ķ�����´��ֶ�)����ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ʒ����������ȡֵ��Χ�������������
	 */
	@ApiField("num")
	private Long num;

	/**
	 * ��Ʒ���ֱ��
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �����б�
	 */
	@ApiListField("orders")
	@ApiField("order")
	private List<Order> orders;

	/**
	 * ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * ��ƷͼƬ����;��
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * ���ʹ�û��֡���ʽ:100;��λ:��.
	 */
	@ApiField("point_fee")
	private Long pointFee;

	/**
	 * �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * ��Ʒ�۸񡣾�ȷ��2λС������λ��Ԫ���磺200.07����ʾ��200Ԫ7��
	 */
	@ApiField("price")
	private String price;

	/**
	 * ���״�����ϸ��Ϣ
	 */
	@ApiField("promotion")
	private String promotion;

	/**
	 * �Ż�����
	 */
	@ApiListField("promotion_details")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	/**
	 * ���ʵ��ʹ�û��֣��۳������˿�ʹ�õĻ��֣�����ʽ:100;��λ:��
	 */
	@ApiField("real_point_fee")
	private Long realPointFee;

	/**
	 * ����ʵ���յ���֧�������������Ӷ������Բ���ȷ���ջ���������������Ӷ�����ȷ���ջ����������ӣ����׳ɹ���������ʵ�����ȥ�˿������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("received_payment")
	private String receivedPayment;

	/**
	 * �ջ��˵���ϸ��ַ
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * �ջ��˵����ڳ���
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * �ջ��˵����ڵ���
	 */
	@ApiField("receiver_district")
	private String receiverDistrict;

	/**
	 * �ջ��˵��ֻ�����
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * �ջ��˵�����
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * �ջ��˵ĵ绰����
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * �ջ��˵�����ʡ��
	 */
	@ApiField("receiver_state")
	private String receiverState;

	/**
	 * �ջ��˵��ʱ�
	 */
	@ApiField("receiver_zip")
	private String receiverZip;

	/**
	 * ����֧�����˺�
	 */
	@ApiField("seller_alipay_no")
	private String sellerAlipayNo;

	/**
	 * ���һ����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("seller_cod_fee")
	private String sellerCodFee;

	/**
	 * �����ʼ���ַ
	 */
	@ApiField("seller_email")
	private String sellerEmail;

	/**
	 * ���ұ�ע���ģ����Ա����϶��������ұ�ע���Ķ�Ӧ��ֻ�����Ҳ��ܲ鿴���ֶΣ�
	 */
	@ApiField("seller_flag")
	private Long sellerFlag;

	/**
	 * ���ұ�ע�����Ա����϶��������ұ�ע��Ӧ��ֻ�����Ҳ��ܲ鿴���ֶΣ�
	 */
	@ApiField("seller_memo")
	private String sellerMemo;

	/**
	 * �����ֻ�
	 */
	@ApiField("seller_mobile")
	private String sellerMobile;

	/**
	 * ��������
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ���ҵ绰
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/**
	 * �����Ƿ������ۡ���ѡֵ:true(������),false(δ����)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * ��������ʱ��������ʽ���������ǰ��������ʽ�п��ܸı䣬��ϵͳ�������ֶ�һֱ���䣩����ѡֵ��ems, express, post, free, virtual��
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * ���׿�����ϸ��Ϣ
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * ���׿��յ�ַ
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * ����״̬����ѡֵ:
    * TRADE_NO_CREATE_PAY(û�д���֧��������)
    * WAIT_BUYER_PAY(�ȴ���Ҹ���)
    * WAIT_SELLER_SEND_GOODS(�ȴ����ҷ���,��:����Ѹ���)
    * WAIT_BUYER_CONFIRM_GOODS(�ȴ����ȷ���ջ�,��:�����ѷ���)
    * TRADE_BUYER_SIGNED(�����ǩ��,��������ר��)
    * TRADE_FINISHED(���׳ɹ�)
    * TRADE_CLOSED(�����Ժ��û��˿�ɹ��������Զ��ر�)
    * TRADE_CLOSED_BY_TAOBAO(������ǰ�����һ���������رս���)
	 */
	@ApiField("status")
	private String status;

	/**
	 * ���ױ�� (�������Ľ��ױ��)
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ��ʱ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss��ҵ�����
ǰ��������ֻ��������Ѹ�������ѷ���������²���Ч
����������˿��ô��ʱ�������Ӷ����ϣ�����˵3��ABC��A�����ˣ���ô���ص���BC���б�, ������������
���û��������˿��ô��ʱ������������ϣ�����ABC��������������ABC�ĳ�ʱ����������ͬ
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * ���ױ��⣬�Ե�������Ϊ�˱����ֵ��ע:taobao.trades.get�ӿڷ��ص�Trade�е�title����Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * ��Ʒ����Ʒ�۸�����������ܽ�����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * ������Դ��
WAP(�ֻ�);HITAO(����);TOP(TOPƽ̨);TAOBAO(��ͨ�Ա�);JHS(�ۻ���)
	 */
	@ApiField("trade_from")
	private String tradeFrom;

	/**
	 * ���ױ�ע��ͨ��taobao.trade.add�ӿڴ���
	 */
	@ApiField("trade_memo")
	private String tradeMemo;

	/**
	 * ���������б�ͬʱ��ѯ���ֽ������Ϳ��ö��ŷָ���Ĭ��ͬʱ��ѯguarantee_trade, auto_delivery, ec, cod��4�ֽ������͵����� 
��ѡֵ 
fixed(һ�ڼ�) 
auction(����) 
guarantee_trade(һ�ڼۡ�����) 
auto_delivery(�Զ�����) 
independent_simple_trade(�������Ű潻��) 
independent_shop_trade(�����׼�潻��) 
ec(ֱ��) 
cod(��������) 
fenxiao(����) 
game_equipment(��Ϸװ��) 
shopex_trade(ShopEX����) 
netcn_trade(��������) 
external_trade(ͳһ�ⲿ����)
	 */
	@ApiField("type")
	private String type;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAlipayWarnMsg() {
		return this.alipayWarnMsg;
	}
	public void setAlipayWarnMsg(String alipayWarnMsg) {
		this.alipayWarnMsg = alipayWarnMsg;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}
	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}
	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}
	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public Long getBuyerFlag() {
		return this.buyerFlag;
	}
	public void setBuyerFlag(Long buyerFlag) {
		this.buyerFlag = buyerFlag;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}
	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCodStatus() {
		return this.codStatus;
	}
	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}
	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public Boolean getHasPostFee() {
		return this.hasPostFee;
	}
	public void setHasPostFee(Boolean hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getInvoiceName() {
		return this.invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

	public List<Order> getOrders() {
		return this.orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Long getPointFee() {
		return this.pointFee;
	}
	public void setPointFee(Long pointFee) {
		this.pointFee = pointFee;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotion() {
		return this.promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public Long getRealPointFee() {
		return this.realPointFee;
	}
	public void setRealPointFee(Long realPointFee) {
		this.realPointFee = realPointFee;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}
	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverState() {
		return this.receiverState;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}
	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}
	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public Long getSellerFlag() {
		return this.sellerFlag;
	}
	public void setSellerFlag(Long sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}
	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeFrom() {
		return this.tradeFrom;
	}
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
