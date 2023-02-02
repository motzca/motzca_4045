package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplace.dto.SpecimenDTO;
import com.plantplace.service.ISpecimenService;

@Controller
public class PlantPlacesController {

	@Autowired
	private ISpecimenService specimenServiceStub;

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimentDTO", specimenDTO);
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"context-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
}
