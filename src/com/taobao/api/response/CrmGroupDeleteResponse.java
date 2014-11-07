package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:10.0
 */
public class CrmGroupDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3149346595285818685L;

	/** 
	 * �첽��������ɹ����Ƿ�ִ�������Ҫͨ��taobao.crm.grouptask.check���
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
