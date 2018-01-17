package com.oa.commons.converter;

import org.springframework.core.convert.converter.Converter;

import com.oa.commons.util.StringUtil;

/**
 * 
 * 类名：StringToStringConverter 功能：Spring MVC 参数封装 详细：去除前后空格 作者：WangYan 版本：1.0
 * 日期：2017-6-23 下午4:26:45
 *
 */
public class StringToStringConverter implements Converter<String, String> {

	public String convert(String source) {

		return StringUtil.trim(source);
	}
}
