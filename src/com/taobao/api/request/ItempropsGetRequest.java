package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItempropsGetResponse;

/**
 * TOP API: taobao.itemprops.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItempropsGetRequest implements TaobaoRequest<ItempropsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ŀ������·��,�ɸ��������ϲ����Ŀ���Ժ���Ŀ����ֵ���,��ʽpid:vid;pid:vid.ȡ��Ŀ��������Ҫ��child_path,cid
	 */
	private String childPath;

	/** 
	* Ҷ����ĿID�����ֻ��cid����ֻ����һ������,ͨ��taobao.itemcats.get���Ҷ����ĿID
	 */
	private Long cid;

	/** 
	* ����ʱ�������ʽ:yyyy-MM-dd HH:mm:ss
���紫2005-01-01 00:00:00����ȡ���е����Ժ�������ID(�������pid�����datetime)
	 */
	private Date datetime;

	/** 
	* ��Ҫ���ص��ֶ��б�����ItemProp��Ĭ�Ϸ��أ�pid, name, must, multi, prop_values
	 */
	private String fields;

	/** 
	* �Ƿ���ɫ���ԡ���ѡֵ:true(��),false(��) (ɾ�������Բ���ƥ��ͷ����������)
	 */
	private Boolean isColorProp;

	/** 
	* �Ƿ�ö�����ԡ���ѡֵ:true(��),false(��) (ɾ�������Բ���ƥ��ͷ����������)���������true������ֵ��������ѡ�����룬�������false������ֵ���û������ֹ����롣
	 */
	private Boolean isEnumProp;

	/** 
	* ��is_enum_prop��true��ǰ���£��Ƿ������ҿ���������������ԣ�ע�����is_enum_prop����false���ò���ͳһ����false������ѡֵ:true(��),false(��) (ɾ�������Բ���ƥ��ͷ����������)
	 */
	private Boolean isInputProp;

	/** 
	* �Ƿ���Ʒ���ԣ��������ֻ�ܷ��ڷ�����Ʒʱʹ�á���ѡֵ:true(��),false(��)
	 */
	private Boolean isItemProp;

	/** 
	* �Ƿ�ؼ����ԡ���ѡֵ:true(��),false(��)
	 */
	private Boolean isKeyProp;

	/** 
	* �Ƿ��������ԡ���ѡֵ:true(��),false(��)
	 */
	private Boolean isSaleProp;

	/** 
	* ������ID
	 */
	private Long parentPid;

	/** 
	* ����id (ȡ��Ŀ����ʱ����pid������ͬʱ��PID��parent_pid)
	 */
	private Long pid;

	public void setChildPath(String childPath) {
		this.childPath = childPath;
	}
	public String getChildPath() {
		return this.childPath;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public Date getDatetime() {
		return this.datetime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}
	public Boolean getIsColorProp() {
		return this.isColorProp;
	}

	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}
	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}

	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}
	public Boolean getIsInputProp() {
		return this.isInputProp;
	}

	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}
	public Boolean getIsItemProp() {
		return this.isItemProp;
	}

	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}
	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}

	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}
	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}

	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}
	public Long getParentPid() {
		return this.parentPid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.itemprops.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_path", this.childPath);
		txtParams.put("cid", this.cid);
		txtParams.put("datetime", this.datetime);
		txtParams.put("fields", this.fields);
		txtParams.put("is_color_prop", this.isColorProp);
		txtParams.put("is_enum_prop", this.isEnumProp);
		txtParams.put("is_input_prop", this.isInputProp);
		txtParams.put("is_item_prop", this.isItemProp);
		txtParams.put("is_key_prop", this.isKeyProp);
		txtParams.put("is_sale_prop", this.isSaleProp);
		txtParams.put("parent_pid", this.parentPid);
		txtParams.put("pid", this.pid);
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

	public Class<ItempropsGetResponse> getResponseClass() {
		return ItempropsGetResponse.class;
	}
}
