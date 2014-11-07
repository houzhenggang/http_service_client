package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeItemsGetResponse;

/**
 * TOP API: taobao.taobaoke.items.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class TaobaokeItemsGetRequest implements TaobaoRequest<TaobaokeItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ���ڵ�
	 */
	private String area;

	/** 
	* �Ƿ��Զ�����
	 */
	private String autoSend;

	/** 
	* �Ƿ�֧�ֵּ�ȯ������Ϊtrue��ʾ����Ʒ֧�ֵּ�ȯ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String cashCoupon;

	/** 
	* �Ƿ�֧�ֻ����������Ϊtrue��ʾ����Ʒ��֧�ֻ����������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String cashOndelivery;

	/** 
	* ��Ʒ��������id
	 */
	private Long cid;

	/** 
	* ����ۼ��ƹ�Ӷ��ѡ��
	 */
	private String endCommissionNum;

	/** 
	* ���Ӷ�����ѡ��磺2345��ʾ23.45%��ע��Ҫ��ʼӶ����ʺ����Ӷ�����һ�����ò���Ч��
	 */
	private String endCommissionRate;

	/** 
	* ��ѡֵ��start_creditһ��.start_credit��ֵһ��ҪС�ڻ����end_credit��ֵ��ע��end_credit��start_creditһ��ʹ�ò���Ч
	 */
	private String endCredit;

	/** 
	* ��߼۸�
	 */
	private String endPrice;

	/** 
	* �ۼ��ƹ�����Χ����
	 */
	private String endTotalnum;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:num_iid,title,nick,pic_url,price,click_url,commission,commission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume
;�ֶ�֮����","�ָ�
	 */
	private String fields;

	/** 
	* �Ƿ��ѯ��������
	 */
	private String guarantee;

	/** 
	* ��ʶһ��Ӧ���Ƿ��������߻����ֻ�Ӧ��,�����true���ʹ������������ܵ����.�������ֵ,��Ĭ����false.
	 */
	private Boolean isMobile;

	/** 
	* ��Ʒ�����а����Ĺؼ���. ע��:��ѯʱkeyword,cid����ѡ������һ������
	 */
	private String keyword;

	/** 
	* �Ƿ��̳ǵ���Ʒ������Ϊtrue��ʾ����Ʒ�������Ա��̳ǵ���Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String mallItem;

	/** 
	* �Ա��û��ǳƣ�ע��ָ�����Ա��Ļ�Ա��¼��.����ǳƴ���,��ô�ͻ����ղ���Ӷ��.ÿ���Ա��ǳƶ���Ӧ��һ��pid������������Ҫ����Ӷ����Ա��ǳƣ����ƹ����Ʒ�ɹ���Ӷ�������������Ա��ǳƵ��˻����������Ϣ���Ե��밢���������վ�鿴.
<font color="red">ע��nick��pid������Ҫ����һ��,���2��������,����pidΪ׼</font>
	 */
	private String nick;

	/** 
	* �Ƿ�30��ά�ޣ�����Ϊtrue��ʾ����Ʒ��֧��30��ά�ޣ�����Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String onemonthRepair;

	/** 
	* �Զ������봮.��ʽ:Ӣ�ĺ��������;���Ȳ��ܴ���12���ַ�,���ֲ�ͬ���ƹ�����,��:bbs,��ʾbbsΪ�ƹ�����;blog,��ʾblogΪ�ƹ�����.
	 */
	private String outerCode;

	/** 
	* �Ƿ�����Ʒ������Ϊtrue��ʾ����Ʒ�����ں�����Ʒ��Ĭ��Ϊfalse
	 */
	private String overseasItem;

	/** 
	* ���ҳ��.1~99
	 */
	private Long pageNo;

	/** 
	* ÿҳ���ؽ����.���ÿҳ40
	 */
	private Long pageSize;

	/** 
	* �û���pid,������mm_xxxx_0_0���ָ�ʽ�м��"xxxx".
<font color="red">ע��nick��pid������Ҫ����һ��,���2��������,����pidΪ׼,��pid����󳤶���20</font>
	 */
	private String pid;

	/** 
	* �Ƿ���ʵ����(��:�����⸶)��Ʒ������Ϊtrue��ʾ����Ʒ����ʵ��������Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String realDescribe;

	/** 
	* �Ƿ�֧��7���˻�������Ϊtrue��ʾ����Ʒ֧��7���˻�������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String sevendaysReturn;

	/** 
	* Ĭ������:default

price_desc(�۸�Ӹߵ���) 
price_asc(�۸�ӵ͵���) 
credit_desc(���õȼ��Ӹߵ���) 
commissionRate_desc(Ӷ����ʴӸߵ���) 
commissionRate_asc(Ӷ����ʴӵ͵���) 
commissionNum_desc(�ɽ����ɸߵ���) 
commissionNum_asc(�ɽ����ӵ͵���) 
commissionVolume_desc(��֧��Ӷ��Ӹߵ���) 
commissionVolume_asc(��֧��Ӷ��ӵ͵���) 
delistTime_desc(��Ʒ�¼�ʱ��Ӹߵ���) 
delistTime_asc(��Ʒ�¼�ʱ��ӵ͵���)
	 */
	private String sort;

	/** 
	* ��ʼ�ۼ��ƹ���Ӷ��.ע�����ص�������30�����ۼ��ƹ������߸��ֶ�Ҫ������ۼ��ƹ���һ��ʹ�ò���Ч
	 */
	private String startCommissionNum;

	/** 
	* ��ʼӶ�����ѡ��磺1234��ʾ12.34%
	 */
	private String startCommissionRate;

	/** 
	* ��������:

1heart(һ��) 
2heart (����) 
3heart(����) 
4heart(����) 
5heart(����) 
1diamond(һ��) 
2diamond(����) 
3diamond(����) 
4diamond(����) 
5diamond(����) 
1crown(һ��) 
2crown(����) 
3crown(����) 
4crown(�Ĺ�) 
5crown(���) 
1goldencrown(һ�ƹ�) 
2goldencrown(���ƹ�) 
3goldencrown(���ƹ�) 
4goldencrown(�Ļƹ�) 
5goldencrown(��ƹ�)
	 */
	private String startCredit;

	/** 
	* ��ʼ�۸�.����۸����ʱ,��ע����ʼ�۸����߼۸����һ����,���� start_price <= end_price
	 */
	private String startPrice;

	/** 
	* �ۼ��ƹ�����Χ��ʼ
	 */
	private String startTotalnum;

	/** 
	* �Ƿ�֧��VIP��������Ϊtrue��ʾ����Ʒ֧��VIP��������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private String vipCard;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setAutoSend(String autoSend) {
		this.autoSend = autoSend;
	}
	public String getAutoSend() {
		return this.autoSend;
	}

	public void setCashCoupon(String cashCoupon) {
		this.cashCoupon = cashCoupon;
	}
	public String getCashCoupon() {
		return this.cashCoupon;
	}

	public void setCashOndelivery(String cashOndelivery) {
		this.cashOndelivery = cashOndelivery;
	}
	public String getCashOndelivery() {
		return this.cashOndelivery;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}
	public String getEndCommissionNum() {
		return this.endCommissionNum;
	}

	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}
	public String getEndCommissionRate() {
		return this.endCommissionRate;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}
	public String getEndCredit() {
		return this.endCredit;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getEndPrice() {
		return this.endPrice;
	}

	public void setEndTotalnum(String endTotalnum) {
		this.endTotalnum = endTotalnum;
	}
	public String getEndTotalnum() {
		return this.endTotalnum;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	public String getGuarantee() {
		return this.guarantee;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}
	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return this.keyword;
	}

	public void setMallItem(String mallItem) {
		this.mallItem = mallItem;
	}
	public String getMallItem() {
		return this.mallItem;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOnemonthRepair(String onemonthRepair) {
		this.onemonthRepair = onemonthRepair;
	}
	public String getOnemonthRepair() {
		return this.onemonthRepair;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOverseasItem(String overseasItem) {
		this.overseasItem = overseasItem;
	}
	public String getOverseasItem() {
		return this.overseasItem;
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

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid() {
		return this.pid;
	}

	public void setRealDescribe(String realDescribe) {
		this.realDescribe = realDescribe;
	}
	public String getRealDescribe() {
		return this.realDescribe;
	}

	public void setSevendaysReturn(String sevendaysReturn) {
		this.sevendaysReturn = sevendaysReturn;
	}
	public String getSevendaysReturn() {
		return this.sevendaysReturn;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSort() {
		return this.sort;
	}

	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}
	public String getStartCommissionNum() {
		return this.startCommissionNum;
	}

	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}
	public String getStartCommissionRate() {
		return this.startCommissionRate;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}
	public String getStartCredit() {
		return this.startCredit;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getStartPrice() {
		return this.startPrice;
	}

	public void setStartTotalnum(String startTotalnum) {
		this.startTotalnum = startTotalnum;
	}
	public String getStartTotalnum() {
		return this.startTotalnum;
	}

	public void setVipCard(String vipCard) {
		this.vipCard = vipCard;
	}
	public String getVipCard() {
		return this.vipCard;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("auto_send", this.autoSend);
		txtParams.put("cash_coupon", this.cashCoupon);
		txtParams.put("cash_ondelivery", this.cashOndelivery);
		txtParams.put("cid", this.cid);
		txtParams.put("end_commissionNum", this.endCommissionNum);
		txtParams.put("end_commissionRate", this.endCommissionRate);
		txtParams.put("end_credit", this.endCredit);
		txtParams.put("end_price", this.endPrice);
		txtParams.put("end_totalnum", this.endTotalnum);
		txtParams.put("fields", this.fields);
		txtParams.put("guarantee", this.guarantee);
		txtParams.put("is_mobile", this.isMobile);
		txtParams.put("keyword", this.keyword);
		txtParams.put("mall_item", this.mallItem);
		txtParams.put("nick", this.nick);
		txtParams.put("onemonth_repair", this.onemonthRepair);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("overseas_item", this.overseasItem);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pid", this.pid);
		txtParams.put("real_describe", this.realDescribe);
		txtParams.put("sevendays_return", this.sevendaysReturn);
		txtParams.put("sort", this.sort);
		txtParams.put("start_commissionNum", this.startCommissionNum);
		txtParams.put("start_commissionRate", this.startCommissionRate);
		txtParams.put("start_credit", this.startCredit);
		txtParams.put("start_price", this.startPrice);
		txtParams.put("start_totalnum", this.startTotalnum);
		txtParams.put("vip_card", this.vipCard);
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

	public Class<TaobaokeItemsGetResponse> getResponseClass() {
		return TaobaokeItemsGetResponse.class;
	}
}
