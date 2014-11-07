package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomUpdateResponse;

/**
 * TOP API: taobao.hotel.room.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class HotelRoomUpdateRequest implements TaobaoUploadRequest<HotelRoomUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �������ѡֵ��A,B,C,D���ֱ����
A��15ƽ�����£�B��16��30ƽ�ף�C��31��50ƽ�ף�D��50ƽ������
	 */
	private String area;

	/** 
	* �������A,B,C,D���ֱ����
A���޿����B����ѿ����C���շѿ����D�������շѿ��
	 */
	private String bbn;

	/** 
	* ���͡���ѡֵ��A,B,C,D,E,F,G,H,I���ֱ����A�����˴���B���󴲣�C��˫����D��˫��/�󴲣�E����ĸ����F�����´���G��Բ�δ���H���ല��I����������
	 */
	private String bedType;

	/** 
	* ��͡�A,B,C,D,E���ֱ����
A�����磬B�����磬C��˫�磬D�����磬E������
	 */
	private String breakfast;

	/** 
	* ����0��99999900������������payment_typeΪ����ʱ�������룬�洢�ĵ�λ�Ƿ֡����ܴ��Ƿ֡�
	 */
	private Long deposit;

	/** 
	* ��Ʒ���������ܳ���25000�����֣�50000���ַ�����
	 */
	private String desc;

	/** 
	* �����ѡ�0��99999900������������payment_typeΪ�����ѻ�������/��ҹʱ�������룬�洢�ĵ�λ�Ƿ֡����ܴ��Ƿ֡�
	 */
	private Long fee;

	/** 
	* �Ƶ귿����Ʒgid������Ϊ���֡�
	 */
	private Long gid;

	/** 
	* ������֪�����ܳ���4000�����֣�8000���ַ�����
	 */
	private String guide;

	/** 
	* ֧�����͡���ѡֵ��A,B,C,D���ֱ����
A��ȫ��֧����B�������ѣ�C������D��������/��ҹ
	 */
	private String paymentType;

	/** 
	* �Ƶ���ƷͼƬ������:JPG,GIF;��󳤶�:500K��֧�ֵ��ļ����ͣ�gif,jpg,jpeg,png�����µ�ʱ��ֻ�ܸ���һ��ͼƬ����ͼƬ����ԭ������ͼƬ�����������ʹ��ԭ������ͼƬ��
�����ٷ�ͼƬ����Ҫ������ƷͼƬ�ϴ��ӿڣ�1����Ʒ���5��ͼƬ��
	 */
	private FileItem pic;

	/** 
	* ��̬��Ϣ�����Դ����쿪ʼ90���ڵķ�̬��Ϣ�����ڱ���������JSON��ʽ���ݡ�
date������̬���ڣ���ʽΪYYYY-MM-DD��
price�������췿�ۣ�0��99999900���洢�ĵ�λ�Ƿ֣����ܴ��Ƿ�
num����������ۼ�����0��999��
�磺
[{"date":2011-01-28,"price":10000, "num":10},{"date":2011-01-29,"price":12000,"num":10}]
	 */
	private String roomQuotas;

	/** 
	* ��ʩ����JSON��ʽ��
valueֵtrue�д˷���falseû�С�
bar����̨��catv�����ߵ��ӣ�ddd�����ڳ�;�绰��idd�����ʳ�;�绰��toilet�����������䣬pubtoliet�����������䡣
�磺
{"bar":false,"catv":false,"ddd":false,"idd":false,"pubtoilet":false,"toilet":false}
	 */
	private String service;

	/** 
	* ������ѡֵ��A,B,C,D,E,F,G,H���ֱ����A��1�׼����£�B��1.1�ף�C��1.2�ף�D��1.35�ף�E��1.5�ף�F��1.8�ף�G��2�ף�H��2.2�׼�����
	 */
	private String size;

	/** 
	* ״̬����ѡֵ1��2��3��1���ϼܡ�2���¼ܡ�3��ɾ����������Ӧ״̬����ȥִ����Ӧ�Ĳ�����
	 */
	private Long status;

	/** 
	* ¥�㡣���Ȳ�����8
	 */
	private String storey;

	/** 
	* �Ƶ���Ʒ���ơ����ܳ���60�ֽ�
	 */
	private String title;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setBbn(String bbn) {
		this.bbn = bbn;
	}
	public String getBbn() {
		return this.bbn;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getBedType() {
		return this.bedType;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getBreakfast() {
		return this.breakfast;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}
	public Long getDeposit() {
		return this.deposit;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}
	public Long getFee() {
		return this.fee;
	}

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}
	public String getGuide() {
		return this.guide;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}
	public FileItem getPic() {
		return this.pic;
	}

	public void setRoomQuotas(String roomQuotas) {
		this.roomQuotas = roomQuotas;
	}
	public String getRoomQuotas() {
		return this.roomQuotas;
	}

	public void setService(String service) {
		this.service = service;
	}
	public String getService() {
		return this.service;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return this.size;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus() {
		return this.status;
	}

	public void setStorey(String storey) {
		this.storey = storey;
	}
	public String getStorey() {
		return this.storey;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("bbn", this.bbn);
		txtParams.put("bed_type", this.bedType);
		txtParams.put("breakfast", this.breakfast);
		txtParams.put("deposit", this.deposit);
		txtParams.put("desc", this.desc);
		txtParams.put("fee", this.fee);
		txtParams.put("gid", this.gid);
		txtParams.put("guide", this.guide);
		txtParams.put("payment_type", this.paymentType);
		txtParams.put("room_quotas", this.roomQuotas);
		txtParams.put("service", this.service);
		txtParams.put("size", this.size);
		txtParams.put("status", this.status);
		txtParams.put("storey", this.storey);
		txtParams.put("title", this.title);
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

	public Class<HotelRoomUpdateResponse> getResponseClass() {
		return HotelRoomUpdateResponse.class;
	}
}
