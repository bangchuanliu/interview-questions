package org.ood.callcenter;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

	private List<Manager> managers = new ArrayList<>();
	
	public Director() {
		
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
