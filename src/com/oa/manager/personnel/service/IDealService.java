package com.oa.manager.personnel.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.oa.commons.base.IBaseService;
import com.oa.commons.model.DataGrid;
import com.oa.commons.model.FileList;
import com.oa.commons.model.PageParam;
import com.oa.manager.personnel.bean.Deal;

/**
 * 
 * 类名：IJobService
 * 功能：
 * 详细：
 * 作者：王岩(wangyan)
 * 版本：1.0
 * 日期：2017年7月2日 13:58:44
 *
 */
public interface IDealService  extends IBaseService{

	/**
	 * 加载简历信息
	 * @return
	 */
	public DataGrid select(PageParam param, Deal d );
	
	public Map selectID(String id);
	/**
	 * 添加简历信息
	 * @param s
	 * @return
	 */
	public  String add(Deal j,String savePath,HttpServletRequest request,FileList files);

	/**
	 *  修改简历信息
	 * @param s
	 * @return
	 */
	public String update(Deal j,String savePath,HttpServletRequest request,FileList files);
	/**
	 * 删除简历信息
	 * @param ids
	 * @return
	 */
	public boolean delete(String[] ids);
	/**
	 * 删除附件
	 * @param id
	 * @param savepath
	 * @return
	 */
	public boolean deleteFile(String id, String savepath);
	
}
