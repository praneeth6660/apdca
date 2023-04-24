package com.apdca.masters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apdca.masters.model.AreaMaster;

@Repository
public interface AreaMasterRepository extends JpaRepository<AreaMaster, String>{

	List<AreaMaster> findByCircd(String cir_cd);
	
}
