package cn.bzu.personalmanage.entity;

import org.springframework.stereotype.Component;

@Component
public class Station {
	private int id;
	private String stationName;
	private int maxNumber;
	private int staffId;
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	
	public Station(int id, String stationName, int maxNumber, int staffId) {
		super();
		this.id = id;
		this.stationName = stationName;
		this.maxNumber = maxNumber;
		this.staffId = staffId;
	}
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Station [id=" + id + ", stationName=" + stationName + ", maxNumber=" + maxNumber + ", staffId="
				+ staffId + "]";
	}
	
	
}
