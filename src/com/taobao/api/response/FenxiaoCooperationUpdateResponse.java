package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:49.0
 */
public class FenxiaoCooperationUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7847654439499933495L;

	/** 
	 * ���½���ɹ�ʧ��
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
