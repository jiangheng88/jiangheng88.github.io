package cn.bzu.personalmanage.service;

import java.util.List;

import cn.bzu.personalmanage.entity.Station;

public interface PositionService {
	public Station getOneStation(int id);

	// �޸�
	public int update(Station station);

	// ɾ��
	public int del(int id);

	// ���
	public int insert(Station station);

	// �õ�������Ϣ

	public List<Station> getList();

}
