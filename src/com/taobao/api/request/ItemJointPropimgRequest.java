package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointPropimgResponse;

/**
 * TOP API: taobao.item.joint.propimg request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class ItemJointPropimgRequest implements TaobaoRequest<ItemJointPropimgResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ͼƬID���������������Ҫ��д
	 */
	private Long id;

	/** 
	* ��Ʒ����ID����ѡ
	 */
	private Long numIid;

	/** 
	* ͼƬ��ַ
	 */
	private String picPath;

	/** 
	* ͼƬ���
	 */
	private Long position;

	/** 
	* �����б�����taobao.itemprops.get.v2��ȡ��Ŀ���ԣ����Ա�������ɫ���ԣ�����taobao.itempropvalues.getȡ��vid����ʽ:pid:vid��
	 */
	private String properties;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getPicPath() {
		return this.picPath;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getProperties() {
		return this.properties;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.joint.propimg";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("pic_path", this.picPath);
		txtParams.put("position", this.position);
		txtParams.put("properties", this.properties);
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

	public Class<ItemJointPropimgResponse> getResponseClass() {
		return ItemJointPropimgResponse.class;
	}
}
