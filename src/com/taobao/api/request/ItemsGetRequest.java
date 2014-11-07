package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsGetResponse;

/**
 * TOP API: taobao.items.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItemsGetRequest implements TaobaoRequest<ItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ������ĿId,ItemCat�е�cid�ֶΡ�����ͨ��taobao.itemcats.getȡ��
	 */
	private Long cid;

	/** 
	* ��Ʒ��߼۸񡣵�λ:Ԫ����������ȡֵ��Χ:0-100000000
	 */
	private Long endPrice;

	/** 
	* ��Ʒ�������ҵ�������õȼ�����1��ʾ1�ģ�2��ʾ2�ġ��������ô�������ʾ������������Ʒ���������������ñ���С�ڵ������õ�end_score
	 */
	private Long endScore;

	/** 
	* ��Ʒ����ɽ������ֵ�����ô�������ʾ������������Ʒ������ɽ�������С�ڵ������õ�end_volume
	 */
	private Long endVolume;

	/** 
	* �践�ص���Ʒ�ṹ�ֶ��б���ѡֵΪItem�е������ֶΣ�num_iid,title,nick,pic_url,cid,price,type,delist_time,post_fee;����ֶ��á�,���ָ����磺num_iid,title�������ֶ�score(�������õȼ���),volume(����ɽ���),location�����ҵ�ַ�����Էֱ��ȡlocation.city,location.state��,num_iid��Ʒ����id���˽ӿڷ��ص�post_fee�ǿ�ݷ��ã�volume��Ӧ������Ʒ�б�ҳ������ɽ���
	 */
	private String fields;

	/** 
	* �Ƿ���Ʒ������Ʒ(������ʵ����������7���������˻�������Ʒ���������������ʱ��is_prepay��promoted_service������������)������Ϊtrue��ʾ����Ʒ����Ʒ���ϵ���Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private Boolean genuineSecurity;

	/** 
	* �Ƿ���3D�Ա�����Ʒ,��Ϊfalse��Ϊ�ձ�ʾ�����Ƿ�3D��Ʒ�����ж�
	 */
	private Boolean is3D;

	/** 
	* �Ƿ�֧�ֻ����������Ϊtrue��ʾ֧�ֻ����������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private Boolean isCod;

	/** 
	* �Ƿ��̳ǵ���Ʒ������Ϊtrue��ʾ����Ʒ�������Ա��̳ǵ���Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private Boolean isMall;

	/** 
	* �Ƿ���ʵ����(��:�����⸶)��Ʒ������Ϊtrue��ʾ����Ʒ����ʵ��������Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private Boolean isPrepay;

	/** 
	* �����С��磺���ݡ�������Ը���taobao.areas.getȡ��
	 */
	private String locationCity;

	/** 
	* ����ʡ���磺�㽭��������Ը���taobao.areas.get ȡ��
	 */
	private String locationState;

	/** 
	* �����ǳ��б����֮���ԡ�,���ָ�;���֧��5�������ǳơ��磺nick1,nick2,nick3
	 */
	private String nicks;

	/** 
	* �Ƿ���1վ������Ʒ������Ϊtrue��ʾ��1վ��Ʒ������Ϊfalse�����ñ�ʾ���ж��������
	 */
	private Boolean oneStation;

	/** 
	* ����ʽ����ʽΪcolumn:asc/desc,column��ѡֵΪ: price���۸�, delist_time���¼�ʱ�䣩, seller_credit���������ã�,popularity(����)���簴�۸��������б�ʾΪ��price:asc�����������ֶΣ�volume��30��ɽ�����
	 */
	private String orderBy;

	/** 
	* ҳ�롣ȡֵ��Χ:�������������Ĭ��ֵΪ1,��Ĭ�Ϸ��ص�һҳ���ݡ��ô˽ӿڻ�ȡ����ʱ������ҳ��ȡ��������page_no*page_size������10��,Ϊ�˱�����̨�������棬�ӿڽ������������Ҿ����ܵ�ϸ���Լ���������������������޸�ʱ��ֶλ�ȡ��Ʒ
	 */
	private Long pageNo;

	/** 
	* ÿҳ������ȡֵ��Χ:�����������;���ֵ:200;Ĭ��ֵ:40
	 */
	private Long pageSize;

	/** 
	* ���˷ѣ������ð��������ʷ�״̬������Ϊtrue���ֻ�����Ұ��ʵ���Ʒ�������ܵ���ʹ�ã�Ҫ����������һ���ò���
	 */
	private Boolean postFree;

	/** 
	* ���Ը��ݲ�ƷId�����������spu����Ʒ������ֶο���ͨ����ѯ taobao.products.get ȡ��
	 */
	private Long productId;

	/** 
	* �Ƿ��ṩ���Ϸ������Ʒ����ѡ����У�2��4������Ϊ2��ʾ����Ʒ�ǡ���һ����������Ʒ������Ϊ4��ʾ����Ʒ�ǡ�7���������˻���������Ʒ
	 */
	private String promotedService;

	/** 
	* ��Ʒ���ԡ������ѵ�ӵ�к����������һ������Ʒ�б��ֶθ�ʽΪ��pid1:vid1;pid2:vid2.���Ե�pid����taobao.itemprops.getȡ�ã�����ֵ��vid��taobao.itempropvalues.getȡ��vid��
	 */
	private String props;

	/** 
	* �����ֶΡ� ����������Ʒ��title�Լ���Ʒ����Ӧ�Ĳ�Ʒ��title
	 */
	private String q;

	/** 
	* ��Ʒ��ͼ۸񡣵�λ:Ԫ����������ȡֵ��Χ:0-100000000��
	 */
	private Long startPrice;

	/** 
	* ��Ʒ�������ҵ���С���õȼ�����1��ʾ1�ģ�2��ʾ2�ġ��������ô�������ʾ������������Ʒ���������������ñ�����ڵ������õ�start_score��
	 */
	private Long startScore;

	/** 
	* ��Ʒ����ɽ�����Сֵ�����ô�������ʾ������������Ʒ������ɽ���������ڵ������õ�start_volume��
	 */
	private Long startVolume;

	/** 
	* ��Ʒ���¾�״̬����ѡ����У�new��second��unused ������Ϊnew��ʾ����Ʒ��ȫ�µ���Ʒ������Ϊsecond��ʾ����Ʒ�Ƕ��ֵ���Ʒ������Ϊunused��ʾ����Ʒ�����õ���Ʒ
	 */
	private String stuffStatus;

	/** 
	* ��������״̬�������ý����������״̬������Ϊtrue���ֻ�������������ҵ���Ʒ�������ܵ���ʹ�ã�Ҫ����������һ���ò���
	 */
	private Boolean wwStatus;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndPrice(Long endPrice) {
		this.endPrice = endPrice;
	}
	public Long getEndPrice() {
		return this.endPrice;
	}

	public void setEndScore(Long endScore) {
		this.endScore = endScore;
	}
	public Long getEndScore() {
		return this.endScore;
	}

	public void setEndVolume(Long endVolume) {
		this.endVolume = endVolume;
	}
	public Long getEndVolume() {
		return this.endVolume;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setGenuineSecurity(Boolean genuineSecurity) {
		this.genuineSecurity = genuineSecurity;
	}
	public Boolean getGenuineSecurity() {
		return this.genuineSecurity;
	}

	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}
	public Boolean getIs3D() {
		return this.is3D;
	}

	public void setIsCod(Boolean isCod) {
		this.isCod = isCod;
	}
	public Boolean getIsCod() {
		return this.isCod;
	}

	public void setIsMall(Boolean isMall) {
		this.isMall = isMall;
	}
	public Boolean getIsMall() {
		return this.isMall;
	}

	public void setIsPrepay(Boolean isPrepay) {
		this.isPrepay = isPrepay;
	}
	public Boolean getIsPrepay() {
		return this.isPrepay;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLocationCity() {
		return this.locationCity;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public String getLocationState() {
		return this.locationState;
	}

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public String getNicks() {
		return this.nicks;
	}

	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}
	public Boolean getOneStation() {
		return this.oneStation;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderBy() {
		return this.orderBy;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPostFree(Boolean postFree) {
		this.postFree = postFree;
	}
	public Boolean getPostFree() {
		return this.postFree;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId() {
		return this.productId;
	}

	public void setPromotedService(String promotedService) {
		this.promotedService = promotedService;
	}
	public String getPromotedService() {
		return this.promotedService;
	}

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public void setQ(String q) {
		this.q = q;
	}
	public String getQ() {
		return this.q;
	}

	public void setStartPrice(Long startPrice) {
		this.startPrice = startPrice;
	}
	public Long getStartPrice() {
		return this.startPrice;
	}

	public void setStartScore(Long startScore) {
		this.startScore = startScore;
	}
	public Long getStartScore() {
		return this.startScore;
	}

	public void setStartVolume(Long startVolume) {
		this.startVolume = startVolume;
	}
	public Long getStartVolume() {
		return this.startVolume;
	}

	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}
	public String getStuffStatus() {
		return this.stuffStatus;
	}

	public void setWwStatus(Boolean wwStatus) {
		this.wwStatus = wwStatus;
	}
	public Boolean getWwStatus() {
		return this.wwStatus;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("end_price", this.endPrice);
		txtParams.put("end_score", this.endScore);
		txtParams.put("end_volume", this.endVolume);
		txtParams.put("fields", this.fields);
		txtParams.put("genuine_security", this.genuineSecurity);
		txtParams.put("is_3D", this.is3D);
		txtParams.put("is_cod", this.isCod);
		txtParams.put("is_mall", this.isMall);
		txtParams.put("is_prepay", this.isPrepay);
		txtParams.put("location.city", this.locationCity);
		txtParams.put("location.state", this.locationState);
		txtParams.put("nicks", this.nicks);
		txtParams.put("one_station", this.oneStation);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("post_free", this.postFree);
		txtParams.put("product_id", this.productId);
		txtParams.put("promoted_service", this.promotedService);
		txtParams.put("props", this.props);
		txtParams.put("q", this.q);
		txtParams.put("start_price", this.startPrice);
		txtParams.put("start_score", this.startScore);
		txtParams.put("start_volume", this.startVolume);
		txtParams.put("stuff_status", this.stuffStatus);
		txtParams.put("ww_status", this.wwStatus);
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

	public Class<ItemsGetResponse> getResponseClass() {
		return ItemsGetResponse.class;
	}
}
