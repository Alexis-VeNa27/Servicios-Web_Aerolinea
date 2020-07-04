<?php
    $id_vuelo = $_GET['idVuelo'];    
    $client = new SoapClient("http://3.86.69.101:8080/ws/Aerolinea.wsdl");

    if ($id_vuelo === ''){
        $incompleto = "Ingresa el Id Vuelo !!!";
        echo $incompleto;
    } else {
        $parametros = array("idVuelo" => $id_vuelo);
        $response = $client->__soapCall('EliminarVuelo', array($parametros));      
        $mensaje = $response->{'mensaje'};
        echo $mensaje;
    }
    
    //Eliminar vuelo con rest...
    /*$url = "http://3.86.69.101:8080/rest/vuelos/$id_vuelo";
    $json = file_get_contents($url, false, stream_context_create(array('http' => array('method' => 'DELETE'))));*/            
?>