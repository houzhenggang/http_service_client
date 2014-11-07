package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressAddResponse;

/**
 * TOP API: taobao.logistics.address.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:58.0
 */
public class LogisticsAddressAddRequest implements TaobaoRequest<LogisticsAddressAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ϸ�ֵ���ַ������Ҫ�ظ���дʡ/��/��
	 */
	private String addr;

	/** 
	* Ĭ���˻���ַ��<br>
<font color='red'>ѡ�����(true)������ǰ��ַ��ΪĬ���˻���ַ������ԭĬ���˻���ַ</font>
	 */
	private Boolean cancelDef;

	/** 
	* ������
	 */
	private String city;

	/** 
	* ��ϵ������ <font color='red'>���Ȳ��ɳ���20���ֽ�</font>
	 */
	private String contactName;

	/** 
	* ������
<br><font color='red'>������ڵ����Ǻ���Ŀ���Ϊ�գ�����Ϊ�ز�</font>
	 */
	private String country;

	/** 
	* Ĭ��ȡ����ַ��<br>
<font color='red'>ѡ�����(true)������ǰ��ַ��ΪĬ��ȡ����ַ������ԭĬ��ȡ����ַ</font>
	 */
	private Boolean getDef;

	/** 
	* ��ע,<br><font color='red'>��ע���ܳ���256�ֽ�</font>
	 */
	private String memo;

	/** 
	* �ֻ����룬�ֻ���绰������һ��
<br><font color='red'>�ֻ����벻�ܳ���20λ</font>
	 */
	private String mobilePhone;

	/** 
	* �绰����,�ֻ���绰������һ��
	 */
	private String phone;

	/** 
	* ����ʡ
	 */
	private String province;

	/** 
	* ��˾����,<br><font color="red">��˾���Ƴ��ܲ��ܳ���20�ֽ�</font>
	 */
	private String sellerCompany;

	/** 
	* ������������
<br><font color='red'>������ڵ����Ǻ���Ŀ���Ϊ�գ�����Ϊ�ز�</font>
	 */
	private String zipCode;

	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}

	public void setCancelDef(Boolean cancelDef) {
		this.cancelDef = cancelDef;
	}
	public Boolean getCancelDef() {
		return this.cancelDef;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName() {
		return this.contactName;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return this.country;
	}

	public void setGetDef(Boolean getDef) {
		this.getDef = getDef;
	}
	public Boolean getGetDef() {
		return this.getDef;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}

	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}
	public String getSellerCompany() {
		return this.sellerCompany;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getZipCode() {
		return this.zipCode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("addr", this.addr);
		txtParams.put("cancel_def", this.cancelDef);
		txtParams.put("city", this.city);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("country", this.country);
		txtParams.put("get_def", this.getDef);
		txtParams.put("memo", this.memo);
		txtParams.put("mobile_phone", this.mobilePhone);
		txtParams.put("phone", this.phone);
		txtParams.put("province", this.province);
		txtParams.put("seller_company", this.sellerCompany);
		txtParams.put("zip_code", this.zipCode);
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

	public Class<LogisticsAddressAddResponse> getResponseClass() {
		return LogisticsAddressAddResponse.class;
	}
}
