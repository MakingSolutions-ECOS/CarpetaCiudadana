
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emisorDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emisorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tramiteDefinicionList" type="{http://services.ecos.edu.uniandes.co/}tramiteDefinicionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emisorDto", propOrder = {
    "codigoEntidadEmisora",
    "nombreEntidadEmisora",
    "tramiteDefinicionList"
})
public class EmisorDto {

    protected Integer codigoEntidadEmisora;
    protected String nombreEntidadEmisora;
    @XmlElement(nillable = true)
    protected List<TramiteDefinicionDto> tramiteDefinicionList;

    /**
     * Obtiene el valor de la propiedad codigoEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoEntidadEmisora() {
        return codigoEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad codigoEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoEntidadEmisora(Integer value) {
        this.codigoEntidadEmisora = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidadEmisora() {
        return nombreEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad nombreEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidadEmisora(String value) {
        this.nombreEntidadEmisora = value;
    }

    /**
     * Gets the value of the tramiteDefinicionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tramiteDefinicionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTramiteDefinicionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TramiteDefinicionDto }
     * 
     * 
     */
    public List<TramiteDefinicionDto> getTramiteDefinicionList() {
        if (tramiteDefinicionList == null) {
            tramiteDefinicionList = new ArrayList<TramiteDefinicionDto>();
        }
        return this.tramiteDefinicionList;
    }

}
