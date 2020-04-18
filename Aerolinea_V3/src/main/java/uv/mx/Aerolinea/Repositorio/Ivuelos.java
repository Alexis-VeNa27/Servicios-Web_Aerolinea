package uv.mx.Aerolinea.Repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import uv.mx.Aerolinea.DTO.Vuelos;

public interface Ivuelos extends CrudRepository<Vuelos, Integer> {
	
	@Query("select idVuelo, origen, destino, hora, fecha, precio "
			+ "from Vuelos v "
			+ "where v.idVuelo = :id_vuelo")
	String mostrarDatosVuelo(@Param("id_vuelo") int idVuelo);			

}
