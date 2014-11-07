package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ItemProp;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemprops.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:35.0
 */
public class ItempropsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7522885476599779246L;

	/** 
	 * ��Ŀ������Ϣ(�����ȡȫ����������������������ֵ),����fields����Ĳ���������Ӧ�Ľ��
	 */
	@ApiListField("item_props")
	@ApiField("item_prop")
	private List<ItemProp> itemProps;

	/** 
	 * ����޸�ʱ��(ֻ��ȡȫ����������ʱ��᷵�ظ��ֶ�)����ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_modified")
	private Date lastModified;

	public void setItemProps(List<ItemProp> itemProps) {
		this.itemProps = itemProps;
	}
	public List<ItemProp> getItemProps( ) {
		return this.itemProps;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public Date getLastModified( ) {
		return this.lastModified;
	}

}
