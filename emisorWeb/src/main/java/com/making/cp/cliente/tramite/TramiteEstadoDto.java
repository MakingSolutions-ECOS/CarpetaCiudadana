
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tramiteEstadoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tramiteEstadoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTramiteEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreTramiteEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tramiteList" type="{http://services.ecos.edu.uniandes.co/}tramiteDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tramiteEstadoDto", propOrder = {
    "codigoTramiteEstado",
    "nombreTramiteEstado",
    "tramiteList"
})
public class TramiteEstadoDto {

    protected Integer codigoTramiteEstado;
    protected String nombreTramiteEstado;
    @XmlElement(nillable = true)
    protected List<TramiteDto> tramiteList;

    /**
     * Obtiene el valor de la propiedad codigoTramiteEstado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramiteEstado() {
        return codigoTramiteEstado;
    }

    /**
     * Define el valor de la propiedad codigoTramiteEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramiteEstado(Integer value) {
        this.codigoTramiteEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTramiteEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTramiteEstado() {
        return nombreTramiteEstado;
    }

    /**
     * Define el valor de la propiedad nombreTramiteEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTramiteEstado(String value) {
        this.nombreTramiteEstado = value;
    }

    /**
     * Gets the value of the tramiteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tramiteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTramiteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TramiteDto }
     * 
     * 
     */
    public List<TramiteDto> getTramiteList() {
        if (tramiteList == null) {
            tramiteList = new ArrayList<TramiteDto>();
        }
        return this.tramiteList;
    }

}
