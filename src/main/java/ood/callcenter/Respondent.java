package org.ood.callcenter;

public class Respondent extends Employee{

	private Manager manager;
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Respondent(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public boolean isAvailable() {
		return false;
	}

	@Override
	public void recevieCall(Call call) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee escalateCall(Call call) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean handleCall(Call call) {
		// TODO Auto-generated method stub
		return false;
	}

}
