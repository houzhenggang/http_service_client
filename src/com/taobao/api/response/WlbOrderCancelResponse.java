package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5723764212549673198L;

	/** 
	 * ��������б�
	 */
	@ApiField("error_code_list")
	private String errorCodeList;

	/** 
	 * �޸�ʱ�䣬ֻ����ȡ���ɹ�������£��ſ�����
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setErrorCodeList(String errorCodeList) {
		this.errorCodeList = errorCodeList;
	}
	public String getErrorCodeList( ) {
		return this.errorCodeList;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
