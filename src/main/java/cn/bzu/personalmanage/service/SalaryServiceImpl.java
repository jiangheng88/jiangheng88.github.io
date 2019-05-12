package cn.bzu.personalmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.bzu.personalmanage.dao.SalaryDao;
import cn.bzu.personalmanage.entity.Salary;
@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
	@Autowired
	private SalaryDao salaryDao;
	@Override
	public Salary getOneSalary(int id) {
		
		return salaryDao.getOneSalary(id);
	}

	@Override
	public List<Salary> getList() {
		
		return salaryDao.getList();
	}

	@Override
	public int del(int id) {
		
		return salaryDao.del(id);
	}

	@Override
	public int insert(Salary salary) {
		
		return salaryDao.insert(salary);
	}

	@Override
	public int update(Salary salary) {
		
		return salaryDao.update(salary);
	}

}
