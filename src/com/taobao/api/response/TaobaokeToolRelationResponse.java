package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.tool.relation response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:57.0
 */
public class TaobaokeToolRelationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1863763225476915764L;

	/** 
	 * ����true��false��ʾ�Ƿ�����û�
	 */
	@ApiField("tools_user")
	private Boolean toolsUser;

	public void setToolsUser(Boolean toolsUser) {
		this.toolsUser = toolsUser;
	}
	public Boolean getToolsUser( ) {
		return this.toolsUser;
	}

}
