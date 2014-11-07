package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ƽ���
 *
 * @author auto create
 * @since 1.0, 2010-12-28 08:59:34.0
 */
public class RecommendWord extends TaobaoObject {

	private static final long serialVersionUID = 3258593847633188589L;

	/**
	 * ƽ���۸�
	 */
	@ApiField("average_price")
	private String averagePrice;

	/**
	 * ��ض�
	 */
	@ApiField("pertinence")
	private String pertinence;

	/**
	 * ������
	 */
	@ApiField("pv")
	private String pv;

	/**
	 * �Ƽ��Ĺؼ���
	 */
	@ApiField("word")
	private String word;

	public String getAveragePrice() {
		return this.averagePrice;
	}
	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getPertinence() {
		return this.pertinence;
	}
	public void setPertinence(String pertinence) {
		this.pertinence = pertinence;
	}

	public String getPv() {
		return this.pv;
	}
	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getWord() {
		return this.word;
	}
	public void setWord(String word) {
		this.word = word;
	}

}
