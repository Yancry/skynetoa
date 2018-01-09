package com.oa.commons.converter;

import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.oa.commons.util.DateUtil;

/**
 * 
 * 类名：StringToDateConverter 功能：Spring MVC 参数格式化 字符串转换Date 详细： 作者：Wangyan 版本：1.0
 * 日期：2017-6-23 下午4:26:45
 *
 */
public class StringToDateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		return DateUtil.string2Date(source);
	}
}
