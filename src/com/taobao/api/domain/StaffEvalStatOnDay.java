package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ͷ�����ͳ���б�(����)
 *
 * @author auto create
 * @since 1.0, 2011-01-05 19:49:54.0
 */
public class StaffEvalStatOnDay extends TaobaoObject {

	private static final long serialVersionUID = 1834839946268235184L;

	/**
	 * ���۲���������
	 */
	@ApiField("eval_date")
	private Date evalDate;

	/**
	 * �ͷ�����ͳ���б�
	 */
	@ApiListField("staff_eval_stat_by_ids")
	@ApiField("staff_eval_stat_by_id")
	private List<StaffEvalStatById> staffEvalStatByIds;

	public Date getEvalDate() {
		return this.evalDate;
	}
	public void setEvalDate(Date evalDate) {
		this.evalDate = evalDate;
	}

	public List<StaffEvalStatById> getStaffEvalStatByIds() {
		return this.staffEvalStatByIds;
	}
	public void setStaffEvalStatByIds(List<StaffEvalStatById> staffEvalStatByIds) {
		this.staffEvalStatByIds = staffEvalStatByIds;
	}

}
