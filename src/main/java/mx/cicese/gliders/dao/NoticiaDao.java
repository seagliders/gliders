package mx.cicese.gliders.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import mx.cicese.gliders.entity.Noticia;


public interface NoticiaDao extends JpaRepository<Noticia, Integer> {

}
