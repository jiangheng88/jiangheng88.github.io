package cn.bzu.personalmanage.entity;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Staff {
	private int id;
	private String name;
	private String sex;
	private String age;

	// 联系方式
	private String phone;
	// 是否在职
	private String state;
	// 学历
	private String education;
	// 专业
	private String prefession;
	// 岗位编号
	private int stationId;
	// 部门编号
	private int departmentId;
	// 薪水编号
	private int salaryId;
	// 入职时间
	private int enterTimeId;
	private Salary salary;
	private Station station;
	private Department department;
	private StaffTransfer staffTransfer;
	private LeaveOffice leaveOffice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPrefession() {
		return prefession;
	}
	public void setPrefession(String prefession) {
		this.prefession = prefession;
	}
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public int getEnterTimeId() {
		return enterTimeId;
	}
	public void setEnterTimeId(int enterTimeId) {
		this.enterTimeId = enterTimeId;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public StaffTransfer getStaffTransfer() {
		return staffTransfer;
	}
	public void setStaffTransfer(StaffTransfer staffTransfer) {
		this.staffTransfer = staffTransfer;
	}
	public LeaveOffice getLeaveOffice() {
		return leaveOffice;
	}
	public void setLeaveOffice(LeaveOffice leaveOffice) {
		this.leaveOffice = leaveOffice;
	}
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, String name, String sex, String age, String phone, String state, String education,
			String prefession, int stationId, int departmentId, int salaryId, int enterTimeId, Salary salary,
			Station station, Department department, StaffTransfer staffTransfer, LeaveOffice leaveOffice) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.state = state;
		this.education = education;
		this.prefession = prefession;
		this.stationId = stationId;
		this.departmentId = departmentId;
		this.salaryId = salaryId;
		this.enterTimeId = enterTimeId;
		this.salary = salary;
		this.station = station;
		this.department = department;
		this.staffTransfer = staffTransfer;
		this.leaveOffice = leaveOffice;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", state="
				+ state + ", education=" + education + ", prefession=" + prefession + ", stationId=" + stationId
				+ ", departmentId=" + departmentId + ", salaryId=" + salaryId + ", enterTimeId=" + enterTimeId
				+ ", salary=" + salary + ", station=" + station + ", department=" + department + ", staffTransfer="
				+ staffTransfer + ", leaveOffice=" + leaveOffice + "]";
	}

}
