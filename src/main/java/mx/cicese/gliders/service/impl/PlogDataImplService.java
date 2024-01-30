package mx.cicese.gliders.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mx.cicese.gliders.dao.PlogDataDao;
import mx.cicese.gliders.entity.PlogData;
import mx.cicese.gliders.service.IPlogDataService;

@Service
public class PlogDataImplService implements IPlogDataService {
	
	@Autowired
	private PlogDataDao plogDataDao;

	@Override
	public List<PlogData> listAll() {
		// TODO Auto-generated method stub
		return (List)plogDataDao.findAll();
	}

	@Override
	public List<PlogData> findPlogdataMissions() {
		
		List<String> missions =  new ArrayList<>();
		missions.add("0033");
		missions.add("0032");
		
		var sort = Sort.by(Sort.Direction.DESC, "dive");
		List<PlogData> plogDataActiveMission = plogDataDao.findByMisionIn(missions);
		
		
		
		
        //Map<Object, List<PlogData>> plogByMision = plogDataActiveMission.stream().collect(Collectors.groupingBy(s -> s.getMision()));




	        
		
		return plogDataActiveMission;
	}

}
