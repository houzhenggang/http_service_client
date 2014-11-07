package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���̶�̬������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-08-19 15:33:10.0
 */
public class ShopScore extends TaobaoObject {

	private static final long serialVersionUID = 1187698425681195562L;

	/**
	 * �����ٶ�����
	 */
	@ApiField("delivery_score")
	private String deliveryScore;

	/**
	 * ��Ʒ��������
	 */
	@ApiField("item_score")
	private String itemScore;

	/**
	 * ����̬������
	 */
	@ApiField("service_score")
	private String serviceScore;

	public String getDeliveryScore() {
		return this.deliveryScore;
	}
	public void setDeliveryScore(String deliveryScore) {
		this.deliveryScore = deliveryScore;
	}

	public String getItemScore() {
		return this.itemScore;
	}
	public void setItemScore(String itemScore) {
		this.itemScore = itemScore;
	}

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

}
