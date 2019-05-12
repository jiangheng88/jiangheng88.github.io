package cn.bzu.personalmanage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.DepartmentDao;
import cn.bzu.personalmanage.entity.Department;
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public Department getOneDepartment(int id) {
		
		return departmentDao.getOneDepartment(id);
	}

	@Override
	public int update(Department department) {
		
		return departmentDao.update(department);
	}

	@Override
	public int del(int id) {
		
		return departmentDao.del(id);
	}

	@Override
	public int insert(Department department) {
	
		return departmentDao.insert(department);
	}

	@Override
	public List<Department> getList() {
		
		return departmentDao.getList();
	}

	@Override
	public List<Department> getDepartments() {
		
		return departmentDao.getDepartments();
	}

	
	

	

}
