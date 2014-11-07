package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class FenxiaoProductAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7716942381148814262L;

	/** 
	 * ��Ʒ����ʱ�� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * ��ƷID
	 */
	@ApiField("pid")
	private Long pid;

	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid( ) {
		return this.pid;
	}

}
