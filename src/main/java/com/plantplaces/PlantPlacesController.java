package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {
	
// Beginner controller
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
}
