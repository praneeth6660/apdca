package com.apdca.masters.model;

import java.time.LocalDateTime;

import com.apdca.user.model.CompositeKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JurisdictionId.class)
@Entity
@Table(name="fdca_jurisdiction_mast")
public class Jurisdiction {
	
	private String state_cd;
	private String dist_cd;
	private String taluka_cd;
	private String jur_cd_old;
	private String jur_name;
	private String cir_cd_old;
	private String area_cd_old;
	private String u_name;
	private String ipAddress;
	private LocalDateTime last_upd;
	private String rec_status;
	@Id
	@Column(name="cir_cd")
	private String circd;
	@Id
	@Column(name="area_cd")
	private String areacd;
	@Id
	@Column(name="jur_cd")
	private String jurcd;
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sno;
	

}
