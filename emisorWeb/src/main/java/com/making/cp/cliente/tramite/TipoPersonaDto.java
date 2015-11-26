
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoPersonaDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoPersonaDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoList" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoTipoPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreTipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPersonaDto", propOrder = {
    "ciudadanoList",
    "codigoTipoPersona",
    "nombreTipoPersona"
})
public class TipoPersonaDto {

    @XmlElement(nillable = true)
    protected List<CiudadanoDto> ciudadanoList;
    protected Integer codigoTipoPersona;
    protected String nombreTipoPersona;

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
     * Obtiene el valor de la propiedad codigoTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTipoPersona() {
        return codigoTipoPersona;
    }

    /**
     * Define el valor de la propiedad codigoTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTipoPersona(Integer value) {
        this.codigoTipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTipoPersona() {
        return nombreTipoPersona;
    }

    /**
     * Define el valor de la propiedad nombreTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTipoPersona(String value) {
        this.nombreTipoPersona = value;
    }

}
