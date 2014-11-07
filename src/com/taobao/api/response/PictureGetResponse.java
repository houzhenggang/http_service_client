package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Picture;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-29 20:30:37.0
 */
public class PictureGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6243195867472273181L;

	/** 
	 * ͼƬ��Ϣ�б�
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/** 
	 * �ܵĽ����
	 */
	@ApiField("totalResults")
	private Long totalResults;

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<Picture> getPictures( ) {
		return this.pictures;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
