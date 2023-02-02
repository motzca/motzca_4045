package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplace.dto.SpecimenDTO;
import com.plantplace.service.ISpecimenService;

@Controller
public class PlantPlacesController {

	@Autowired
	private ISpecimenService specimenServiceStub;

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		return "start";
	}
}
