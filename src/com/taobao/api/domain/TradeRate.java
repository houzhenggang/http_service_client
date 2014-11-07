package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����б�
 *
 * @author auto create
 * @since 1.0, 2011-03-10 09:34:52.0
 */
public class TradeRate extends TaobaoObject {

	private static final long serialVersionUID = 7878982572517414397L;

	/**
	 * ��������,��󳤶�:500������
	 */
	@ApiField("content")
	private String content;

	/**
	 * ���۴���ʱ��,��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��Ʒ�۸�,��ȷ��2λС��;��λ:Ԫ.��:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * ��Ʒ����
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * �������ǳ�
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * �Ӷ���ID
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * ���������ǳ�
	 */
	@ApiField("rated_nick")
	private String ratedNick;

	/**
	 * ���۽���,��󳤶�:500������
	 */
	@ApiField("reply")
	private String reply;

	/**
	 * ���۽��,��ѡֵ:good(����),neutral(����),bad(����)
	 */
	@ApiField("result")
	private String result;

	/**
	 * �����߽�ɫ.��ѡֵ:seller(����),buyer(���)
	 */
	@ApiField("role")
	private String role;

	/**
	 * ����ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ������Ϣ�Ƿ����ڼǷ֣�
��ȡֵ��true(����Ƿ�)��false(������Ƿ�)
	 */
	@ApiField("valid_score")
	private Boolean validScore;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getRatedNick() {
		return this.ratedNick;
	}
	public void setRatedNick(String ratedNick) {
		this.ratedNick = ratedNick;
	}

	public String getReply() {
		return this.reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Boolean getValidScore() {
		return this.validScore;
	}
	public void setValidScore(Boolean validScore) {
		this.validScore = validScore;
	}

}
