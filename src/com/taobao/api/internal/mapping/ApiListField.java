package com.taobao.api.internal.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ݽṹ�б�����ע�⡣
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface ApiListField {

	/** JSON�б�����ӳ������ **/
	public String value() default "";

}
