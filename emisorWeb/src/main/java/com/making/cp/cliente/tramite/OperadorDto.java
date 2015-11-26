
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para operadorDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operadorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoList" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoOperador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaActivacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identificacionOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suscripcionList" type="{http://services.ecos.edu.uniandes.co/}suscripcionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operadorDto", propOrder = {
    "ciudadanoList",
    "codigoOperador",
    "fechaActivacion",
    "fechaActualizacion",
    "identificacionOperador",
    "nombreOperador",
    "suscripcionList"
})
public class OperadorDto {

    @XmlElement(nillable = true)
    protected List<CiudadanoDto> ciudadanoList;
    protected Integer codigoOperador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActivacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;
    protected String identificacionOperador;
    protected String nombreOperador;
    @XmlElement(nillable = true)
    protected List<SuscripcionDto> suscripcionList;

    /**
     * Gets the value of the ciudadanoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudadanoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudadanoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiudadanoDto }
     * 
     * 
     */
    public List<CiudadanoDto> getCiudadanoList() {
        if (ciudadanoList == null) {
            ciudadanoList = new ArrayList<CiudadanoDto>();
        }
        return this.ciudadanoList;
    }

    /**
     * Obtiene el valor de la propiedad codigoOperador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoOperador() {
        return codigoOperador;
    }

    /**
     * Define el valor de la propiedad codigoOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoOperador(Integer value) {
        this.codigoOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActivacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * Define el valor de la propiedad fechaActivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActivacion(XMLGregorianCalendar value) {
        this.fechaActivacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacion(XMLGregorianCalendar value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionOperador() {
        return identificacionOperador;
    }

    /**
     * Define el valor de la propiedad identificacionOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionOperador(String value) {
        this.identificacionOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOperador() {
        return nombreOperador;
    }

    /**
     * Define el valor de la propiedad nombreOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOperador(String value) {
        this.nombreOperador = value;
    }

    /**
     * Gets the value of the suscripcionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suscripcionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuscripcionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuscripcionDto }
     * 
     * 
     */
    public List<SuscripcionDto> getSuscripcionList() {
        if (suscripcionList == null) {
            suscripcionList = new ArrayList<SuscripcionDto>();
        }
        return this.suscripcionList;
    }

}
