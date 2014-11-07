package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի���Ŀͳ�ƽṹ����  ����������ͳ�Ʒ��ػ�������Ŀ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:19:16.0
 */
public class TaohuaCateStat extends TaobaoObject {

	private static final long serialVersionUID = 6723228933447894316L;

	/**
	 * ��ĿID
	 */
	@ApiField("cate_id")
	private Long cateId;

	/**
	 * ��ǰ��Ŀ�������Ʒ����
	 */
	@ApiField("count")
	private Long count;

	/**
	 * ��Ŀ����
	 */
	@ApiField("name")
	private String name;

	public Long getCateId() {
		return this.cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
