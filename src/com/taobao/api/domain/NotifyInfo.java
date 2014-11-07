package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ʾ��Ҫ�������͵���Ϣ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:17:36.0
 */
public class NotifyInfo extends TaobaoObject {

	private static final long serialVersionUID = 7845712163888642669L;

	/**
	 * ������Ϣ��״̬�����������⣩������ѡֵ�������Ʒ��Ϣ״̬���˿���Ϣ״̬��������Ϣ״̬�е�˵����isNotifyӦΪ������topic���͵������ͣ�����topicΪtrade����isNotifyӦΪTradeCreate
	 */
	@ApiField("is_notify")
	private String isNotify;

	/**
	 * ������Ϣ���������⡣��ѡֵ trade���������ͣ� item����Ʒ���ͣ� refund���˿����ͣ�
	 */
	@ApiField("topic")
	private String topic;

	public String getIsNotify() {
		return this.isNotify;
	}
	public void setIsNotify(String isNotify) {
		this.isNotify = isNotify;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
