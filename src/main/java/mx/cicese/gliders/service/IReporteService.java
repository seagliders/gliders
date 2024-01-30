package mx.cicese.gliders.service;

import java.util.List;

import mx.cicese.gliders.entity.Reporte;

public interface IReporteService {
	
	public List<Reporte> listReporteInactivas();
	public List<Reporte> listReporteActivas();
	

}
