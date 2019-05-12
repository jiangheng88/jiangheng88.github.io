package cn.bzu.personalmanage.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.bzu.personalmanage.dao.DepartmentDao;
import cn.bzu.personalmanage.entity.Salary;
import cn.bzu.personalmanage.entity.Staff;
import cn.bzu.personalmanage.service.DepartmentService;
import cn.bzu.personalmanage.service.StaffService;

@Controller
@SessionAttributes(types = { ArrayList.class, String.class, Staff.class,Integer.class })
public class StaffController {
	@Autowired
	private StaffService staffService;
	@Autowired
	private DepartmentController departmentController;
	@Autowired
	private PositionController positionController;
	@Autowired
	private SalaryController salaryController;
	@Autowired
	private LeaveOfficeController l;
	@RequestMapping("/insert")
	public String insert(Model model) {
		departmentController.getAllDepartment(model);
		positionController.getAllPosition(model);
		salaryController.getAll(model);
		l.getTime(model);
		l.getAll(model);
		return "insert";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam(value = "id") Integer id, Model model, Staff staff) {
		departmentController.getAllDepartment(model);
		positionController.getAllPosition(model);
		salaryController.getAll(model);
		Staff staff1 = staffService.getStaff(id);
		System.out.println(staff1);
		model.addAttribute("staff", staff1);
		return "update";
	}

	// 执行查询的功能
	@RequestMapping("/dostaff")
	public String seleteStaff(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,Model model) {
		List<Staff> list = new ArrayList<Staff>();
		// 使用分页，获取第1页，7条内容
		Page<Staff> page = PageHelper.startPage(pn, 8);
		list = staffService.getList();
		
		PageInfo<Staff> info = new PageInfo<>(list,8);
		
		model.addAttribute("pageInfo", info);
		return "staff";
	}

	// 执行删除功能
	@RequestMapping("/dodel")
	public String dodel(@RequestParam(value = "id") Integer id,Model model) {
		System.out.println(id);
		int count = staffService.del(id);
		if (count == 0) {
			model.addAttribute("failed", "删除失败");
		}
		
		return "redirect:/dostaff";
	}

	// 执行修改功能

	@RequestMapping("/doupdate")
	public String doUpdate(Staff staff, Model model) {
		System.out.println(staff.getStationId()+"****"+staff.getDepartmentId());
		int count = staffService.update(staff);
		System.out.println(count);
		if (count > 0) {
			return "redirect:/dostaff";
		} else {
			return "redirect:/update";
		}

	}
	@RequestMapping("/doinsert")
	public String doinsert(Staff staff) {
		
		int count = staffService.insert(staff);
		if(count>0) {
			return "redirect:/dostaff";
		}else {
			return "insert";
		}
	}
	
	//实现模糊查询
	@RequestMapping("/doFuzzyQuery")
	public String fuzzyQuery(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,
			@RequestParam(required = false,defaultValue = "",value = "name")String name,Model model) {
		
		List<Staff> list = new ArrayList<Staff>();
		// 使用分页，获取第1页，7条内容
		Page<Staff> page = PageHelper.startPage(pn, 8);
		list = staffService.getListByLike(name);
		if(list != null)
			System.out.println(list.get(0).toString());
		
		PageInfo<Staff> info = new PageInfo<>(list,8);
		
		model.addAttribute("pageInfomain", info);
		
		return "main";
	}
	
	/*
	 * 查询所有
	 */
	
	public void getAll(Model model) {
		List<Staff> staffs = staffService.getList();
		model.addAttribute("staffs", staffs);
	}
	
	/*
	 * 查询总条数
	 */
	public void getCount(Model model) {
		int count = staffService.count();
		model.addAttribute("count", count);
	}
	//得到在职的人员
	
	public void getOnjob(Model model) {
		List<Staff> staffOnjob = staffService.getOnJob();
		model.addAttribute("staffOnjob", staffOnjob);
	}
}
