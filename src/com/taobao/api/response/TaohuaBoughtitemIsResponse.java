package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.boughtitem.is response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaBoughtitemIsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7242839978189295445L;

	/** 
	 * ���ؽ����true�������Ʒ�Ѿ����������false�������Ʒ��û�б������
	 */
	@ApiField("is_bought")
	private Boolean isBought;

	public void setIsBought(Boolean isBought) {
		this.isBought = isBought;
	}
	public Boolean getIsBought( ) {
		return this.isBought;
	}

}
