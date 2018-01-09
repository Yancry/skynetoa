package com.oa.manager.system.service;

import java.util.List;

import com.oa.commons.base.IBaseService;
import com.oa.manager.system.bean.SyMenu;
import com.oa.manager.system.bean.SyUsers;

/**
 * 
 * 类名：IMainService
 * 功能：
 * 详细：
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-7-6 下午4:08:14
 *
 */
public interface IMainService extends IBaseService{
	
	/**
	 * 获取用户最新资料，刷新session，ServletContext全局变量
	 * @return
	 */
	public void init(SyUsers u);
	
	public List<SyMenu> selectMenusTop();
	
	
}
