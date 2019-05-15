package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.Department;

public interface DepartmentDao {
	//�õ�һ����Ϣ�ļ�¼
	public Department getOneDepartment(int id);
	//�޸�
	public int update(Department department);
	//ɾ��
	public int del(int id);
	
	//���
	public int insert(Department department);
	
	//�õ�������Ϣ
	public List<Department> getList();
	
	//����id�Ĺ�����ѯ
	
	public Department getDepartmentById(int id);

	//������ѯ���м�¼
	public List<Department> getDepartments();

	
}
