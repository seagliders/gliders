package mx.cicese.gliders.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import mx.cicese.gliders.entity.PlogData;



public interface PlogDataDao extends JpaRepository<PlogData, Integer>{

	//List<PlogData> findByMisionIs(List<String> findMissions, Sort sort);
	//@Query("SELECT p FROM PlogData p WHERE p.mision IN (:mi)")
	//public List<PlogData> findPlogdataMissions(@Param("mi") List<String> missions);
    List<PlogData> findByMisionIn(List<String> misiones);

	
	
}
