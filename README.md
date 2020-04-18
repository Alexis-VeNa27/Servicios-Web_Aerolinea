# **Aerolínea** ✈
Este proyecto esta siendo desarrollado en la Experiencia Educativa "Tecnologías Para La Integración De Soluciones" con el objetivo de aprender a utilizar los Servicios Web.

------



**TABLA DE CONTENIDO** 📋

- [Link Del Servidor](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#link-del-servidor-)
- [Versión 1](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#versi%C3%B3n-1)
  - [Mensajes Básicos Del Sistema](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#mensajes-b%C3%A1sicos-del-sistema-)
- [Versión 2](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#versi%C3%B3n-2)
  - [Funcionalidades](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#funcionalidades-)
  - [Diagrama De Clases](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#diagrama-de-clases-)
- [Versión 3]()
  - [Request & Response](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#request--response-)
  - [Ejemplo de peticiones](https://github.com/Alexis-VeNa27/Servicios-Web_Aerolinea/blob/master/README.md#request--response-)



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

------

## *Diagrama de clases* 🗂

- **Vuelo**

| **ATRIBUTO** | **TIPO DE DATO** |
| :----------: | :--------------: |
|   idVuelo    |      `int`       |
|    origen    |     `string`     |
|   destino    |     `string`     |
|     hora     |     `string`     |
|    fecha     |     `string`     |
|    precio    |      `int`       |



- **Compra**

| **ATRIBUTO** | **TIPO DE DATO** |
| :--------:   | :---------------: |
|   IdCompra   |      `int`        |
|   idVueloF   |      `int`        |
|  nomCliente  |     `string`      |
|  metodoPago  |     `string`      |
|   asiento    |     `string`      |

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

| **VARIABLE** |    **DESCRIPCION**     |
| :----------: | :--------------------: |
|  `idVuelo`   | *int* -> Numero Entero |

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
|  `mensaje`   |         **Datos de la compra cancelada:**         |
|  `idCompra`  |                *int* -> Numero Entero                |
|  `idVuelo`   |                *int* -> Numero Entero                |
| `nomCliente` |            *string* -> Nombre Del Cliente            |
| `metodoPago` |    *string* -> Forma De Pago (Efectivo o Tarjeta)    |
|  `asiento`   | *string* -> Lugar De Asiento (Formato: Letra-Numero) |

------

## Ejemplo de peticiones 💬📝

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

```xml-dtd
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

------

`Modificar Compra`

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <ModificarCompraRequest xmlns="http://www.example.org/Aerolinea">
            <idCompra>35</idCompra>
            <idVuelo>80</idVuelo>
            <nomCliente>Heisenber</nomCliente>
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
            <ns2:nomCliente xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">NOMBRE CLIENTE: Heisenber</ns2:nomCliente>
            <ns2:metodoPago xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">METODO PAGO: Tarjeta</ns2:metodoPago>
            <ns2:asiento xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">ASIENTO: B-15</ns2:asiento>
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

------
