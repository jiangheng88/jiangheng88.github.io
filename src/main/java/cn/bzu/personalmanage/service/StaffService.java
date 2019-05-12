package cn.bzu.personalmanage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bzu.personalmanage.entity.Staff;

public interface StaffService {
	// 获得一条职工的信息
	public Staff getStaff(int id);

	//
	public int del(int id);

	//
	public int update(Staff staff);

	//
	public int insert(Staff staff);

	// 获得多个员工的信息
	public List<Staff> getList();

	// 模糊查询的方法
	public List<Staff> getListByLike(@Param("name") String name);
	//获得员工的人数
		public int count();
		
		 public  List<Staff> getOnJob();
}
