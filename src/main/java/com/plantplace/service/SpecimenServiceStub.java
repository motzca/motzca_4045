package com.plantplace.service;

import org.springframework.stereotype.Component;

import com.plantplace.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimentDTO = new SpecimenDTO();
		specimentDTO.setSpecimentId(43);
		return specimentDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}

}
