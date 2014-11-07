package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.GradePromotion;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.grade.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:27:29.0
 */
public class CrmGradeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5414517792596154257L;

	/** 
	 * �ȼ���Ϣ����
	 */
	@ApiListField("grade_promotions")
	@ApiField("grade_promotion")
	private List<GradePromotion> gradePromotions;

	public void setGradePromotions(List<GradePromotion> gradePromotions) {
		this.gradePromotions = gradePromotions;
	}
	public List<GradePromotion> getGradePromotions( ) {
		return this.gradePromotions;
	}

}
