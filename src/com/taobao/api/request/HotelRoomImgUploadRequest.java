package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomImgUploadResponse;

/**
 * TOP API: taobao.hotel.room.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class HotelRoomImgUploadRequest implements TaobaoUploadRequest<HotelRoomImgUploadResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƶ귿����Ʒgid������Ϊ���֡�
	 */
	private Long gid;

	/** 
	* �Ƶ���ƷͼƬ������:JPG,GIF;��󳤶�:500K��֧�ֵ��ļ����ͣ�gif,jpg,jpeg,png��
���ԭͼƬ����5�ţ���û����Ż���Ŵ���ԭͼƬ����������ԭͼƬ�����ӣ�������Ų��뵽ԭͼƬ��ȥ���Զ����ơ�
���ԭͼƬ����5�ţ���û����ţ����滻���һ��ͼƬ�����������λ�ò��룬ͼƬ����ƣ����һ�ű�ɾ����
	 */
	private FileItem pic;

	/** 
	* ͼƬ��ţ���ѡֵ��1��2��3��4��5
	 */
	private Long position;

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}
	public FileItem getPic() {
		return this.pic;
	}

	public void setPosition(Long position) {
		this.position = position;
	}
	public Long getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.img.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gid", this.gid);
		txtParams.put("position", this.position);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", this.pic);
		return params;
	}

	public Class<HotelRoomImgUploadResponse> getResponseClass() {
		return HotelRoomImgUploadResponse.class;
	}
}
