package com.apdca.user.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.apdca.masters.model.Circle;
import com.apdca.masters.model.Fdca_Codes;
import com.apdca.masters.model.LicensesForm;
import com.apdca.masters.repository.CircleRepository;
import com.apdca.masters.repository.Fdca_CodesRepository;
import com.apdca.masters.repository.LicensesFormRepository;
import com.apdca.user.model.Inward;
import com.apdca.user.service.InwardService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private Environment env;
	@Autowired
	private Fdca_CodesRepository fdca_codesRepository;
	@Autowired
	private CircleRepository circleRepository;
	@Autowired
	private LicensesFormRepository licensesFormRepository;
	@Autowired
	private InwardService inwardSevice;

	@RequestMapping("/RequestforLicense")
	public String requestforLicenses(Model model,HttpSession session) {
		Inward inward = new Inward();
		List<Fdca_Codes> fdca_code = fdca_codesRepository.findByGrp("CON");
		List<Circle> circle_list = circleRepository.findAll();
		List<LicensesForm> licensesList = licensesFormRepository.findAll();
		model.addAttribute("fdca_codes", fdca_code);
		model.addAttribute("inward", inward);
		model.addAttribute("circle_list", circle_list);
		model.addAttribute("licensesList", licensesList);
		String id=""+session.getAttribute("reqId");
		System.out.println("id is--->"+id);
		return "users/RequestfroLicenses";
	}

	@RequestMapping("/SaveRequestforLicenses")
	public String saveRequestforLicenses(@Valid @ModelAttribute Inward inward,
			@RequestParam("file_type") MultipartFile file, HttpSession session, BindingResult result,Model model) {
		String fileName = file.getOriginalFilename();
		byte[] bytes;
		try {
			if(result.hasErrors()) {
				model.addAttribute("inward", inward);
				return "users/RequestfroLicenses";
			}
			bytes = file.getBytes();
			Path path = Paths.get(env.getProperty("file.path") + fileName);
			Files.write(path, bytes);
			inward.setAppl_status("FRE");
			inward.setFile_name(path.toString());
			inward.setInw_dt(LocalDateTime.now());
			Inward inw = inwardSevice.saveInward(inward);
			Long reqId = inw.getReq_id();
			session.setAttribute("reqId", reqId);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return "redirect:/users/RequestforLicense";
	}

}
