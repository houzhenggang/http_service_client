package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * api�������
 *
 * @author auto create
 * @since 1.0, 2011-01-05 17:00:00.0
 */
public class Apirule extends TaobaoObject {

	private static final long serialVersionUID = 4336139335471632168L;

	/**
	 * api����
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * api��������������ṹ
	 */
	@ApiListField("apirule_parameters")
	@ApiField("apirule_parameter")
	private List<ApiruleParameter> apiruleParameters;

	/**
	 * api���������������޸�ʱ��
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * �Ƿ���Ҫsession������¼��
	 */
	@ApiField("need_session")
	private Boolean needSession;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public List<ApiruleParameter> getApiruleParameters() {
		return this.apiruleParameters;
	}
	public void setApiruleParameters(List<ApiruleParameter> apiruleParameters) {
		this.apiruleParameters = apiruleParameters;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Boolean getNeedSession() {
		return this.needSession;
	}
	public void setNeedSession(Boolean needSession) {
		this.needSession = needSession;
	}

}
