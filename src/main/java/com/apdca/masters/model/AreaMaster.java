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
@Entity
@IdClass(CompositeKey.class)
@Table(name = "fdca_area_master")
public class AreaMaster {
	private String dist_cd;
	private String cir_cd_old;
	private String area_cd_old;
	private String area_name;
	private String state_cd;
	private String u_name;
	private String ip_address;
	private LocalDateTime last_upd;
	@Id
	@Column(name="area_cd")
	private String areacd;
	@Id
	@Column(name="cir_cd")
	private String circd;
	private String rec_status;
	private String new_area_name;
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sno;

}
