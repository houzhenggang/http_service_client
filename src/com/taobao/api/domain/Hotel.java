package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Hotel���Ƶ꣩�ṹ�����ֶ���ϸ˵���ɲο��ӿڶ��壬�磺�Ƶ귢���ӿڡ�
 *
 * @author auto create
 * @since 1.0, 2011-05-30 09:47:04.0
 */
public class Hotel extends TaobaoObject {

	private static final long serialVersionUID = 8783871732147517794L;

	/**
	 * �Ƶ��ַ
	 */
	@ApiField("address")
	private String address;

	/**
	 * ���б���
	 */
	@ApiField("city")
	private Long city;

	/**
	 * ������������
	 */
	@ApiField("city_str")
	private String cityStr;

	/**
	 * ���ұ���
	 */
	@ApiField("country")
	private String country;

	/**
	 * ������������
	 */
	@ApiField("country_str")
	private String countryStr;

	/**
	 * ����ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * װ��ʱ��
	 */
	@ApiField("decorate_time")
	private String decorateTime;

	/**
	 * �Ƶ����
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * �������
	 */
	@ApiField("district")
	private Long district;

	/**
	 * ������������
	 */
	@ApiField("district_str")
	private String districtStr;

	/**
	 * �Ƶ�id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * �Ƶ꼶��
	 */
	@ApiField("level")
	private String level;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �Ƶ�����
	 */
	@ApiField("name")
	private String name;

	/**
	 * ��ҵʱ��
	 */
	@ApiField("opening_time")
	private String openingTime;

	/**
	 * �Ƶ궨λ
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * �Ƶ�ͼƬurl
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ʡ�ݱ���
	 */
	@ApiField("province")
	private Long province;

	/**
	 * ʡ����������
	 */
	@ApiField("province_str")
	private String provinceStr;

	/**
	 * �����б�
	 */
	@ApiListField("room_types")
	@ApiField("room_type")
	private List<RoomType> roomTypes;

	/**
	 * ������
	 */
	@ApiField("rooms")
	private Long rooms;

	/**
	 * ��ͨ��������ʩ����JSON��ʽ����
	 */
	@ApiField("service")
	private String service;

	/**
	 * ״̬��0������ˣ�1�����������ͨ������2����˷����3��ͣ��
	 */
	@ApiField("status")
	private Long status;

	/**
	 * ¥����
	 */
	@ApiField("storeys")
	private Long storeys;

	/**
	 * �Ƶ�绰
	 */
	@ApiField("tel")
	private String tel;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCity() {
		return this.city;
	}
	public void setCity(Long city) {
		this.city = city;
	}

	public String getCityStr() {
		return this.cityStr;
	}
	public void setCityStr(String cityStr) {
		this.cityStr = cityStr;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryStr() {
		return this.countryStr;
	}
	public void setCountryStr(String countryStr) {
		this.countryStr = countryStr;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDecorateTime() {
		return this.decorateTime;
	}
	public void setDecorateTime(String decorateTime) {
		this.decorateTime = decorateTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getDistrict() {
		return this.district;
	}
	public void setDistrict(Long district) {
		this.district = district;
	}

	public String getDistrictStr() {
		return this.districtStr;
	}
	public void setDistrictStr(String districtStr) {
		this.districtStr = districtStr;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpeningTime() {
		return this.openingTime;
	}
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getProvince() {
		return this.province;
	}
	public void setProvince(Long province) {
		this.province = province;
	}

	public String getProvinceStr() {
		return this.provinceStr;
	}
	public void setProvinceStr(String provinceStr) {
		this.provinceStr = provinceStr;
	}

	public List<RoomType> getRoomTypes() {
		return this.roomTypes;
	}
	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}

	public Long getRooms() {
		return this.rooms;
	}
	public void setRooms(Long rooms) {
		this.rooms = rooms;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStoreys() {
		return this.storeys;
	}
	public void setStoreys(Long storeys) {
		this.storeys = storeys;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
