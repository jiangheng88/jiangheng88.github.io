package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.LeaveOffice;
import cn.bzu.personalmanage.entity.Station;

public interface LeaveOfficeDao {
	public LeaveOffice getOneLeaveOffice(int id);

	// 修改
	public int update(LeaveOffice leaveOffice);

	// 删除
	public int del(int id);

	// 添加离职
	public int insertLeave(LeaveOffice leaveOffice);
	
	
	//添加入职
	public int insertEnter(LeaveOffice leaveOffice);
	

	// 得到多条信息

	public List<LeaveOffice> getList();
	
	
	public List<LeaveOffice> getTime();
}
