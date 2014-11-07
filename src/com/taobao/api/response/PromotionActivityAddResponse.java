package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Activity;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.activity.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class PromotionActivityAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7351994687468141959L;

	/** 
	 * ���Ϣ�������id������,Ŀǰֻ����activity_id,activity_url
	 */
	@ApiField("activity")
	private Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Activity getActivity( ) {
		return this.activity;
	}

}
