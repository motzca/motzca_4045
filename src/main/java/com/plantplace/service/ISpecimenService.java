package com.plantplace.service;

import com.plantplace.dto.SpecimenDTO;

public interface ISpecimenService {

	/* (non-Javadoc)
	 * @see com.plantplaces.service.ISpecimentService#fetchById(int)
	 */
	SpecimenDTO fetchById(int id);

	/* (non-Javadoc)
	 * @see com.plantplaces.service.ISpecimentService#fetchById(int)
	 */
	void save(SpecimenDTO specimenDTO);

}