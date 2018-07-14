package org.ood.callcenter;

public class Call {
	
	private Caller caller;
	private Role role;

	public Call(Caller caller) {
		this.caller = caller;
		Role role = Role.respondent;
	}
}
