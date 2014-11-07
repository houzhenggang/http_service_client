package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Promotion;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.promotion.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingPromotionAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2583449655232578817L;

	/** 
	 * �Ƿ����óɹ�
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * �������óɹ����Żݲ�����Ϣ��������Promotion���ݽṹ�е�promotion_id,item_id,item_detail_url��
	 */
	@ApiListField("promotions")
	@ApiField("promotion")
	private List<Promotion> promotions;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
	public List<Promotion> getPromotions( ) {
		return this.promotions;
	}

}
