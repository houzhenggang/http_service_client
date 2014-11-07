package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelUpdateResponse;

/**
 * TOP API: taobao.hotel.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class HotelUpdateRequest implements TaobaoUploadRequest<HotelUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �Ƶ��ַ�����Ȳ��ܳ���120
	 */
	private String address;

	/** 
	* ���б��롣�μ���http://kezhan.trip.taobao.com/area.html��domesticΪfalseʱĬ��Ϊ0
	 */
	private Long city;

	/** 
	* domesticΪtrueʱ���̶�China��
domesticΪfalseʱ�����봫����ľƵꡣ�μ���http://kezhan.trip.taobao.com/countrys.html
	 */
	private String country;

	/** 
	* װ��ʱ�䡣���Ȳ��ܳ���4��
	 */
	private String decorateTime;

	/** 
	* �Ƶ���ܡ�������25000������
	 */
	private String desc;

	/** 
	* �����ؼ��У����롣�μ���http://kezhan.trip.taobao.com/area.html
	 */
	private Long district;

	/** 
	* �Ƿ���ھƵꡣ��ѡֵ��true��false
	 */
	private Boolean domestic;

	/** 
	* �Ƶ�id������Ϊ���֡�
	 */
	private Long hid;

	/** 
	* �Ƶ꼶�𡣿�ѡֵ��A,B,C,D,E,F�������ջ��Ԣ���������������Ǽ�/���¡����Ǽ�/���ʡ����Ǽ�/�ߵ������Ǽ�/����
	 */
	private String level;

	/** 
	* �Ƶ����ơ����ܳ���60�ֽ�
	 */
	private String name;

	/** 
	* ��ҵʱ�䡣���Ȳ��ܳ���4��
	 */
	private String openingTime;

	/** 
	* �Ƶ궨λ����ѡֵ��T,B���������ζȼ١��������
	 */
	private String orientation;

	/** 
	* �Ƶ�ͼƬ������:JPG,GIF;��󳤶�:500K��֧�ֵ��ļ����ͣ�gif,jpg,jpeg,png��
ͼƬû�д������������ͼƬ��ʹ��ԭ����ͼƬ
	 */
	private FileItem pic;

	/** 
	* ʡ�ݱ��롣�μ���http://kezhan.trip.taobao.com/area.html��domesticΪfalseʱĬ��Ϊ0
	 */
	private Long province;

	/** 
	* �����������Ȳ��ܳ���4��
	 */
	private Long rooms;

	/** 
	* ��ͨ��������ʩ����JSON��ʽ��cityCenterDistance��railwayDistance��airportDistance�ֱ������������ġ������վ�����������������Ϊ������3λ��������Ĭ��-1���������ݡ�
����keyֵtrue�����д˷���false����û�С�
parking��ͣ������airportShuttle���������ͣ�rentCar���⳵��meetingRoom�������ң�businessCenter���������ģ�swimmingPool����Ӿ�أ�fitnessClub���������ģ�laundry��ϴ�·���morningCall���������bankCard���������п���creditCard���������ÿ���chineseRestaurant���в�����westernRestaurant����������cafe����������bar���ưɣ�ktv��KTV��
�磺
{"airportShuttle":true,"parking":false,"fitnessClub":false,"chineseRestaurant":false,"rentCar":false,"laundry":false,"bankCard":false,"cityCenterDistance":-1,"creditCard":false,"westernRestaurant":false,"ktv":false,"railwayDistance":-1,"swimmingPool":false,"cafe":false,"businessCenter":false,"morningCall":false,"bar":false,"meetingRoom":false,"airportDistance":-1}
	 */
	private String service;

	/** 
	* ¥���������Ȳ��ܳ���4��
	 */
	private Long storeys;

	/** 
	* �Ƶ�绰����ʽ�����Ҵ��루�6λ��#���ţ��4λ��#�绰���20λ�������Ҵ�����ʾ���й���½0086�����00852������00853��̨��00886
	 */
	private String tel;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setCity(Long city) {
		this.city = city;
	}
	public Long getCity() {
		return this.city;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return this.country;
	}

	public void setDecorateTime(String decorateTime) {
		this.decorateTime = decorateTime;
	}
	public String getDecorateTime() {
		return this.decorateTime;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setDistrict(Long district) {
		this.district = district;
	}
	public Long getDistrict() {
		return this.district;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}
	public Boolean getDomestic() {
		return this.domestic;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}
	public Long getHid() {
		return this.hid;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel() {
		return this.level;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}
	public String getOpeningTime() {
		return this.openingTime;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getOrientation() {
		return this.orientation;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}
	public FileItem getPic() {
		return this.pic;
	}

	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getProvince() {
		return this.province;
	}

	public void setRooms(Long rooms) {
		this.rooms = rooms;
	}
	public Long getRooms() {
		return this.rooms;
	}

	public void setService(String service) {
		this.service = service;
	}
	public String getService() {
		return this.service;
	}

	public void setStoreys(Long storeys) {
		this.storeys = storeys;
	}
	public Long getStoreys() {
		return this.storeys;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return this.tel;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("address", this.address);
		txtParams.put("city", this.city);
		txtParams.put("country", this.country);
		txtParams.put("decorate_time", this.decorateTime);
		txtParams.put("desc", this.desc);
		txtParams.put("district", this.district);
		txtParams.put("domestic", this.domestic);
		txtParams.put("hid", this.hid);
		txtParams.put("level", this.level);
		txtParams.put("name", this.name);
		txtParams.put("opening_time", this.openingTime);
		txtParams.put("orientation", this.orientation);
		txtParams.put("province", this.province);
		txtParams.put("rooms", this.rooms);
		txtParams.put("service", this.service);
		txtParams.put("storeys", this.storeys);
		txtParams.put("tel", this.tel);
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

	public Class<HotelUpdateResponse> getResponseClass() {
		return HotelUpdateResponse.class;
	}
}
