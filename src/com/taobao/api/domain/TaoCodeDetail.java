package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Դ�������
 *
 * @author auto create
 * @since 1.0, 2010-05-27 17:39:07.0
 */
public class TaoCodeDetail extends TaobaoObject {

	private static final long serialVersionUID = 4131895149353681458L;

	/**
	 * ��תURL����type=9ʱ����ֵ
	 */
	@ApiField("direct_url")
	private String directUrl;

	/**
	 * ����һ����Ŀ���
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * ��������ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * �����ؼ���
	 */
	@ApiField("item_keywords")
	private String itemKeywords;

	/**
	 * ����״̬��0,1��������-1������ɾ����-2�������¼ܣ�-3��С���¼ܣ�-4��С��ɾ����-5����δ�ϼܣ�-9��CC
	 */
	@ApiField("item_status")
	private Long itemStatus;

	/**
	 * �Դ����Ƿ���ڣ�true�����ڣ�false��δ���ڡ�
	 */
	@ApiField("overdue")
	private Boolean overdue;

	/**
	 * ������Ŀ���
	 */
	@ApiField("shop_category")
	private Long shopCategory;

	/**
	 * ���̱��
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * �Դ���״̬��0��ɾ���� 1�����ߣ� 2�����ߡ�
	 */
	@ApiField("status")
	private Long status;

	/**
	 * �Դ���
	 */
	@ApiField("tao_code")
	private String taoCode;

	/**
	 * �Դ������ͣ�1�������Դ��룬2�������Դ��룬9�������Դ��롣
	 */
	@ApiField("type")
	private Long type;

	public String getDirectUrl() {
		return this.directUrl;
	}
	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemKeywords() {
		return this.itemKeywords;
	}
	public void setItemKeywords(String itemKeywords) {
		this.itemKeywords = itemKeywords;
	}

	public Long getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(Long itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Boolean getOverdue() {
		return this.overdue;
	}
	public void setOverdue(Boolean overdue) {
		this.overdue = overdue;
	}

	public Long getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(Long shopCategory) {
		this.shopCategory = shopCategory;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTaoCode() {
		return this.taoCode;
	}
	public void setTaoCode(String taoCode) {
		this.taoCode = taoCode;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
