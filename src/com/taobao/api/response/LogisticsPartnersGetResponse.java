package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.LogisticsPartner;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.partners.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class LogisticsPartnersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4512224699193822753L;

	/** 
	 * ������˾��Ϣ��
	 */
	@ApiListField("logistics_partners")
	@ApiField("logistics_partner")
	private List<LogisticsPartner> logisticsPartners;

	public void setLogisticsPartners(List<LogisticsPartner> logisticsPartners) {
		this.logisticsPartners = logisticsPartners;
	}
	public List<LogisticsPartner> getLogisticsPartners( ) {
		return this.logisticsPartners;
	}

}
