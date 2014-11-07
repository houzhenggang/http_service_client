package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RoomImage���Ƶ�ͼƬ���ṹ�����ֶ���ϸ˵���ɲο��ӿڶ��壬�磺��ƷͼƬ�ϴ��ӿڡ�
 *
 * @author auto create
 * @since 1.0, 2011-05-30 10:01:04.0
 */
public class RoomImage extends TaobaoObject {

	private static final long serialVersionUID = 3627839332396968434L;

	/**
	 * ��Ʒ����ͼƬ��url���á�,��������������ǰ����Ʒ������ͼƬ��ַ��
	 */
	@ApiField("all_images")
	private String allImages;

	/**
	 * �Ƶ���Ʒid
	 */
	@ApiField("gid")
	private Long gid;

	/**
	 * ͼƬurl����ǰ�ӿڲ�����ͼƬurl�������ϴ�ͼƬ�ӿ�ʱ�������ϴ�ͼƬ��õ���ͼƬurl������ɾ��ͼƬ�ӿ�ʱ������ɾ������ͼƬurl��
	 */
	@ApiField("image")
	private String image;

	/**
	 * ͼƬλ�ã���ѡֵ��1,2,3,4,5������ͼƬ��λ�ã��磺2������ڶ���ͼƬ��
	 */
	@ApiField("position")
	private Long position;

	public String getAllImages() {
		return this.allImages;
	}
	public void setAllImages(String allImages) {
		this.allImages = allImages;
	}

	public Long getGid() {
		return this.gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

}
