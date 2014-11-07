package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.FenxiaoGrade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.grades.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:49.0
 */
public class FenxiaoGradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2355864441353536684L;

	/** 
	 * �����̵ȼ���Ϣ
	 */
	@ApiListField("fenxiao_grades")
	@ApiField("fenxiao_grade")
	private List<FenxiaoGrade> fenxiaoGrades;

	/** 
	 * ��¼��
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setFenxiaoGrades(List<FenxiaoGrade> fenxiaoGrades) {
		this.fenxiaoGrades = fenxiaoGrades;
	}
	public List<FenxiaoGrade> getFenxiaoGrades( ) {
		return this.fenxiaoGrades;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
