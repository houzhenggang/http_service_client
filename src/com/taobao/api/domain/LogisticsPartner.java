package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ѯ���ͷ�Χ֮�ڵ�������˾��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-27 16:59:24.0
 */
public class LogisticsPartner extends TaobaoObject {

	private static final long serialVersionUID = 5582213672415465353L;

	/**
	 * ����˵����Ϣ
	 */
	@ApiField("cover_remark")
	private String coverRemark;

	/**
	 * ������˾��ϸ��Ϣ
	 */
	@ApiField("partner")
	private PartnerDetail partner;

	/**
	 * �����ʹ��˵����Ϣ
	 */
	@ApiField("uncover_remark")
	private String uncoverRemark;

	public String getCoverRemark() {
		return this.coverRemark;
	}
	public void setCoverRemark(String coverRemark) {
		this.coverRemark = coverRemark;
	}

	public PartnerDetail getPartner() {
		return this.partner;
	}
	public void setPartner(PartnerDetail partner) {
		this.partner = partner;
	}

	public String getUncoverRemark() {
		return this.uncoverRemark;
	}
	public void setUncoverRemark(String uncoverRemark) {
		this.uncoverRemark = uncoverRemark;
	}

}
