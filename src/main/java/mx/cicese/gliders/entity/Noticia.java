package mx.cicese.gliders.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="noticias")
public class Noticia {
	
	@Id
	private Integer id;
	
	private String encabezado;
	
	private String noticia;
	
	private String foto1;
	
	private String foto2;
	
	private String foto3;
	
	private Date fecha;
	
	private String fotopie1;
	
	private String fotopie2;
	
	private String fotopie3;

}
