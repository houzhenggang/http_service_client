package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Chatpeer;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatpeers.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class WangwangEserviceChatpeersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7126912947551868744L;

	/** 
	 * �������ID�б�
	 */
	@ApiListField("chatpeers")
	@ApiField("chatpeer")
	private List<Chatpeer> chatpeers;

	/** 
	 * ��Ա��Ŀ��
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * �����룺 
10000:�ɹ��� 

60000��ʱ��Ƿ�������1)ʱ��γ���7��,��2)��ʼʱ���񳬹�30�죬��3)ʱ���ʽ���ԣ� 

50000�������û�ID���Ǹõ��̵��ʺţ� 

40000��ϵͳ���󣬰����������Ϊ�ա�
	 */
	@ApiField("ret")
	private Long ret;

	public void setChatpeers(List<Chatpeer> chatpeers) {
		this.chatpeers = chatpeers;
	}
	public List<Chatpeer> getChatpeers( ) {
		return this.chatpeers;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setRet(Long ret) {
		this.ret = ret;
	}
	public Long getRet( ) {
		return this.ret;
	}

}
