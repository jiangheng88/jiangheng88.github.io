package cn.bzu.personalmanage.service;

import java.util.List;

import cn.bzu.personalmanage.entity.Salary;

public interface SalaryService {
	// 得到一条薪水信息
	public Salary getOneSalary(int id);

	// 得到全部的薪水
	public List<Salary> getList();

	public int del(int id);

	public int insert(Salary salary);

	public int update(Salary salary);
}
