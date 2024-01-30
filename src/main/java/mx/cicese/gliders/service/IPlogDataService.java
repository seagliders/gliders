package mx.cicese.gliders.service;


import java.util.List;
import java.util.Map;

import mx.cicese.gliders.entity.PlogData;

public interface IPlogDataService {
	
	public List<PlogData> listAll();
	
	List<PlogData> findPlogdataMissions();

}
