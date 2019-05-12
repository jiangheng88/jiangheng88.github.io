package cn.bzu.personalmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.StafftransferDao;
import cn.bzu.personalmanage.entity.StaffTransfer;
@Service("stafftransferService")
public class StafftransferServiceImpl implements StafftransferService {
	@Autowired
	private StafftransferDao stafftransfer;
	
	@Override
	public StaffTransfer getOneStafftransfer(int id) {
		
		return stafftransfer.getOneStafftransfer(id);
	}

	@Override
	public int update(StaffTransfer staffTransfer) {
		
		return stafftransfer.update(staffTransfer);
	}

	@Override
	public int del(int id) {
		
		return stafftransfer.del(id);
	}

	@Override
	public int insert(StaffTransfer staffTransfer) {
		
		return stafftransfer.insert(staffTransfer);
	}

	@Override
	public List<StaffTransfer> getList() {
		
		return stafftransfer.getList();
	}

}
