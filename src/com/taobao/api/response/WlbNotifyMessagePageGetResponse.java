package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.notify.message.page.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbNotifyMessagePageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6475623882736843243L;

	/** 
	 * ������ѯ���������
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * ��Ϣ����б�
	 */
	@ApiListField("wlb_messages")
	@ApiField("wlb_message")
	private List<WlbMessage> wlbMessages;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWlbMessages(List<WlbMessage> wlbMessages) {
		this.wlbMessages = wlbMessages;
	}
	public List<WlbMessage> getWlbMessages( ) {
		return this.wlbMessages;
	}

}
