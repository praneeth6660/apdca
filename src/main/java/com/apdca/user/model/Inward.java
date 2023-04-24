package com.apdca.user.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="fdca_inward")
public class Inward {
	private String cir_cd;
	@CreatedDate
	private LocalDateTime inw_dt;
	private String inw_type;
	private Long firm_no;
	private String firm_type;
	private String firm_nm;
	private String add1;
	private String add2;
	private String town;
	@NotBlank
	 @Size(min = 6, max = 6)
	private String pin;
	@NotBlank
    @Pattern(regexp="^[6-9]\\d{9}$", message="Mobile number should be 10 digits and start with 6, 7, 8, or 9")
	private String phone;
	private String taluka_cd;
	private String firm_con;
	private String firm_sto;
	private String firm_est;
	private String firm_pos;
	private String firm_cei;
	private BigDecimal firm_area;
	private String firm_ic;
	private String lic_app;
	private Date lic_iss_dt;
	private Date lic_validity;
	private Date lic_renewal;
	private Date last_ins_dt;
	private String dist_cd;
	private String cold_storage;
	private String open24hr;
	private String parent_lic_no;
	private Long parent_firm_no;
	private String allot_2_di;
	private Date allot_dt;
	private Date ins_dt;
	private LocalDateTime recm_dt;
	private LocalDateTime grant_dt;
	private String ins_rep1;
	private String ins_rep2;
	private String ins_rep3;
	private String ins_rep4;
	private String inw_status;
	private String pending_at;
	private String ac_remark;
	private String emp_cd;
	private String bank_cd;
	private String pay_det;
	private Long mob_sms;
	private LocalDateTime dd_dt;
	private Long f_amnt;
	private String by_whom;
	private File lic_image;
	private File lic_image20e;
	private String inw_purpose;
	private String scheme;
	private String inw_by;
	private String grant_emp;
	private Long insp_id; 
	private String attach_docs;
	private Integer late_fee;
	private String inw_upd_mesg;
	private String req_tag;
	private LocalDateTime visit_on;
	private String area_cd;
	private String jur_cd;
	private String bank_branchname;
	private String challan_date;
	private String u_name;
	@LastModifiedDate
	private LocalDateTime last_upd;
	private String ip_no;
	private String email;
	private String state_cd;
	private String meseva_app_num;
	private String status_type;
	private String lic_20;
	private String lic_21;
	private String lic_20b;
	private String lic_21b;
	private String lic_20a;
	private String lic_21a;
	private String lic_20c;
	private String lic_20d;
	private String lic_20f;
	private String lic_20g;
	private String lic_20bb;
	private String lic_21bb;
	private String test;
	private String req_for;
	private String appl_status;
	private String aadhar_number;
	private String pan_number;
	@NotNull
	private String lic_form;
	private Date rec_date;
	private Long trno;
	private Date pay_date;
	private BigDecimal fee;
	private LocalDateTime final_sub_dt;
	private LocalDateTime ad_apr_rej_dt;
	private String ad_rej_apr_remarks;
	private LocalDateTime di_appr_rej_dt;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long req_id;
	private String frw_rej_ad;
	private String frw_rej_ad_ip;
	private String frw_rej_di;
	private String frw_rej_di_ip;
	private File insp_report;
	private String ack_msg;
	private String sdp_status;
	private String recommended;
	private LocalDateTime user_query_dt;
	private String user_query;
	private String user_query_ip;
	private String user_name;
	private String file_name;
	public String getCir_cd() {
		return cir_cd;
	}
	public void setCir_cd(String cir_cd) {
		this.cir_cd = cir_cd;
	}
	public LocalDateTime getInw_dt() {
		return inw_dt;
	}
	public void setInw_dt(LocalDateTime inw_dt) {
		this.inw_dt = inw_dt;
	}
	public String getInw_type() {
		return inw_type;
	}
	public void setInw_type(String inw_type) {
		this.inw_type = inw_type;
	}
	public Long getFirm_no() {
		return firm_no;
	}
	public void setFirm_no(Long firm_no) {
		this.firm_no = firm_no;
	}
	public String getFirm_type() {
		return firm_type;
	}
	public void setFirm_type(String firm_type) {
		this.firm_type = firm_type;
	}
	public String getFirm_nm() {
		return firm_nm;
	}
	public void setFirm_nm(String firm_nm) {
		this.firm_nm = firm_nm;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTaluka_cd() {
		return taluka_cd;
	}
	public void setTaluka_cd(String taluka_cd) {
		this.taluka_cd = taluka_cd;
	}
	public String getFirm_con() {
		return firm_con;
	}
	public void setFirm_con(String firm_con) {
		this.firm_con = firm_con;
	}
	public String getFirm_sto() {
		return firm_sto;
	}
	public void setFirm_sto(String firm_sto) {
		this.firm_sto = firm_sto;
	}
	public String getFirm_est() {
		return firm_est;
	}
	public void setFirm_est(String firm_est) {
		this.firm_est = firm_est;
	}
	public String getFirm_pos() {
		return firm_pos;
	}
	public void setFirm_pos(String firm_pos) {
		this.firm_pos = firm_pos;
	}
	public String getFirm_cei() {
		return firm_cei;
	}
	public void setFirm_cei(String firm_cei) {
		this.firm_cei = firm_cei;
	}
	public BigDecimal getFirm_area() {
		return firm_area;
	}
	public void setFirm_area(BigDecimal firm_area) {
		this.firm_area = firm_area;
	}
	public String getFirm_ic() {
		return firm_ic;
	}
	public void setFirm_ic(String firm_ic) {
		this.firm_ic = firm_ic;
	}
	public String getLic_app() {
		return lic_app;
	}
	public void setLic_app(String lic_app) {
		this.lic_app = lic_app;
	}
	public Date getLic_iss_dt() {
		return lic_iss_dt;
	}
	public void setLic_iss_dt(Date lic_iss_dt) {
		this.lic_iss_dt = lic_iss_dt;
	}
	public Date getLic_validity() {
		return lic_validity;
	}
	public void setLic_validity(Date lic_validity) {
		this.lic_validity = lic_validity;
	}
	public Date getLic_renewal() {
		return lic_renewal;
	}
	public void setLic_renewal(Date lic_renewal) {
		this.lic_renewal = lic_renewal;
	}
	public Date getLast_ins_dt() {
		return last_ins_dt;
	}
	public void setLast_ins_dt(Date last_ins_dt) {
		this.last_ins_dt = last_ins_dt;
	}
	public String getDist_cd() {
		return dist_cd;
	}
	public void setDist_cd(String dist_cd) {
		this.dist_cd = dist_cd;
	}
	public String getCold_storage() {
		return cold_storage;
	}
	public void setCold_storage(String cold_storage) {
		this.cold_storage = cold_storage;
	}
	public String getOpen24hr() {
		return open24hr;
	}
	public void setOpen24hr(String open24hr) {
		this.open24hr = open24hr;
	}
	public String getParent_lic_no() {
		return parent_lic_no;
	}
	public void setParent_lic_no(String parent_lic_no) {
		this.parent_lic_no = parent_lic_no;
	}
	public Long getParent_firm_no() {
		return parent_firm_no;
	}
	public void setParent_firm_no(Long parent_firm_no) {
		this.parent_firm_no = parent_firm_no;
	}
	public String getAllot_2_di() {
		return allot_2_di;
	}
	public void setAllot_2_di(String allot_2_di) {
		this.allot_2_di = allot_2_di;
	}
	public Date getAllot_dt() {
		return allot_dt;
	}
	public void setAllot_dt(Date allot_dt) {
		this.allot_dt = allot_dt;
	}
	public Date getIns_dt() {
		return ins_dt;
	}
	public void setIns_dt(Date ins_dt) {
		this.ins_dt = ins_dt;
	}
	public LocalDateTime getRecm_dt() {
		return recm_dt;
	}
	public void setRecm_dt(LocalDateTime recm_dt) {
		this.recm_dt = recm_dt;
	}
	public LocalDateTime getGrant_dt() {
		return grant_dt;
	}
	public void setGrant_dt(LocalDateTime grant_dt) {
		this.grant_dt = grant_dt;
	}
	public String getIns_rep1() {
		return ins_rep1;
	}
	public void setIns_rep1(String ins_rep1) {
		this.ins_rep1 = ins_rep1;
	}
	public String getIns_rep2() {
		return ins_rep2;
	}
	public void setIns_rep2(String ins_rep2) {
		this.ins_rep2 = ins_rep2;
	}
	public String getIns_rep3() {
		return ins_rep3;
	}
	public void setIns_rep3(String ins_rep3) {
		this.ins_rep3 = ins_rep3;
	}
	public String getIns_rep4() {
		return ins_rep4;
	}
	public void setIns_rep4(String ins_rep4) {
		this.ins_rep4 = ins_rep4;
	}
	public String getInw_status() {
		return inw_status;
	}
	public void setInw_status(String inw_status) {
		this.inw_status = inw_status;
	}
	public String getPending_at() {
		return pending_at;
	}
	public void setPending_at(String pending_at) {
		this.pending_at = pending_at;
	}
	public String getAc_remark() {
		return ac_remark;
	}
	public void setAc_remark(String ac_remark) {
		this.ac_remark = ac_remark;
	}
	public String getEmp_cd() {
		return emp_cd;
	}
	public void setEmp_cd(String emp_cd) {
		this.emp_cd = emp_cd;
	}
	public String getBank_cd() {
		return bank_cd;
	}
	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}
	public String getPay_det() {
		return pay_det;
	}
	public void setPay_det(String pay_det) {
		this.pay_det = pay_det;
	}
	public Long getMob_sms() {
		return mob_sms;
	}
	public void setMob_sms(Long mob_sms) {
		this.mob_sms = mob_sms;
	}
	public LocalDateTime getDd_dt() {
		return dd_dt;
	}
	public void setDd_dt(LocalDateTime dd_dt) {
		this.dd_dt = dd_dt;
	}
	public Long getF_amnt() {
		return f_amnt;
	}
	public void setF_amnt(Long f_amnt) {
		this.f_amnt = f_amnt;
	}
	public String getBy_whom() {
		return by_whom;
	}
	public void setBy_whom(String by_whom) {
		this.by_whom = by_whom;
	}
	public File getLic_image() {
		return lic_image;
	}
	public void setLic_image(File lic_image) {
		this.lic_image = lic_image;
	}
	public File getLic_image20e() {
		return lic_image20e;
	}
	public void setLic_image20e(File lic_image20e) {
		this.lic_image20e = lic_image20e;
	}
	public String getInw_purpose() {
		return inw_purpose;
	}
	public void setInw_purpose(String inw_purpose) {
		this.inw_purpose = inw_purpose;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getInw_by() {
		return inw_by;
	}
	public void setInw_by(String inw_by) {
		this.inw_by = inw_by;
	}
	public String getGrant_emp() {
		return grant_emp;
	}
	public void setGrant_emp(String grant_emp) {
		this.grant_emp = grant_emp;
	}
	public Long getInsp_id() {
		return insp_id;
	}
	public void setInsp_id(Long insp_id) {
		this.insp_id = insp_id;
	}
	public String getAttach_docs() {
		return attach_docs;
	}
	public void setAttach_docs(String attach_docs) {
		this.attach_docs = attach_docs;
	}
	public Integer getLate_fee() {
		return late_fee;
	}
	public void setLate_fee(Integer late_fee) {
		this.late_fee = late_fee;
	}
	public String getInw_upd_mesg() {
		return inw_upd_mesg;
	}
	public void setInw_upd_mesg(String inw_upd_mesg) {
		this.inw_upd_mesg = inw_upd_mesg;
	}
	public String getReq_tag() {
		return req_tag;
	}
	public void setReq_tag(String req_tag) {
		this.req_tag = req_tag;
	}
	public LocalDateTime getVisit_on() {
		return visit_on;
	}
	public void setVisit_on(LocalDateTime visit_on) {
		this.visit_on = visit_on;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
	public String getJur_cd() {
		return jur_cd;
	}
	public void setJur_cd(String jur_cd) {
		this.jur_cd = jur_cd;
	}
	public String getBank_branchname() {
		return bank_branchname;
	}
	public void setBank_branchname(String bank_branchname) {
		this.bank_branchname = bank_branchname;
	}
	public String getChallan_date() {
		return challan_date;
	}
	public void setChallan_date(String challan_date) {
		this.challan_date = challan_date;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public LocalDateTime getLast_upd() {
		return last_upd;
	}
	public void setLast_upd(LocalDateTime last_upd) {
		this.last_upd = last_upd;
	}
	public String getIp_no() {
		return ip_no;
	}
	public void setIp_no(String ip_no) {
		this.ip_no = ip_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState_cd() {
		return state_cd;
	}
	public void setState_cd(String state_cd) {
		this.state_cd = state_cd;
	}
	public String getMeseva_app_num() {
		return meseva_app_num;
	}
	public void setMeseva_app_num(String meseva_app_num) {
		this.meseva_app_num = meseva_app_num;
	}
	public String getStatus_type() {
		return status_type;
	}
	public void setStatus_type(String status_type) {
		this.status_type = status_type;
	}
	public String getLic_20() {
		return lic_20;
	}
	public void setLic_20(String lic_20) {
		this.lic_20 = lic_20;
	}
	public String getLic_21() {
		return lic_21;
	}
	public void setLic_21(String lic_21) {
		this.lic_21 = lic_21;
	}
	public String getLic_20b() {
		return lic_20b;
	}
	public void setLic_20b(String lic_20b) {
		this.lic_20b = lic_20b;
	}
	public String getLic_21b() {
		return lic_21b;
	}
	public void setLic_21b(String lic_21b) {
		this.lic_21b = lic_21b;
	}
	public String getLic_20a() {
		return lic_20a;
	}
	public void setLic_20a(String lic_20a) {
		this.lic_20a = lic_20a;
	}
	public String getLic_21a() {
		return lic_21a;
	}
	public void setLic_21a(String lic_21a) {
		this.lic_21a = lic_21a;
	}
	public String getLic_20c() {
		return lic_20c;
	}
	public void setLic_20c(String lic_20c) {
		this.lic_20c = lic_20c;
	}
	public String getLic_20d() {
		return lic_20d;
	}
	public void setLic_20d(String lic_20d) {
		this.lic_20d = lic_20d;
	}
	public String getLic_20f() {
		return lic_20f;
	}
	public void setLic_20f(String lic_20f) {
		this.lic_20f = lic_20f;
	}
	public String getLic_20g() {
		return lic_20g;
	}
	public void setLic_20g(String lic_20g) {
		this.lic_20g = lic_20g;
	}
	public String getLic_20bb() {
		return lic_20bb;
	}
	public void setLic_20bb(String lic_20bb) {
		this.lic_20bb = lic_20bb;
	}
	public String getLic_21bb() {
		return lic_21bb;
	}
	public void setLic_21bb(String lic_21bb) {
		this.lic_21bb = lic_21bb;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getReq_for() {
		return req_for;
	}
	public void setReq_for(String req_for) {
		this.req_for = req_for;
	}
	public String getAppl_status() {
		return appl_status;
	}
	public void setAppl_status(String appl_status) {
		this.appl_status = appl_status;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getLic_form() {
		return lic_form;
	}
	public void setLic_form(String lic_form) {
		this.lic_form = lic_form;
	}
	public Date getRec_date() {
		return rec_date;
	}
	public void setRec_date(Date rec_date) {
		this.rec_date = rec_date;
	}
	public Long getTrno() {
		return trno;
	}
	public void setTrno(Long trno) {
		this.trno = trno;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public LocalDateTime getFinal_sub_dt() {
		return final_sub_dt;
	}
	public void setFinal_sub_dt(LocalDateTime final_sub_dt) {
		this.final_sub_dt = final_sub_dt;
	}
	public LocalDateTime getAd_apr_rej_dt() {
		return ad_apr_rej_dt;
	}
	public void setAd_apr_rej_dt(LocalDateTime ad_apr_rej_dt) {
		this.ad_apr_rej_dt = ad_apr_rej_dt;
	}
	public String getAd_rej_apr_remarks() {
		return ad_rej_apr_remarks;
	}
	public void setAd_rej_apr_remarks(String ad_rej_apr_remarks) {
		this.ad_rej_apr_remarks = ad_rej_apr_remarks;
	}
	public LocalDateTime getDi_appr_rej_dt() {
		return di_appr_rej_dt;
	}
	public void setDi_appr_rej_dt(LocalDateTime di_appr_rej_dt) {
		this.di_appr_rej_dt = di_appr_rej_dt;
	}
	public Long getReq_id() {
		return req_id;
	}
	public void setReq_id(Long req_id) {
		this.req_id = req_id;
	}
	public String getFrw_rej_ad() {
		return frw_rej_ad;
	}
	public void setFrw_rej_ad(String frw_rej_ad) {
		this.frw_rej_ad = frw_rej_ad;
	}
	public String getFrw_rej_ad_ip() {
		return frw_rej_ad_ip;
	}
	public void setFrw_rej_ad_ip(String frw_rej_ad_ip) {
		this.frw_rej_ad_ip = frw_rej_ad_ip;
	}
	public String getFrw_rej_di() {
		return frw_rej_di;
	}
	public void setFrw_rej_di(String frw_rej_di) {
		this.frw_rej_di = frw_rej_di;
	}
	public String getFrw_rej_di_ip() {
		return frw_rej_di_ip;
	}
	public void setFrw_rej_di_ip(String frw_rej_di_ip) {
		this.frw_rej_di_ip = frw_rej_di_ip;
	}
	public File getInsp_report() {
		return insp_report;
	}
	public void setInsp_report(File insp_report) {
		this.insp_report = insp_report;
	}
	public String getAck_msg() {
		return ack_msg;
	}
	public void setAck_msg(String ack_msg) {
		this.ack_msg = ack_msg;
	}
	public String getSdp_status() {
		return sdp_status;
	}
	public void setSdp_status(String sdp_status) {
		this.sdp_status = sdp_status;
	}
	public String getRecommended() {
		return recommended;
	}
	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}
	public LocalDateTime getUser_query_dt() {
		return user_query_dt;
	}
	public void setUser_query_dt(LocalDateTime user_query_dt) {
		this.user_query_dt = user_query_dt;
	}
	public String getUser_query() {
		return user_query;
	}
	public void setUser_query(String user_query) {
		this.user_query = user_query;
	}
	public String getUser_query_ip() {
		return user_query_ip;
	}
	public void setUser_query_ip(String user_query_ip) {
		this.user_query_ip = user_query_ip;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public Inward() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inward(String cir_cd, LocalDateTime inw_dt, String inw_type, Long firm_no, String firm_type, String firm_nm,
			String add1, String add2, String town, String pin, String phone, String taluka_cd, String firm_con,
			String firm_sto, String firm_est, String firm_pos, String firm_cei, BigDecimal firm_area, String firm_ic,
			String lic_app, Date lic_iss_dt, Date lic_validity, Date lic_renewal, Date last_ins_dt, String dist_cd,
			String cold_storage, String open24hr, String parent_lic_no, Long parent_firm_no, String allot_2_di,
			Date allot_dt, Date ins_dt, LocalDateTime recm_dt, LocalDateTime grant_dt, String ins_rep1, String ins_rep2,
			String ins_rep3, String ins_rep4, String inw_status, String pending_at, String ac_remark, String emp_cd,
			String bank_cd, String pay_det, Long mob_sms, LocalDateTime dd_dt, Long f_amnt, String by_whom,
			File lic_image, File lic_image20e, String inw_purpose, String scheme, String inw_by, String grant_emp,
			Long insp_id, String attach_docs, Integer late_fee, String inw_upd_mesg, String req_tag,
			LocalDateTime visit_on, String area_cd, String jur_cd, String bank_branchname, String challan_date,
			String u_name, LocalDateTime last_upd, String ip_no, String email, String state_cd, String meseva_app_num,
			String status_type, String lic_20, String lic_21, String lic_20b, String lic_21b, String lic_20a,
			String lic_21a, String lic_20c, String lic_20d, String lic_20f, String lic_20g, String lic_20bb,
			String lic_21bb, String test, String req_for, String appl_status, String aadhar_number, String pan_number,
			String lic_form, Date rec_date, Long trno, Date pay_date, BigDecimal fee, LocalDateTime final_sub_dt,
			LocalDateTime ad_apr_rej_dt, String ad_rej_apr_remarks, LocalDateTime di_appr_rej_dt, Long req_id,
			String frw_rej_ad, String frw_rej_ad_ip, String frw_rej_di, String frw_rej_di_ip, File insp_report,
			String ack_msg, String sdp_status, String recommended, LocalDateTime user_query_dt, String user_query,
			String user_query_ip, String user_name, String file_name) {
		super();
		this.cir_cd = cir_cd;
		this.inw_dt = inw_dt;
		this.inw_type = inw_type;
		this.firm_no = firm_no;
		this.firm_type = firm_type;
		this.firm_nm = firm_nm;
		this.add1 = add1;
		this.add2 = add2;
		this.town = town;
		this.pin = pin;
		this.phone = phone;
		this.taluka_cd = taluka_cd;
		this.firm_con = firm_con;
		this.firm_sto = firm_sto;
		this.firm_est = firm_est;
		this.firm_pos = firm_pos;
		this.firm_cei = firm_cei;
		this.firm_area = firm_area;
		this.firm_ic = firm_ic;
		this.lic_app = lic_app;
		this.lic_iss_dt = lic_iss_dt;
		this.lic_validity = lic_validity;
		this.lic_renewal = lic_renewal;
		this.last_ins_dt = last_ins_dt;
		this.dist_cd = dist_cd;
		this.cold_storage = cold_storage;
		this.open24hr = open24hr;
		this.parent_lic_no = parent_lic_no;
		this.parent_firm_no = parent_firm_no;
		this.allot_2_di = allot_2_di;
		this.allot_dt = allot_dt;
		this.ins_dt = ins_dt;
		this.recm_dt = recm_dt;
		this.grant_dt = grant_dt;
		this.ins_rep1 = ins_rep1;
		this.ins_rep2 = ins_rep2;
		this.ins_rep3 = ins_rep3;
		this.ins_rep4 = ins_rep4;
		this.inw_status = inw_status;
		this.pending_at = pending_at;
		this.ac_remark = ac_remark;
		this.emp_cd = emp_cd;
		this.bank_cd = bank_cd;
		this.pay_det = pay_det;
		this.mob_sms = mob_sms;
		this.dd_dt = dd_dt;
		this.f_amnt = f_amnt;
		this.by_whom = by_whom;
		this.lic_image = lic_image;
		this.lic_image20e = lic_image20e;
		this.inw_purpose = inw_purpose;
		this.scheme = scheme;
		this.inw_by = inw_by;
		this.grant_emp = grant_emp;
		this.insp_id = insp_id;
		this.attach_docs = attach_docs;
		this.late_fee = late_fee;
		this.inw_upd_mesg = inw_upd_mesg;
		this.req_tag = req_tag;
		this.visit_on = visit_on;
		this.area_cd = area_cd;
		this.jur_cd = jur_cd;
		this.bank_branchname = bank_branchname;
		this.challan_date = challan_date;
		this.u_name = u_name;
		this.last_upd = last_upd;
		this.ip_no = ip_no;
		this.email = email;
		this.state_cd = state_cd;
		this.meseva_app_num = meseva_app_num;
		this.status_type = status_type;
		this.lic_20 = lic_20;
		this.lic_21 = lic_21;
		this.lic_20b = lic_20b;
		this.lic_21b = lic_21b;
		this.lic_20a = lic_20a;
		this.lic_21a = lic_21a;
		this.lic_20c = lic_20c;
		this.lic_20d = lic_20d;
		this.lic_20f = lic_20f;
		this.lic_20g = lic_20g;
		this.lic_20bb = lic_20bb;
		this.lic_21bb = lic_21bb;
		this.test = test;
		this.req_for = req_for;
		this.appl_status = appl_status;
		this.aadhar_number = aadhar_number;
		this.pan_number = pan_number;
		this.lic_form = lic_form;
		this.rec_date = rec_date;
		this.trno = trno;
		this.pay_date = pay_date;
		this.fee = fee;
		this.final_sub_dt = final_sub_dt;
		this.ad_apr_rej_dt = ad_apr_rej_dt;
		this.ad_rej_apr_remarks = ad_rej_apr_remarks;
		this.di_appr_rej_dt = di_appr_rej_dt;
		this.req_id = req_id;
		this.frw_rej_ad = frw_rej_ad;
		this.frw_rej_ad_ip = frw_rej_ad_ip;
		this.frw_rej_di = frw_rej_di;
		this.frw_rej_di_ip = frw_rej_di_ip;
		this.insp_report = insp_report;
		this.ack_msg = ack_msg;
		this.sdp_status = sdp_status;
		this.recommended = recommended;
		this.user_query_dt = user_query_dt;
		this.user_query = user_query;
		this.user_query_ip = user_query_ip;
		this.user_name = user_name;
		this.file_name = file_name;
	}
	
}
