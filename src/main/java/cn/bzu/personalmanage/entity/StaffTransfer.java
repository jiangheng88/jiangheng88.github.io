package cn.bzu.personalmanage.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
public class StaffTransfer {
	private int id;
	//调动前的岗位编号
	private int beforeid;
	//调动后的岗位编号
	private int afterid;
	private String staffName;
	//调动时间
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private int StaffId;
	private Staff staff;
	private Station position;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBeforeid() {
		return beforeid;
	}
	public void setBeforeid(int beforeid) {
		this.beforeid = beforeid;
	}
	public int getAfterid() {
		return afterid;
	}
	public void setAfterid(int afterid) {
		this.afterid = afterid;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	public Station getPosition() {
		return position;
	}
	public void setPosition(Station position) {
		this.position = position;
	}
	public int getStaffId() {
		return StaffId;
	}
	public void setStaffId(int staffId) {
		StaffId = staffId;
	}
	
	public StaffTransfer(int id, int beforeid, int afterid, String staffName, Date date, int staffId, Staff staff,
			Station station) {
		super();
		this.id = id;
		this.beforeid = beforeid;
		this.afterid = afterid;
		this.staffName = staffName;
		this.date = date;
		StaffId = staffId;
		this.staff = staff;
		this.position = position;
	}
	public StaffTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StaffTransfer [id=" + id + ", beforeid=" + beforeid + ", afterid=" + afterid + ", staffName="
				+ staffName + ", date=" + date + ", StaffId=" + StaffId + ", staff=" + staff + ", position=" + position
				+ "]";
	}
	
	
	
	
}
