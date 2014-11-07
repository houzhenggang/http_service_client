package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Msg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatlog.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class WangwangEserviceChatlogGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3258891198319719595L;

	/** 
	 * �����¼��Ŀ��
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * ������Ϣ�б���Msg[]��direction=0Ϊfrom_id������Ϣ��to_id��direction=1Ϊto_id������Ϣ��from_id
	 */
	@ApiListField("msgs")
	@ApiField("msg")
	private List<Msg> msgs;

	/** 
	 * �����룺<br> 
10000:�ɹ���<br> 
50000��ʱ��Ƿ�������1)ʱ��γ���7��,��2)��ʼʱ���񳬹�30�죬��3)ʱ���ʽ���ԣ�<br> 
40000�������û�ID���Ǹõ��̵��ʺŻ����ʺŲ�ѯ���ʺ�˽����ϵ�˵������¼��<br> 
30000��ϵͳ���󣬰����������Ϊ��<br>
	 */
	@ApiField("ret")
	private Long ret;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setMsgs(List<Msg> msgs) {
		this.msgs = msgs;
	}
	public List<Msg> getMsgs( ) {
		return this.msgs;
	}

	public void setRet(Long ret) {
		this.ret = ret;
	}
	public Long getRet( ) {
		return this.ret;
	}

}
