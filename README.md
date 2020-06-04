# **Aerolínea** ✈
Este proyecto esta siendo desarrollado en la Experiencia Educativa "Tecnologías Para La Integración De Soluciones" con el objetivo de aprender a utilizar los Servicios Web.

------



**TABLA DE CONTENIDO** 📋

> - [Link Del Servidor](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#link-del-servidor-)
> - [Versión 1](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#versi%C3%B3n-1)
>   - [Mensajes Básicos Del Sistema](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#mensajes-b%C3%A1sicos-del-sistema-)
> - [Versión 2](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#versi%C3%B3n-2)
>   - [Funcionalidades](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#funcionalidades-)
>   - [Modelo De Datos](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#modelo-de-datos-) 
> - [Versión 3](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#versi%C3%B3n-3) 
>   - [Request & Response](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#request--response-)
>   - [Ejemplo De Peticiones Y Respuestas ](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#ejemplo-de-peticiones-y-respuestas-) 
> - [Documentación](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#documentaci%C3%B3n) 
>   - [Diagrama De Casos De Uso](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-casos-de-uso-) 
>   - [Diagrama De Actividad](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-actividad-) 
>   - [Diagrama De Componentes](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-componentes-) 
>   - [Diagrama De Clases](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-clases-) 
>   - [Diagrama De Secuencia](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-secuencia-) 
>



## *Link del servidor* 🗄

[Dale Click !!!](http://3.86.69.101:8080/ws/Aerolinea.wsdl)

------



### `Versión 1`

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



### `Versión 2`

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

## *Modelo de datos* 🗂

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



### `Versión 3`

## Request & Response 📥📤

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
|  `mensaje`   |         **Se agrego el siguiente vuelo:**          |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

------

- Mostrar Vuelo

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idVuelo`   | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   |         **Datos del vuelo seleccionado:**          |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

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
|  `mensaje`   | **Se modificaron los datos del siguiente vuelo:**  |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

------

- Eliminar Vuelo

**Datos que recibe**

| **VARIABLE** | **DESCRIPCION** |
| :----------: | :-------------: |
|              |                 |

**Datos que devuelve**

| **VARIABLE** |                  **DESCRIPCION**                   |
| :----------: | :------------------------------------------------: |
|  `mensaje`   |           **Datos del vuelo eliminado:**           |
|  `idVuelo`   |               *int* -> Numero Entero               |
|   `origen`   |            *string* -> Ciudad De Origen            |
|  `destino`   |           *string* -> Ciudad De Destino            |
|    `hora`    |    *string* -> Hora Del Vuelo (Formato: 24 hrs)    |
|   `fecha`    | *string* -> Fecha Del Vuelo (Formato: Dia/Mes/Año) |
|   `precio`   |               *int* -> Numero Entero               |

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

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `mensaje`   |          **Datos de la compra realizada:**           |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

------

- Mostrar Compra

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idCompra`  | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `mensaje`   |         **Datos de la compra seleccionada:**         |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

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

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `mensaje`   | **Se modificaron los datos de la siguiente compra:** |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

------

- Cancelar Compra

**Datos que recibe**

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idCompra`  | *int* -> Numero Entero |

**Datos que devuelve**

| **VARIABLE** |                   **DESCRIPCION**                    |
| :----------: | :--------------------------------------------------: |
|  `mensaje`   |          **Datos de la compra cancelada:**           |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

------

## Ejemplo de peticiones y respuestas 💬📝

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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se agrego el siguiente vuelo: 
</ns2:mensaje>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Mexico</ns2:origen>
            <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: Japon</ns2:destino>
            <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 16:00</ns2:hora>
            <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 10/09/2021</ns2:fecha>
            <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 750</ns2:precio>
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
</ns2:mensaje>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Mexico</ns2:origen>
            <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: Japon</ns2:destino>
            <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 16:00</ns2:hora>
            <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 10/09/2021</ns2:fecha>
            <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 750</ns2:precio>
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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se modificaron los datos del siguiente vuelo: 
</ns2:mensaje>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Mexico</ns2:origen>
            <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: China</ns2:destino>
            <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 20:00</ns2:hora>
            <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 15/11/2021</ns2:fecha>
            <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 750</ns2:precio>
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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Datos del vuelo eliminado: 
</ns2:mensaje>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Mexico</ns2:origen>
            <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: China</ns2:destino>
            <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 20:00</ns2:hora>
            <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 15/11/2021</ns2:fecha>
            <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 750</ns2:precio>
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
                <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 1</ns2:idVuelo>
                <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Puebla</ns2:origen>
                <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: Guadalajara</ns2:destino>
                <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 12:00</ns2:hora>
                <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 2020-09-19</ns2:fecha>
                <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 2000</ns2:precio>
            </ns2:vuelos>
            <ns2:vuelos>
                <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 2</ns2:idVuelo>
                <ns2:origen xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ORIGEN: Tokio</ns2:origen>
                <ns2:destino xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">DESTINO: Mexico</ns2:destino>
                <ns2:hora xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">HORA: 19:00</ns2:hora>
                <ns2:fecha xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">FECHA: 12/10/2020</ns2:fecha>
                <ns2:precio xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">PRECIO: 9000</ns2:precio>
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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Datos de la compra realizada: 
</ns2:mensaje>
            <ns2:idCompra xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_COMPRA: 35</ns2:idCompra>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:nomCliente xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">NOMBRE CLIENTE: Heisenberg</ns2:nomCliente>
            <ns2:metodoPago xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">METODO PAGO: Efectivo</ns2:metodoPago>
            <ns2:asiento xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ASIENTO: A-15</ns2:asiento>
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
</ns2:mensaje>
            <ns2:idCompra xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_COMPRA: 35</ns2:idCompra>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:nomCliente xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">NOMBRE CLIENTE: Heisenberg</ns2:nomCliente>
            <ns2:metodoPago xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">METODO PAGO: Efectivo</ns2:metodoPago>
            <ns2:asiento xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ASIENTO: A-15</ns2:asiento>
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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Se modificaron los datos de la siguiente compra: 
</ns2:mensaje>
            <ns2:idCompra xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_COMPRA: 35</ns2:idCompra>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:nomCliente xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">NOMBRE CLIENTE: Heisenberg</ns2:nomCliente>
            <ns2:metodoPago xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">METODO PAGO: Tarjeta</ns2:metodoPago>
            <ns2:asiento xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ASIENTO: B-15</ns2:asiento>
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
            <ns2:mensaje xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">Datos de la compra cancelada: 
</ns2:mensaje>
            <ns2:idCompra xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_COMPRA: 35</ns2:idCompra>
            <ns2:idVuelo xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ID_VUELO: 80</ns2:idVuelo>
            <ns2:nomCliente xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">NOMBRE CLIENTE: Heisenber</ns2:nomCliente>
            <ns2:metodoPago xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">METODO PAGO: Tarjeta</ns2:metodoPago>
            <ns2:asiento xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ASIENTO: B-15</ns2:asiento>
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



### `Documentación`

## **Diagrama de casos de uso** 👥



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/CasosDeUso.png?raw=true)



------

## **Diagrama de actividad** 📌



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeActividad.png?raw=true)



------

## **Diagrama de componentes** 🗃



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeComponentes.png?raw=true)



------

## **Diagrama de clases** 📂



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeClases.png?raw=true)



------

## **Diagrama de secuencia** 📈



![](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/Diagramas_Aerolinea/DiagramaDeSecuencia.png?raw=true)



------

