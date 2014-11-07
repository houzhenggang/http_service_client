package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementAppSubscribeResponse;

/**
 * TOP API: taobao.increment.app.subscribe request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 11:26:23.0
 */
public class IncrementAppSubscribeRequest implements TaobaoRequest<IncrementAppSubscribeResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ISV���ķ���ʱ�䣬���¼��㡣Ŀǰ��ѡֵ��1��3��6��12����ʱ���������ISV�����Ա��ĺ����������������ͣ�����ѡ����ʱ��Ϊ-1����ʾ���ö��ģ�
	 */
	private Long duration;

	/** 
	* Ҫ���ĵ���Ϣ״̬����ѡֵ�У���Ʒ��Ϣ״̬���˿���Ϣ״̬��������Ϣ״̬�����״̬���͡�status�ֶ�֧�ֶ��״̬ͬʱ���ġ�ÿ�������״̬����Ʒ��Ϣ״̬���������Ϣ״̬����ͬһ�����࣬�˿���Ϣ״̬���������Ϣ״̬����ͬһ�����࣬������Ϣ״̬���������Ϣ״̬����ͬһ�����ࣩҪ�ϲ���һ���롣ÿ���������Ϣ�ڲ���","���ӣ�����֮����";"���ӡ������������˳��Ҫ��topics��������͵�˳��һһ��Ӧ�������������ĳ���������Ϣ������all����ʾ����������������е���Ϣ״̬���磺������topics="trade;refund;item"ʱ��������status="all;all;all"��ʾ�Ҷ���������������Ϣ�µ�����״̬����Ϣ��������status="TradeCreate,TradeSuccess;all;ItemDelete"��ʾ�Ҷ��Ľ��������µĽ��״����ͽ��׳ɹ�����Ϣ���˿������µ������˿������Ϣ����Ʒ�µ���Ʒɾ������Ϣ��
	 */
	private String status;

	/** 
	* Ҫ���ĵ���Ϣ��𡣿ɶ�����ͬʱ���ģ�ÿ������֮����";"�ָ�������ѡֵ�����������Ϣ����˵�������磬���Ҫͬʱ���Ľ��ף��˿��Ʒ����Ϣ������ַ�������"trade;refund;item"
	 */
	private String topics;

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration() {
		return this.duration;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getTopics() {
		return this.topics;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.increment.app.subscribe";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("duration", this.duration);
		txtParams.put("status", this.status);
		txtParams.put("topics", this.topics);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<IncrementAppSubscribeResponse> getResponseClass() {
		return IncrementAppSubscribeResponse.class;
	}
}
