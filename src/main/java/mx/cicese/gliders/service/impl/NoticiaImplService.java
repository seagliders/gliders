package mx.cicese.gliders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mx.cicese.gliders.dao.NoticiaDao;
import mx.cicese.gliders.entity.Noticia;
import mx.cicese.gliders.service.INoticiaService;

@Service
public class NoticiaImplService implements INoticiaService {
	
	@Autowired
	private NoticiaDao noticiaDao;

	@Override
	public List<Noticia> listAllDscOrder() {
		
		return (List)noticiaDao.findAll(Sort.by("fecha").descending());
	}

	@Override
	public Page<Noticia> listAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return noticiaDao.findAll(pageable);
	}

}
