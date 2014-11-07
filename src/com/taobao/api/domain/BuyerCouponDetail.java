package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ҳ����Ż�ȯ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:17:42.0
 */
public class BuyerCouponDetail extends TaobaoObject {

	private static final long serialVersionUID = 7816589541261978537L;

	/**
	 * �Ż�ȯʹ�����������������ٷֲ���������Ż�ȯ��501������501����ʹ�á�ע�⣺���ص��ǡ��֡������ǡ�Ԫ��
	 */
	@ApiField("condition")
	private Long condition;

	/**
	 * �Ż�ȯ���
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	/**
	 * �Ż�ȯ����ֵ�����ص��ǡ��֡������ǡ�Ԫ����500����500���൱��5Ԫ
	 */
	@ApiField("denomination")
	private Long denomination;

	/**
	 * �Ż�ȯ��Ч��
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ��ת��״̬�£��յ��Ż�ȯ���Ա��ǳ�
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * �Ż�ȯ��Դ�����һ������˵��Ա��ǳ�
	 */
	@ApiField("source")
	private String source;

	/**
	 * unused��δʹ�ã�using��ʹ����,used,�Ѿ�ʹ�ã�overdue���Ѿ����ڣ�transfered���Ѿ�ת��
	 */
	@ApiField("status")
	private String status;

	public Long getCondition() {
		return this.condition;
	}
	public void setCondition(Long condition) {
		this.condition = condition;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

	public Long getDenomination() {
		return this.denomination;
	}
	public void setDenomination(Long denomination) {
		this.denomination = denomination;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
