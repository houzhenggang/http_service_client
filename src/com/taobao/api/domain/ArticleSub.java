package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Ӧ�ö�����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-15 11:46:10.0
 */
public class ArticleSub extends TaobaoObject {

	private static final long serialVersionUID = 5288989281296876757L;

	/**
	 * Ӧ���շѴ��룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ���ø�Ӧ�õ��շѴ���
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * Ӧ������
	 */
	@ApiField("article_name")
	private String articleName;

	/**
	 * �Ƿ��Զ�����
	 */
	@ApiField("autosub")
	private Boolean autosub;

	/**
	 * ������ϵ����ʱ��
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * �Ƿ�������
	 */
	@ApiField("expire_notice")
	private Boolean expireNotice;

	/**
	 * �շ���Ŀ���룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ�����շ���Ŀ����
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * �շ���Ŀ����
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * �Ա���Ա��
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ״̬��1=��Ч 2=����
	 */
	@ApiField("status")
	private Long status;

	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleName() {
		return this.articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Boolean getAutosub() {
		return this.autosub;
	}
	public void setAutosub(Boolean autosub) {
		this.autosub = autosub;
	}

	public Date getDeadline() {
		return this.deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Boolean getExpireNotice() {
		return this.expireNotice;
	}
	public void setExpireNotice(Boolean expireNotice) {
		this.expireNotice = expireNotice;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
