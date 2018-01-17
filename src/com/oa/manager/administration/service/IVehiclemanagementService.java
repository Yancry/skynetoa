package com.oa.manager.administration.service;

import java.util.List;

import com.oa.commons.base.IBaseService;
import com.oa.commons.model.DataGrid;
import com.oa.commons.model.PageParam;
import com.oa.manager.administration.bean.VmVehiclemanagement;

/**
 * 
 * 类名：vehiclemanagementService
 * 功能：
 * 详细：
 * 作者：WangYan
 * 版本：1.0
 * 日期：2017-7-14 下午5:53:58
 *
 */
public interface IVehiclemanagementService  extends IBaseService {
	/**
	 * 查询车辆
	 * @return
	 */
   @SuppressWarnings("rawtypes")
   public DataGrid load(PageParam param,VmVehiclemanagement vm);
   
   /**
    * 批量删除
    */
   public boolean deletes(String[] ids);
   /**
    * 修改车辆管理 
    * @param id
    * @return
    */
   public List selectcar(String id);
   /**
    * 更新车辆管理时用到
    *
    * @param vm
    * @return
    */
   public String updateVmVehiclemanagement(VmVehiclemanagement vm);
}


