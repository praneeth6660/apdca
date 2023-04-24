package com.apdca.masters.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apdca.masters.model.AreaMaster;
import com.apdca.masters.model.Jurisdiction;
import com.apdca.masters.repository.AreaMasterRepository;
import com.apdca.masters.repository.JurisdictionRepository;

@RestController
@RequestMapping(value = "/users")
public class CommonMethodsController {

	@Autowired
	private AreaMasterRepository areaMasterRepository;
	@Autowired
	private JurisdictionRepository jurisdictionRepository;

	@PostMapping("/getMandals")
	public List<AreaMaster> getMandals(@RequestBody AreaMaster userDate) {
		List<AreaMaster> areaList = new ArrayList<>();
		try {
			areaList = areaMasterRepository.findByCircd(userDate.getCircd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return areaList;
	}

	@PostMapping("/getJurisdiction")
	public List<Jurisdiction> getJurisdiction(@RequestBody Jurisdiction jurisdiction) {
		List<Jurisdiction> jurList = new ArrayList<>();
		try {
			jurList = jurisdictionRepository.findByCircdAndAreacd(jurisdiction.getCircd(), jurisdiction.getAreacd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jurList;
	}
}
