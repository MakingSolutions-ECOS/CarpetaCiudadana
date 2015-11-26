
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para categoriasTramiteDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="categoriasTramiteDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCategoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "categoriasTramiteDto", propOrder = {
    "codigoCategoria",
    "nombreCategoria",
    "tramiteDefinicionList"
})
public class CategoriasTramiteDto {

    protected Integer codigoCategoria;
    protected String nombreCategoria;
    @XmlElement(nillable = true)
    protected List<TramiteDefinicionDto> tramiteDefinicionList;

    /**
     * Obtiene el valor de la propiedad codigoCategoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCategoria() {
        return codigoCategoria;
    }

    /**
     * Define el valor de la propiedad codigoCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCategoria(Integer value) {
        this.codigoCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Define el valor de la propiedad nombreCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCategoria(String value) {
        this.nombreCategoria = value;
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
