package com.apdca.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apdca.user.model.Inward;
import com.apdca.user.repository.InwardRepository;

@Service
public class InwardServiceImpl implements InwardService{

	@Autowired
	private InwardRepository inwardRepository;
	
	@Override
	public Inward saveInward(Inward inward) {
		// TODO Auto-generated method stub
		return inwardRepository.save(inward);
	}

}
