package com.oa.commons.exception;

/**
 * 
 * 类名：MyException
 * 功能：自定义异常
 * 详细：
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-6-30 下午5:43:15
 *
 */
public class MyRuntimeException extends RuntimeException{

	/**
	 * @Fields serialVersionUID : 
	 */
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * 创建一个新的实例 MyException.
	 *
	 * @param message 异常信息
	 */
	public MyRuntimeException(String message) {
		super(message);
	}
	
}
