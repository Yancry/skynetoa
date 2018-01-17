package com.oa.manager.files.bean;

import java.util.List;

/**
 * 文档类型 权限 集合模型
 * @author WangYan
 * @version 1.0
 */
public class TypePowersList {
	/**
	 * 授权部门
	 */
	private List<WdCfTypePowers> deptPowers;
	/**
	 * 授权用户
	 */
	private List<WdCfTypePowers> userPowers;
	public List<WdCfTypePowers> getDeptPowers() {
		return deptPowers;
	}
	public void setDeptPowers(List<WdCfTypePowers> deptPowers) {
		this.deptPowers = deptPowers;
	}
	public List<WdCfTypePowers> getUserPowers() {
		return userPowers;
	}
	public void setUserPowers(List<WdCfTypePowers> userPowers) {
		this.userPowers = userPowers;
	}
	
}
