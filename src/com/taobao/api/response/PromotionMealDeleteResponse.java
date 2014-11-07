package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.meal.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class PromotionMealDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6619486415428519734L;

	/** 
	 * true���ɹ� false��ʧ��
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * �޸�ʱ�䡣
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
