package uv.mx.Aerolinea;

import org.example.aerolinea.AgregarVueloRequest;
import org.example.aerolinea.AgregarVueloResponse;
import org.example.aerolinea.CancelarCompraRequest;
import org.example.aerolinea.CancelarCompraResponse;
import org.example.aerolinea.EliminarVueloRequest;
import org.example.aerolinea.EliminarVueloResponse;
import org.example.aerolinea.ModificarCompraRequest;
import org.example.aerolinea.ModificarCompraResponse;
import org.example.aerolinea.ModificarVueloRequest;
import org.example.aerolinea.ModificarVueloResponse;
import org.example.aerolinea.MostrarCompraRequest;
import org.example.aerolinea.MostrarCompraResponse;
import org.example.aerolinea.MostrarVueloRequest;
import org.example.aerolinea.MostrarVueloResponse;
import org.example.aerolinea.RealizarCompraRequest;
import org.example.aerolinea.RealizarCompraResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import uv.mx.Aerolinea.DTO.Compras;
import uv.mx.Aerolinea.DTO.Vuelos;
import uv.mx.Aerolinea.Repositorio.Icompras;
import uv.mx.Aerolinea.Repositorio.Ivuelos;


@Endpoint
public class EndPoint {
	
	@Autowired	
	private Icompras icompras;
	
	@Autowired
	private Ivuelos ivuelos;
	
	@PayloadRoot(localPart="AgregarVueloRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public AgregarVueloResponse getAgregarVuelo(@RequestPayload AgregarVueloRequest peticion ) {
		AgregarVueloResponse agregarVuelo= new AgregarVueloResponse();
		agregarVuelo.setMensaje("Se agrego el siguiente vuelo: \n"); 
		agregarVuelo.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		agregarVuelo.setOrigen("ORIGEN: " + peticion.getOrigen());
		agregarVuelo.setDestino("DESTINO: " + peticion.getDestino());
		agregarVuelo.setHora("HORA: " + peticion.getHora());
		agregarVuelo.setFecha("FECHA: " + peticion.getFecha());
		agregarVuelo.setPrecio("PRECIO: " + peticion.getPrecio());	
		
		Vuelos vuelos = new Vuelos();
		
		vuelos.setIdVuelo(peticion.getIdVuelo());
		vuelos.setOrigen(peticion.getOrigen());
		vuelos.setDestino(peticion.getDestino());
		vuelos.setHora(peticion.getHora());
		vuelos.setFecha(peticion.getFecha());
		vuelos.setPrecio(peticion.getPrecio());				
		
		ivuelos.save(vuelos);	
		
		return agregarVuelo;		
	}
		
		
	@PayloadRoot(localPart="MostrarVueloRequest", namespace="http://www.example.org/Aerolinea")
		
	@ResponsePayload
	public MostrarVueloResponse getMostrarVuelo(@RequestPayload MostrarVueloRequest peticion ) {
		MostrarVueloResponse mostrarVuelo= new MostrarVueloResponse();
		
		String id = ivuelos.mostrarDatosVuelo(peticion.getIdVuelo());
		
		String[] datosVuelo = id.split(",");
		
		String idVuelo = datosVuelo[0];
		int IDVUELO = Integer.parseInt(idVuelo);
		
		String ORIGEN = datosVuelo[1];
		String DESTINO = datosVuelo[2];
		String HORA = datosVuelo[3];
		String FECHA = datosVuelo[4];
			
		String precio = datosVuelo[5];
		int PRECIO = Integer.parseInt(precio);				
		
		mostrarVuelo.setMensaje("Datos del vuelo seleccionado: \n");				
		mostrarVuelo.setIdVuelo("ID_VUELO: " + IDVUELO);		
		mostrarVuelo.setOrigen("ORIGEN: " + ORIGEN);
		mostrarVuelo.setDestino("DESTINO: " + DESTINO);
		mostrarVuelo.setHora("HORA: " + HORA);
		mostrarVuelo.setFecha("FECHA: " + FECHA);
		mostrarVuelo.setPrecio("PRECIO: " + PRECIO);
		
		return mostrarVuelo;			
	}
	
	@PayloadRoot(localPart="ModificarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ModificarVueloResponse getModificarVuelo(@RequestPayload ModificarVueloRequest peticion ) {
		ModificarVueloResponse modificarVuelo= new ModificarVueloResponse();						
		
		modificarVuelo.setMensaje("Se modificaron los datos del siguiente vuelo: \n"); 
		modificarVuelo.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		modificarVuelo.setOrigen("ORIGEN: " + peticion.getOrigen());
		modificarVuelo.setDestino("DESTINO: " + peticion.getDestino());
		modificarVuelo.setHora("HORA: " + peticion.getHora());
		modificarVuelo.setFecha("FECHA: " + peticion.getFecha());
		modificarVuelo.setPrecio("PRECIO: " + peticion.getPrecio());
		
		Vuelos vuelos = new Vuelos();
		
		vuelos.setIdVuelo(peticion.getIdVuelo());
		vuelos.setOrigen(peticion.getOrigen());
		vuelos.setDestino(peticion.getDestino());
		vuelos.setHora(peticion.getHora());
		vuelos.setFecha(peticion.getFecha());
		vuelos.setPrecio(peticion.getPrecio());				
		
		ivuelos.save(vuelos);	
		
		return modificarVuelo;			
	}
	
	@PayloadRoot(localPart="EliminarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public EliminarVueloResponse getEliminarVuelo(@RequestPayload EliminarVueloRequest peticion ) {
		EliminarVueloResponse eliminarVuelo= new EliminarVueloResponse();
		
		String id = ivuelos.mostrarDatosVuelo(peticion.getIdVuelo());
		
		String[] datosVuelo = id.split(",");
		
		String idVuelo = datosVuelo[0];
		int IDVUELO = Integer.parseInt(idVuelo);
		
		String ORIGEN = datosVuelo[1];
		String DESTINO = datosVuelo[2];
		String HORA = datosVuelo[3];
		String FECHA = datosVuelo[4];
			
		String precio = datosVuelo[5];
		int PRECIO = Integer.parseInt(precio);				
		
		eliminarVuelo.setMensaje("Datos del vuelo eliminado: \n"); 
		eliminarVuelo.setIdVuelo("ID_VUELO: " + IDVUELO);
		eliminarVuelo.setOrigen("ORIGEN: " + ORIGEN);
		eliminarVuelo.setDestino("DESTINO: " + DESTINO);
		eliminarVuelo.setHora("HORA: " + HORA);
		eliminarVuelo.setFecha("FECHA: " + FECHA);
		eliminarVuelo.setPrecio("PRECIO: " + PRECIO);				
				
		ivuelos.deleteById(peticion.getIdVuelo());
		
		return eliminarVuelo;			
	}
	
	@PayloadRoot(localPart="RealizarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public RealizarCompraResponse getRealizarCompra(@RequestPayload RealizarCompraRequest peticion ) {
		RealizarCompraResponse realizarCompra= new RealizarCompraResponse();
		realizarCompra.setMensaje("Datos de la compra realizada: \n");
		realizarCompra.setIdCompra("ID_COMPRA: " + peticion.getIdCompra());
		realizarCompra.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		realizarCompra.setNomCliente("NOMBRE CLIENTE: " + peticion.getNomCliente());
		realizarCompra.setMetodoPago("METODO PAGO: " + peticion.getMetodoPago());
		realizarCompra.setAsiento("ASIENTO: " + peticion.getAsiento());
		
		Compras compras = new Compras();
		
		compras.setIdCompra(peticion.getIdCompra());
		compras.setIdVueloF(peticion.getIdVuelo());
		compras.setNomCliente(peticion.getNomCliente());
		compras.setMetodoPago(peticion.getMetodoPago());
		compras.setAsiento(peticion.getAsiento());
				
		icompras.save(compras);
		
		return realizarCompra;		
	}
	
	@PayloadRoot(localPart="MostrarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public MostrarCompraResponse getMostrarCompra(@RequestPayload MostrarCompraRequest peticion ) {
		MostrarCompraResponse mostrarCompra= new MostrarCompraResponse();
		
		String id = icompras.mostrarDatosCompra(peticion.getIdCompra());
		
		String[] datosCompra= id.split(",");
		
		String idCompra = datosCompra[0];
		int IDCOMPRA = Integer.parseInt(idCompra);
		
		String idVuelo = datosCompra[1];
		int IDVUELO = Integer.parseInt(idVuelo);
						
		String NOMCLIENTE = datosCompra[2];
		String  METODOPAGO = datosCompra[3];
		String ASIENTO = datosCompra[4];		
					
		
		mostrarCompra.setMensaje("Datos de la compra seleccionada: \n");
		mostrarCompra.setIdCompra("ID_COMPRA: " + IDCOMPRA);
		mostrarCompra.setIdVuelo("ID_VUELO: " + IDVUELO);
		mostrarCompra.setNomCliente("NOMBRE CLIENTE: " + NOMCLIENTE);
		mostrarCompra.setMetodoPago("METODO PAGO: " + METODOPAGO);
		mostrarCompra.setAsiento("ASIENTO: " + ASIENTO);
		return mostrarCompra;		
	}
	
	@PayloadRoot(localPart="ModificarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public ModificarCompraResponse getModificarCompra(@RequestPayload ModificarCompraRequest peticion ) {
		ModificarCompraResponse modificarCompra= new ModificarCompraResponse();
		modificarCompra.setMensaje("Se modificaron los datos de la siguiente compra: \n");
		modificarCompra.setIdCompra("ID_COMPRA: " + peticion.getIdCompra());
		modificarCompra.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		modificarCompra.setNomCliente("NOMBRE CLIENTE: " + peticion.getNomCliente());
		modificarCompra.setMetodoPago("METODO PAGO: " + peticion.getMetodoPago());
		modificarCompra.setAsiento("ASIENTO: " + peticion.getAsiento());
		
		Compras compras = new Compras();
		
		compras.setIdCompra(peticion.getIdCompra());
		compras.setIdVueloF(peticion.getIdVuelo());		
		compras.setNomCliente(peticion.getNomCliente());
		compras.setMetodoPago(peticion.getMetodoPago());
		compras.setAsiento(peticion.getAsiento());
		
		icompras.save(compras);
		
		return modificarCompra;		
	}
	
	@PayloadRoot(localPart="CancelarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public CancelarCompraResponse getCancelarCompra(@RequestPayload CancelarCompraRequest peticion ) {
		CancelarCompraResponse cancelarCompra= new CancelarCompraResponse();
		
		String id = icompras.mostrarDatosCompra(peticion.getIdCompra());
		
		String[] datosCompra= id.split(",");
		
		String idCompra = datosCompra[0];
		int IDCOMPRA = Integer.parseInt(idCompra);
		
		String idVuelo = datosCompra[1];
		int IDVUELO = Integer.parseInt(idVuelo);
						
		String NOMCLIENTE = datosCompra[2];
		String  METODOPAGO = datosCompra[3];
		String ASIENTO = datosCompra[4];
		
		cancelarCompra.setMensaje("Datos de la compra cancelada: \n");
		cancelarCompra.setIdCompra("ID_COMPRA: " + IDCOMPRA);
		cancelarCompra.setIdVuelo("ID_VUELO: " + IDVUELO);
		cancelarCompra.setNomCliente("NOMBRE CLIENTE: " + NOMCLIENTE);
		cancelarCompra.setMetodoPago("METODO PAGO: " + METODOPAGO);
		cancelarCompra.setAsiento("ASIENTO: " + ASIENTO);
		
		icompras.deleteById(peticion.getIdCompra());
		
		return cancelarCompra;		
	}	
}