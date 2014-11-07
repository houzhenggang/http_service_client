package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ʻ������ݶ���
 *
 * @author auto create
 * @since 1.0, 2011-07-07 17:34:24.0
 */
public class INRecordBase extends TaobaoObject {

	private static final long serialVersionUID = 5148516646612327257L;

	/**
	 * ������Ŀ��ƽ������۸�
	 */
	@ApiField("avg_price")
	private Long avgPrice;

	/**
	 * ������Ŀ�µ����
	 */
	@ApiField("click")
	private Long click;

	/**
	 * ������Ŀ�¾���������(����δչ�ֿͻ�)
	 */
	@ApiField("competition")
	private Long competition;

	/**
	 * ʱ���
	 */
	@ApiField("date")
	private Date date;

	/**
	 * ������Ŀ��չ����
	 */
	@ApiField("pv")
	private Long pv;

	public Long getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(Long avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Long getClick() {
		return this.click;
	}
	public void setClick(Long click) {
		this.click = click;
	}

	public Long getCompetition() {
		return this.competition;
	}
	public void setCompetition(Long competition) {
		this.competition = competition;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Long getPv() {
		return this.pv;
	}
	public void setPv(Long pv) {
		this.pv = pv;
	}

}
