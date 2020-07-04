# **Aerolínea TC** ✈
Este proyecto esta siendo desarrollado en la Experiencia Educativa "Tecnologías Para La Integración De Soluciones" con el objetivo de aprender a utilizar los Servicios Web.

------



**TABLA DE CONTENIDO** 📋

> - [Link Del Servidor](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#link-del-servidor-)
> - [Link De La Página Web](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#link-de-la-página-web-)
> - [Mensajes Básicos Del Sistema](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#mensajes-básicos-del-sistema-)
> - [Funcionalidades](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#funcionalidades-)
> - [Modelo De Datos](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#modelo-de-datos-) 
> - [Soap](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#soap-)
>   - [Request & Response](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#request--response-)
>   - [Ejemplo De Peticiones Y Respuestas ](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#ejemplo-de-peticiones-y-respuestas-) 
> - [Rest](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#rest-️)
>   - [URLs](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#urls-)
> - [Consumo](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#consumo-)
>   - [Herramientas Utilizadas](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#herramientas-utilizadas-️)
>   - [Pantallas Finales](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#pantallas-finales-️)
> - [Documentación]([https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#documentaci%C3%B3n-%EF%B8%8F](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#documentación-️)) 
>   - [Diagrama De Casos De Uso](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-casos-de-uso-) 
>   - [Diagrama De Actividad](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#diagrama-de-actividad-) 
>   - [Diagrama De Componentes](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#diagrama-de-componentes-) 
>   - [Diagrama De Clases](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#diagrama-de-clases-) 
>   - [Diagrama De Secuencia](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea#diagrama-de-secuencia-) 
>



## *Link del servidor* 🗄

[Dale Click !!!](http://3.86.69.101:8080/ws/Aerolinea.wsdl)

------



## *Link de la página web* 📱💻

[Dale Click !!!](http://3.86.69.101/AerolineaTC/Inicio.html)

------



## *Mensajes básicos del sistema* 📩

> Agregar Vuelo

- Con esto podríamos agregar diferentes vuelos a la aerolínea.

> Mostrar Vuelo

- Con esto mostraríamos todos los datos del vuelo.

> Modificar Vuelo

- Con esto podríamos modificar los datos del vuelo.

> Eliminar Vuelo

- Con esto eliminaríamos el vuelo por completo.

> Comprar Boleto

- Con esto compraríamos un boleto de la aerolínea.

> Comprobante de Compra

- Con esto obtendríamos un comprobante de compra de algún vuelo de la aerolínea.

------



## *Funcionalidades* ✅❎

- [x] Agregar Vuelo
- [x] Mostrar Vuelo
- [x] Modificar Vuelo
- [x] Eliminar Vuelo
- [x] Realizar Compra
- [x] Mostrar Compra
- [x] Modificar Compra
- [x] Cancelar Compra
- [x] Buscar Vuelos

------



## *Modelo de datos* 📁

- **Vuelo**

| **ATRIBUTO** |    **TIPO DE DATO**    |
| :----------: | :--------------------: |
|   id_vuelo   | `int (11) PRIMARY KEY` |
|    origen    |    `varchar (255)`     |
|   destino    |    `varchar (255)`     |
|     hora     |    `varchar (255)`     |
|    fecha     |    `varchar (255)`     |
|    precio    |       `int (11)`       |



- **Compra**

| **ATRIBUTO** | **TIPO DE DATO** |
| :--------:   | :---------------: |
|   Id_compra   |      `int (11) PRIMARY KEY`      |
|   id_vuelof   | `int (11) FOREIGN KEY` |
|  nom_cliente  | `varchar (255)` |
|  metodo_pago  | `varchar (255)` |
|   asiento    | `varchar (255)` |

------



## *Soap* 📬 



> ## **Request & Response** 📥📤
>

`Vuelo`

- Agregar Vuelo

**Datos que recibe**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Mostrar Vuelo

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idVuelo`   | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Modificar Vuelo 

**Datos que recibe**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Eliminar Vuelo

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idVuelo`   | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Buscar Vuelos

**Datos que recibe**

| **VARIABLE** | **DESCRIPCION** |
| :----------: | :-------------: |
|              |                 |

**Datos que devuelve**

`¡ Lista de Vuelos de La Aerolínea !`

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

------



`Compra`



- Realizar Compra

**Datos que recibe**

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Mostrar Compra

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idCompra`  | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Modificar Compra

**Datos que recibe**

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   | **Contiene información respecto a lo que sucedió** |

------



- Cancelar Compra

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idCompra`  | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |          **DESCRIPCION**          |
| :----------: | :-------------------------------: |
|  `mensaje`   | **Datos de la compra cancelada:** |

------



> ## **Ejemplo de peticiones y respuestas** 💬📝

> ***VUELO***

`Agregar Vuelo`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <AgregarVueloRequest xmlns="http://www.example.org/Aerolinea">
            <idVuelo>80</idVuelo>
            <origen>Mexico</origen>
            <destino>Japon</destino>
            <hora>16:00</hora>
            <fecha>10/09/2021</fecha>
            <precio>750</precio>
        </AgregarVueloRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:AgregarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se agrego el vuelo con el ID: 80</ns2:mensaje>
        </ns2:AgregarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que ya exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:AgregarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo: 80 Ya Existe !</ns2:mensaje>
        </ns2:AgregarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Mostrar Vuelo`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <MostrarVueloRequest xmlns="http://www.example.org/Aerolinea">
            <idVuelo>80</idVuelo>
        </MostrarVueloRequest>
    </Body>
</Envelope>
```

```XML
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:MostrarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Datos del vuelo seleccionado: 
Id vuelo: 80
Origen: Mexico
Destino: Japon
Hora: 16:00
Fecha: 10/09/2021
Precio: 750
</ns2:mensaje>
        </ns2:MostrarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:MostrarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo: 800 No Existe !</ns2:mensaje>
        </ns2:MostrarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Modificar Vuelo`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ModificarVueloRequest xmlns="http://www.example.org/Aerolinea">
            <idVuelo>80</idVuelo>
            <origen>Mexico</origen>
            <destino>China</destino>
            <hora>20:00</hora>
            <fecha>15/11/2021</fecha>
            <precio>750</precio>
        </ModificarVueloRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ModificarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se modificaron los datos del vuelo con el ID: 80</ns2:mensaje>
        </ns2:ModificarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ModificarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo: 8000 No Existe !</ns2:mensaje>
        </ns2:ModificarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Eliminar Vuelo`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <EliminarVueloRequest xmlns="http://www.example.org/Aerolinea">
            <idVuelo>80</idVuelo>
        </EliminarVueloRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:EliminarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se elimino exitosamente el vuelo con el ID: 80</ns2:mensaje>
        </ns2:EliminarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:EliminarVueloResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo: 800 No Existe !</ns2:mensaje>
        </ns2:EliminarVueloResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Buscar Vuelos`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <BuscarVuelosRequest xmlns="http://www.example.org/Aerolinea"/>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:BuscarVuelosResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:vuelos>
                <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">10</ns2:idVuelo>
                <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Tokio</ns2:origen>
                <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Uruguay</ns2:destino>
                <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">16:00</ns2:hora>
                <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">10/09/2021</ns2:fecha>
                <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">750</ns2:precio>
            </ns2:vuelos>
            <ns2:vuelos>
                <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">25</ns2:idVuelo>
                <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">China</ns2:origen>
                <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Peru</ns2:destino>
                <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">16:00</ns2:hora>
                <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">10/09/2021</ns2:fecha>
                <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">750</ns2:precio>
            </ns2:vuelos>
            <ns2:vuelos>
                <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">80</ns2:idVuelo>
                <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Mexico</ns2:origen>
                <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Japon</ns2:destino>
                <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">16:00</ns2:hora>
                <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">10/09/2021</ns2:fecha>
                <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:int">750</ns2:precio>
            </ns2:vuelos>
        </ns2:BuscarVuelosResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



> ***COMPRA***

`Realizar Compra`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <RealizarCompraRequest xmlns="http://www.example.org/Aerolinea">
            <idCompra>35</idCompra>
            <idVuelo>80</idVuelo>
            <nomCliente>Heisenberg</nomCliente>
            <metodoPago>Efectivo</metodoPago>
            <asiento>A-15</asiento>
        </RealizarCompraRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:RealizarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se realizó la compra con el ID: 35</ns2:mensaje>
        </ns2:RealizarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdCompra` de una compra que ya exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:RealizarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">La Compra 35 Ya Existe !</ns2:mensaje>
        </ns2:RealizarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:RealizarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo 800 No Existe !</ns2:mensaje>
        </ns2:RealizarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Mostrar Compra`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <MostrarCompraRequest xmlns="http://www.example.org/Aerolinea">
            <idCompra>35</idCompra>
        </MostrarCompraRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:MostrarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Datos de la compra seleccionada: 
Id compra: 35
Id vuelo: 80
Nombre cliente: Heisenberg
Método pago: Efectivo
Asiento: A-15
</ns2:mensaje>
        </ns2:MostrarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdCompra` de una compra que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:MostrarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">La Compra 355 No Existe !</ns2:mensaje>
        </ns2:MostrarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Modificar Compra`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ModificarCompraRequest xmlns="http://www.example.org/Aerolinea">
            <idCompra>35</idCompra>
            <idVuelo>80</idVuelo>
            <nomCliente>Heisenberg</nomCliente>
            <metodoPago>Tarjeta</metodoPago>
            <asiento>B-15</asiento>
        </ModificarCompraRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ModificarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se modificaron los datos de la compra con el ID: 35</ns2:mensaje>
        </ns2:ModificarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdCompra` de una compra que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ModificarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">La Compra 355 No Existe !</ns2:mensaje>
        </ns2:ModificarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdVuelo` de un vuelo que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ModificarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">El Vuelo 800 No Existe !</ns2:mensaje>
        </ns2:ModificarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



`Cancelar Compra`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <CancelarCompraRequest xmlns="http://www.example.org/Aerolinea">
            <idCompra>35</idCompra>
        </CancelarCompraRequest>
    </Body>
</Envelope>
```

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:CancelarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se cancelo exitosamente la compra con el ID: 35</ns2:mensaje>
        </ns2:CancelarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```



👀 **En caso de que ingresen el `IdCompra` de una compra que no exista en la Aerolínea...** 👀

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:CancelarCompraResponse xmlns:ns2="http://www.example.org/Aerolinea">
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">La Compra 355 No Existe !</ns2:mensaje>
        </ns2:CancelarCompraResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

------



## *Rest* ⛓️



> ## **URLs** 🔗

> ***VUELO***

`Agregar Vuelo` ➡️ *Agrega un vuelo a la Aerolínea TC*

- `POST`	***/rest/vuelos/***



`Mostrar Vuelo` ➡️ *Muestra un vuelo de la Aerolínea TC*

- `GET`	***/rest/vuelos/{idVuelo}***



`Modificar Vuelo` ➡️ *Modifica un vuelo de la Aerolínea TC*

- `PUT`	***/rest/vuelos/***



`Eliminar Vuelo` ➡️ *Elimina un vuelo de la Aerolínea TC*

- `DELETE`	***/rest/vuelos/{idVuelo}***



`Buscar Vuelos` ➡️ *Devuelve una lista de los vuelos que pertenecen a la Aerolínea TC*

- `GET` ***/rest/vuelos/***



------



> ***COMPRA***

`Realizar Compra` ➡️ *Realiza una compra a la Aerolínea TC*

- `POST`	***/rest/compras/***



`Mostrar Compra` ➡️ *Muestra una compra que se realizo a la Aerolínea TC*

- `GET`	***/rest/compras/{idCompra}***



`Modificar Compra` ➡️ *Modifica una compra que se realizo a la Aerolínea TC*

- `PUT`	***/rest/compras/***



`Cancelar Compra` ➡️ *Cancela una compra que se realizo a la Aerolínea TC*

- `DELETE`	***/rest/Compras/{idCompra}***



## *Consumo* 👩🏻‍💻👨🏻‍💻



Este es el consumo final de **SOAP** y **REST** de la **Aerolínea TC**, fue codificado en el editor **Visual Studio Code** y probado en el navegador **Microsoft Edge**.  



> ## **Herramientas Utilizadas** ⚙️

*El proyecto fue implementado con la ayuda de las siguientes herramientas:*

- `HTML`	
- `PHP`
- `CSS`
- `JAVASCRIPT`
- `AJAX`
- `BOOTSTRAP`
- `JQUERY`
- `SWEETALERT2`
- `APACHE`



> ## **Pantallas Finales** 🛫🗺️

*A continuación se muestran algunas capturas de pantalla del consumo de la Aerolínea TC*



`Pagina De Inicio:`

![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/AerolineaTcInicio.png?raw=true)



`Servicios:`

![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/AerolineaTcServicio.png?raw=true)



`Vuelos:`

![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/AerolineaTcVuelo.png?raw=true)



`Compras:`

![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/AerolineaTcCompra.png?raw=true)



## *Documentación* 🗂️



> ## **Diagrama de casos de uso** 👥
>



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/CasosDeUso.png?raw=true)



------

> ## **Diagrama de actividad** 📌
>



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeActividad.png?raw=true)



------

> ## **Diagrama de componentes** 🗃
>



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeComponentes.png?raw=true)



------

> ## **Diagrama de clases** 📂
>



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeClases.png?raw=true)



------

> ## **Diagrama de secuencia** 📈
>



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeSecuencia.png?raw=true)



------

