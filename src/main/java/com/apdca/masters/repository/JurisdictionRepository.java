package com.apdca.masters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apdca.masters.model.Jurisdiction;

@Repository
public interface JurisdictionRepository extends JpaRepository<Jurisdiction, String>{
	@Query(value = "select j.* from fdca_jurisdiction_mast j where j.cir_cd=:circd AND j.area_cd=:areacd",nativeQuery = true)
	List<Jurisdiction> findByCircdAndAreacd(String circd,String areacd);
}
