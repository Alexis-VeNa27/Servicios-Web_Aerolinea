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
 *         &lt;element name="respuesta3" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "respuesta3"
})
@XmlRootElement(name = "ModificarVueloResponse")
public class ModificarVueloResponse {

    @XmlElement(required = true)
    protected Object respuesta3;

    /**
     * Obtiene el valor de la propiedad respuesta3.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRespuesta3() {
        return respuesta3;
    }

    /**
     * Define el valor de la propiedad respuesta3.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRespuesta3(Object value) {
        this.respuesta3 = value;
    }

}
