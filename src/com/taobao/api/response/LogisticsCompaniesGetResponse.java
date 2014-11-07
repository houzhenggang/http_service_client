package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.LogisticsCompany;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.companies.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class LogisticsCompaniesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2815124489765137517L;

	/** 
	 * ������˾��Ϣ�����ص�LogisticCompany�����ľ�����ϢΪ���fields������ֶ���Ϣ��
	 */
	@ApiListField("logistics_companies")
	@ApiField("logistics_company")
	private List<LogisticsCompany> logisticsCompanies;

	public void setLogisticsCompanies(List<LogisticsCompany> logisticsCompanies) {
		this.logisticsCompanies = logisticsCompanies;
	}
	public List<LogisticsCompany> getLogisticsCompanies( ) {
		return this.logisticsCompanies;
	}

}
