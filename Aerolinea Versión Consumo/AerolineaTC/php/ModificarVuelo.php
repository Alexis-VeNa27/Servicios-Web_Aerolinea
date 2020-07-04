<?php
    
    $client = new SoapClient("http://3.86.69.101:8080/ws/Aerolinea.wsdl");

    $id_vuelo = $_GET['idVuelo'];
    $origen = $_GET['origen'];
    $destino = $_GET['destino'];
    $hora = $_GET['hora'];
    $fecha = $_GET['fecha'];
    $precio = $_GET['precio'];    

    if ($id_vuelo === '' || $origen === '' || $destino === '' || $hora === '' || $fecha === '' || $precio === ''){
        $incompleto = "Completa Todos Los Campos !!!";
        echo $incompleto;
    } else {
        $parametros = array("idVuelo" => $id_vuelo, "origen" => $origen, "destino" => $destino, "hora" => $hora, "fecha" => $fecha, "precio" => $precio);
        $response = $client->__soapCall('ModificarVuelo', array($parametros));      
        $mensaje = $response->{'mensaje'};
        echo $mensaje;
    }
?>