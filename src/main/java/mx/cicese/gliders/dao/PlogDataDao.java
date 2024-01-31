package mx.cicese.gliders.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mx.cicese.gliders.entity.PlogData;

public interface PlogDataDao extends JpaRepository<PlogData, Integer> {

	// List<PlogData> findByMisionIs(List<String> findMissions, Sort sort);
	// @Query("SELECT p FROM PlogData p WHERE p.mision IN (:mi)")
	//@Query("SELECT pd FROM PlogData pd WHERE pd.mision IN :misionList")
	@Query(value = "SELECT * FROM plog AS pd WHERE pd.mision IN(:misionList) ORDER BY pd.dive", nativeQuery = true)
	List<PlogData> findPlogdataMissions(@Param("misionList")List<String> missions);
	// List<PlogData> findByMisionIn(List<String> misiones);

}
