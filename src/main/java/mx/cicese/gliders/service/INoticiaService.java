package mx.cicese.gliders.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mx.cicese.gliders.entity.Noticia;

public interface INoticiaService {
	
	public List<Noticia> listAll();
	
	public Page<Noticia> listAll(Pageable pageable);

}
