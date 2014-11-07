package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeItemsConvertResponse;

/**
 * TOP API: taobao.taobaoke.items.convert request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class TaobaokeItemsConvertRequest implements TaobaoRequest<TaobaokeItemsConvertResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:num_iid,title,nick,pic_url,price,click_url,commission,ommission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume
;�ֶ�֮����","�ָ�.
	 */
	private String fields;

	/** 
	* ��ʶһ��Ӧ���Ƿ��������߻����ֻ�Ӧ��,�����true���ʹ������������ܵ����.�������ֵ,��Ĭ����false.
	 */
	private Boolean isMobile;

	/** 
	* �ƹ��ߵ��Ա���Ա�ǳ�.ע��ָ�����Ա��Ļ�Ա��¼��
	 */
	private String nick;

	/** 
	* �Ա�����Ʒ����id��.�������40��.��ʽ��:"value1,value2,value3" ��" , "�ŷָ���Ʒ����id
	 */
	private String numIids;

	/** 
	* �Զ������봮.��ʽ:Ӣ�ĺ��������;���Ȳ��ܴ���12���ַ�,���ֲ�ͬ���ƹ�����,��:bbs,��ʾbbsΪ�ƹ�����;blog,��ʾblogΪ�ƹ�����.
	 */
	private String outerCode;

	/** 
	* �Կ��û���pid,�������ɵ����.nick��pid������Ļ�,��pidΪ׼
	 */
	private Long pid;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}
	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public String getNumIids() {
		return this.numIids;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
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
		return "taobao.taobaoke.items.convert";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("is_mobile", this.isMobile);
		txtParams.put("nick", this.nick);
		txtParams.put("num_iids", this.numIids);
		txtParams.put("outer_code", this.outerCode);
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

	public Class<TaobaokeItemsConvertResponse> getResponseClass() {
		return TaobaokeItemsConvertResponse.class;
	}
}
