package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ����������ϵ
 *
 * @author auto create
 * @since 1.0, 2011-06-08 15:32:42.0
 */
public class Cooperation extends TaobaoObject {

	private static final long serialVersionUID = 6418893627535741996L;

	/**
	 * ��Ӧ����Ȩ��֧����ʽ��ALIPAY(֧����)��OFFPREPAY(Ԥ����)��OFFTRANSFER(ת��)��OFFSETTLEMENT(���ڽ���)
	 */
	@ApiListField("auth_payway")
	@ApiField("string")
	private List<String> authPayway;

	/**
	 * ������ϵID
	 */
	@ApiField("cooperate_id")
	private Long cooperateId;

	/**
	 * ������ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * ������nick
	 */
	@ApiField("distributor_nick")
	private String distributorNick;

	/**
	 * ������ֹʱ��
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * �ȼ�ID
	 */
	@ApiField("grade_id")
	private Long gradeId;

	/**
	 * ��Ȩ��Ʒ��
	 */
	@ApiField("product_line")
	private String productLine;

	/**
	 * ������ʼʱ��
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * NORMAL END ENDING
	 */
	@ApiField("status")
	private String status;

	/**
	 * ��Ӧ��ID
	 */
	@ApiField("supplier_id")
	private Long supplierId;

	/**
	 * ��Ӧ��NICK
	 */
	@ApiField("supplier_nick")
	private String supplierNick;

	/**
	 * ������ʽ�� AGENT(����) ��DEALER(����)
	 */
	@ApiField("trade_type")
	private String tradeType;

	public List<String> getAuthPayway() {
		return this.authPayway;
	}
	public void setAuthPayway(List<String> authPayway) {
		this.authPayway = authPayway;
	}

	public Long getCooperateId() {
		return this.cooperateId;
	}
	public void setCooperateId(Long cooperateId) {
		this.cooperateId = cooperateId;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorNick() {
		return this.distributorNick;
	}
	public void setDistributorNick(String distributorNick) {
		this.distributorNick = distributorNick;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getGradeId() {
		return this.gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getProductLine() {
		return this.productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
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

	public Long getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNick() {
		return this.supplierNick;
	}
	public void setSupplierNick(String supplierNick) {
		this.supplierNick = supplierNick;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
