package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �Ի���Ʒ���ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-08 16:13:51.0
 */
public class TaohuaItem extends TaobaoObject {

	private static final long serialVersionUID = 2459565379315861171L;

	/**
	 * ����ͼ��������Ϣ
	 */
	@ApiField("author")
	private String author;

	/**
	 * ��Ʒ������Ϣ
	 */
	@ApiField("description")
	private String description;

	/**
	 * �����û�ϲ��ֵ
	 */
	@ApiField("favorite")
	private Long favorite;

	/**
	 * �ļ�����
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * Ҷ����Ŀ��ID
	 */
	@ApiField("leaf_cate_id")
	private Long leafCateId;

	/**
	 * Ҷ����Ŀ������
	 */
	@ApiField("leaf_cate_name")
	private String leafCateName;

	/**
	 * ��ƷͼƬ����
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ�۸�����
	 */
	@ApiField("price")
	private String price;

	/**
	 * ������������
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * ������Ʒ����������
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * ����ĿID
	 */
	@ApiField("root_cate_id")
	private Long rootCateId;

	/**
	 * ����Ŀ����
	 */
	@ApiField("root_cate_name")
	private String rootCateName;

	/**
	 * �ļ���С����λbyte
	 */
	@ApiField("size")
	private String size;

	/**
	 * ��δ�ϼ� never_put_shelves,
�ϼ�put_shelves,
С���¼�down_shevles,
ɾ��delete,
�û��¼�down_shevles_by_seller
	 */
	@ApiField("status_name")
	private String statusName;

	/**
	 * �Ի���Ʒ������ֵ�����ݽṹ
	 */
	@ApiListField("taohua_item_pv_pairs")
	@ApiField("taohua_item_p_v_pair")
	private List<TaohuaItemPVPair> taohuaItemPvPairs;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

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

	public Long getFavorite() {
		return this.favorite;
	}
	public void setFavorite(Long favorite) {
		this.favorite = favorite;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLeafCateId() {
		return this.leafCateId;
	}
	public void setLeafCateId(Long leafCateId) {
		this.leafCateId = leafCateId;
	}

	public String getLeafCateName() {
		return this.leafCateName;
	}
	public void setLeafCateName(String leafCateName) {
		this.leafCateName = leafCateName;
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

	public String getRootCateName() {
		return this.rootCateName;
	}
	public void setRootCateName(String rootCateName) {
		this.rootCateName = rootCateName;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public List<TaohuaItemPVPair> getTaohuaItemPvPairs() {
		return this.taohuaItemPvPairs;
	}
	public void setTaohuaItemPvPairs(List<TaohuaItemPVPair> taohuaItemPvPairs) {
		this.taohuaItemPvPairs = taohuaItemPvPairs;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
