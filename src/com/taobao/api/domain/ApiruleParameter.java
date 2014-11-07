package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * api��������������ṹ
 *
 * @author auto create
 * @since 1.0, 2011-01-10 12:12:05.0
 */
public class ApiruleParameter extends TaobaoObject {

	private static final long serialVersionUID = 3547773659338474838L;

	/**
	 * ������Ϊbyte[]ʱ��֧�ֵ��ļ������б��ԡ�,���ָ
	 */
	@ApiField("file_exts")
	private String fileExts;

	/**
	 * ��󳤶ȡ�������Ϊstring��number��field_listʱΪ�ַ����ȣ�������Ϊbyte[]ʱΪ�ֽڳ��ȡ�
	 */
	@ApiField("length")
	private Long length;

	/**
	 * ���������ԡ�;���ŷָ�����󳤶ȡ�
	 */
	@ApiField("max_list_size")
	private Long maxListSize;

	/**
	 * ������Ϊnumberʱ�����ֵ
	 */
	@ApiField("max_value")
	private Long maxValue;

	/**
	 * ������Ϊnumberʱ����Сֵ
	 */
	@ApiField("min_value")
	private Long minValue;

	/**
	 * �Ƿ�ش�
	 */
	@ApiField("must")
	private Boolean must;

	/**
	 * aip�Ĳ�����
	 */
	@ApiField("name")
	private String name;

	/**
	 * api�Ĳ������͡�Ŀǰ�� string��int��number��field_list��date��boolean��price��byte[] 8��
	 */
	@ApiField("type")
	private String type;

	public String getFileExts() {
		return this.fileExts;
	}
	public void setFileExts(String fileExts) {
		this.fileExts = fileExts;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public Long getMaxListSize() {
		return this.maxListSize;
	}
	public void setMaxListSize(Long maxListSize) {
		this.maxListSize = maxListSize;
	}

	public Long getMaxValue() {
		return this.maxValue;
	}
	public void setMaxValue(Long maxValue) {
		this.maxValue = maxValue;
	}

	public Long getMinValue() {
		return this.minValue;
	}
	public void setMinValue(Long minValue) {
		this.minValue = minValue;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
