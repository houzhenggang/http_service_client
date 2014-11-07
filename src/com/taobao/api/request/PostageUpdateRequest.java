package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PostageUpdateResponse;

/**
 * TOP API: taobao.postage.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class PostageUpdateRequest implements TaobaoRequest<PostageUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ĭ��EMS�Ӽ۷���.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String emsIncrease;

	/** 
	* Ĭ��EMS����.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String emsPrice;

	/** 
	* Ĭ�Ͽ�ݼӼ۷���.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String expressIncrease;

	/** 
	* Ĭ�Ͽ�ݷ���.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String expressPrice;

	/** 
	* �ʷ�ģ�屸ע
	 */
	private String memo;

	/** 
	* �ʷ�ģ������
	 */
	private String name;

	/** 
	* Ĭ��ƽ�ʼӼ۷���.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String postIncrease;

	/** 
	* Ĭ��ƽ�ʷ���.��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String postPrice;

	/** 
	* �ʷ�ģ��id.ע��:������postage_id�����Ǵ��ڵ�postage��id
	 */
	private Long postageId;

	/** 
	* �ʷ������漰�ĵ�������������ö���������������������taobao.areas.get�ӿڻ�ȡ�����߲ο���http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm  �� (110000;310000;320000,330000)�ʹ����ʷ������漰(����;�Ϻ�;����,�㽭)�ĸ���������дʱҪע����յ�������ֵ������������������룬������ִ�����Ϣ
	 */
	private String postageModeDests;

	/** 
	* �˷���ģ��id:�޸Ķ����ģ��ʱ,�� ��;������.ע��1:������postage_mode_id�����ǵ�ǰpostage��������postage_mode��id.ע��2:���޸Ķ��PostageModeʱ,�ַ�����ʹ�� " ; " �ֺ�����,����ע��ÿ���ֶε�����һ��Ҫ���.ע��3:������˷�ģ����ģ���ʱ��������Ѿ�����Ĭ�ϵ��˷����ſ�����Ӷ�Ӧ���ʷ�ģ����ģ�塣��,�����Ĭ�ϵ�EMS�˷���ſ��������EMS��ģ������.
	 */
	private String postageModeIds;

	/** 
	* �˷ѷ�ʽ�Ӽ��������������� (1.5;2.4;2.0).��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String postageModeIncreases;

	/** 
	* ��ģ��������ͣ�����(add),�޸�(update),ɾ��(delete). ��(add;add;add).ע�⣺����ģ����в�����ʱ��˲�������.���������Ĭ��Ϊupdate.�����������ܴ���ģ��ID
	 */
	private String postageModeOptTypes;

	/** 
	* �˷ѷ�ʽ�������������� (11.2;14;1;6).��ȷ��1λС��;��λ:Ԫ����:10.5
	 */
	private String postageModePrices;

	/** 
	* �˷ѷ�ʽ:ƽ��(post),��ݹ�˾(express),EMS(ems)������:��(post;express;ems)�ֺ�����
	 */
	private String postageModeTypes;

	/** 
	* ɾ��ems���͵��ʷ�ģ�壬��������������͵����ʷ�ģ��
	 */
	private Boolean removeEms;

	/** 
	* ɾ��������͵��ʷ�ģ�壬��������������͵����ʷ�ģ��
	 */
	private Boolean removeExpress;

	/** 
	* ɾ��ƽ�����͵��ʷ�ģ�壬��������������͵����ʷ�ģ��
	 */
	private Boolean removePost;

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}
	public String getEmsIncrease() {
		return this.emsIncrease;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	public String getEmsPrice() {
		return this.emsPrice;
	}

	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}
	public String getExpressIncrease() {
		return this.expressIncrease;
	}

	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public String getExpressPrice() {
		return this.expressPrice;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}
	public String getPostIncrease() {
		return this.postIncrease;
	}

	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}
	public String getPostPrice() {
		return this.postPrice;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageModeDests(String postageModeDests) {
		this.postageModeDests = postageModeDests;
	}
	public String getPostageModeDests() {
		return this.postageModeDests;
	}

	public void setPostageModeIds(String postageModeIds) {
		this.postageModeIds = postageModeIds;
	}
	public String getPostageModeIds() {
		return this.postageModeIds;
	}

	public void setPostageModeIncreases(String postageModeIncreases) {
		this.postageModeIncreases = postageModeIncreases;
	}
	public String getPostageModeIncreases() {
		return this.postageModeIncreases;
	}

	public void setPostageModeOptTypes(String postageModeOptTypes) {
		this.postageModeOptTypes = postageModeOptTypes;
	}
	public String getPostageModeOptTypes() {
		return this.postageModeOptTypes;
	}

	public void setPostageModePrices(String postageModePrices) {
		this.postageModePrices = postageModePrices;
	}
	public String getPostageModePrices() {
		return this.postageModePrices;
	}

	public void setPostageModeTypes(String postageModeTypes) {
		this.postageModeTypes = postageModeTypes;
	}
	public String getPostageModeTypes() {
		return this.postageModeTypes;
	}

	public void setRemoveEms(Boolean removeEms) {
		this.removeEms = removeEms;
	}
	public Boolean getRemoveEms() {
		return this.removeEms;
	}

	public void setRemoveExpress(Boolean removeExpress) {
		this.removeExpress = removeExpress;
	}
	public Boolean getRemoveExpress() {
		return this.removeExpress;
	}

	public void setRemovePost(Boolean removePost) {
		this.removePost = removePost;
	}
	public Boolean getRemovePost() {
		return this.removePost;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.postage.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ems_increase", this.emsIncrease);
		txtParams.put("ems_price", this.emsPrice);
		txtParams.put("express_increase", this.expressIncrease);
		txtParams.put("express_price", this.expressPrice);
		txtParams.put("memo", this.memo);
		txtParams.put("name", this.name);
		txtParams.put("post_increase", this.postIncrease);
		txtParams.put("post_price", this.postPrice);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("postage_mode_dests", this.postageModeDests);
		txtParams.put("postage_mode_ids", this.postageModeIds);
		txtParams.put("postage_mode_increases", this.postageModeIncreases);
		txtParams.put("postage_mode_optTypes", this.postageModeOptTypes);
		txtParams.put("postage_mode_prices", this.postageModePrices);
		txtParams.put("postage_mode_types", this.postageModeTypes);
		txtParams.put("remove_ems", this.removeEms);
		txtParams.put("remove_express", this.removeExpress);
		txtParams.put("remove_post", this.removePost);
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

	public Class<PostageUpdateResponse> getResponseClass() {
		return PostageUpdateResponse.class;
	}
}
