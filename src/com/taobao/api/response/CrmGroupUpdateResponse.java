package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:29:05.0
 */
public class CrmGroupUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4221159556483232399L;

	/** 
	 * �����޸��Ƿ�ɹ�
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
