package cn.bzu.personalmanage.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
public class LeaveOffice {
	private int id;
	private int StaffId;
	private String reason;
	private String state;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date enterdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date leavedate;
	private Staff staff;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public int getStaffId() {
		return StaffId;
	}
	public void setStaffId(int staffId) {
		StaffId = staffId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public Date getEnterdate() {
		return enterdate;
	}
	public void setEnterdate(Date enterdate) {
		this.enterdate = enterdate;
	}
	public Date getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public LeaveOffice() {
		super();
		
	}
	@Override
	public String toString() {
		return "LeaveOffice [id=" + id + ", reason=" + reason + ", state=" + state + ", enterdate=" + enterdate
				+ ", leavedate=" + leavedate + ", staff=" + staff + "]";
	}
	public LeaveOffice(int id, String reason, String state, Date enterdate, Date leavedate, Staff staff) {
		super();
		this.id = id;
		this.reason = reason;
		this.state = state;
		this.enterdate = enterdate;
		this.leavedate = leavedate;
		this.staff = staff;
	}
	
	
	
}
