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
import cn.bzu.personalmanage.entity.Station;
import cn.bzu.personalmanage.service.PositionService;

@SessionAttributes(types = {ArrayList.class})
@Controller
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	//添加的页面
	@RequestMapping("/positionInsert")
	public String positionInsert() {
		return "positionInsert";
	}
	
	//修改页面
	@RequestMapping("/positionUpdate")
	public String positionUpdate(@RequestParam(value="id") Integer id,Model model) {
		getAllPosition(model);
		Station station = positionService.getOneStation(id);
		model.addAttribute("station", station);
		return "positionUpdate";
	}
	
	// 显示职位的信息
	@RequestMapping("/doPosition")
	public String position(Model model, @RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {
		List<Station> list = new ArrayList<>();
		Page<Station> page = PageHelper.startPage(pn, 15);
		list = positionService.getList();

		PageInfo<Station> info = new PageInfo<>(list, 15);

		model.addAttribute("pageInfo", info);
		return "position";
	}
	
	//添加岗位
	@RequestMapping("/dopositionInsert")
	public String dopositionInsert(Station station) {
		int count = positionService.insert(station);
		if(count>0) {
			return "redirect:/doPosition";
		}else {
			return "redirect:/positionInsert";
		}
		
	}
	
	//修改岗位
	@RequestMapping("/dopositionUpdate")
	public String dopositionUpdate(Station station) {
		int count= positionService.update(station);
		if(count>0) {
			return "redirect:/doPosition";
		}else {
			return "redirect:/positionUpdate";
		}
	}
	
	//删除岗位
	@RequestMapping("/dodelPosition")
	public String dodelPosition(@RequestParam(value="id")Integer id) {
		positionService.del(id);
		return "redirect:/doPosition";
	}
	
	//查询所有的岗位
	
	public void getAllPosition(Model model) {
		List<Station> list = new ArrayList<>();
		list = positionService.getList();
		model.addAttribute("position", list);
	}
	
}
