package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ֪ͨ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-16 13:24:44.0
 */
public class NotifyItem extends TaobaoObject {

	private static final long serialVersionUID = 2781979688781718359L;

	/**
	 * ��Ʒ�˴β�����������ֶΣ��ԡ�,���ָ��Ӧ����ƷItem���ֶ����ơ�Ŀǰ֧��title��price��num��item_img��prop_img��location��cid��approve_status�� list_time�����ֶεĸ��ı�Ƿ��أ����С�item_img��prop_img����ͬʱ���ֱ�ʾ��Ʒ���ͼƬ�б������޸�
	 */
	@ApiField("changed_fields")
	private String changedFields;

	/**
	 * ��Ʒ���(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ��Ʒ�޸�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ��Ʒ����
	 */
	@ApiField("num")
	private Long num;

	/**
	 * ��Ʒ���ֱ��
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * ��Ʒ�۸񣬸�ʽ��5.00����λ��Ԫ����ȷ������
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��ƷSKU���
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * ��ƷSKU���
	 */
	@ApiField("sku_num")
	private Long skuNum;

	/**
	 * ��Ʒ��������Ӧ����Ʒ������Ϣ״̬��
��ѡֵ 
ItemAdd��������Ʒ�� 
ItemUpshelf���ϼ���Ʒ�� 
ItemDownshelf���¼���Ʒ�� 
ItemDelete��ɾ����Ʒ�� 
ItemUpdate��������Ʒ�� 
ItemRecommendDelete��ȡ�������Ƽ���Ʒ�� 
ItemRecommendAdd�������Ƽ���Ʒ�� 
ItemZeroStock����Ʒ���գ�
	 */
	@ApiField("status")
	private String status;

	/**
	 * ��Ʒ����,���ܳ���60�ֽ�
	 */
	@ApiField("title")
	private String title;

	public String getChangedFields() {
		return this.changedFields;
	}
	public void setChangedFields(String changedFields) {
		this.changedFields = changedFields;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuNum() {
		return this.skuNum;
	}
	public void setSkuNum(Long skuNum) {
		this.skuNum = skuNum;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
