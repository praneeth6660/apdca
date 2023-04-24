package com.apdca.security;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fdca_onlineuser")
public class OnlineUsers{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final long OTP_VALID_DURATION = 5 * 60 * 1000;   // 5 minutes
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private Long user_id;
	private String firm_no;
	private String user_nm;
	
	private String reqloginnm;
	private String user_pwd;
	private Long req_id;
	private String email_id;
	private String mobile_no;
	private String address;
    private String area;
    private String pincode;
    private String ip_no;
    private LocalDateTime reset_pwd_date;
    private String firm_nm;
    private int role_id;
    private Date dob;
    
    @Column(name = "verification_code", length = 64)
    private String verificationCode;
    private boolean enabled;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="user_roles",
            joinColumns={@JoinColumn(name="user_id", referencedColumnName="user_id")},
            inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="role_uid")})
    private List<Roles> roles = new ArrayList<>();

	
   
     
	
    
    
    

}
