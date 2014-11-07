package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeVirtualcardGetResponse;

/**
 * TOP API: taobao.taobaoke.virtualcard.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TaobaokeVirtualcardGetRequest implements TaobaoRequest<TaobaokeVirtualcardGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �绰������Ŀǰֻ�����µ���֧��:
�㽭
				�Ϻ�
				����
				�㶫
				����
				ɽ��
				����
				����
				����
				�Ĵ�
				����
				���
				����
				�ӱ�
				����
				����
				�½�
				����
				�ຣ
				����
				����
				����
				����
				������
				����
				����
				����
				����
				����
				����
				ɽ��
	 */
	private String area;

	/** 
	* �绰������Ϸ�㿨���.
�绰����phoneCard����Ϸ����gameCard

ע��:����ǵ绰����ѯ,�� area,operator,price,card_type���Ǳ���Ĳ���. 
�������Ϸ����ѯ,��game_name,price,card_type�Ǳ������
	 */
	private String bizType;

	/** 
	* �绰��ֵ������.
���Ҵ��䣺autoship���Զ�������autopost��10���Ӵ��䣺10minship
	 */
	private String cardType;

	/** 
	* �践�ص��ֶ��б�.��ѡֵ:num_iid,title,nick,pic_url,price,click_url,commission,ommission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume ;�ֶ�֮����","�ָ�
	 */
	private String fields;

	/** 
	* ��Ϸ��,Ŀǰֻ֧��������Ϸ:
ħ������
				����֮��
				�漣����
				��;
				��Ѫ����
				��������
				�λ�����
				������
				���ƺ���
				�����˲�
				��������
				ħ��
				����
				��Ѫ����
				�ʵ�
				������
				����������ʰ�
				��������
				�����⴫
				���������
				������Ե
				�����
				QQ����
				������
				ð�յ�
				ˮ�Q��
				�ʺ絺
				��ͷ����
				���ܿ�����
				����ȺӢ��
				���춯��
				��������
				�λù���
				����
				����
				׿Խ֮��
				����
				��������
				�Ʒ�
				����Q��
				����Ӣ��
				��Ӣ�����
				�ų�֮Ұ��
				�����ɶ�
				���
				�������⴫
				SD�Ҵ�
				��Խ����
				QQ���ɻ���
				QQ����
				QQ����
				�����⴫
				�����
				���³�����ʿ
	 */
	private String gameName;

	/** 
	* �Ա��û��ǳƣ�ע��ָ�����Ա��Ļ�Ա��¼��.����ǳƴ���,��ô�ͻ����ղ���Ӷ��.ÿ���Ա��ǳƶ���Ӧ��һ��pid������������Ҫ����Ӷ����Ա��ǳƣ����ƹ����Ʒ�ɹ���Ӷ�������������Ա��ǳƵ��˻����������Ϣ���Ե��밢���������վ�鿴
	 */
	private String nick;

	/** 
	* �绰����Ӫ��.
1:�ƶ� 2:��ͨ 3:����
	 */
	private String operator;

	/** 
	* �Զ������봮.��ʽ:Ӣ�ĺ��������;���Ȳ��ܴ���12���ַ�,���ֲ�ͬ���ƹ�����,��:bbs,��ʾbbsΪ�ƹ�����;blog,��ʾblogΪ�ƹ�����.
	 */
	private String outerCode;

	/** 
	* ���ҳ��.1~99
	 */
	private Long pageNo;

	/** 
	* ÿҳ���ؽ����.���ÿҳ40
	 */
	private Long pageSize;

	/** 
	* �Կ�id
	 */
	private String pid;

	/** 
	* ��ֵ����ֵ.Ŀǰֻ֧��������ֵ:
  1,
        10, 
        20, 
        30, 
        50, 
        100,
        200,
        300,
        500, 
        1000
	 */
	private String price;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType() {
		return this.cardType;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameName() {
		return this.gameName;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
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

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid() {
		return this.pid;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return this.price;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.virtualcard.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("card_type", this.cardType);
		txtParams.put("fields", this.fields);
		txtParams.put("game_name", this.gameName);
		txtParams.put("nick", this.nick);
		txtParams.put("operator", this.operator);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pid", this.pid);
		txtParams.put("price", this.price);
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

	public Class<TaobaokeVirtualcardGetResponse> getResponseClass() {
		return TaobaokeVirtualcardGetResponse.class;
	}
}
