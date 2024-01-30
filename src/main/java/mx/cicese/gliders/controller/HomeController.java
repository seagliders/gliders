package mx.cicese.gliders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import mx.cicese.gliders.entity.Noticia;
import mx.cicese.gliders.service.INoticiaService;
import mx.cicese.gliders.service.IReporteService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private INoticiaService noticiaService;
	
	@Autowired
	private IReporteService iReporteService;
	
	@GetMapping("")
	public String home(Model model, HttpSession session) {
		
		//model.addAttribute("sesion", session.getAttribute("idUsuario"));
		List<Noticia> noticias = noticiaService.listAllDscOrder();
		model.addAttribute("noticias", noticias);
		return "usuario/home";
	}
	
	@GetMapping("/datos")
	public String datos(Model model, HttpSession session) {
		model.addAttribute("activas", iReporteService.listReporteActivas());
		model.addAttribute("inactivas", iReporteService.listReporteInactivas());
		
		return "usuario/datos";
		
	}

}
