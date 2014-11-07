package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercatsListAddResponse;

/**
 * TOP API: taobao.sellercats.list.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class SellercatsListAddRequest implements TaobaoRequest<SellercatsListAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �����Զ�����Ŀ���ơ�������20���ַ�
	 */
	private String name;

	/** 
	* ����Ŀ��ţ������ĿΪ�����µ�һ����Ŀ��ֵ����0�������ĿΪ����Ŀ�����û�ȡtaobao.sellercats.list.get����Ŀ���
	 */
	private Long parentCid;

	/** 
	* ����ͼƬURL��ַ��(���Ե�ַ����ʽ��http://host/image_path)
	 */
	private String pictUrl;

	/** 
	* ����Ŀ��ҳ���ϵ�����λ��,ȡֵ��Χ:�����������
	 */
	private Long sortOrder;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}
	public Long getParentCid() {
		return this.parentCid;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}
	public String getPictUrl() {
		return this.pictUrl;
	}

	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Long getSortOrder() {
		return this.sortOrder;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.sellercats.list.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("name", this.name);
		txtParams.put("parent_cid", this.parentCid);
		txtParams.put("pict_url", this.pictUrl);
		txtParams.put("sort_order", this.sortOrder);
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

	public Class<SellercatsListAddResponse> getResponseClass() {
		return SellercatsListAddResponse.class;
	}
}
