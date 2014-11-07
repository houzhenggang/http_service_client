package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����ײ��ࡣ
 *
 * @author auto create
 * @since 1.0, 2011-06-27 16:23:13.0
 */
public class Meal extends TaobaoObject {

	private static final long serialVersionUID = 7673971742877861736L;

	/**
	 * �����ײ���Ʒ�б�item_idΪ��Ʒ��id;item_show_nameΪ��Ʒ��ʾ�������������5����Ʒ���д��䣬���Բ�ѯ�����5������json��ʽ������
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * �ײ�id��
	 */
	@ApiField("meal_id")
	private Long mealId;

	/**
	 * �����ײ�������
	 */
	@ApiField("meal_memo")
	private String mealMemo;

	/**
	 * �����ײ����ơ�
	 */
	@ApiField("meal_name")
	private String mealName;

	/**
	 * �ײ�һ�ڼ�(��λ�ǣ�Ԫ)
	 */
	@ApiField("meal_price")
	private String mealPrice;

	/**
	 * ��ͨ�˷�ģ��id��������ֶ�Ϊ�ջ�0ʱ���˷������Ҹ���;������ֶβ�Ϊ�գ�˵���˷�ģ����ڣ��˷�����Ҹ���
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * �ײ�״̬����Ч��VALID;ʧЧ��INVALID(��Ч�ײ�Ϊ��ʹ�õ��ײ�,��Ч�ײ�Ϊ�ײ�������Ʒ�¼ܻ���Ϊ0ʱ)��
	 */
	@ApiField("status")
	private String status;

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public Long getMealId() {
		return this.mealId;
	}
	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public String getMealMemo() {
		return this.mealMemo;
	}
	public void setMealMemo(String mealMemo) {
		this.mealMemo = mealMemo;
	}

	public String getMealName() {
		return this.mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealPrice() {
		return this.mealPrice;
	}
	public void setMealPrice(String mealPrice) {
		this.mealPrice = mealPrice;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
