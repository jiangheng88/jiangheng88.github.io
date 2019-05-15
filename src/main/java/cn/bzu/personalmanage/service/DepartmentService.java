package cn.bzu.personalmanage.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.entity.Department;

public interface DepartmentService {
	// �õ�һ����Ϣ�ļ�¼
	public Department getOneDepartment(int id);

	// �޸�
	public int update(Department department);

	// ɾ��
	public int del(int id);

	// ���
	public int insert(Department department);

	// �õ�������Ϣ

	public List<Department> getList();

	// ������ѯ���м�¼
	public List<Department> getDepartments();


	
}
