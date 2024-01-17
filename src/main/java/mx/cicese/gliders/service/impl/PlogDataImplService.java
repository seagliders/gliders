package mx.cicese.gliders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
