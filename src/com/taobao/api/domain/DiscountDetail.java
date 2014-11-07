package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ۿ�������Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 11:12:21.0
 */
public class DiscountDetail extends TaobaoObject {

	private static final long serialVersionUID = 7688152997875599664L;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �ۿ�����ID
	 */
	@ApiField("detail_id")
	private Long detailId;

	/**
	 * �Żݷ�ʽ:PERCENT�����ۿ��Żݣ���PRICE���������Żݣ�
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * �Żݱ��ʻ����Żݼ۸� 10%��10
	 */
	@ApiField("discount_value")
	private Long discountValue;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ա�ȼ���id���߷�����id
	 */
	@ApiField("target_id")
	private Long targetId;

	/**
	 * �ȼ����ƻ��߷���������
	 */
	@ApiField("target_name")
	private String targetName;

	/**
	 * �ۿ�����:GRADE������Ա�ȼ��Żݣ���DISTRIBUTOR�����������Żݣ�
	 */
	@ApiField("target_type")
	private String targetType;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDetailId() {
		return this.detailId;
	}
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Long getDiscountValue() {
		return this.discountValue;
	}
	public void setDiscountValue(Long discountValue) {
		this.discountValue = discountValue;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getTargetId() {
		return this.targetId;
	}
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}

	public String getTargetName() {
		return this.targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
