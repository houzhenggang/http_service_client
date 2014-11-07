package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ۻ���Ӧ�ã�չʾ���ػ���������Ʒ�ķֵ������Ϣ�Ķ���
 *
 * @author auto create
 * @since 1.0, 2011-01-05 14:19:49.0
 */
public class ShopPositionData extends TaobaoObject {

	private static final long serialVersionUID = 1277956588342587515L;

	/**
	 * ���̵ĵ�ַ
	 */
	@ApiField("address")
	private String address;

	/**
	 * ���ҵ������ڵĳ���
	 */
	@ApiField("city")
	private String city;

	/**
	 * �Ա���Ʒ������id����Ӧ����Ʒ�ߵ�һ����Ʒ�����ʶ
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ���ҵ��̵��ֻ���ϵ����
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * ���ҵ��˻�����id
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * ��ʶ��һ��Ψһ�ĵ�ַλ�ö��󣬾��ж���������ͽ�ͨ��Ϣ
	 */
	@ApiField("shop_position_id")
	private Long shopPositionId;

	/**
	 * �������̵�����
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * ���̵�һЩ��ͨ��ʾ��Ϣ
	 */
	@ApiField("traffic")
	private String traffic;

	/**
	 * �������ڵľ��ȣ��Ŵ�100000��
	 */
	@ApiField("x")
	private Long x;

	/**
	 * �������ڵ�γ�ȣ��Ŵ�100000��
	 */
	@ApiField("y")
	private Long y;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getShopPositionId() {
		return this.shopPositionId;
	}
	public void setShopPositionId(Long shopPositionId) {
		this.shopPositionId = shopPositionId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTraffic() {
		return this.traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public Long getX() {
		return this.x;
	}
	public void setX(Long x) {
		this.x = x;
	}

	public Long getY() {
		return this.y;
	}
	public void setY(Long y) {
		this.y = y;
	}

}
