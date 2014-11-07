package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3594768191593371379L;

	/** 
	 * ��������ʱ��
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * ���������������ɹ��󣬷����������Ķ�����ţ������������ʧ�ܣ����ֶ�Ϊ�ա�
	 */
	@ApiField("order_code")
	private String orderCode;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}

}
