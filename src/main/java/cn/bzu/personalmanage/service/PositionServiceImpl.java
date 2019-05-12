package cn.bzu.personalmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzu.personalmanage.dao.PositionDao;
import cn.bzu.personalmanage.entity.Station;
@Service("positionService")
public class PositionServiceImpl implements PositionService{
	@Autowired
	private PositionDao positionDao;
	@Override
	public Station getOneStation(int id) {
		
		return positionDao.getOneStation(id);
	}

	@Override
	public int update(Station station) {
		
		return positionDao.update(station);
	}

	@Override
	public int del(int id) {
		
		return positionDao.del(id);
	}

	@Override
	public int insert(Station station) {
		
		return positionDao.insert(station);
	}

	@Override
	public List<Station> getList() {
		
		return positionDao.getList();
	}
	
}
