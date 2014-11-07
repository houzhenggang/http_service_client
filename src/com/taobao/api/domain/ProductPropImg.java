package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ����ͼƬ
 *
 * @author auto create
 * @since 1.0, 2010-05-11 16:32:29.0
 */
public class ProductPropImg extends TaobaoObject {

	private static final long serialVersionUID = 7268653671633425226L;

	/**
	 * ���ʱ��.��ʽ:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��Ʒ����ͼƬID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �޸�ʱ��.��ʽ:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ͼƬ��š���Ʒ���ͼƬչʾ˳������ԽСԽ��ǰ��Ҫ������������
	 */
	@ApiField("position")
	private Long position;

	/**
	 * ͼƬ������Ʒ��ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * ���Դ�(pid:vid),Ŀǰֻ����ɫ����.��:��ɫ:��ɫ��ʾΪ��1627207:28326
	 */
	@ApiField("props")
	private String props;

	/**
	 * ͼƬ��ַ.(���Ե�ַ,��ʽ:http://host/image_path)
	 */
	@ApiField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
