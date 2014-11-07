package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˿ʱ�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-20 20:26:51.0
 */
public class RefundRemindTimeout extends TaobaoObject {

	private static final long serialVersionUID = 2655395772238816899L;

	/**
	 * �Ƿ���ڳ�ʱ����ѡֵ:true(��),false(��)
	 */
	@ApiField("exist_timeout")
	private Boolean existTimeout;

	/**
	 * ���ѵ����ͣ��˿���������ʾ��Ϣ�����ͣ�
	 */
	@ApiField("remind_type")
	private Long remindType;

	/**
	 * ��ʱʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("timeout")
	private Date timeout;

	public Boolean getExistTimeout() {
		return this.existTimeout;
	}
	public void setExistTimeout(Boolean existTimeout) {
		this.existTimeout = existTimeout;
	}

	public Long getRemindType() {
		return this.remindType;
	}
	public void setRemindType(Long remindType) {
		this.remindType = remindType;
	}

	public Date getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}

}
