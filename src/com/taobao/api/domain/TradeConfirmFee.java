package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ȷ���ջ����ýṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-21 21:30:00.0
 */
public class TradeConfirmFee extends TaobaoObject {

	private static final long serialVersionUID = 3151321776272972817L;

	/**
	 * ȷ���ջ��Ľ��(�������ʷ�)����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("confirm_fee")
	private String confirmFee;

	/**
	 * ��ȷ���ջ����ʷѣ����������һ���ջ�����û���ʷ�ʱ��0.00����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("confirm_post_fee")
	private String confirmPostFee;

	/**
	 * �Ƿ������һ�ʶ�����ֻ���Ӷ�����Ч���������Ӷ������ǽ������ʱ������true������false��
	 */
	@ApiField("is_last_order")
	private Boolean isLastOrder;

	public String getConfirmFee() {
		return this.confirmFee;
	}
	public void setConfirmFee(String confirmFee) {
		this.confirmFee = confirmFee;
	}

	public String getConfirmPostFee() {
		return this.confirmPostFee;
	}
	public void setConfirmPostFee(String confirmPostFee) {
		this.confirmPostFee = confirmPostFee;
	}

	public Boolean getIsLastOrder() {
		return this.isLastOrder;
	}
	public void setIsLastOrder(Boolean isLastOrder) {
		this.isLastOrder = isLastOrder;
	}

}
