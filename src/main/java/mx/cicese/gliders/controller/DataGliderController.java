package mx.cicese.gliders.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.cicese.gliders.entity.PlogData;

import mx.cicese.gliders.service.IPlogDataService;
import mx.cicese.gliders.service.IReporteService;

@RestController
@RequestMapping("/datosGliders")
public class DataGliderController {

	@Autowired
	private IPlogDataService iPlogDataService;

	@Autowired
	private IReporteService iReporteService;

	@GetMapping("")
	public List<PlogData> listAll() {
		return iPlogDataService.listAll();
	}

	@GetMapping("/getTrackMision")
	public List<PlogData> listDataMision() {
		List<String> activeMissions = new ArrayList<String>();
		activeMissions.add("0033");
		activeMissions.add("0032");//borrar esta linea para produccion
		//activeMissions.add("0033");//borrar esta linea para produccion
		//iReporteService.listReporteActivas().forEach((mision) -> {
			//activeMissions.add(mision.getMision()); //activar esta linea para produccion
		//});
		if (!activeMissions.isEmpty()) {
			return iPlogDataService.findPlogdataMissions();
		}
		return null;

	}

}
