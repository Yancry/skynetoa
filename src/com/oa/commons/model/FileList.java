package com.oa.commons.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * 类名：FileList 功能：多文件上传模型 详细：单文件接收：@RequestParam MultipartFile file
 * 多文件接收:FileList files 作者：Wangyan 版本：1.0 日期：2017-6-30 下午4:05:37
 *
 */
public class FileList {
	/**
	 * 上传文件集合
	 */
	List<MultipartFile> file;

	public List<MultipartFile> getFile() {
		return file;
	}

	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}

}
