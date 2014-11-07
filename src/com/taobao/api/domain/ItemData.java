package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ۻ�����Ʒ����
 *
 * @author auto create
 * @since 1.0, 2011-06-24 13:21:06.0
 */
public class ItemData extends TaobaoObject {

	private static final long serialVersionUID = 6257441899681312926L;

	/**
	 * ��Ʒ�ľۻ���۸񣬵�λ��
	 */
	@ApiField("activity_price")
	private Long activityPrice;

	/**
	 * ��Ʒ��Ӧ���Ա���Ŀid
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ��Ʒ��Ӧ�ľۻ��������Ŀ
	 */
	@ApiField("child_category")
	private Long childCategory;

	/**
	 * ��Ʒ���ڳ���
	 */
	@ApiField("city")
	private String city;

	/**
	 * ��Ʒ�ĵ�ǰ���
	 */
	@ApiField("current_stock")
	private Long currentStock;

	/**
	 * ��Ʒ��Ӧ���ۿ� �ۻ����/ԭ��
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * �Ƿ����ռ�����µ�δ֧���Ķ�����
	 */
	@ApiField("exist_hold_stock")
	private Boolean existHoldStock;

	/**
	 * ��Ʒ��Ӧ����id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * ��Ʒ�Ƿ�Ϊ����״̬,����״̬����Ʒ����ʾΪ������
	 */
	@ApiField("is_lock")
	private Boolean isLock;

	/**
	 * ��Ʒ��Ӧ�ľۻ���������Ϣ
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * ����ۻ���֧�ֵ�6����������Ʒ�Ƿ�֧�֣�1֧�֣�0��֧��
��һλ����ʵ����
�ڶ�λ�������˻�
����λ����һ����
����λ���̳���Ʒ����
����λ���̳��ṩ��Ʊ
����λ���̳�7���˻�
	 */
	@ApiField("item_guarantee")
	private String itemGuarantee;

	/**
	 * ��Ʒ������id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ������Ʒ��״̬��AVAIL_BUY=���Թ���
WAIT_FOR_START=������ʼ
EXIST_HOLDER=��ռ��
NO_STOCK=������
OUT_OF_TIME=�Ź��ѽ���
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * ��Ʒ��Ӧ��URl
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * ��Ʒ�ĳ�����
	 */
	@ApiField("long_name")
	private String longName;

	/**
	 * ��Ʒ�����ʱ���ĺ���ֵ
	 */
	@ApiField("online_end_time")
	private Long onlineEndTime;

	/**
	 * ��Ʒ�ϼܿ�ʼʱ���ĺ���ֵ
	 */
	@ApiField("online_start_time")
	private Long onlineStartTime;

	/**
	 * ��Ʒ��ԭ�ۣ���λ��
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * ��Ʒ��Ӧ�ľۻ���һ����Ŀ
	 */
	@ApiField("parent_category")
	private Long parentCategory;

	/**
	 * ��Ʒ�Ƿ����
	 */
	@ApiField("pay_postage")
	private Boolean payPostage;

	/**
	 * ��Ʒ��Ӧ��ͼƬ��ַ
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ��Ӧ�Ľ�����ԭʼͼƬ��ַ
	 */
	@ApiField("pic_url_from_ic")
	private String picUrlFromIc;

	/**
	 * ��Ʒ��Ӧ��ƽ̨id��1001=�ۻ���
	 */
	@ApiField("platform_id")
	private Long platformId;

	/**
	 * ���Ҷ�Ӧ�����õȼ�
	 */
	@ApiField("seller_credit")
	private Long sellerCredit;

	/**
	 * ��Ʒ��Ӧ�������˻�id
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * ��Ʒ��Ӧ�������˻�nick
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ���ػ��������ķֵ���Ϣ
	 */
	@ApiListField("shop_position_list")
	@ApiField("shop_position_data")
	private List<ShopPositionData> shopPositionList;

	/**
	 * ��Ʒ��Ӧ�ĵ������ͣ����У��̳�
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * ��Ʒ������
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * �Ѳ��ŵ����������
	 */
	@ApiField("sold_count")
	private Long soldCount;

	public Long getActivityPrice() {
		return this.activityPrice;
	}
	public void setActivityPrice(Long activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getChildCategory() {
		return this.childCategory;
	}
	public void setChildCategory(Long childCategory) {
		this.childCategory = childCategory;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getCurrentStock() {
		return this.currentStock;
	}
	public void setCurrentStock(Long currentStock) {
		this.currentStock = currentStock;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Boolean getExistHoldStock() {
		return this.existHoldStock;
	}
	public void setExistHoldStock(Boolean existHoldStock) {
		this.existHoldStock = existHoldStock;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Boolean getIsLock() {
		return this.isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemGuarantee() {
		return this.itemGuarantee;
	}
	public void setItemGuarantee(String itemGuarantee) {
		this.itemGuarantee = itemGuarantee;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getLongName() {
		return this.longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}

	public Long getOnlineEndTime() {
		return this.onlineEndTime;
	}
	public void setOnlineEndTime(Long onlineEndTime) {
		this.onlineEndTime = onlineEndTime;
	}

	public Long getOnlineStartTime() {
		return this.onlineStartTime;
	}
	public void setOnlineStartTime(Long onlineStartTime) {
		this.onlineStartTime = onlineStartTime;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getParentCategory() {
		return this.parentCategory;
	}
	public void setParentCategory(Long parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Boolean getPayPostage() {
		return this.payPostage;
	}
	public void setPayPostage(Boolean payPostage) {
		this.payPostage = payPostage;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicUrlFromIc() {
		return this.picUrlFromIc;
	}
	public void setPicUrlFromIc(String picUrlFromIc) {
		this.picUrlFromIc = picUrlFromIc;
	}

	public Long getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}

	public Long getSellerCredit() {
		return this.sellerCredit;
	}
	public void setSellerCredit(Long sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public List<ShopPositionData> getShopPositionList() {
		return this.shopPositionList;
	}
	public void setShopPositionList(List<ShopPositionData> shopPositionList) {
		this.shopPositionList = shopPositionList;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Long getSoldCount() {
		return this.soldCount;
	}
	public void setSoldCount(Long soldCount) {
		this.soldCount = soldCount;
	}

}
