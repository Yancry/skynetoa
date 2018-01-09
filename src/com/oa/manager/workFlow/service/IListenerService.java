package com.oa.manager.workFlow.service;

import java.util.List;

import com.oa.commons.base.IBaseService;
import com.oa.commons.model.DataGrid;
import com.oa.commons.model.PageParam;
import com.oa.manager.workFlow.bean.WfWorkflowListener;

/**
 * 
 * 类名：IListenerService
 * 功能：
 * 详细：
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-7-12 上午10:54:56
 *
 */
public interface IListenerService extends IBaseService{

	/**
	 * 流程监听器 分页查询
	 * @param param
	 * @param wl
	 * @return
	 */
	public DataGrid selectWfWorkflowListener(PageParam param,WfWorkflowListener wl);
	
	
	/**
	 * 添加监听器
	 * @param wl
	 * @return
	 */
	public String addListener(WfWorkflowListener wl);
	
	/**
	 * 查询监听器，不分页，用于流程设计查找带回
	 * @param wl
	 * @return
	 */
	@SuppressWarnings({ "rawtypes"})
	public List selectWfWorkflowListener(WfWorkflowListener wl);
	/**
	 * 修改监听器
	 * @param wl
	 * @return
	 */
	public String updateListener(WfWorkflowListener wl);
	/**
	 * 批量删除监听器
	 * @param ids
	 * @return
	 */
	public boolean deleteListener(String[] ids);
	
}
