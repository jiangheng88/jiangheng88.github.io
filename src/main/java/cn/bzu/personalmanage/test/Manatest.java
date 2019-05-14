package cn.bzu.personalmanage.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.activation.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.codec.ServerSentEventHttpMessageReader;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.bzu.personalmanage.dao.DepartmentDao;
import cn.bzu.personalmanage.dao.LeaveOfficeDao;
import cn.bzu.personalmanage.dao.SalaryDao;
import cn.bzu.personalmanage.dao.StaffDao;
import cn.bzu.personalmanage.dao.StafftransferDao;
import cn.bzu.personalmanage.entity.Department;
import cn.bzu.personalmanage.entity.Salary;
import cn.bzu.personalmanage.entity.Staff;

public class Manatest {
	@Autowired
	private StaffDao staffDao;

	@Test
	public void maTest() throws IOException {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StaffDao staffDao = cxt.getBean(StaffDao.class);
		SalaryDao salaryDao = cxt.getBean(SalaryDao.class);
		DepartmentDao departmentDao = cxt.getBean(DepartmentDao.class);
		StafftransferDao stafftransferDao = cxt.getBean(StafftransferDao.class);
		LeaveOfficeDao l = cxt.getBean(LeaveOfficeDao.class);
		// Staff staff = new Staff();

		// staff.setPhone("5464648");
		// System.out.println(staffDao.update(staff));
		// Department department = new Department();
		// department.setDpname("ÏúÊÛ²¿");

		/*
		 * DepartmentDao departmentDao = cxt.getBean(DepartmentDao.class);
		 * System.out.println(departmentDao.getOneDepartment(1));
		 * departmentDao.insert(department);
		 */
		// Staff staff2 = staffDao.getStaff(13);
		/*
		 * List<Staff> list = staffDao.getListByLike("%¹þ%"); for (Staff f : list) {
		 * System.out.println(f); }
		 */

		// Salary salary = salaryDao.getOneSalary(1);
		/*
		 * Salary salary = new Salary(1,20,2800,150,25,5822);
		 * 
		 * int count = salaryDao.update(salary); System.out.println(count);
		 */
		/*
		 * List<Staff> list = staffDao.getListByLike(""); for (Staff f : list) {
		 * System.out.println(f); }
		 */

		/*
		 * List<Department> list = departmentDao.getList(); for (Department f : list) {
		 * System.out.println(f); }
		 */
		/*
		 * List<Department> list = departmentDao.getList(); for(Department
		 * department:list) { System.out.println(department.getStaffs()); }
		 */
		
		/*
		 * Map<Integer, String> map= departmentDao.getdpNameId();
		 * System.out.println(map);
		 */
		System.out.println(staffDao.getListByName("½ªºã"));
		 
	}

}
