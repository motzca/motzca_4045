package com.plantplace.service;

import com.plantplace.dto.SpecimenDTO;

/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */

public interface ISpecimenService {

	/**
	 * Get specimens from persistence layer
	 * @param id
	 * @return
	 */
	SpecimenDTO fetchById(int id);
	
/**
 * Persist the given DTO
 * @param specimenDTO
 */
	void save(SpecimenDTO specimenDTO);

}