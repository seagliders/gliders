package mx.cicese.gliders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.cicese.gliders.entity.Noticia;
import mx.cicese.gliders.service.INoticiaService;

@RestController
@RequestMapping("/noticias")
public class NoticiasController {
	
	@Autowired
	private INoticiaService noticiaService;
	
	@GetMapping("")
	public List<Noticia> listAll(){
		
		
		return noticiaService.listAll();
		
		
	}

}
