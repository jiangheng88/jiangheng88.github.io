package cn.bzu.personalmanage.dao;

import java.util.List;

import cn.bzu.personalmanage.entity.Station;

public interface PositionDao {
	public Station getOneStation(int id);

	// 修改
	public int update(Station station);

	// 删除
	public int del(int id);

	// 添加
	public int insert(Station station);

	// 得到多条信息

	public List<Station> getList();

}
