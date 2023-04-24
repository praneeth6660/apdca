package com.apdca.masters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apdca.masters.model.Fdca_Codes;

@Repository
public interface Fdca_CodesRepository extends JpaRepository<Fdca_Codes, Integer>{
	List<Fdca_Codes> findByGrp(String grp);
}
