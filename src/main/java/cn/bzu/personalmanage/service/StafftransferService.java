package cn.bzu.personalmanage.service;

import java.util.List;

import cn.bzu.personalmanage.entity.StaffTransfer;

public interface StafftransferService {
	// �õ�һ����Ϣ�ļ�¼
	public StaffTransfer getOneStafftransfer(int id);

	// �޸�
	public int update(StaffTransfer staffTransfer);

	// ɾ��
	public int del(int id);

	// ���
	public int insert(StaffTransfer staffTransfer);

	// �õ�������Ϣ

	public List<StaffTransfer> getList();
}
