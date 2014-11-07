package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Area;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.areas.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class AreasGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5249491313862648869L;

	/** 
	 * ��ַ������Ϣ�б�.���ص�Area�����ľ�����ϢΪ���fields������ֶ���Ϣ.
	 */
	@ApiListField("areas")
	@ApiField("area")
	private List<Area> areas;

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public List<Area> getAreas( ) {
		return this.areas;
	}

}
