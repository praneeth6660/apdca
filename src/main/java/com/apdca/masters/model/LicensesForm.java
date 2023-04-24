package com.apdca.masters.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="fdca_license_form")
public class LicensesForm {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sno;
	@Id
	private String licForm;
	private String typeSale;
	private String appliForm;
	private String licCd;

}
