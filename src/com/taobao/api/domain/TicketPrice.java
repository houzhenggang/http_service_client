package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Ʊ����ϸ���ݣ�����Ʊ�ۣ�������ȼ�ͣ�
 *
 * @author auto create
 * @since 1.0, 2010-11-19 18:08:38.0
 */
public class TicketPrice extends TaobaoObject {

	private static final long serialVersionUID = 5264891567577755515L;

	/**
	 * ��������� �Է�Ϊ��λ
	 */
	@ApiField("build_price")
	private Long buildPrice;

	/**
	 * ȼ�͸���˰���Է�Ϊ��λ
	 */
	@ApiField("oil_price")
	private Long oilPrice;

	/**
	 * ��Ʊ�۸� �Է�Ϊ��λ
	 */
	@ApiField("tkt_price")
	private Long tktPrice;

	/**
	 * 0:���˼�,1:��ͯ��
	 */
	@ApiField("type")
	private Long type;

	public Long getBuildPrice() {
		return this.buildPrice;
	}
	public void setBuildPrice(Long buildPrice) {
		this.buildPrice = buildPrice;
	}

	public Long getOilPrice() {
		return this.oilPrice;
	}
	public void setOilPrice(Long oilPrice) {
		this.oilPrice = oilPrice;
	}

	public Long getTktPrice() {
		return this.tktPrice;
	}
	public void setTktPrice(Long tktPrice) {
		this.tktPrice = tktPrice;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
