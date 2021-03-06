package com.tts.mapsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapController {
	@Autowired
	MapService mapService;
	
	@GetMapping({"/", "home"})
	public String getDefaultMap(Model model) {
		model.addAttribute(new Location());
		return "index";
	}
	
	@PostMapping({"/", "/home"})
	public String getMapForLocation(Location location, Model model) {
		mapService.addCoordinates(location);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		model.addAttribute(location);
		return "index";
	}
}
