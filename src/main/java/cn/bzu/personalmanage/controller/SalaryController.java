package cn.bzu.personalmanage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mchange.v2.log.MLevel;

import cn.bzu.personalmanage.entity.Salary;
import cn.bzu.personalmanage.entity.StaffTransfer;
import cn.bzu.personalmanage.service.SalaryService;

@Controller

public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	/*
	 * 显示修改的页面
	 */
	@RequestMapping("/salaryUpdate")
	public String salaryUpdate(@RequestParam(value= "id") Integer id,Model model) {
		Salary salary = salaryService.getOneSalary(id);
		if(salary!=null) {
			model.addAttribute("salary", salary);
		}
		return "salaryUpdate";
	}
	/*
	 * 显示添加页面
	 */
	@RequestMapping("/salaryInsert")
	public String salaryInsert() {
		return "salaryInsert";
	}
	
	/*
	 * 显示所用的薪水信息
	 */
	@RequestMapping("/doSalary")
	public String allSalary(@RequestParam(value = "pn",defaultValue = "1",required = false)Integer pn,Model model) {
	
		List<Salary> list = new ArrayList<>();
		Page<Salary> page = PageHelper.startPage(pn,8);
		list = salaryService.getList();
		System.out.println(list);
		PageInfo<Salary> info = new PageInfo<>(list,8);

		model.addAttribute("pageInfo", info);
		return "salary";
	}
	
	/*
	 * 修改
	 */
	@RequestMapping("doSalaryUpdate")
	public String doSalaryUpdate(Salary salary) {
		int count = salaryService.update(salary);
		System.out.println(count);
		if(count>0) {
			return "redirect:/doSalary";
		}else {
			return "redirect:/salaryUpdate";
		}
	}
	
	/*添加
	 * 
	 */
	@RequestMapping("/doSalaryInsert")
	public String doSalaryInsert(Salary salary) {
		int count = salaryService.insert(salary);
		if(count>0) {
			return "redirect:/doSalary";
		}else {
			return "redirect:/salaryInsert";
		}
	}
	
	/*
	 * 删除
	 */
	@RequestMapping("/doSalaryDel")
	public String doSalaryDel(@RequestParam(value="id")Integer id) {
		int count = salaryService.del(id);
		if(count>0){
			return "redirect:/doSalary";
		}else {
			return "errors";
		}
	}
	
	
	/*
	 * 查询所有
	 */
	
	public void getAll(Model model) {
	List<Salary> list =	salaryService.getList();
	model.addAttribute("salary", list);
	}
}
