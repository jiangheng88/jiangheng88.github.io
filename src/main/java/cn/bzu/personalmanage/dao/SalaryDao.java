package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.Salary;

public interface SalaryDao {
	//�õ�һ��нˮ��Ϣ
	public Salary getOneSalary(int id);
	//�õ�ȫ����нˮ
	public List<Salary> getList();
	
	public int del(int id);
	public int insert(Salary salary);
	public int update(Salary salary);
	
	
}
