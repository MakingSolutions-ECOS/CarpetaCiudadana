
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tramiteActividadDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tramiteActividadDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTramite" type="{http://services.ecos.edu.uniandes.co/}tramiteDto" minOccurs="0"/>
 *         &lt;element name="codigoTramiteActividad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripcionTramiteActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaTramiteActividad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tramiteActividadDto", propOrder = {
    "codigoTramite",
    "codigoTramiteActividad",
    "descripcionTramiteActividad",
    "fechaTramiteActividad"
})
public class TramiteActividadDto {

    protected TramiteDto codigoTramite;
    protected Integer codigoTramiteActividad;
    protected String descripcionTramiteActividad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTramiteActividad;

    /**
     * Obtiene el valor de la propiedad codigoTramite.
     * 
     * @return
     *     possible object is
     *     {@link TramiteDto }
     *     
     */
    public TramiteDto getCodigoTramite() {
        return codigoTramite;
    }

    /**
     * Define el valor de la propiedad codigoTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteDto }
     *     
     */
    public void setCodigoTramite(TramiteDto value) {
        this.codigoTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteActividad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramiteActividad() {
        return codigoTramiteActividad;
    }

    /**
     * Define el valor de la propiedad codigoTramiteActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramiteActividad(Integer value) {
        this.codigoTramiteActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTramiteActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTramiteActividad() {
        return descripcionTramiteActividad;
    }

    /**
     * Define el valor de la propiedad descripcionTramiteActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTramiteActividad(String value) {
        this.descripcionTramiteActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTramiteActividad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTramiteActividad() {
        return fechaTramiteActividad;
    }

    /**
     * Define el valor de la propiedad fechaTramiteActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTramiteActividad(XMLGregorianCalendar value) {
        this.fechaTramiteActividad = value;
    }

}
