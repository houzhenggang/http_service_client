package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ۿ���Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-17 14:17:53.0
 */
public class Discount extends TaobaoObject {

	private static final long serialVersionUID = 1824815848313727865L;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �ۿ�����
	 */
	@ApiListField("details")
	@ApiField("discount_detail")
	private List<DiscountDetail> details;

	/**
	 * �ۿ�ID
	 */
	@ApiField("discount_id")
	private Long discountId;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �ۿ�����
	 */
	@ApiField("name")
	private String name;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public List<DiscountDetail> getDetails() {
		return this.details;
	}
	public void setDetails(List<DiscountDetail> details) {
		this.details = details;
	}

	public Long getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
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

}
