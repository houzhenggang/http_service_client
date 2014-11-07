package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscSearchResponse;

/**
 * TOP API: taobao.vas.subsc.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:39.0
 */
public class VasSubscSearchRequest implements TaobaoRequest<VasSubscSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* Ӧ���շѴ��룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ���ø�Ӧ�õ��շѴ���
	 */
	private String articleCode;

	/** 
	* �Ƿ��Զ����ѣ�true=�Զ����� false=���Զ����� ��=ȫ��
	 */
	private Boolean autosub;

	/** 
	* ����ʱ�����ֵ
	 */
	private Date endDeadline;

	/** 
	* �Ƿ������ѣ�true=�������� false=�ǵ������� ��=ȫ��
	 */
	private Boolean expireNotice;

	/** 
	* �շ���Ŀ���룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ�����շ���Ŀ����
	 */
	private String itemCode;

	/** 
	* �Ա���Ա��
	 */
	private String nick;

	/** 
	* ҳ��
	 */
	private Long pageNo;

	/** 
	* һҳ�����ļ�¼��
	 */
	private Long pageSize;

	/** 
	* ����ʱ����ʼֵ
	 */
	private Date startDeadline;

	/** 
	* ������¼״̬��1=��Ч 2=���� ��=ȫ��
	 */
	private Long status;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setAutosub(Boolean autosub) {
		this.autosub = autosub;
	}
	public Boolean getAutosub() {
		return this.autosub;
	}

	public void setEndDeadline(Date endDeadline) {
		this.endDeadline = endDeadline;
	}
	public Date getEndDeadline() {
		return this.endDeadline;
	}

	public void setExpireNotice(Boolean expireNotice) {
		this.expireNotice = expireNotice;
	}
	public Boolean getExpireNotice() {
		return this.expireNotice;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return this.itemCode;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDeadline(Date startDeadline) {
		this.startDeadline = startDeadline;
	}
	public Date getStartDeadline() {
		return this.startDeadline;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.vas.subsc.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
		txtParams.put("autosub", this.autosub);
		txtParams.put("end_deadline", this.endDeadline);
		txtParams.put("expire_notice", this.expireNotice);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_deadline", this.startDeadline);
		txtParams.put("status", this.status);
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

	public Class<VasSubscSearchResponse> getResponseClass() {
		return VasSubscSearchResponse.class;
	}
}
