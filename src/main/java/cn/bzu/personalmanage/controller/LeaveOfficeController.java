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

import cn.bzu.personalmanage.entity.LeaveOffice;
import cn.bzu.personalmanage.entity.Station;
import cn.bzu.personalmanage.service.LeaveOfficeService;
import cn.bzu.personalmanage.service.PositionService;

@Controller
@SessionAttributes(types = {ArrayList.class,Integer.class})
public class LeaveOfficeController {
	@Autowired
	private LeaveOfficeService leaveOfficeService;
	@Autowired
	private StaffController staffController;
	// �����ְҳ��
	@RequestMapping("/insertEnter")
	public String insertEnter(Model model) {
		staffController.getCount(model);
		return "insertEnter";
	}
	// �����ְҳ��
		@RequestMapping("/insertLeave")
		public String insertLeave(Model model) {
			staffController.getOnjob(model);
			return "insertLeave";
		}
	// �޸�ҳ��
	@RequestMapping("/leaveOfficeUpdate")
	public String positionUpdate(@RequestParam(value = "id") Integer id, Model model) {
		
		LeaveOffice leaveOffice = leaveOfficeService.getOneLeaveOffice(id);
		
		model.addAttribute("leaveOffice", leaveOffice);
		return "leaveOfficeUpdate";
	}

	// ��ʾ��ϸ��Ϣ
	@RequestMapping("/doLeaveOffice")
	public String leaveOffice(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {
		List<LeaveOffice> list = new ArrayList<>();
		Page<LeaveOffice> page = PageHelper.startPage(pn, 15);
		list = leaveOfficeService.getList();

		PageInfo<LeaveOffice> info = new PageInfo<>(list, 15);

		model.addAttribute("pageInfo", info);
		return "leaveOffice";
	}

	// �޸�

	@RequestMapping("/doLeaveOfficeUpdate")
	public String dopositionUpdate(LeaveOffice leaveOffice) {
		int count = leaveOfficeService.update(leaveOffice);
		if (count > 0) {
			return "redirect:/doLeaveOffice";
		} else {
			return "redirect:/leaveOfficeUpdate";
		}
	}

	// ���

	@RequestMapping("/doLeaveOfficeInsert")
	public String dopositionInsert(LeaveOffice leaveOffice) {
		int count = leaveOfficeService.insertEnter(leaveOffice);
		if (count > 0) {
			return "redirect:/insert";
		} else {
			return "redirect:/leaveOfficeInsert";
		}

	}

	// ɾ��
	@RequestMapping("/dodelLeaveOffice")
	public String dodelPosition(@RequestParam(value = "id") Integer id) {
		leaveOfficeService.del(id);
		return "redirect:/doLeaveOffice";
	}
	
	public void getAll(Model model) {
		List<LeaveOffice> list =leaveOfficeService.getList();
		model.addAttribute("leaveoffice", list);
	}
	
	
	
	public void getTime(Model model) {
		List<LeaveOffice> newLeave = leaveOfficeService.getTime();
		model.addAttribute("newLeave", newLeave);
	}
}
