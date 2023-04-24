package com.apdca.security;

import java.util.List;

public interface UserService {
	OnlineUsers saveUser(OnlineUsersDto userDto);
	OnlineUsers findUserByreqloginnm(String reqloginnm);
	List<OnlineUsersDto> findAllUsers();
	
	
	
	
}
