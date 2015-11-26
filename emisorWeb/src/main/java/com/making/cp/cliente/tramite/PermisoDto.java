
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para permisoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="permisoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPermiso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombrePermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rolPermisoList" type="{http://services.ecos.edu.uniandes.co/}rolPermisoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zonaPermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permisoDto", propOrder = {
    "codigoPermiso",
    "nombrePermiso",
    "rolPermisoList",
    "zonaPermiso"
})
public class PermisoDto {

    protected Integer codigoPermiso;
    protected String nombrePermiso;
    @XmlElement(nillable = true)
    protected List<RolPermisoDto> rolPermisoList;
    protected String zonaPermiso;

    /**
     * Obtiene el valor de la propiedad codigoPermiso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoPermiso() {
        return codigoPermiso;
    }

    /**
     * Define el valor de la propiedad codigoPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoPermiso(Integer value) {
        this.codigoPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePermiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePermiso() {
        return nombrePermiso;
    }

    /**
     * Define el valor de la propiedad nombrePermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePermiso(String value) {
        this.nombrePermiso = value;
    }

    /**
     * Gets the value of the rolPermisoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolPermisoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolPermisoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolPermisoDto }
     * 
     * 
     */
    public List<RolPermisoDto> getRolPermisoList() {
        if (rolPermisoList == null) {
            rolPermisoList = new ArrayList<RolPermisoDto>();
        }
        return this.rolPermisoList;
    }

    /**
     * Obtiene el valor de la propiedad zonaPermiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaPermiso() {
        return zonaPermiso;
    }

    /**
     * Define el valor de la propiedad zonaPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaPermiso(String value) {
        this.zonaPermiso = value;
    }

}
