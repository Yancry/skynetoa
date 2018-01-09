package com.oa.commons.job;

import java.util.Date;

import com.oa.commons.util.DateUtil;
import com.oa.commons.util.DbBackupRes;

/**
 * 定时任务 备份数据库
 * 
 * @author WangYan
 * @version 1.0
 *
 */
public class TimingBackupDatabase {

	/**
	 * 定时备份数据库
	 */
	public void backupDatabase() {
		String fileName = DateUtil.date2String(new Date(), "MM月dd日HH时mm分");
		DbBackupRes.backupDatabase(fileName + ".sql");
	}
}
