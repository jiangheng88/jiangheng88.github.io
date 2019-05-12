package cn.bzu.personalmanage.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
public class Department {
	private int id;
	//部门名字
	private String dpname;
	//部门人数
	private String dpmenber;
	//员工的id
	private int staffId;
	
	//创建时间
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	private List<Staff> staffs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDpname() {
		return dpname;
	}
	public void setDpname(String dpname) {
		this.dpname = dpname;
	}
	public String getDpmenber() {
		return dpmenber;
	}
	public void setDpmenber(String dpmenber) {
		this.dpmenber = dpmenber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dpname=" + dpname + ", dpmenber=" + dpmenber + ", staffId=" + staffId
				+ ", date=" + date + ", list=" + staffs + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dpname, String dpmenber, int staffId, Date date, List<Staff> list) {
		super();
		this.id = id;
		this.dpname = dpname;
		this.dpmenber = dpmenber;
		this.staffId = staffId;
		this.date = date;
		this.staffs = list;
	}
	
	
	
}
