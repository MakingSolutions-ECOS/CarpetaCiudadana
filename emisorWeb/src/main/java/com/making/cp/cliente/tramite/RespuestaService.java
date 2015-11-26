
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuestaService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sePresentoError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaService", propOrder = {
    "errorMensaje",
    "errorOriginal",
    "respuestaService",
    "sePresentoError"
})
@XmlSeeAlso({
    RespuestaTramite.class,
    RespuestaTramiteDefinicion.class
})
public class RespuestaService {

    protected String errorMensaje;
    protected String errorOriginal;
    protected String respuestaService;
    protected Boolean sePresentoError;

    /**
     * Obtiene el valor de la propiedad errorMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMensaje() {
        return errorMensaje;
    }

    /**
     * Define el valor de la propiedad errorMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMensaje(String value) {
        this.errorMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad errorOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorOriginal() {
        return errorOriginal;
    }

    /**
     * Define el valor de la propiedad errorOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorOriginal(String value) {
        this.errorOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaService() {
        return respuestaService;
    }

    /**
     * Define el valor de la propiedad respuestaService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaService(String value) {
        this.respuestaService = value;
    }

    /**
     * Obtiene el valor de la propiedad sePresentoError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSePresentoError() {
        return sePresentoError;
    }

    /**
     * Define el valor de la propiedad sePresentoError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSePresentoError(Boolean value) {
        this.sePresentoError = value;
    }

}
