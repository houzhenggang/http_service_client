package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի������������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-08 16:14:15.0
 */
public class TaohuaOrder extends TaobaoObject {

	private static final long serialVersionUID = 2482511587378316744L;

	/**
	 * ��ƷID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����޸�ʱ��
	 */
	@ApiField("modified")
	private String modified;

	/**
	 * �������
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 1��wait_pay:�ȴ���Ҹ��
2��timeout_close: ϵͳ��ʱ�رա� ��
3��pay_suc:���׳ɹ���������������
4��uncreate_trade:û�д����ⲿ���ף�֧�������ף����� ����           
 ����������
5��micropay_trade_close: ���ױ��Ա�΢֧���رա��� ����           ��������������6��alipay_trade_close:���ױ�֧�����رա��� ����
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * ��ƷͼƬ����
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ��Ʒ�۸�
	 */
	@ApiField("price")
	private String price;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getModified() {
		return this.modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
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

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
