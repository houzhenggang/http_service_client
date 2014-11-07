package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �˷�ģ��ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 14:47:20.0
 */
public class Postage extends TaobaoObject {

	private static final long serialVersionUID = 5385245746939578946L;

	/**
	 * ��������
	 */
	@ApiField("created")
	private Date created;

	/**
	 * EMS�Ӽ�����
	 */
	@ApiField("ems_increase")
	private String emsIncrease;

	/**
	 * EMS�շ�
	 */
	@ApiField("ems_price")
	private String emsPrice;

	/**
	 * ��ݼӼ�����
	 */
	@ApiField("express_increase")
	private String expressIncrease;

	/**
	 * ����շ�
	 */
	@ApiField("express_price")
	private String expressPrice;

	/**
	 * ��ע
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * ����޸�����
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �˷�ģ������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ƽ�ʼӼ��շ�
	 */
	@ApiField("post_increase")
	private String postIncrease;

	/**
	 * ƽ���շ�
	 */
	@ApiField("post_price")
	private String postPrice;

	/**
	 * �˷�ģ��ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * �˷ѷ�ʽģ���շѷ�ʽ�������Ҫ��ȡ�ʷ���ģ���������ݣ�������Ϊpostage_mode.id,postage_mode.type,postage_mode.dests,postage_mode.price����ʽ
	 */
	@ApiListField("postage_modes")
	@ApiField("postage_mode")
	private List<PostageMode> postageModes;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmsIncrease() {
		return this.emsIncrease;
	}
	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}

	public String getEmsPrice() {
		return this.emsPrice;
	}
	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}

	public String getExpressIncrease() {
		return this.expressIncrease;
	}
	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}

	public String getExpressPrice() {
		return this.expressPrice;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPostIncrease() {
		return this.postIncrease;
	}
	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}

	public String getPostPrice() {
		return this.postPrice;
	}
	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public List<PostageMode> getPostageModes() {
		return this.postageModes;
	}
	public void setPostageModes(List<PostageMode> postageModes) {
		this.postageModes = postageModes;
	}

}
