package mx.cicese.gliders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "reporte")
public class Reporte {
	
	@Id
	private Integer id;
	private String glider;
	private String estado;
	private String mision;
	private String ruta;
	private String sensores;
	private String titulo;
	

}
