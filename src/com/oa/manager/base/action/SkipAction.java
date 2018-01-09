package com.oa.manager.base.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oa.commons.base.BaseAction;

/**
 * 
 * 类名：MsgAction
 * 功能：请求跳转
 * 详细：处理一些特殊请求 直接跳转页面
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-7-1 下午3:50:53
 *
 */
@Controller
public class SkipAction extends BaseAction{
	
	/**
	 * 跳转到服务器信息查看页面
	 * @return
	 */
	@RequestMapping("servlet/info")
	public String toservletinfo(){
		return "system/jspinfo";
	}
}
