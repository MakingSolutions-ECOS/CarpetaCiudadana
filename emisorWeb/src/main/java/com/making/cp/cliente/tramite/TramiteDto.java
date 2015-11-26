
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tramiteDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tramiteDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCiudadano" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" minOccurs="0"/>
 *         &lt;element name="codigoTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoTramiteDefinicion" type="{http://services.ecos.edu.uniandes.co/}tramiteDefinicionDto" minOccurs="0"/>
 *         &lt;element name="codigoTramiteEstado" type="{http://services.ecos.edu.uniandes.co/}tramiteEstadoDto" minOccurs="0"/>
 *         &lt;element name="codigoTramiteOperador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tramiteActividadList" type="{http://services.ecos.edu.uniandes.co/}tramiteActividadDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tramiteDto", propOrder = {
    "codigoCiudadano",
    "codigoTramite",
    "codigoTramiteDefinicion",
    "codigoTramiteEstado",
    "codigoTramiteOperador",
    "tramiteActividadList"
})
public class TramiteDto {

    protected CiudadanoDto codigoCiudadano;
    protected Integer codigoTramite;
    protected TramiteDefinicionDto codigoTramiteDefinicion;
    protected TramiteEstadoDto codigoTramiteEstado;
    protected Integer codigoTramiteOperador;
    @XmlElement(nillable = true)
    protected List<TramiteActividadDto> tramiteActividadList;

    /**
     * Obtiene el valor de la propiedad codigoCiudadano.
     * 
     * @return
     *     possible object is
     *     {@link CiudadanoDto }
     *     
     */
    public CiudadanoDto getCodigoCiudadano() {
        return codigoCiudadano;
    }

    /**
     * Define el valor de la propiedad codigoCiudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadanoDto }
     *     
     */
    public void setCodigoCiudadano(CiudadanoDto value) {
        this.codigoCiudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramite() {
        return codigoTramite;
    }

    /**
     * Define el valor de la propiedad codigoTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramite(Integer value) {
        this.codigoTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @return
     *     possible object is
     *     {@link TramiteDefinicionDto }
     *     
     */
    public TramiteDefinicionDto getCodigoTramiteDefinicion() {
        return codigoTramiteDefinicion;
    }

    /**
     * Define el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteDefinicionDto }
     *     
     */
    public void setCodigoTramiteDefinicion(TramiteDefinicionDto value) {
        this.codigoTramiteDefinicion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteEstado.
     * 
     * @return
     *     possible object is
     *     {@link TramiteEstadoDto }
     *     
     */
    public TramiteEstadoDto getCodigoTramiteEstado() {
        return codigoTramiteEstado;
    }

    /**
     * Define el valor de la propiedad codigoTramiteEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteEstadoDto }
     *     
     */
    public void setCodigoTramiteEstado(TramiteEstadoDto value) {
        this.codigoTramiteEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteOperador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramiteOperador() {
        return codigoTramiteOperador;
    }

    /**
     * Define el valor de la propiedad codigoTramiteOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramiteOperador(Integer value) {
        this.codigoTramiteOperador = value;
    }

    /**
     * Gets the value of the tramiteActividadList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tramiteActividadList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTramiteActividadList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TramiteActividadDto }
     * 
     * 
     */
    public List<TramiteActividadDto> getTramiteActividadList() {
        if (tramiteActividadList == null) {
            tramiteActividadList = new ArrayList<TramiteActividadDto>();
        }
        return this.tramiteActividadList;
    }

}
