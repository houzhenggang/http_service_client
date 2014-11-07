package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˷ѷ�ʽģ���շѷ�ʽ
 *
 * @author auto create
 * @since 1.0, 2010-04-21 15:52:10.0
 */
public class PostageMode extends TaobaoObject {

	private static final long serialVersionUID = 1821496983872237173L;

	/**
	 * �ʷ������漰�ĵ���,��������ö�������������;������taobao.areas.get�ӿڻ�ȡ.���߲ο�:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm �� (110000,310000,320000,330000).�ʹ����ʷ������� 
��(����,�Ϻ�,����,�㽭)�ĸ�����.��дʱҪע����յ�������ֵ,�����������������,������ִ�����Ϣ.
	 */
	@ApiField("dests")
	private String dests;

	/**
	 * �˷ѷ�ʽ��id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �˷�����
	 */
	@ApiField("increase")
	private String increase;

	/**
	 * �˷�ģ��ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * �˷ѵ���
	 */
	@ApiField("price")
	private String price;

	/**
	 * �˷ѷ�ʽ(Ŀǰ�ṩ):ƽ��(post),��ݹ�˾(express),EMS(ems)
	 */
	@ApiField("type")
	private String type;

	public String getDests() {
		return this.dests;
	}
	public void setDests(String dests) {
		this.dests = dests;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIncrease() {
		return this.increase;
	}
	public void setIncrease(String increase) {
		this.increase = increase;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
