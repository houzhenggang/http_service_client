package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeMemoUpdateResponse;

/**
 * TOP API: taobao.trade.memo.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:27.0
 */
public class TradeMemoUpdateRequest implements TaobaoRequest<TradeMemoUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ���ױ�ע���ģ���ѡֵΪ��0(��ɫ), 1(��ɫ), 2(��ɫ), 3(��ɫ), 4(��ɫ), 5(�ۺ�ɫ)��Ĭ��ֵΪ0
	 */
	private Long flag;

	/** 
	* ���ױ�ע����󳤶�: 1000���ֽ�
	 */
	private String memo;

	/** 
	* �Ƿ��memo��ֵ�ÿ�
��Ϊtrue���򲻹ܴ����memo�ֶε�ֵ�Ƿ�Ϊ�գ�����������е�memoֵ��գ����ã�
����false��������memo�Ƿ�Ϊ�����޸�memo��ֵ����memoΪ������Զ�����memo�ֶε��޸ģ���memo�ǿգ���ʹ���´����memo�������е�memo��ֵ
	 */
	private Boolean reset;

	/** 
	* ���ױ��
	 */
	private Long tid;

	public void setFlag(Long flag) {
		this.flag = flag;
	}
	public Long getFlag() {
		return this.flag;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setReset(Boolean reset) {
		this.reset = reset;
	}
	public Boolean getReset() {
		return this.reset;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.trade.memo.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("flag", this.flag);
		txtParams.put("memo", this.memo);
		txtParams.put("reset", this.reset);
		txtParams.put("tid", this.tid);
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

	public Class<TradeMemoUpdateResponse> getResponseClass() {
		return TradeMemoUpdateResponse.class;
	}
}
