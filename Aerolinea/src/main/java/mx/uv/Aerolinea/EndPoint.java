package mx.uv.Aerolinea;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import org.example.aerolinea.AgregarVueloRequest;
import org.example.aerolinea.AgregarVueloResponse;
import org.example.aerolinea.ComprarBoletoRequest;
import org.example.aerolinea.ComprarBoletoResponse;
import org.example.aerolinea.ComprobanteCompraRequest;
import org.example.aerolinea.ComprobanteCompraResponse;
import org.example.aerolinea.EliminarVueloRequest;
import org.example.aerolinea.EliminarVueloResponse;
import org.example.aerolinea.ModificarVueloRequest;
import org.example.aerolinea.ModificarVueloResponse;
import org.example.aerolinea.MostrarVueloRequest;
import org.example.aerolinea.MostrarVueloResponse;

@Endpoint
public class EndPoint {
	
	@PayloadRoot(localPart="AgregarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public AgregarVueloResponse getAgregarVuelo(@RequestPayload AgregarVueloRequest peticion ) {
		AgregarVueloResponse respuesta1= new AgregarVueloResponse();
		respuesta1.setRespuesta1("Se agrego el siguiente vuelo: "+peticion.getAgregar());
		return respuesta1;
	}
	
	@PayloadRoot(localPart="MostrarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public MostrarVueloResponse getMostrarVuelo(@RequestPayload MostrarVueloRequest peticion ) {
		MostrarVueloResponse respuesta2= new MostrarVueloResponse();
		respuesta2.setRespuesta2("A continuacion se muestra el siguiente vuelo: "+peticion.getMostrar());
		return respuesta2;
	}
	
	@PayloadRoot(localPart="ModificarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ModificarVueloResponse getModificarVuelo(@RequestPayload ModificarVueloRequest peticion ) {
		ModificarVueloResponse respuesta3= new ModificarVueloResponse();
		respuesta3.setRespuesta3("Se modifico el siguiente vuelo: "+peticion.getModificar());
		return respuesta3;
	}
	
	@PayloadRoot(localPart="EliminarVueloRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public EliminarVueloResponse getEliminarVuelo(@RequestPayload EliminarVueloRequest peticion ) {
		EliminarVueloResponse respuesta4= new EliminarVueloResponse();
		respuesta4.setRespuesta4("Se elimino el siguiente vuelo: "+peticion.getEliminar());
		return respuesta4;
	}
	
	@PayloadRoot(localPart="ComprarBoletoRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ComprarBoletoResponse getComprarBoleto(@RequestPayload ComprarBoletoRequest peticion ) {
		ComprarBoletoResponse respuesta5= new ComprarBoletoResponse();
		respuesta5.setRespuesta5("Se elimino el siguiente vuelo: "+peticion.getComprar());
		return respuesta5;
	}
	
	@PayloadRoot(localPart="ComprobanteCompraRequest", namespace="http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ComprobanteCompraResponse getComprobanteCompra(@RequestPayload ComprobanteCompraRequest peticion ) {
		ComprobanteCompraResponse respuesta6= new ComprobanteCompraResponse();
		respuesta6.setRespuesta6("Se elimino el siguiente vuelo: "+peticion.getComprobante());
		return respuesta6;
	}
	
}
