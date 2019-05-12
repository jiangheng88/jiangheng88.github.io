package cn.bzu.personalmanage.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.entity.Department;

public interface DepartmentService {
	// 得到一条信息的记录
	public Department getOneDepartment(int id);

	// 修改
	public int update(Department department);

	// 删除
	public int del(int id);

	// 添加
	public int insert(Department department);

	// 得到多条信息

	public List<Department> getList();

	// 关联查询所有记录
	public List<Department> getDepartments();


	
}
