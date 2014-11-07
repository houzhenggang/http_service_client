package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class FenxiaoProductUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5289317738157225875L;

	/** 
	 * ����ʱ�䣬ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/** 
	 * ��ƷID
	 */
	@ApiField("pid")
	private Long pid;

	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getModified( ) {
		return this.modified;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid( ) {
		return this.pid;
	}

}
