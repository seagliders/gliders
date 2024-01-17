package mx.cicese.gliders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String home(Model model, HttpSession session) {
		
		model.addAttribute("sesion", session.getAttribute("idUsuario"));
		 return "usuario/home";
	}

}
