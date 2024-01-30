package mx.cicese.gliders.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.cicese.gliders.dao.ReporteDao;
import mx.cicese.gliders.entity.Reporte;
import mx.cicese.gliders.service.IReporteService;

@Service
public class ReporteImplService implements IReporteService{
	
	@Autowired
	private ReporteDao reporteDao;

	@Override
	public List<Reporte> listReporteActivas() {
		
		List<Reporte> activas = new ArrayList<>();
		reporteDao.findAll().forEach((estado) -> {
			//System.out.println(estado.getEstado().toString());
			if(estado.getEstado().toString().equals("1"))
			{
				activas.add(estado);
			}
		});
		
		
		return activas;
	}

	@Override
	public List<Reporte> listReporteInactivas() {
		List<Reporte> inactivas = new ArrayList<>();
		reporteDao.findAll().forEach((estado) -> {
			//System.out.println(estado.getEstado().toString());
			if(estado.getEstado().toString().equals("0"))
			{
				inactivas.add(estado);
			}
		});
		return inactivas;
	}

}
