package org.ood.callcenter;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

	private Director director;
	private List<Respondent> respondents = new ArrayList<>();
	
	public Manager(Director director) {
		this.director = director;
	}
	
	public void addRespondent(Respondent respondent) {
		respondents.add(respondent);
	}
	
	@Override
	public boolean isAvailable() {
		return false;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Respondent> getRespondents() {
		return respondents;
	}

	public void setRespondents(List<Respondent> respondents) {
		this.respondents = respondents;
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
