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

import cn.bzu.personalmanage.entity.Department;
import cn.bzu.personalmanage.entity.Staff;
import cn.bzu.personalmanage.service.DepartmentService;
@Controller
@SessionAttributes(types = {ArrayList.class})
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;
	//��Ӳ��ŵ�ҳ��
	@RequestMapping("/departmentInsert")
	public String departmentInsert() {
		
		
		return "departmentInsert";
	}
	//��ת�޸�ҳ��
	@RequestMapping("/departmentUpdate")
	public String update(Model model,@RequestParam(value="id") Integer id) {
		getAllDepartment(model);
		Department department = departmentservice.getOneDepartment(id);
		model.addAttribute("department", department);
		
		return "departmentUpdate";
	}
	
	
	//ִ�в�ѯ������Ϣ
	@RequestMapping("/dodepartment")
	public String doDepartment(Model model,@RequestParam(required = false,defaultValue = "1",value="pn") Integer pn) {
		
		List<Department> list = new ArrayList<>();
		Page<Department> page = PageHelper.startPage(pn, 7);
		list= departmentservice.getList();
		model.addAttribute("department", list);
		PageInfo<Department> info = new PageInfo<>(list,7);
		
		model.addAttribute("pageInfo", info);
		return "department";
	}
	
	//ִ����Ӳ���
	@RequestMapping("/dodepartmentInsert")
	public String dodepartmentInsert(Department department) {
		int count = departmentservice.insert(department);
		if(count>0) {
			return "redirect:/dodepartment";
		}else {
			return "redirect:/departmentInsert";
		}
		
	}
	
	//ִ���޸Ĳ���
	@RequestMapping("/dodepartmentUpdate")
	public String doupdate(Model model,Department department,@RequestParam(value="id") Integer id) {
		
		
		int count = departmentservice.update(department);
		if(count>0) {
			return "redirect:/dodepartment";
		}else {
			return "redirect:/departmentUpdate";
		}
		
	}
	
	
	//ִ��ɾ���Ĺ���
	@RequestMapping("/dodelDepartment")
	public String dodelDepartment(@RequestParam(value="id") Integer id) {
		int count = departmentservice.del(id);
		if(count>0) {
			return "redirect:/dodepartment";
		}else {
			return "error";
		}
		
	}
	
	//��ѯ���еļ�¼
	
	public void getAllDepartment(Model model){
		List<Department> departments = departmentservice.getList();
		model.addAttribute("departments", departments);
	}
	
}
