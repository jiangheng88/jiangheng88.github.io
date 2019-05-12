package cn.bzu.personalmanage.dao;

import org.springframework.stereotype.Repository;

import cn.bzu.personalmanage.entity.Admin;
@Repository
public interface AdminDao {
	public Admin login(String name,String pass);
		
	
}
