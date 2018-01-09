package com.oa.manager.common_platform.service;

import com.oa.commons.base.IBaseService;
import com.oa.commons.model.DataGrid;
import com.oa.commons.model.PageParam;
import com.oa.manager.common_platform.bean.RmRulesmanager;

/**
 * 
 * 类名：IRulesService
 * 功能：
 * 详细：
 * 作者：Wangyan
 * 版本：1.0
 * 日期：2017-6-30 上午10:18:45
 *
 */
public interface IRulesService extends IBaseService {
	/**
	 * 查看法规
	 * @return
	 */
public DataGrid load(RmRulesmanager rm,PageParam param );

/**
 * 批量删除
 * @param ids
 * @return
 */
public boolean deletes(String[] ids);
/**
 * 修改法规
 * @param rm
 * @return
 */
public String updaterule(RmRulesmanager rm);
}
