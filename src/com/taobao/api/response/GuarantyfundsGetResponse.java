package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.GuarantyFund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.guarantyfunds.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:22.0
 */
public class GuarantyfundsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6294494645334514756L;

	/** 
	 * B�̼ұ�֤��ʹ�ü�¼����󷵻�1000����¼�� 
��������뿪ʼ���ںͽ������ڣ��򷵻����в�����1000���ļ�¼ 
���ֻ���뿪ʼ���ڣ�������������ڣ��򷵻ؿ�ʼ�����Ժ󴴽������в�����1000���ļ�¼ 
���ֻ����������ڣ������뿪ʼ���ڣ��򷵻ؽ���������ǰ���������в�����1000���ļ�¼
	 */
	@ApiListField("guarantyFunds")
	@ApiField("guaranty_fund")
	private List<GuarantyFund> guarantyFunds;

	public void setGuarantyFunds(List<GuarantyFund> guarantyFunds) {
		this.guarantyFunds = guarantyFunds;
	}
	public List<GuarantyFund> getGuarantyFunds( ) {
		return this.guarantyFunds;
	}

}
