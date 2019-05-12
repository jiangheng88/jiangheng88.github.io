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

import cn.bzu.personalmanage.entity.StaffTransfer;
import cn.bzu.personalmanage.entity.Station;
import cn.bzu.personalmanage.service.StafftransferService;

@Controller
@SessionAttributes(types = {ArrayList.class})
public class StaffTransferController {
	@Autowired
	private StafftransferService stafftransferService;
	@Autowired
	private PositionController positionController;
	@Autowired
private StaffController staffController;
	// 修改页面
	@RequestMapping("/stafftransferUpdate")
	public String stafftransferUpdate(Model model, @RequestParam(value = "id") Integer id) {
		positionController.getAllPosition(model);
		StaffTransfer staffTransfer = stafftransferService.getOneStafftransfer(id);
		model.addAttribute("staffTransfer", staffTransfer);
		return "stafftransferUpdate";
	}

	// 添加页面
	@RequestMapping("/stafftransferInsert")
	public String stafftransferInsert(Model model) {
		staffController.getAll(model);
		positionController.getAllPosition(model);
		return "stafftransferInsert";
	}

	// 显示调动的详细信息
	@RequestMapping("/doStafftransfer")
	public String staffTransfer(Model model,
			@RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {
		List<StaffTransfer> list = new ArrayList<>();
		Page<StaffTransfer> page = PageHelper.startPage(pn, 10);
		list = stafftransferService.getList();

		System.out.println(list);
		PageInfo<StaffTransfer> info = new PageInfo<>(list, 10);

		model.addAttribute("pageInfo", info);

		ArrayList<String> names = new ArrayList<>();

		return "stafftransfer";
	}

	// 执行修改页面
	@RequestMapping("/doStafftransferUpdate")
	public String doStafftransferUpdate(StaffTransfer staffTransfer) {
		int count = stafftransferService.update(staffTransfer);
		if (count > 0) {
			return "redirect:/doStafftransfer";
		} else {
			return "redirect:/stafftransferUpdate";
		}
	}

	// 添加
	@RequestMapping("doStafftransferInsert")
	public String doStafftransferInsert(StaffTransfer staffTransfer) {
		int count = stafftransferService.insert(staffTransfer);
		if (count > 0) {
			return "redirect:/doStafftransfer";
		} else {
			return "redirect:/stafftransferInsert";

		}
	}

	// 删除

	@RequestMapping("/doStafftransferDel")
	public String doStafftransferDel(@RequestParam(value = "id") Integer id) {
		stafftransferService.del(id);
		return "redirect:/doStafftransfer";
	}
	
	
	/*
	 * 查询所有的
	 */
	
	public void getAll(Model model){
		List<StaffTransfer> list = stafftransferService.getList();
		List<String> names = new ArrayList<>();
		for(StaffTransfer l: list) {
			String name = l.getStaff().getStation().getStationName();
			names.add(name);
			model.addAttribute("names", names);
		}
		
		
	}
}
