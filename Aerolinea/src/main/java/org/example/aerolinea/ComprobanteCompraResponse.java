//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.25 a las 07:10:32 PM CST 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respuesta6" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "respuesta6"
})
@XmlRootElement(name = "ComprobanteCompraResponse")
public class ComprobanteCompraResponse {

    @XmlElement(required = true)
    protected Object respuesta6;

    /**
     * Obtiene el valor de la propiedad respuesta6.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRespuesta6() {
        return respuesta6;
    }

    /**
     * Define el valor de la propiedad respuesta6.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRespuesta6(Object value) {
        this.respuesta6 = value;
    }

}
