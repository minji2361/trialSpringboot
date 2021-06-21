package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.trial.model.Member;

public interface UserRepository extends JpaRepository<Member, Integer>{

	@Query("select m from Member m where id = :id and password = :password")
	Member findMember(String id, String password);

}
