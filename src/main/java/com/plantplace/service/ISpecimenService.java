package com.plantplace.service;

import com.plantplace.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchById(int id);

	void save(SpecimenDTO specimenDTO);

}