package com.apdca.masters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apdca.masters.model.LicensesForm;

@Repository
public interface LicensesFormRepository extends JpaRepository<LicensesForm, String>{

}
