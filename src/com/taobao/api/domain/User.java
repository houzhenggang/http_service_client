package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �û�
 *
 * @author auto create
 * @since 1.0, 2011-06-30 11:45:44.0
 */
public class User extends TaobaoObject {

	private static final long serialVersionUID = 6313654949615191133L;

	/**
	 * ֧�����˻�
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * ���ް󶨡���ѡֵ:bind(��),notbind(δ��)
	 */
	@ApiField("alipay_bind")
	private String alipayBind;

	/**
	 * ֧����ID
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * �Ƿ������ơ���ѡֵ:limited(������),unlimited(������)
	 */
	@ApiField("auto_repost")
	private String autoRepost;

	/**
	 * ����ͷ���ַ
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * ����
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * �������
	 */
	@ApiField("buyer_credit")
	private UserCredit buyerCredit;

	/**
	 * �Ƿ�μ�����
	 */
	@ApiField("consumer_protection")
	private Boolean consumerProtection;

	/**
	 * �û�ע��ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��ϵ��email
	 */
	@ApiField("email")
	private String email;

	/**
	 * �Ƿ����ͼ���񡣿�ѡֵ:true(��),false(��)
	 */
	@ApiField("has_more_pic")
	private Boolean hasMorePic;

	/**
	 * �û���Ϊ�����Ƿ񿪹���
	 */
	@ApiField("has_shop")
	private Boolean hasShop;

	/**
	 * �Ƿ�24Сʱ���緢��(ʵ����)
	 */
	@ApiField("is_lightning_consignment")
	private Boolean isLightningConsignment;

	/**
	 * ���ϴ���ƷͼƬ����
	 */
	@ApiField("item_img_num")
	private Long itemImgNum;

	/**
	 * ������ƷͼƬ�������(��Ʒ��ͼ��С)����λ:k
	 */
	@ApiField("item_img_size")
	private Long itemImgSize;

	/**
	 * �����½ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_visit")
	private Date lastVisit;

	/**
	 * �Ƿ���������Ʒ�û���true or  false
	 */
	@ApiField("liangpin")
	private Boolean liangpin;

	/**
	 * �û���ǰ��ס�ع�����Ϣ���磺location.city��ȡ���е�city����
	 */
	@ApiField("location")
	private Location location;

	/**
	 * �Ƿ������Ա�������־
	 */
	@ApiField("magazine_subscribe")
	private Boolean magazineSubscribe;

	/**
	 * �û��ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �û��Ƿ�Ϊ�����û���������˽��Ϣ����Ҫ��½���ܲ鿴�Լ��ġ�
Ŀǰ����taobao.user.getʹ��
	 */
	@ApiField("online_gaming")
	private Boolean onlineGaming;

	/**
	 * ����ʵ����֤����ѡֵ:authentication(ʵ����֤),not authentication(û����֤)
	 */
	@ApiField("promoted_type")
	private String promotedType;

	/**
	 * ���ϴ�����ͼƬ����
	 */
	@ApiField("prop_img_num")
	private Long propImgNum;

	/**
	 * ������������ͼƬ�������������ͼ����ƷͼƬ����Ʒ����ͼƬ������λ:k
	 */
	@ApiField("prop_img_size")
	private Long propImgSize;

	/**
	 * ��������
	 */
	@ApiField("seller_credit")
	private UserCredit sellerCredit;

	/**
	 * �Ա𡣿�ѡֵ:m(��),f(Ů)
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * �����Ƿ�ǩ��ʳƷ���ҳ�ŵЭ��
	 */
	@ApiField("sign_food_seller_promise")
	private Boolean signFoodSellerPromise;

	/**
	 * ״̬����ѡֵ:normal(����),inactive(δ����),delete(ɾ��),reeze(����),supervise(���)
	 */
	@ApiField("status")
	private String status;

	/**
	 * �û����͡���ѡֵ:B(B�̼�),C(C�̼�)
	 */
	@ApiField("type")
	private String type;

	/**
	 * �û��ַ���ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * �û�����ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * �û����봹ֱ�г����͡�shoes��ʾЬ�Ǵ�ֱ�г��û���3C��ʾ3C��ֱ�г��û����������֮����","�ָ����磺һ���û�����3C�û�����Ь���û�����ô����ֶη��ؾ���"3C,shoes"������û����Ǵ�ֱ�г��û������ֶη���Ϊ""��
	 */
	@ApiField("vertical_market")
	private String verticalMarket;

	/**
	 * �û���ȫվvip��Ϣ����ȡֵ���£�c(��ͨ��Ա),asso_vip(������Ա), exp_vip1,exp_vip2,exp_vip3,exp_vip4(�ĸ��ȼ�������vip��Ա), vip1,vip2,vip3,vip4(�ĸ��ȼ�����ʽvip��Ա)����10��ȡֵ������asso_vip����vip��Ա˥�˶��ɣ�����վ�ϵ�׼vip��Ӧ������vip��Ա��������ͨ��Ա��׼vip��Ա��
	 */
	@ApiField("vip_info")
	private String vipInfo;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayBind() {
		return this.alipayBind;
	}
	public void setAlipayBind(String alipayBind) {
		this.alipayBind = alipayBind;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAutoRepost() {
		return this.autoRepost;
	}
	public void setAutoRepost(String autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public UserCredit getBuyerCredit() {
		return this.buyerCredit;
	}
	public void setBuyerCredit(UserCredit buyerCredit) {
		this.buyerCredit = buyerCredit;
	}

	public Boolean getConsumerProtection() {
		return this.consumerProtection;
	}
	public void setConsumerProtection(Boolean consumerProtection) {
		this.consumerProtection = consumerProtection;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHasMorePic() {
		return this.hasMorePic;
	}
	public void setHasMorePic(Boolean hasMorePic) {
		this.hasMorePic = hasMorePic;
	}

	public Boolean getHasShop() {
		return this.hasShop;
	}
	public void setHasShop(Boolean hasShop) {
		this.hasShop = hasShop;
	}

	public Boolean getIsLightningConsignment() {
		return this.isLightningConsignment;
	}
	public void setIsLightningConsignment(Boolean isLightningConsignment) {
		this.isLightningConsignment = isLightningConsignment;
	}

	public Long getItemImgNum() {
		return this.itemImgNum;
	}
	public void setItemImgNum(Long itemImgNum) {
		this.itemImgNum = itemImgNum;
	}

	public Long getItemImgSize() {
		return this.itemImgSize;
	}
	public void setItemImgSize(Long itemImgSize) {
		this.itemImgSize = itemImgSize;
	}

	public Date getLastVisit() {
		return this.lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}

	public Boolean getLiangpin() {
		return this.liangpin;
	}
	public void setLiangpin(Boolean liangpin) {
		this.liangpin = liangpin;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getMagazineSubscribe() {
		return this.magazineSubscribe;
	}
	public void setMagazineSubscribe(Boolean magazineSubscribe) {
		this.magazineSubscribe = magazineSubscribe;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Boolean getOnlineGaming() {
		return this.onlineGaming;
	}
	public void setOnlineGaming(Boolean onlineGaming) {
		this.onlineGaming = onlineGaming;
	}

	public String getPromotedType() {
		return this.promotedType;
	}
	public void setPromotedType(String promotedType) {
		this.promotedType = promotedType;
	}

	public Long getPropImgNum() {
		return this.propImgNum;
	}
	public void setPropImgNum(Long propImgNum) {
		this.propImgNum = propImgNum;
	}

	public Long getPropImgSize() {
		return this.propImgSize;
	}
	public void setPropImgSize(Long propImgSize) {
		this.propImgSize = propImgSize;
	}

	public UserCredit getSellerCredit() {
		return this.sellerCredit;
	}
	public void setSellerCredit(UserCredit sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getSignFoodSellerPromise() {
		return this.signFoodSellerPromise;
	}
	public void setSignFoodSellerPromise(Boolean signFoodSellerPromise) {
		this.signFoodSellerPromise = signFoodSellerPromise;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getVerticalMarket() {
		return this.verticalMarket;
	}
	public void setVerticalMarket(String verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

	public String getVipInfo() {
		return this.vipInfo;
	}
	public void setVipInfo(String vipInfo) {
		this.vipInfo = vipInfo;
	}

}
