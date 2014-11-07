package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������
 *
 * @author auto create
 * @since 1.0, 2010-04-22 14:14:56.0
 */
public class Subscription extends TaobaoObject {

	private static final long serialVersionUID = 7544595762513267811L;

	/**
	 * ������Ϣ��״̬�����������⣩������ѡֵ�������Ʒ��Ϣ״̬���˿���Ϣ״̬��������Ϣ״̬�е�˵����
	 */
	@ApiField("status")
	private String status;

	/**
	 * ������Ϣ���������⡣
��ѡֵ 
trade���������ͣ� 
item����Ʒ���ͣ� 
refund���˿����ͣ�
	 */
	@ApiField("topic")
	private String topic;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
