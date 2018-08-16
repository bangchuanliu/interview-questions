package org.ood.callcenter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CallHandler {
	
	List<Respondent> respondents = new ArrayList<>();
	List<Manager> Managers = new ArrayList<>();
	List<Director> Directors = new ArrayList<>();
	
	BlockingQueue<Call> queue = new LinkedBlockingQueue<>();
	
	public CallHandler() {}
	
	public void dispatchCall(Call call) {
		Employee employee = getHandlerForCall(call);
		
		if (employee != null) {
			employee.recevieCall(call);
		} else {
			queue.add(call);
		}
	}
	
	public Employee getHandlerForCall(Call call) {
		return null;
	}
	
	public void addCall(Call call) {
		queue.add(call);
	}
}
