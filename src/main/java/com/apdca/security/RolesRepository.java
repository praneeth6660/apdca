package com.apdca.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Integer>{
	Roles findByrolename(String rolename);

}
