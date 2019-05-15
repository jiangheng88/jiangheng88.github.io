package cn.bzu.personalmanage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bzu.personalmanage.entity.Staff;

public interface StaffDao {
	//���һ��ְ������Ϣ
	public Staff getStaff(int id);
	//
	public int del(int id);
	//
	public int update(Staff staff);
	//
	public int insert(Staff staff);
	//��ö��Ա������Ϣ
	public List<Staff> getList();
	//ģ����ѯ�ķ���
	public List<Staff> getListByLike(@Param("name") String name);	
	
	//ͬ��SalaryId�õ�Staff
	public Staff getStaffBySalaryId(int salaryId);
	//���Ա��������
	public int count();
	 public  List<Staff> getOnJob();
	/*
	 * ͨ�����ֲ�ѯ
	 */
	public List<Staff> getListByName(String name);
	
}
