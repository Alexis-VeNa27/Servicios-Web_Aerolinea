<?php
    $id_vuelo = $_GET['idVuelo'];
        
    $url = "http://3.86.69.101:8080/rest/vuelos/$id_vuelo";    
    $json = file_get_contents($url);
    $datos = json_decode($json, true);

    if ($id_vuelo === '') {
        $incompleto = "Ingresa el Id Vuelo !!!";
        echo $incompleto;
    } else if ($datos === NULL) {
        $null = "El Vuelo Con El ID: ". $id_vuelo ." No Existe !";        
        echo $null;        
    } else {    
        echo("Id vuelo: ".$datos['idVuelo']." | ");        
        echo("Origen: ".$datos['origen']." | ");
        echo("Destino: ".$datos['destino']." | ");
        echo("Hora: ".$datos['hora']." | ");
        echo("Fecha: ".$datos['fecha']." | ");
        echo("Precio: ".$datos['precio']." | ");
    }        
?>