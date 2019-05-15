package cn.bzu.personalmanage.entity;

public class Salary {
	private int id;
	
	//������
	private int attendance;
	//��������
	private int baseSalary;
	//����
	private int bonus;
	//����
	private int allowance;
	//�ܺ�
	private int sum;
	//Ա��
	private Staff staff;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getAllowance() {
		return allowance;
	}
	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Salary(int id, int staffId, String staffName, int attendance, int baseSalary, int bonus, int allowance,
			int sum, Staff staff) {
		super();
		this.id = id;
		
		this.attendance = attendance;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.allowance = allowance;
		this.sum = sum;
		this.staff = staff;
	}
	
	
	public Salary(int id, int attendance, int baseSalary, int bonus, int allowance, int sum) {
		super();
		this.id = id;
		this.attendance = attendance;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.allowance = allowance;
		this.sum = sum;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", attendance=" + attendance
				+ ", baseSalary=" + baseSalary + ", bonus=" + bonus + ", allowance=" + allowance + ", sum=" + sum
				+ ", staff=" + staff + "]";
	}
	
	
	
	
}
