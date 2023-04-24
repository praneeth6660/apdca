package com.apdca.masters.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.apdca.security.Roles;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "fdca_circle")
public class Circle {
	private String cir_nm;
	private Long lic_sr;
	private String lic_head;
	private String add1;
	private String add2;
	private String city;
	private String cir_head;
	private String cir_pass;
	private String cir_dist1;
	private String cir_dist2;
	private String cir_dist3;
	private LocalDateTime check_in;
	private LocalDateTime check_out;
	private Long no_hits;
	private int dly_hits;
	private int no_logged;
	private String common_msg_1;
	private String common_msg_2;
	private String common_msg_3;
	private int msg_cnt;
	private int no_lic;
	private int rp_def;
	private String stickler_msg;
	private String dist_cd;
	@Id
	private String cir_cd;
	private String state_cd;
	private String u_name;
	private String ip_address;
	private LocalDateTime last_upd;

}
