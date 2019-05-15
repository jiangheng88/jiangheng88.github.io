package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.LeaveOffice;
import cn.bzu.personalmanage.entity.Station;

public interface LeaveOfficeDao {
	public LeaveOffice getOneLeaveOffice(int id);

	// �޸�
	public int update(LeaveOffice leaveOffice);

	// ɾ��
	public int del(int id);

	// �����ְ
	public int insertLeave(LeaveOffice leaveOffice);
	
	
	//�����ְ
	public int insertEnter(LeaveOffice leaveOffice);
	

	// �õ�������Ϣ

	public List<LeaveOffice> getList();
	
	
	public List<LeaveOffice> getTime();
}
