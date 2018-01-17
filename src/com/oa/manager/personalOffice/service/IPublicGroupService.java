package com.oa.manager.personalOffice.service;

import java.util.List;
import java.util.Map;

import com.oa.commons.base.IBaseService;
import com.oa.commons.model.DataGrid;
import com.oa.commons.model.PageParam;
import com.oa.manager.personalOffice.bean.PublicGroup;

/**
 * 
 * 类名：IPublicAddressBookService
 * 功能：
 * 详细：
 * 作者：王岩(wangyan)
 * 版本：1.0
 * 日期：2017-6-30 下午02:24:10
 *
 */
public interface IPublicGroupService extends IBaseService{
	/**
	 * 通讯录分组条件查询
	 * @param param
	 * @return
	 */
	public DataGrid selectGroup(PageParam param,PublicGroup g);
	public PublicGroup  selectGroup(String id);
	/**
	 * 添加通讯录分组
	 * @return
	 */
	public String addGroup(PublicGroup g);
	/**
	 * 修改通讯录分组
	 * @return
	 */
	public String updateGroup(PublicGroup g);
	/**
	 * 批量删除通讯录分组
	 * @param ids
	 * @return
	 */
	public String deleteGroup(String[] ids);
	
	//*****************************安卓*************************************
	/**
	 * 分页查询公司通讯录分组
	 * @param param
	 * @return
	 */
	public List<Map<String,Object>> selectPublicGroup(PageParam param);
	/**
	 * 查询公司通讯录总数
	 * @return
	 */
	public Long totlepublicGroup();
}
