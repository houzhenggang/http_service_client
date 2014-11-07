package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NonReplyStatOnDay;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.noreplynum.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceNoreplynumGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3244389486245534942L;

	/** 
	 * δ�ظ�ͳ���б�
	 */
	@ApiListField("non_reply_stat_on_days")
	@ApiField("non_reply_stat_on_day")
	private List<NonReplyStatOnDay> nonReplyStatOnDays;

	public void setNonReplyStatOnDays(List<NonReplyStatOnDay> nonReplyStatOnDays) {
		this.nonReplyStatOnDays = nonReplyStatOnDays;
	}
	public List<NonReplyStatOnDay> getNonReplyStatOnDays( ) {
		return this.nonReplyStatOnDays;
	}

}
