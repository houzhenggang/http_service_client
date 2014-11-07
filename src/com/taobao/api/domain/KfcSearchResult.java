package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * KFC �ؼ��ʹ���ƥ����
 *
 * @author auto create
 * @since 1.0, 2010-07-01 14:13:17.0
 */
public class KfcSearchResult extends TaobaoObject {

	private static final long serialVersionUID = 6236383117674289853L;

	/**
	 * ���˺���ı���
��ƥ�䵽B�ȼ��Ĵ�ʱ���ı��еĹؼ��ʱ��滻Ϊ*�ţ�content��Ϊ�ؼ����滻����ı���
���������contentʼ��Ϊnull
	 */
	@ApiField("content")
	private String content;

	/**
	 * ƥ�䵽�Ĺؼ��ʵĵȼ���ֵΪnull����ΪA��B��C��D��
��ƥ�䲻���ؼ���ʱ��ֵΪnull������ֵΪA��B��C��D�е�һ����
A��B��C��D�ȼ������س̶ȴӸ��������С�
	 */
	@ApiField("level")
	private String level;

	/**
	 * �Ƿ�ƥ�䵽�ؼ���,ƥ�䵽��Ϊtrue.
	 */
	@ApiField("matched")
	private Boolean matched;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public Boolean getMatched() {
		return this.matched;
	}
	public void setMatched(Boolean matched) {
		this.matched = matched;
	}

}
