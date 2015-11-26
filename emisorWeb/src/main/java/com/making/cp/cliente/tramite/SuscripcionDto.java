
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para suscripcionDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suscripcionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoOperador" type="{http://services.ecos.edu.uniandes.co/}operadorDto" minOccurs="0"/>
 *         &lt;element name="codigoSubscripcion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="detalleSubscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vigente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suscripcionDto", propOrder = {
    "codigoOperador",
    "codigoSubscripcion",
    "detalleSubscripcion",
    "fecha",
    "vigente"
})
public class SuscripcionDto {

    protected OperadorDto codigoOperador;
    protected Integer codigoSubscripcion;
    protected String detalleSubscripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected boolean vigente;

    /**
     * Obtiene el valor de la propiedad codigoOperador.
     * 
     * @return
     *     possible object is
     *     {@link OperadorDto }
     *     
     */
    public OperadorDto getCodigoOperador() {
        return codigoOperador;
    }

    /**
     * Define el valor de la propiedad codigoOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadorDto }
     *     
     */
    public void setCodigoOperador(OperadorDto value) {
        this.codigoOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSubscripcion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoSubscripcion() {
        return codigoSubscripcion;
    }

    /**
     * Define el valor de la propiedad codigoSubscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoSubscripcion(Integer value) {
        this.codigoSubscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleSubscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleSubscripcion() {
        return detalleSubscripcion;
    }

    /**
     * Define el valor de la propiedad detalleSubscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleSubscripcion(String value) {
        this.detalleSubscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     */
    public boolean isVigente() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     */
    public void setVigente(boolean value) {
        this.vigente = value;
    }

}
