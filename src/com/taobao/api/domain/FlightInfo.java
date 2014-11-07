package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ������Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-11-25 16:06:39.0
 */
public class FlightInfo extends TaobaoObject {

	private static final long serialVersionUID = 1123288515456143483L;

	/**
	 * ���չ�˾������
	 */
	@ApiField("airline_code")
	private String airlineCode;

	/**
	 * ���չ�˾����
	 */
	@ApiField("airline_name")
	private String airlineName;

	/**
	 * �������������
	 */
	@ApiField("arr_airport_code")
	private String arrAirportCode;

	/**
	 * �����������
	 */
	@ApiField("arr_airport_name")
	private String arrAirportName;

	/**
	 * �������ڣ�������Ҫ���и�ʽ��
	 */
	@ApiField("arr_date")
	private Date arrDate;

	/**
	 * ����ʱ�䣬������Ҫ���и�ʽ��
	 */
	@ApiField("arr_time")
	private Date arrTime;

	/**
	 * ������Ϣ�еĲ�λ��Ϣ�б�
	 */
	@ApiListField("cabin_price_list")
	@ApiField("cabin_price")
	private List<CabinPrice> cabinPriceList;

	/**
	 * ���˺���
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * ��������������
	 */
	@ApiField("dep_airport_code")
	private String depAirportCode;

	/**
	 * ������������
	 */
	@ApiField("dep_airport_name")
	private String depAirportName;

	/**
	 * �������ڣ�������Ҫ���и�ʽ��
	 */
	@ApiField("dep_date")
	private Date depDate;

	/**
	 * ����ʱ�䣬������Ҫ���и�ʽ��
	 */
	@ApiField("dep_time")
	private Date depTime;

	/**
	 * ��������ѣ��Է�Ϊ��λ
	 */
	@ApiField("fees")
	private Long fees;

	/**
	 * �����
	 */
	@ApiField("flight")
	private String flight;

	/**
	 * ����
	 */
	@ApiField("flight_type")
	private String flightType;

	/**
	 * ����id��tb��Ʊϵͳ���У���������⣬�¶���ʱ�����ֶ�
	 */
	@ApiField("id")
	private String id;

	/**
	 * �Ƿ��ṩ����
	 */
	@ApiField("meals")
	private Long meals;

	/**
	 * ���
	 */
	@ApiField("miles")
	private Long miles;

	/**
	 * ��׼�۸�Y�ռ۸��Է�Ϊ��λ
	 */
	@ApiField("stand_price")
	private Long standPrice;

	/**
	 * תͣ
	 */
	@ApiField("stops")
	private Long stops;

	/**
	 * ȼ��˰���Է�Ϊ��λ
	 */
	@ApiField("taxes")
	private Long taxes;

	public String getAirlineCode() {
		return this.airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getAirlineName() {
		return this.airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getArrAirportCode() {
		return this.arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}

	public String getArrAirportName() {
		return this.arrAirportName;
	}
	public void setArrAirportName(String arrAirportName) {
		this.arrAirportName = arrAirportName;
	}

	public Date getArrDate() {
		return this.arrDate;
	}
	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public Date getArrTime() {
		return this.arrTime;
	}
	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
	}

	public List<CabinPrice> getCabinPriceList() {
		return this.cabinPriceList;
	}
	public void setCabinPriceList(List<CabinPrice> cabinPriceList) {
		this.cabinPriceList = cabinPriceList;
	}

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getDepAirportCode() {
		return this.depAirportCode;
	}
	public void setDepAirportCode(String depAirportCode) {
		this.depAirportCode = depAirportCode;
	}

	public String getDepAirportName() {
		return this.depAirportName;
	}
	public void setDepAirportName(String depAirportName) {
		this.depAirportName = depAirportName;
	}

	public Date getDepDate() {
		return this.depDate;
	}
	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Date getDepTime() {
		return this.depTime;
	}
	public void setDepTime(Date depTime) {
		this.depTime = depTime;
	}

	public Long getFees() {
		return this.fees;
	}
	public void setFees(Long fees) {
		this.fees = fees;
	}

	public String getFlight() {
		return this.flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getFlightType() {
		return this.flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getMeals() {
		return this.meals;
	}
	public void setMeals(Long meals) {
		this.meals = meals;
	}

	public Long getMiles() {
		return this.miles;
	}
	public void setMiles(Long miles) {
		this.miles = miles;
	}

	public Long getStandPrice() {
		return this.standPrice;
	}
	public void setStandPrice(Long standPrice) {
		this.standPrice = standPrice;
	}

	public Long getStops() {
		return this.stops;
	}
	public void setStops(Long stops) {
		this.stops = stops;
	}

	public Long getTaxes() {
		return this.taxes;
	}
	public void setTaxes(Long taxes) {
		this.taxes = taxes;
	}

}
