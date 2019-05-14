package cn.bzu.personalmanage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.StaffDao;
import cn.bzu.personalmanage.entity.Staff;
@Service("staffService")
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffDao staffDao;
	@Override
	public Staff getStaff(int id) {
		
		return staffDao.getStaff(id);
	}

	@Override
	public int del(int id) {
		return staffDao.del(id);
		
	}

	@Override
	public int update(Staff staff) {
		return staffDao.update(staff);
		
	}

	@Override
	public int insert(Staff staff) {
		return staffDao.insert(staff);
		
	}

	@Override
	public List<Staff> getList() {
		
		return staffDao.getList();
	}

	@Override
	public List<Staff> getListByLike(@Param("name") String name) {
		
		return staffDao.getListByLike(name);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return staffDao.count();
	}

	@Override
	public List<Staff> getOnJob() {
		// TODO Auto-generated method stub
		return staffDao.getOnJob();
	}

	@Override
	public List<Staff> getListByName(String name) {
		// TODO Auto-generated method stub
		return staffDao.getListByName(name);
	}

	
	
}
