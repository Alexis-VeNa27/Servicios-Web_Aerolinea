package uv.mx.Aerolinea.Repositorio;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import uv.mx.Aerolinea.DTO.Compras;

public interface Icompras extends CrudRepository<Compras, Integer>{
	
	@Query("select idCompra, idVueloF, nomCliente, metodoPago, asiento "
			+ "from Compras c "
			+ "where c.idCompra = :id_compra")
	String mostrarDatosCompra(@Param("id_compra") int idCompra);
	
	@Modifying
	@Query(
	  value = 
	    "insert into Compras (idCompra, asiento, metodoPago, nomCliente, idVuelo) values (?, ?, ?, ?, ?)",
	  nativeQuery = true)
	void insertCompra(@Param("id_compra") int idCompra, @Param("asiento") String asiento, 
	  @Param("metodo_pago") String metodoPago, @Param("nom_cliente") String nomCliente, @Param("id_vuelo") int idVuelo);		

}
