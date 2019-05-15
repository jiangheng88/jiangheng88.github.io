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

	// ��ת��index.jspҳ��
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// ��ת����ҳ��
	@RequestMapping("/main")
	public String main() {
		return "main";
	}

	// �����¼�ķ���
	@RequestMapping(value = "/login")
	public String index(Admin admin, Model model,HttpSession session) {
		Admin ad = adminService.login(admin.getAdminName(), admin.getAdminPass());
		
		
		
		if (ad != null ) {
			model.addAttribute("admin",ad);
			return "redirect:/main";
		} else {
			model.addAttribute("note", "���������������µ�¼");
			return "index";
		}
	}

	/*
	 * // �õ�ͼƬ�ķ���
	 * 
	 * @RequestMapping("/images") public void getimage(HttpServletRequest request,
	 * HttpServletResponse response, Model model) throws IOException {
	 * response.setContentType("image.jpg"); int width = 100; int height = 25;
	 * CheckCodeSet cc = CheckCodeSet.getInstance(); cc.set(width, height); //
	 * �õ�����������֤�� String checkcode = cc.generateCheckCode(); // ����֤�뱣�浽session��
	 * model.addAttribute("checkCode", checkcode); // ����� OutputStream os =
	 * response.getOutputStream(); // ����֤����ͼƬ����ʽ������������
	 * ImageIO.write(cc.generateCheckImg(checkcode), "jpg", os); }
	 */

}
