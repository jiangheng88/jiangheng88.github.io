package cn.bzu.personalmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.LeaveOfficeDao;
import cn.bzu.personalmanage.entity.LeaveOffice;
@Service("leaveOfficeService")
public class LeaveOfficeServiceImpl implements LeaveOfficeService {

	@Autowired
	private LeaveOfficeDao leaveOfficeDao;
	@Override
	public LeaveOffice getOneLeaveOffice(int id) {
		
		return leaveOfficeDao.getOneLeaveOffice(id);
	}

	@Override
	public int update(LeaveOffice leaveOffice) {
		
		return leaveOfficeDao.update(leaveOffice);
	}

	@Override
	public int del(int id) {
		
		return leaveOfficeDao.del(id);
	}

	

	@Override
	public List<LeaveOffice> getList() {
		
		return leaveOfficeDao.getList();
	}

	@Override
	public int insertLeave(LeaveOffice leaveOffice) {
		// TODO Auto-generated method stub
		return leaveOfficeDao.insertLeave(leaveOffice);
	}

	@Override
	public int insertEnter(LeaveOffice leaveOffice) {
		// TODO Auto-generated method stub
		return leaveOfficeDao.insertEnter(leaveOffice);
	}

	@Override
	public List<LeaveOffice> getTime() {
		// TODO Auto-generated method stub
		return leaveOfficeDao.getTime();
	}

}
