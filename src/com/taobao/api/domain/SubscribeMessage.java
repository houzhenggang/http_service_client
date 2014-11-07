package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ISV������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-12-08 13:21:45.0
 */
public class SubscribeMessage extends TaobaoObject {

	private static final long serialVersionUID = 3551436114232195412L;

	/**
	 * ISV��Ӧ��AppKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * ���ֶα���û����ڽ��׶����Ĺ����ֶΡ��ֶθ�ʽkey1:value1:key1name:value1name;key2:value2:key2name:value2name;����ÿ�������4�����֣�key(�����б�ǵ�key)��value(�����б�ǵ�value)��keyname(������Ϣ�б�ǵ�key�ı���)��valuename(������Ϣ�б�ǵ�value�ı���)��4������֮����ð��":"���ӡ���ͬ���֮���Էֺ�";"������Ĭ�ϴ��ֶ�Ϊ�գ���ʾ���жϽ��׵ı�ǣ���Ҫ���ĵĶ���������������ֶβ�Ϊ�գ�����ݶ����key��value�Խ�����Ϣ���й��ˡ����һ����Ƕ�û�����У���˽�����Ϣ��������������
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * ISV�Ķ��ĵ���ʱ��
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * ISV�Ķ�����Ϣ�޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ISV������������Ϣ�б���ʾ��Щ��Ϣ��Ҫ�������͸�App�������Ҫ��ȡISV����Ϣ�б�����notifyInfo����
	 */
	@ApiListField("notify_infos")
	@ApiField("notify_info")
	private List<NotifyInfo> notifyInfos;

	/**
	 * App������Ϣ�ĵ�ַ
	 */
	@ApiField("notify_url")
	private String notifyUrl;

	/**
	 * ISV�Ķ��Ŀ�ʼʱ�䡣���ĵ��쿪ʼ����
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * ISV�Ķ�����Ϣ�����б������Ҫ��ȡISV����Ȩ�б�����subscription����
	 */
	@ApiListField("subscriptions")
	@ApiField("subscription")
	private List<Subscription> subscriptions;

	/**
	 * Ӧ���������û����ࡣĿǰһ����Ϊ3�֣�all(һ���û����е���Ϣ���ܽ��գ������û���Ϊ���Һ���Ϊ�������������Ϣ);seller(ֻ�ܽ���һ���û���Ϊ��������������Ϣ);buyer(ֻ�ܽ���һ���û���Ϊ�������������Ϣ)��Ĭ����all��
Ŀǰ����Ϣ�У���Ʒ��Ϣ�Դ��ֶβ����У�����������ҹ��ˣ��������˿���ص���Ϣ����ݴ��ֶν��д洢
	 */
	@ApiField("user_role")
	private String userRole;

	/**
	 * ISV�Ķ����Ƿ��Ѿ���Ч����Ч��ʾ�ܹ�����������Ϣ�ȣ�
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<NotifyInfo> getNotifyInfos() {
		return this.notifyInfos;
	}
	public void setNotifyInfos(List<NotifyInfo> notifyInfos) {
		this.notifyInfos = notifyInfos;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public String getUserRole() {
		return this.userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
