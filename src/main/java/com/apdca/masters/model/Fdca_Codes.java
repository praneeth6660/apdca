package com.apdca.masters.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fdca_codes")
public class Fdca_Codes {

	private String grp;
	private String catg_cd;
	private String catg_nm;
	private String detail;
	private Long sn;
	private String codeids;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer newid;
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public String getCatg_cd() {
		return catg_cd;
	}
	public void setCatg_cd(String catg_cd) {
		this.catg_cd = catg_cd;
	}
	public String getCatg_nm() {
		return catg_nm;
	}
	public void setCatg_nm(String catg_nm) {
		this.catg_nm = catg_nm;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Long getSn() {
		return sn;
	}
	public void setSn(Long sn) {
		this.sn = sn;
	}
	public String getCodeids() {
		return codeids;
	}
	public void setCodeids(String codeids) {
		this.codeids = codeids;
	}
	public Integer getNewid() {
		return newid;
	}
	public void setNewid(Integer newid) {
		this.newid = newid;
	} 
	public Fdca_Codes(String grp, String catg_cd, String catg_nm, String detail, Long sn, String codeids,
			Integer newid) {
		super();
		this.grp = grp;
		this.catg_cd = catg_cd;
		this.catg_nm = catg_nm;
		this.detail = detail;
		this.sn = sn;
		this.codeids = codeids;
		this.newid = newid;
	}
	public Fdca_Codes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
