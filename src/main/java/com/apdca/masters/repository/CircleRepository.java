package com.apdca.masters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apdca.masters.model.Circle;

@Repository
public interface CircleRepository extends JpaRepository<Circle, String>{

}
