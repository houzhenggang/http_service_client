package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-12-31 11:49:08.0
 */
public class Shop extends TaobaoObject {

	private static final long serialVersionUID = 1741715511153963991L;

	/**
	 * �ܳ�������������C���ҷ����ܳ�����������B���ҷ���0��ֻ��taobao.shop.remainshowcase.get���Է��أ�
	 */
	@ApiField("all_count")
	private Long allCount;

	/**
	 * ���̹���
	 */
	@ApiField("bulletin")
	private String bulletin;

	/**
	 * ������������Ŀ���
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ����ʱ�䡣��ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��������
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ����޸�ʱ�䡣��ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ����ַ���������·����������"http://logo.taobao.com/shop-logo"��ƴ�ӳɾ���·��
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * ʣ���������������C���ҷ������ڳ�����������B���ҷ���-1��ֻ��taobao.shop.remainshowcase.get���Է��أ�
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * ���̶�̬������Ϣ
	 */
	@ApiField("shop_score")
	private ShopScore shopScore;

	/**
	 * ���̱��
	 */
	@ApiField("sid")
	private Long sid;

	/**
	 * ���̱���
	 */
	@ApiField("title")
	private String title;

	/**
	 * ���õĳ�������������C���ҷ�����ʹ�õĳ�����������B���ҷ���-1��ֻ��taobao.shop.remainshowcase.get���Է��أ�
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Long getAllCount() {
		return this.allCount;
	}
	public void setAllCount(Long allCount) {
		this.allCount = allCount;
	}

	public String getBulletin() {
		return this.bulletin;
	}
	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public ShopScore getShopScore() {
		return this.shopScore;
	}
	public void setShopScore(ShopScore shopScore) {
		this.shopScore = shopScore;
	}

	public Long getSid() {
		return this.sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
