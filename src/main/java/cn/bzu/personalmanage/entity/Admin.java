package cn.bzu.personalmanage.entity;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	private int id;
	private String adminName;
	private String adminPass;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public Admin(int id, String adminName, String adminPass) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.adminPass = adminPass;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminName=" + adminName + ", adminPass=" + adminPass + "]";
	}
	
	
}
