package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeShopsGetResponse;

/**
 * TOP API: taobao.taobaoke.shops.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class TaobaokeShopsGetRequest implements TaobaoRequest<TaobaokeShopsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ǰ̨��Ŀid
	 */
	private Long cid;

	/** 
	* ������Ʒ����ѯ����ֵ
	 */
	private String endAuctioncount;

	/** 
	* ����Ӷ�������ѯ����ֵ
	 */
	private String endCommissionrate;

	/** 
	* �����ƹ����õȼ���ѯ����
	 */
	private String endCredit;

	/** 
	* �����ۼ��ƹ�����ѯ����ֵ
	 */
	private String endTotalaction;

	/** 
	* ��Ҫ���ص��ֶΣ�Ŀǰ���������ֶ� user_id click_url shop_title commission_rate seller_credit shop_type auction_count total_auction
	 */
	private String fields;

	/** 
	* ��������ؼ��ֲ�ѯ
	 */
	private String keyword;

	/** 
	* �Ա��û��ǳƣ�ע��ָ�����Ա��Ļ�Ա��¼��.����ǳƴ���,��ô�ͻ����ղ���Ӷ��.ÿ���Ա��ǳƶ���Ӧ��һ��pid������������Ҫ����Ӷ����Ա��ǳƣ����ƹ����Ʒ�ɹ���Ӷ�������������Ա��ǳƵ��˻����������Ϣ���Ե��밢���������վ�鿴
	 */
	private String nick;

	/** 
	* �Ƿ�ֻ��ʾ�̳ǵ���
	 */
	private Boolean onlyMall;

	/** 
	* �Զ������봮.��ʽ:Ӣ�ĺ��������;���Ȳ��ܴ���12���ַ�,���ֲ�ͬ���ƹ�����,��:bbs,��ʾbbsΪ�ƹ�����;blog,��ʾblogΪ�ƹ�����.
	 */
	private String outerCode;

	/** 
	* ҳ��.���ҳ1~99
	 */
	private Long pageNo;

	/** 
	* ÿҳ����.���ÿҳ40
	 */
	private Long pageSize;

	/** 
	* �Կ��û���pid,�������ɵ����.nick��pid������Ļ�,��pidΪ׼
	 */
	private Long pid;

	/** 
	* ���̱�������ѯ��ʼֵ
	 */
	private String startAuctioncount;

	/** 
	* ����Ӷ�������ѯ��ʼֵ��ע��Ӷ�������x10000������.50��ʾ0.5%
	 */
	private String startCommissionrate;

	/** 
	* �����ƹ����õȼ���ʼ
	 */
	private String startCredit;

	/** 
	* �����ۼ��ƹ�����ʼֵ
	 */
	private String startTotalaction;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndAuctioncount(String endAuctioncount) {
		this.endAuctioncount = endAuctioncount;
	}
	public String getEndAuctioncount() {
		return this.endAuctioncount;
	}

	public void setEndCommissionrate(String endCommissionrate) {
		this.endCommissionrate = endCommissionrate;
	}
	public String getEndCommissionrate() {
		return this.endCommissionrate;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}
	public String getEndCredit() {
		return this.endCredit;
	}

	public void setEndTotalaction(String endTotalaction) {
		this.endTotalaction = endTotalaction;
	}
	public String getEndTotalaction() {
		return this.endTotalaction;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return this.keyword;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOnlyMall(Boolean onlyMall) {
		this.onlyMall = onlyMall;
	}
	public Boolean getOnlyMall() {
		return this.onlyMall;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
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

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
	}

	public void setStartAuctioncount(String startAuctioncount) {
		this.startAuctioncount = startAuctioncount;
	}
	public String getStartAuctioncount() {
		return this.startAuctioncount;
	}

	public void setStartCommissionrate(String startCommissionrate) {
		this.startCommissionrate = startCommissionrate;
	}
	public String getStartCommissionrate() {
		return this.startCommissionrate;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}
	public String getStartCredit() {
		return this.startCredit;
	}

	public void setStartTotalaction(String startTotalaction) {
		this.startTotalaction = startTotalaction;
	}
	public String getStartTotalaction() {
		return this.startTotalaction;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.shops.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("end_auctioncount", this.endAuctioncount);
		txtParams.put("end_commissionrate", this.endCommissionrate);
		txtParams.put("end_credit", this.endCredit);
		txtParams.put("end_totalaction", this.endTotalaction);
		txtParams.put("fields", this.fields);
		txtParams.put("keyword", this.keyword);
		txtParams.put("nick", this.nick);
		txtParams.put("only_mall", this.onlyMall);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pid", this.pid);
		txtParams.put("start_auctioncount", this.startAuctioncount);
		txtParams.put("start_commissionrate", this.startCommissionrate);
		txtParams.put("start_credit", this.startCredit);
		txtParams.put("start_totalaction", this.startTotalaction);
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

	public Class<TaobaokeShopsGetResponse> getResponseClass() {
		return TaobaokeShopsGetResponse.class;
	}
}
