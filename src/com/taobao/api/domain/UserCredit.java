package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �û�����
 *
 * @author auto create
 * @since 1.0, 2010-07-01 14:13:07.0
 */
public class UserCredit extends TaobaoObject {

	private static final long serialVersionUID = 7489455247465467969L;

	/**
	 * �յ��ĺ�����������ȡֵ��Χ:�����������
	 */
	@ApiField("good_num")
	private Long goodNum;

	/**
	 * ���õȼ����Ǹ���score���ɵģ������õȼ����Ա���Ա���Ա����ϵ����öȣ���Ϊ20�����𣬼����磺level = 1 ʱ����ʾһ�ģ�level = 2 ʱ����ʾ����
	 */
	@ApiField("level")
	private Long level;

	/**
	 * �����ܷ֣�����������һ�֣������������ӷ֣�����������һ�֡���Խ�ߣ��ȼ�Խ�ߣ�
	 */
	@ApiField("score")
	private Long score;

	/**
	 * �յ���������������ȡֵ��Χ:�����������
	 */
	@ApiField("total_num")
	private Long totalNum;

	public Long getGoodNum() {
		return this.goodNum;
	}
	public void setGoodNum(Long goodNum) {
		this.goodNum = goodNum;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

}
