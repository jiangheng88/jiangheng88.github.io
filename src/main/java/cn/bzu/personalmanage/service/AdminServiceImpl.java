package cn.bzu.personalmanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.AdminDao;
import cn.bzu.personalmanage.entity.Admin;


@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	@Override
	public Admin login(String name, String pass) {
		
		return adminDao.login(name, pass);
	}

}
