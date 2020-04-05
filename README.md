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
|   idVuelo    |      `int`        |
|  nomCliente  |     `string`      |
|  metodoPago  |     `string`      |
|   asiento    |     `string`      |

------
