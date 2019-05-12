package cn.bzu.personalmanage.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.bzu.personalmanage.entity.Admin;
import cn.bzu.personalmanage.service.AdminService;
import cn.bzu.personalmanage.service.AdminServiceImpl;
import cn.bzu.personalmanage.utils.CheckCodeSet;

@Controller
@SessionAttributes(types = { Admin.class }, value = { "checkCode" })
public class AdminController {
	@Autowired
	private AdminService adminService;

	// 跳转到index.jsp页面
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// 跳转到主页面
	@RequestMapping("/main")
	public String main() {
		return "main";
	}

	// 处理登录的方法
	@RequestMapping(value = "/login")
	public String index(Admin admin, Model model,HttpSession session) {
		Admin ad = adminService.login(admin.getAdminName(), admin.getAdminPass());
		
		
		
		if (ad != null ) {
			model.addAttribute("admin",ad);
			return "redirect:/main";
		} else {
			model.addAttribute("note", "你输入有误，请重新登录");
			return "index";
		}
	}

	/*
	 * // 得到图片的方法
	 * 
	 * @RequestMapping("/images") public void getimage(HttpServletRequest request,
	 * HttpServletResponse response, Model model) throws IOException {
	 * response.setContentType("image.jpg"); int width = 100; int height = 25;
	 * CheckCodeSet cc = CheckCodeSet.getInstance(); cc.set(width, height); //
	 * 得到随机分配的验证码 String checkcode = cc.generateCheckCode(); // 将验证码保存到session中
	 * model.addAttribute("checkCode", checkcode); // 输出流 OutputStream os =
	 * response.getOutputStream(); // 将验证码以图片的形式输出到浏览器上
	 * ImageIO.write(cc.generateCheckImg(checkcode), "jpg", os); }
	 */

}
