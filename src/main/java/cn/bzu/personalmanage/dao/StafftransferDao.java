package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.Department;
import cn.bzu.personalmanage.entity.StaffTransfer;

public interface StafftransferDao {
	// 得到一条信息的记录
		public StaffTransfer getOneStafftransfer(int id);

		// 修改
		public int update(StaffTransfer staffTransfer);

		// 删除
		public int del(int id);

		// 添加
		public int insert(StaffTransfer staffTransfer);

		// 得到多条信息

		public List<StaffTransfer> getList();
}
