package com.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.model.Member;
import com.example.trial.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Member findMember(String id, String password) {
		Member member = userRepository.findMember(id, password);
		return member;
	}

}
