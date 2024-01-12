package mx.cicese.gliders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
	
	@GetMapping("/pagina")
	public Page<Noticia> listNoticiaPageabled(Pageable pageable){
		
		Pageable sort = PageRequest.of(0, 5, Sort.by("id").descending());
		
		return noticiaService.listAll(sort);
		
	}
	

}
