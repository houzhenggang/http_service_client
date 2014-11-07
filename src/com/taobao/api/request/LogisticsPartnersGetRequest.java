package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsPartnersGetResponse;

/**
 * TOP API: taobao.logistics.partners.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class LogisticsPartnersGetRequest implements TaobaoRequest<LogisticsPartnersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����۸�.ֻ�е�ѡ���������˲����Ż���Ч
	 */
	private String goodsValue;

	/** 
	* �������ͣ����ݴ˲����ɲ���ṩ��Ӧ�������͵�������˾��Ϣ(������˾״̬����)����ѡֵ��cod(��������)��online(�����µ�)�� offline(�Լ���ϵ)��limit(��ʱ����)��Ȼ���ٸ���source_id,target_id,goods_value����������������������˾. Ŀǰ�����Լ���ϵ�������ͽ��᷵�ؿգ���Ϊ�Լ���ϵ��û�о���ķ�����Ϣ�����Բ����м�¼��
	 */
	private String serviceType;

	/** 
	* ������˾�����ص�����.�ο�:http://www.stats.gov.cn/tjbz/xzqhdm/t20100623_402652267.htm  ���ߵ��� taobao.areas.get ��ȡ
	 */
	private String sourceId;

	/** 
	* ������˾���͵ص�����.�ο�:http://www.stats.gov.cn/tjbz/xzqhdm/t20100623_402652267.htm  ���ߵ��� taobao.areas.get ��ȡ
	 */
	private String targetId;

	public void setGoodsValue(String goodsValue) {
		this.goodsValue = goodsValue;
	}
	public String getGoodsValue() {
		return this.goodsValue;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceType() {
		return this.serviceType;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceId() {
		return this.sourceId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetId() {
		return this.targetId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.partners.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("goods_value", this.goodsValue);
		txtParams.put("service_type", this.serviceType);
		txtParams.put("source_id", this.sourceId);
		txtParams.put("target_id", this.targetId);
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

	public Class<LogisticsPartnersGetResponse> getResponseClass() {
		return LogisticsPartnersGetResponse.class;
	}
}
