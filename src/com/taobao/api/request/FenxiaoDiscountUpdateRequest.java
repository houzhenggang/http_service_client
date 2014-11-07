package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountUpdateResponse;

/**
 * TOP API: taobao.fenxiao.discount.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class FenxiaoDiscountUpdateRequest implements TaobaoRequest<FenxiaoDiscountUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ID�����磺��0,1002,1003��
	 */
	private String detailIds;

	/** 
	* ADD(����)��UPDATE�����£���DEL��ɾ������Ӧ��target_type����Ϣ��NULL�������磺��UPDATE,DEL,DEL��
	 */
	private String detailStatuss;

	/** 
	* �ۿ�ID
	 */
	private Long discountId;

	/** 
	* �ۿ����ƣ����Ȳ��ܳ���25�ֽ�
	 */
	private String discountName;

	/** 
	* ״̬DEL��ɾ����UPDATE(����)
	 */
	private String discountStatus;

	/** 
	* PERCENT�����ۿ��Żݣ���PRICE���������Żݣ�������"PERCENT,PRICE,PERCENT"
	 */
	private String discountTypes;

	/** 
	* �Żݱ��ʻ����Żݼ۸����磺��8000,-2300,7000��,��СΪ-100000000��100000000֮�䣨��λ���֣�
	 */
	private String discountValues;

	/** 
	* ��Ա�ȼ���id���߷�����id�����磺��1001,2001,1002��
	 */
	private String targetIds;

	/** 
	* GRADE������Ա�ȼ��Żݣ���DISTRIBUTOR�����������Żݣ�������"GRADE,DISTRIBUTOR"
	 */
	private String targetTypes;

	public void setDetailIds(String detailIds) {
		this.detailIds = detailIds;
	}
	public String getDetailIds() {
		return this.detailIds;
	}

	public void setDetailStatuss(String detailStatuss) {
		this.detailStatuss = detailStatuss;
	}
	public String getDetailStatuss() {
		return this.detailStatuss;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId() {
		return this.discountId;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountStatus(String discountStatus) {
		this.discountStatus = discountStatus;
	}
	public String getDiscountStatus() {
		return this.discountStatus;
	}

	public void setDiscountTypes(String discountTypes) {
		this.discountTypes = discountTypes;
	}
	public String getDiscountTypes() {
		return this.discountTypes;
	}

	public void setDiscountValues(String discountValues) {
		this.discountValues = discountValues;
	}
	public String getDiscountValues() {
		return this.discountValues;
	}

	public void setTargetIds(String targetIds) {
		this.targetIds = targetIds;
	}
	public String getTargetIds() {
		return this.targetIds;
	}

	public void setTargetTypes(String targetTypes) {
		this.targetTypes = targetTypes;
	}
	public String getTargetTypes() {
		return this.targetTypes;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.discount.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("detail_ids", this.detailIds);
		txtParams.put("detail_statuss", this.detailStatuss);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("discount_name", this.discountName);
		txtParams.put("discount_status", this.discountStatus);
		txtParams.put("discount_types", this.discountTypes);
		txtParams.put("discount_values", this.discountValues);
		txtParams.put("target_ids", this.targetIds);
		txtParams.put("target_types", this.targetTypes);
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

	public Class<FenxiaoDiscountUpdateResponse> getResponseClass() {
		return FenxiaoDiscountUpdateResponse.class;
	}
}
