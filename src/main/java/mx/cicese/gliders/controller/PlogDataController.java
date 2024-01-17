package mx.cicese.gliders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.cicese.gliders.entity.PlogData;
import mx.cicese.gliders.service.IPlogDataService;

@RestController
@RequestMapping("/datosSuperficie")
public class PlogDataController {
	
	@Autowired
	private IPlogDataService iPlogDataService;
	
	@GetMapping("")
	public List<PlogData> listAll(){
		return iPlogDataService.listAll();
	}

}
