package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.PropValue;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itempropvalues.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class ItempropvaluesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8221564286745422765L;

	/** 
	 * ����޸�ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/** 
	 * ����ֵ,����fields����Ĳ���������Ӧ�Ľ��
	 */
	@ApiListField("prop_values")
	@ApiField("prop_value")
	private List<PropValue> propValues;

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public Date getLastModified( ) {
		return this.lastModified;
	}

	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
	}
	public List<PropValue> getPropValues( ) {
		return this.propValues;
	}

}
