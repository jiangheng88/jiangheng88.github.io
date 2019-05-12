package cn.bzu.personalmanage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.bzu.personalmanage.entity.Staff;
import cn.bzu.personalmanage.service.StaffService;

@Controller
@SessionAttributes(types = {ArrayList.class})
public class StatementController {
	@Autowired
	private StaffService staffService;
	@Autowired
	private StaffController staffController;
	
	
	
	@RequestMapping("/doStatement")
	public String getAllInfo(Model model) {
		staffController.getAll(model);
		
		return "statement";
	}
}
