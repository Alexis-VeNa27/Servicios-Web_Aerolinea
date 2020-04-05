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
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class EndPoint {
	
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
		return agregarVuelo;		
	}
		
		
	@PayloadRoot(localPart="MostrarVueloRequest", namespace="http://www.example.org/Aerolinea")
		
	@ResponsePayload
	public MostrarVueloResponse getMostrarVuelo(@RequestPayload MostrarVueloRequest peticion ) {
		MostrarVueloResponse mostrarVuelo= new MostrarVueloResponse();
		mostrarVuelo.setMensaje("Datos del vuelo seleccionado: \n"); 
		mostrarVuelo.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		mostrarVuelo.setOrigen("ORIGEN: Mexico");
		mostrarVuelo.setDestino("DESTINO: China");
		mostrarVuelo.setHora("HORA: 16:00");
		mostrarVuelo.setFecha("FECHA: 12/12/2020");
		mostrarVuelo.setPrecio("PRECIO: 250");				
		return mostrarVuelo;			
	}
	
	@PayloadRoot(localPart="ModificarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ModificarVueloResponse getModificarVuelo(@RequestPayload ModificarVueloRequest peticion ) {
		ModificarVueloResponse modificarVuelo= new ModificarVueloResponse();
		modificarVuelo.setMensaje("Se modificaron los datos del siguiente vuelo: \n"); 
		modificarVuelo.setIdVuelo("ID_VUELO: 098765");
		modificarVuelo.setOrigen("ORIGEN: " + peticion.getOrigen());
		modificarVuelo.setDestino("DESTINO: " + peticion.getDestino());
		modificarVuelo.setHora("HORA: " + peticion.getHora());
		modificarVuelo.setFecha("FECHA: " + peticion.getFecha());
		modificarVuelo.setPrecio("PRECIO: " + peticion.getPrecio());	
		return modificarVuelo;			
	}
	
	@PayloadRoot(localPart="EliminarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public EliminarVueloResponse getEliminarVuelo(@RequestPayload EliminarVueloRequest peticion ) {
		EliminarVueloResponse eliminarVuelo= new EliminarVueloResponse();
		eliminarVuelo.setMensaje("Datos del vuelo eliminado: \n"); 
		eliminarVuelo.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		eliminarVuelo.setOrigen("ORIGEN: Mexico");
		eliminarVuelo.setDestino("DESTINO: China");
		eliminarVuelo.setHora("HORA: 16:00");
		eliminarVuelo.setFecha("FECHA: 12/12/2020");
		eliminarVuelo.setPrecio("PRECIO: 250");				
		return eliminarVuelo;			
	}
	
	@PayloadRoot(localPart="RealizarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public RealizarCompraResponse getRealizarCompra(@RequestPayload RealizarCompraRequest peticion ) {
		RealizarCompraResponse realizarCompra= new RealizarCompraResponse();
		realizarCompra.setMensaje("Datos de la compra realizada: \n");
		realizarCompra.setIdCompra("ID_COMPRA: 12345");
		realizarCompra.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		realizarCompra.setNomCliente("NOMBRE CLIENTE: " + peticion.getNomCliente());
		realizarCompra.setMetodoPago("METODO PAGO: " + peticion.getMetodoPago());
		realizarCompra.setAsiento("ASIENTO: 35-B");
		return realizarCompra;		
	}
	
	@PayloadRoot(localPart="MostrarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public MostrarCompraResponse getMostrarCompra(@RequestPayload MostrarCompraRequest peticion ) {
		MostrarCompraResponse mostrarCompra= new MostrarCompraResponse();
		mostrarCompra.setMensaje("Datos de la compra seleccionada: \n");
		mostrarCompra.setIdCompra("ID_COMPRA: " + peticion.getIdCompra());
		mostrarCompra.setIdVuelo("ID_VUELO: 098765");
		mostrarCompra.setNomCliente("NOMBRE CLIENTE: Heisenberg");
		mostrarCompra.setMetodoPago("METODO PAGO: Efectivo");
		mostrarCompra.setAsiento("ASIENTO: 35-B");
		return mostrarCompra;		
	}
	
	@PayloadRoot(localPart="ModificarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public ModificarCompraResponse getModificarCompra(@RequestPayload ModificarCompraRequest peticion ) {
		ModificarCompraResponse modificarCompra= new ModificarCompraResponse();
		modificarCompra.setMensaje("Se modificaron los datos de la siguiente compra: \n");
		modificarCompra.setIdCompra("ID_COMPRA: 12345");
		modificarCompra.setIdVuelo("ID_VUELO: " + peticion.getIdVuelo());
		modificarCompra.setNomCliente("NOMBRE CLIENTE: " + peticion.getNomCliente());
		modificarCompra.setMetodoPago("METODO PAGO: " + peticion.getMetodoPago());
		modificarCompra.setAsiento("ASIENTO: " + peticion.getAsiento());
		return modificarCompra;		
	}
	
	@PayloadRoot(localPart="CancelarCompraRequest", namespace="http://www.example.org/Aerolinea")		
	
	@ResponsePayload
	public CancelarCompraResponse getCancelarCompra(@RequestPayload CancelarCompraRequest peticion ) {
		CancelarCompraResponse cancelarCompra= new CancelarCompraResponse();
		cancelarCompra.setMensaje("Datos de la compra cancelada: \n");
		cancelarCompra.setIdCompra("ID_COMPRA: " + peticion.getIdCompra());
		cancelarCompra.setIdVuelo("ID_VUELO: 098765");
		cancelarCompra.setNomCliente("NOMBRE CLIENTE: Heisenberg");
		cancelarCompra.setMetodoPago("METODO PAGO: Efectivo");
		cancelarCompra.setAsiento("ASIENTO: 35-B");
		return cancelarCompra;		
	}	
}