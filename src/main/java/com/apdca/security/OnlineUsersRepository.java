package com.apdca.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineUsersRepository extends JpaRepository<OnlineUsers, Long>{
	
	OnlineUsers findByreqloginnm(String reqloginnm);
	

}
