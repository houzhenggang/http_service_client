package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.SubUserInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.subusers.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class SellercenterSubusersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2315163291255794879L;

	/** 
	 * ���˺Ż�����Ϣ�б�������ϢΪid�����˺��û��������˺�id�����˺��ǳơ���ǰ״ֵ̬���Ƿ����
	 */
	@ApiListField("subusers")
	@ApiField("sub_user_info")
	private List<SubUserInfo> subusers;

	public void setSubusers(List<SubUserInfo> subusers) {
		this.subusers = subusers;
	}
	public List<SubUserInfo> getSubusers( ) {
		return this.subusers;
	}

}
