package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.append response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:19.0
 */
public class CrmGroupAppendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1255154293839883496L;

	/** 
	 * �첽��������ɹ�����������Ƿ����ͨ��taobao.crm.grouptask.check���
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
