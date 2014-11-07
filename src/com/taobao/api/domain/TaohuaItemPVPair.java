package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ��Ʒ����ֵ������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:18:26.0
 */
public class TaohuaItemPVPair extends TaobaoObject {

	private static final long serialVersionUID = 7173978597354794866L;

	/**
	 * �Ի���Ŀ�������ݽṹ
	 */
	@ApiField("taohua_cate_prop")
	private TaohuaCateProp taohuaCateProp;

	/**
	 * �Ի���Ŀ����ֵ���ݽṹ
	 */
	@ApiListField("taohua_cate_prop_values")
	@ApiField("taohua_cate_prop_value")
	private List<TaohuaCatePropValue> taohuaCatePropValues;

	public TaohuaCateProp getTaohuaCateProp() {
		return this.taohuaCateProp;
	}
	public void setTaohuaCateProp(TaohuaCateProp taohuaCateProp) {
		this.taohuaCateProp = taohuaCateProp;
	}

	public List<TaohuaCatePropValue> getTaohuaCatePropValues() {
		return this.taohuaCatePropValues;
	}
	public void setTaohuaCatePropValues(List<TaohuaCatePropValue> taohuaCatePropValues) {
		this.taohuaCatePropValues = taohuaCatePropValues;
	}

}
