package mx.cicese.gliders.service.impl;

import java.util.List;

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
		return (List) plogDataDao.findAll();
	}

	@Override
	public List<PlogData> findPlogdataMissions() {
		
		String missionss = "0018";

		var sort = Sort.by(Sort.Direction.DESC, "mision", "dive");
		List<PlogData> plogDataActiveMission = plogDataDao.findPlogdataMissions(List.of("0018"));
		plogDataActiveMission.forEach((p) -> {
			
			if(p.getMision().trim().equals("0018")) {
				System.out.println(p.getDive());
			}
		});
		// Map<Object, List<PlogData>> plogByMision =
		// plogDataActiveMission.stream().collect(Collectors.groupingBy(s ->
		// s.getMision()));
System.out.println("----------------");
		return plogDataActiveMission;
	}

}
