package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��װ�˾���Ľ�Ʒ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-10-15 10:36:48.0
 */
public class AwardOnline extends TaobaoObject {

	private static final long serialVersionUID = 4823337125925383224L;

	/**
	 * ��Ʒ������
	 */
	@ApiField("award_name")
	private String awardName;

	/**
	 * ��ƷͼƬ��url
	 */
	@ApiField("award_pic_url")
	private String awardPicUrl;

	/**
	 * ��Ʒ��ԭ��
	 */
	@ApiField("award_price")
	private String awardPrice;

	/**
	 * ������Ŀ��id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * �ڽ����ߵ�detailUrl
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * ʣ������
	 */
	@ApiField("left_count")
	private Long leftCount;

	/**
	 * �ϼܵ�������
	 */
	@ApiField("online_count")
	private Long onlineCount;

	/**
	 * ����ʱ�䣬��ȷ����
	 */
	@ApiField("online_ec_end")
	private Date onlineEcEnd;

	/**
	 * ���Զһ���ʱ��Ρ�
	 */
	@ApiField("online_ec_range")
	private String onlineEcRange;

	/**
	 * ��ʼ���ڣ���ȷ���յġ�
	 */
	@ApiField("online_ec_start")
	private Date onlineEcStart;

	/**
	 * ��Ʒ������id�����ڷ����콱����
	 */
	@ApiField("online_id")
	private Long onlineId;

	public String getAwardName() {
		return this.awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getAwardPicUrl() {
		return this.awardPicUrl;
	}
	public void setAwardPicUrl(String awardPicUrl) {
		this.awardPicUrl = awardPicUrl;
	}

	public String getAwardPrice() {
		return this.awardPrice;
	}
	public void setAwardPrice(String awardPrice) {
		this.awardPrice = awardPrice;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public Long getLeftCount() {
		return this.leftCount;
	}
	public void setLeftCount(Long leftCount) {
		this.leftCount = leftCount;
	}

	public Long getOnlineCount() {
		return this.onlineCount;
	}
	public void setOnlineCount(Long onlineCount) {
		this.onlineCount = onlineCount;
	}

	public Date getOnlineEcEnd() {
		return this.onlineEcEnd;
	}
	public void setOnlineEcEnd(Date onlineEcEnd) {
		this.onlineEcEnd = onlineEcEnd;
	}

	public String getOnlineEcRange() {
		return this.onlineEcRange;
	}
	public void setOnlineEcRange(String onlineEcRange) {
		this.onlineEcRange = onlineEcRange;
	}

	public Date getOnlineEcStart() {
		return this.onlineEcStart;
	}
	public void setOnlineEcStart(Date onlineEcStart) {
		this.onlineEcStart = onlineEcStart;
	}

	public Long getOnlineId() {
		return this.onlineId;
	}
	public void setOnlineId(Long onlineId) {
		this.onlineId = onlineId;
	}

}
