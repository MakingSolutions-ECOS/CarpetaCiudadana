
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolPermisoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolPermisoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPermiso" type="{http://services.ecos.edu.uniandes.co/}permisoDto" minOccurs="0"/>
 *         &lt;element name="codigoRol" type="{http://services.ecos.edu.uniandes.co/}rolDto" minOccurs="0"/>
 *         &lt;element name="codigoRolPermiso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolPermisoDto", propOrder = {
    "codigoPermiso",
    "codigoRol",
    "codigoRolPermiso"
})
public class RolPermisoDto {

    protected PermisoDto codigoPermiso;
    protected RolDto codigoRol;
    protected Integer codigoRolPermiso;

    /**
     * Obtiene el valor de la propiedad codigoPermiso.
     * 
     * @return
     *     possible object is
     *     {@link PermisoDto }
     *     
     */
    public PermisoDto getCodigoPermiso() {
        return codigoPermiso;
    }

    /**
     * Define el valor de la propiedad codigoPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link PermisoDto }
     *     
     */
    public void setCodigoPermiso(PermisoDto value) {
        this.codigoPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRol.
     * 
     * @return
     *     possible object is
     *     {@link RolDto }
     *     
     */
    public RolDto getCodigoRol() {
        return codigoRol;
    }

    /**
     * Define el valor de la propiedad codigoRol.
     * 
     * @param value
     *     allowed object is
     *     {@link RolDto }
     *     
     */
    public void setCodigoRol(RolDto value) {
        this.codigoRol = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRolPermiso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoRolPermiso() {
        return codigoRolPermiso;
    }

    /**
     * Define el valor de la propiedad codigoRolPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoRolPermiso(Integer value) {
        this.codigoRolPermiso = value;
    }

}
