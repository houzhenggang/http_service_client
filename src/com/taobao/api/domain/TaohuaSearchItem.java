package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի�������Ʒ�������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-08 16:14:06.0
 */
public class TaohuaSearchItem extends TaobaoObject {

	private static final long serialVersionUID = 6231649167496965414L;

	/**
	 * ����ͼ������
	 */
	@ApiField("author")
	private String author;

	/**
	 * ��Ʒ������Ϣ
	 */
	@ApiField("description")
	private String description;

	/**
	 * �ĵ���ҳ��
	 */
	@ApiField("doc_pages")
	private Long docPages;

	/**
	 * �����û���ĳһ��Ʒ��ϲ���̶ȣ�ֵԽ�����ʾԽϲ��
	 */
	@ApiField("favorite")
	private Long favorite;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ��ƷͼƬ����
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ�۸񣬵�λ����
	 */
	@ApiField("price")
	private String price;

	/**
	 * ����ͼ���������
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * ������Ʒ�ĳ�������Ϣ
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * ����ĿID
	 */
	@ApiField("root_cate_id")
	private Long rootCateId;

	/**
	 * ����
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * �Ի����ҵı�ţ�ע�⣺�����Ա���Ա�ı�š�
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * ���ҵ��Ա�nick
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ��Ʒ������������
	 */
	@ApiField("shop_title")
	private String shopTitle;

	/**
	 * �ļ���С����λ:byte
	 */
	@ApiField("size")
	private String size;

	/**
	 * �ĵ���׺��
	 */
	@ApiField("suffix")
	private String suffix;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * ������Ŀ������
	 */
	@ApiField("two_level_name")
	private String twoLevelName;

	/**
	 * �����
	 */
	@ApiField("view_count")
	private Long viewCount;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDocPages() {
		return this.docPages;
	}
	public void setDocPages(Long docPages) {
		this.docPages = docPages;
	}

	public Long getFavorite() {
		return this.favorite;
	}
	public void setFavorite(Long favorite) {
		this.favorite = favorite;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

	public String getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Long getRootCateId() {
		return this.rootCateId;
	}
	public void setRootCateId(Long rootCateId) {
		this.rootCateId = rootCateId;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
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

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getSuffix() {
		return this.suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTwoLevelName() {
		return this.twoLevelName;
	}
	public void setTwoLevelName(String twoLevelName) {
		this.twoLevelName = twoLevelName;
	}

	public Long getViewCount() {
		return this.viewCount;
	}
	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

}
