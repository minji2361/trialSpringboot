package com.example.trial.service;

import com.example.trial.model.Member;

public interface UserService {
	
	public Member findMember(String id, String password);

}
