
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rolPermisoList" type="{http://services.ecos.edu.uniandes.co/}rolPermisoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usuarioList" type="{http://services.ecos.edu.uniandes.co/}usuarioDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolDto", propOrder = {
    "codigoRol",
    "nombreRol",
    "rolPermisoList",
    "usuarioList"
})
public class RolDto {

    protected Integer codigoRol;
    protected String nombreRol;
    @XmlElement(nillable = true)
    protected List<RolPermisoDto> rolPermisoList;
    @XmlElement(nillable = true)
    protected List<UsuarioDto> usuarioList;

    /**
     * Obtiene el valor de la propiedad codigoRol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoRol() {
        return codigoRol;
    }

    /**
     * Define el valor de la propiedad codigoRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoRol(Integer value) {
        this.codigoRol = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * Define el valor de la propiedad nombreRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRol(String value) {
        this.nombreRol = value;
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
     * Gets the value of the usuarioList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarioList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarioList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioDto }
     * 
     * 
     */
    public List<UsuarioDto> getUsuarioList() {
        if (usuarioList == null) {
            usuarioList = new ArrayList<UsuarioDto>();
        }
        return this.usuarioList;
    }

}
