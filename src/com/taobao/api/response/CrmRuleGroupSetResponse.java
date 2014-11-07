package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rule.group.set response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:17.0
 */
public class CrmRuleGroupSetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8663368825469656946L;

	/** 
	 * �����Ƿ�ɹ�
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
