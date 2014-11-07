package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteAddResponse;

/**
 * TOP API: taobao.favorite.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:44.0
 */
public class FavoriteAddRequest implements TaobaoRequest<FavoriteAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ITEM��ʾ������SHOP��ʾ���̣�ֻ�ܴ���������֮һ
	 */
	private String collectType;

	/** 
	* ����ղص�����Ʒ���ʹ�num_iid������ǵ��̣��ʹ���sid
	 */
	private Long itemNumid;

	/** 
	* ���ղ��Ƿ񹫿�
	 */
	private Boolean shared;

	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}
	public String getCollectType() {
		return this.collectType;
	}

	public void setItemNumid(Long itemNumid) {
		this.itemNumid = itemNumid;
	}
	public Long getItemNumid() {
		return this.itemNumid;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}
	public Boolean getShared() {
		return this.shared;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.favorite.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("collect_type", this.collectType);
		txtParams.put("item_numid", this.itemNumid);
		txtParams.put("shared", this.shared);
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

	public Class<FavoriteAddResponse> getResponseClass() {
		return FavoriteAddResponse.class;
	}
}
