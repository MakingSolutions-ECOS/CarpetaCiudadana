
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nacionalidadDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nacionalidadDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoList" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoNacionalidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreNacionaliad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nacionalidadDto", propOrder = {
    "ciudadanoList",
    "codigoNacionalidad",
    "nombreNacionaliad"
})
public class NacionalidadDto {

    @XmlElement(nillable = true)
    protected List<CiudadanoDto> ciudadanoList;
    protected Integer codigoNacionalidad;
    protected String nombreNacionaliad;

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
     * Obtiene el valor de la propiedad codigoNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoNacionalidad() {
        return codigoNacionalidad;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoNacionalidad(Integer value) {
        this.codigoNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreNacionaliad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreNacionaliad() {
        return nombreNacionaliad;
    }

    /**
     * Define el valor de la propiedad nombreNacionaliad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreNacionaliad(String value) {
        this.nombreNacionaliad = value;
    }

}
