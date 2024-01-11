package mx.cicese.gliders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.cicese.gliders.dao.NoticiaDao;
import mx.cicese.gliders.entity.Noticia;
import mx.cicese.gliders.service.INoticiaService;

@Service
public class NoticiaImplService implements INoticiaService {
	
	@Autowired
	private NoticiaDao noticiaDao;

	@Override
	public List<Noticia> listAll() {
		
		return (List)noticiaDao.findAll();
	}

}
