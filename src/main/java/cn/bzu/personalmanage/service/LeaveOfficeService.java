package cn.bzu.personalmanage.service;

import java.util.List;

import cn.bzu.personalmanage.entity.LeaveOffice;

public interface LeaveOfficeService {
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
