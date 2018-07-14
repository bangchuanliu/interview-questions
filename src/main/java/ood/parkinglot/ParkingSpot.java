package org.ood.parkinglot;

public class ParkingSpot {
	
	private int row;
	private Vehicle parkedVehicle;
	private Level level;
	private long startTime;
	
	public boolean isAvaiable() {
		return parkedVehicle == null;
	}
	
	public void park(Vehicle vehivle) {
		
	}
	
	
	public void removeVehicle() {
		
	}
	
	public boolean canPark(Vehicle vehicle) {
		return false;
	}
	
	
}
