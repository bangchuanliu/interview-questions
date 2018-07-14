package org.ood.callcenter;

public abstract class Employee {

	private Call currentCall;
	private Role role;
	private CallHandler callHandler;

	public Employee() {
	}
	
	public Employee(CallHandler callHandler) {
		this.callHandler = callHandler;
	}
	
	public boolean isAvailable() {
		return currentCall == null;
	}

	public void recevieCall(Call call) {
		if (!isAvailable()) {
			callHandler.addCall(call);
		} else {
			if (!handleCall(call)) {
				Employee emp = escalateCall(call);
				emp.recevieCall(call);
			} else {
				currentCall = null;
			}
		}
	};

	public abstract Employee escalateCall(Call call);
	
	public abstract boolean handleCall(Call call);
}
