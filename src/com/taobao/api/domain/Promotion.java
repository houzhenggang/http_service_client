package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ�Żݲ�������
 *
 * @author auto create
 * @since 1.0, 2011-06-29 16:32:21.0
 */
public class Promotion extends TaobaoObject {

	private static final long serialVersionUID = 3384514412981812129L;

	/**
	 * ���ۼ�����1ֻ��һ����0��ʾ���
	 */
	@ApiField("decrease_num")
	private Long decreaseNum;

	/**
	 * �Ż����ͣ�PRICE��ʾ���۸��Żݣ�DISCOUNT��ʾ���ۿ��Ż�
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * �Żݶ��
	 */
	@ApiField("discount_value")
	private String discountValue;

	/**
	 * �Żݽ�������
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * ��Ʒ����ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �Ż�����
	 */
	@ApiField("promotion_desc")
	private String promotionDesc;

	/**
	 * �Ż�ID
	 */
	@ApiField("promotion_id")
	private Long promotionId;

	/**
	 * �Żݱ��⣬��ʾ�ڱ�������ҳ����Ż�ͼ���tip��
	 */
	@ApiField("promotion_title")
	private String promotionTitle;

	/**
	 * �Żݿ�ʼ����
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * �Żݲ���״̬��ACTIVE��ʾ��Ч��UNACTIVE��ʾ��Ч
	 */
	@ApiField("status")
	private String status;

	/**
	 * ��Ӧ����Ⱥ��ǩID
	 */
	@ApiField("tag_id")
	private Long tagId;

	public Long getDecreaseNum() {
		return this.decreaseNum;
	}
	public void setDecreaseNum(Long decreaseNum) {
		this.decreaseNum = decreaseNum;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDiscountValue() {
		return this.discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPromotionDesc() {
		return this.promotionDesc;
	}
	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}

	public Long getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionTitle() {
		return this.promotionTitle;
	}
	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTagId() {
		return this.tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

}
