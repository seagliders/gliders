package mx.cicese.gliders.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import mx.cicese.gliders.entity.Noticia;

public interface INoticiaService {
	
	public List<Noticia> listAllDscOrder();
	
	public Page<Noticia> listAll(Pageable pageable);

}
