<?php        
    $client = new SoapClient("http://3.86.69.101:8080/ws/Aerolinea.wsdl");    

    $response = $client->__soapCall('BuscarVuelos', array());    

    $respuesta = $response->{'vuelos'};    

    print "<table>";    
        print         
            "<tr>" .                  
                "<td colspan=6>". "Vuelos De La Aerolínea TC" ."</td>".                    
            "</tr>";
        print   "<td>". "ID DEL VUELO" ."</td>";
        print   "<td>". "ORIGEN" ."</td>";
        print   "<td>". "DESTINO" ."</td>";
        print   "<td>". "HORA" ."</td>";
        print   "<td>". "FECHA" ."</td>";
        print   "<td>". "PRECIO" ."</td>";               

        foreach ($respuesta as $key => $value) {                        
            print                         
                "<tr>" .                               
                    "<td>". $value->{'idVuelo'} ."</td>".
                    "<td>". $value->{'origen'} ."</td>".
                    "<td>". $value->{'destino'} ."</td>".
                    "<td>". $value->{'hora'} ."</td>".
                    "<td>". $value->{'fecha'} ."</td>".
                    "<td>". $value->{'precio'} ."</td>".                    
                "</tr>";
        }
    print "</table>";    
?>