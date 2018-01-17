package com.oa.manager.workFlow.entity;

/**
 * 
 * 类名：ListenerField
 * 功能：流程监听器字段注入 字段模式
 * 详细：
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-7-9 上午10:49:21
 *
 */
public class ListenerField implements java.io.Serializable{
	/**
	 * @Fields serialVersionUID : 
	 */
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 字段名称
	 */
	private String name;
	/**
	 * 表达式取值
	 */
	private String expression;
	/**
	 * 固定值
	 */
	private String stringValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
}
