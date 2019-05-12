package cn.bzu.personalmanage.service;

import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.entity.Admin;

public interface AdminService {
	public Admin login(String name,String pass);
}
