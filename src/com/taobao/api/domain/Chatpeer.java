package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������ID�б�
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:22:35.0
 */
public class Chatpeer extends TaobaoObject {

	private static final long serialVersionUID = 5541983826943885483L;

	/**
	 * ��������
	 */
	@ApiField("date")
	private String date;

	/**
	 * ��������û�ID��cntaobao+�Ա�nick������cntaobaotest
	 */
	@ApiField("uid")
	private String uid;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
