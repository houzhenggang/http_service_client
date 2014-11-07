package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderScheduleRuleAddResponse;

/**
 * TOP API: taobao.wlb.order.schedule.rule.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbOrderScheduleRuleAddRequest implements TaobaoRequest<WlbOrderScheduleRuleAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���÷����ֿ����id��ͨ��taobao.wlb.subscription.query�ӿڻ��service_id��
	 */
	private Long backupStoreId;

	/** 
	* �����ֿ����id��ͨ��taobao.wlb.subscription.query�ӿڻ��service_id��
	 */
	private Long defaultStoreId;

	/** 
	* ��������Ķ���������ã�
REMARK_STOP--�ж������Բ��Զ��·�
COD_STOP--������������Զ��·�
CHECK_WAREHOUSE_DELIVER--���ֿ�����ͷ�Χ
	 */
	private String option;

	/** 
	* ���ҵ�����׼�����б�
	 */
	private String provAreaIds;

	public void setBackupStoreId(Long backupStoreId) {
		this.backupStoreId = backupStoreId;
	}
	public Long getBackupStoreId() {
		return this.backupStoreId;
	}

	public void setDefaultStoreId(Long defaultStoreId) {
		this.defaultStoreId = defaultStoreId;
	}
	public Long getDefaultStoreId() {
		return this.defaultStoreId;
	}

	public void setOption(String option) {
		this.option = option;
	}
	public String getOption() {
		return this.option;
	}

	public void setProvAreaIds(String provAreaIds) {
		this.provAreaIds = provAreaIds;
	}
	public String getProvAreaIds() {
		return this.provAreaIds;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.schedule.rule.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("backup_store_id", this.backupStoreId);
		txtParams.put("default_store_id", this.defaultStoreId);
		txtParams.put("option", this.option);
		txtParams.put("prov_area_ids", this.provAreaIds);
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

	public Class<WlbOrderScheduleRuleAddResponse> getResponseClass() {
		return WlbOrderScheduleRuleAddResponse.class;
	}
}
