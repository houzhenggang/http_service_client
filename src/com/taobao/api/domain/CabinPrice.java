package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��λ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-11-19 18:09:14.0
 */
public class CabinPrice extends TaobaoObject {

	private static final long serialVersionUID = 1359986624675431265L;

	/**
	 * �������۵�ǰ��λ�Ĵ�����id�б�
	 */
	@ApiField("air_supply_ids")
	private String airSupplyIds;

	/**
	 * ��λ�ȼ���
-1����ȷ����
0��ͷ�Ȳգ�
1������գ�
2�����ò�
	 */
	@ApiField("cabin_class")
	private Long cabinClass;

	/**
	 * ��λ���룺��A-Z�������չ�˾�Ĳ�λ����
	 */
	@ApiField("cabin_code")
	private String cabinCode;

	/**
	 * ��Ʒ����˵���������Ʒ
	 */
	@ApiField("cabin_memo")
	private String cabinMemo;

	/**
	 * ʣ�����Ʊ����
0��9����ʾʣ��0~9��
A����ʾ����9��
	 */
	@ApiField("cabin_num")
	private String cabinNum;

	/**
	 * ʵ�����ۼ۸��Է�Ϊ��λ
	 */
	@ApiField("cabin_price")
	private Long cabinPrice;

	/**
	 * ��Ʒ���ͣ�
6����ͨ�ؼۣ�
8��������Ʒ��
10�������Ʒ
	 */
	@ApiField("cabin_type")
	private String cabinType;

	/**
	 * ��ͯƱ�۸��Է�Ϊ��λ
	 */
	@ApiField("child_cabin_price")
	private Long childCabinPrice;

	/**
	 * ��λ�ۿۣ�10~90
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * ����id
	 */
	@ApiField("flight_id")
	private Long flightId;

	/**
	 * ��λid
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �ⲿ��Ʒ���ͣ������չ�˾��Ʒ���ͣ�������ڣ��µ�ʱ�������
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * �ۼ���Ǯ���Է�Ϊ��λ
	 */
	@ApiField("return_fee")
	private Long returnFee;

	/**
	 * �ؼ�/����/�����Ʒid�����Ϊ�������Ʒ֮һ���µ�ʱ�������
	 */
	@ApiField("special_product_id")
	private Long specialProductId;

	/**
	 * �˸�ǩ����
	 */
	@ApiField("tui_gai_qian")
	private String tuiGaiQian;

	public String getAirSupplyIds() {
		return this.airSupplyIds;
	}
	public void setAirSupplyIds(String airSupplyIds) {
		this.airSupplyIds = airSupplyIds;
	}

	public Long getCabinClass() {
		return this.cabinClass;
	}
	public void setCabinClass(Long cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getCabinCode() {
		return this.cabinCode;
	}
	public void setCabinCode(String cabinCode) {
		this.cabinCode = cabinCode;
	}

	public String getCabinMemo() {
		return this.cabinMemo;
	}
	public void setCabinMemo(String cabinMemo) {
		this.cabinMemo = cabinMemo;
	}

	public String getCabinNum() {
		return this.cabinNum;
	}
	public void setCabinNum(String cabinNum) {
		this.cabinNum = cabinNum;
	}

	public Long getCabinPrice() {
		return this.cabinPrice;
	}
	public void setCabinPrice(Long cabinPrice) {
		this.cabinPrice = cabinPrice;
	}

	public String getCabinType() {
		return this.cabinType;
	}
	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}

	public Long getChildCabinPrice() {
		return this.childCabinPrice;
	}
	public void setChildCabinPrice(Long childCabinPrice) {
		this.childCabinPrice = childCabinPrice;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Long getFlightId() {
		return this.flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public Long getReturnFee() {
		return this.returnFee;
	}
	public void setReturnFee(Long returnFee) {
		this.returnFee = returnFee;
	}

	public Long getSpecialProductId() {
		return this.specialProductId;
	}
	public void setSpecialProductId(Long specialProductId) {
		this.specialProductId = specialProductId;
	}

	public String getTuiGaiQian() {
		return this.tuiGaiQian;
	}
	public void setTuiGaiQian(String tuiGaiQian) {
		this.tuiGaiQian = tuiGaiQian;
	}

}
