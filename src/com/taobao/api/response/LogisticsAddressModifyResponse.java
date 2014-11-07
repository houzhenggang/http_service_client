package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AddressResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.modify response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:58.0
 */
public class LogisticsAddressModifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4712149655576782848L;

	/** 
	 * ֻ�����޸�ʱ��modify_date
	 */
	@ApiField("address_result")
	private AddressResult addressResult;

	public void setAddressResult(AddressResult addressResult) {
		this.addressResult = addressResult;
	}
	public AddressResult getAddressResult( ) {
		return this.addressResult;
	}

}
