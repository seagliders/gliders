package mx.cicese.gliders.dao;

import org.springframework.data.repository.CrudRepository;

import mx.cicese.gliders.entity.Noticia;


public interface NoticiaDao extends CrudRepository<Noticia, Integer> {

}
