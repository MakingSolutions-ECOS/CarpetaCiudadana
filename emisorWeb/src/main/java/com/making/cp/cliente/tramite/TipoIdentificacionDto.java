
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoIdentificacionDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoList" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tipoIdentificacionDto", propOrder = {
    "ciudadanoList",
    "codigoTipoIdentificacion",
    "nombreTipoIdentificacion",
    "usuarioList"
})
public class TipoIdentificacionDto {

    @XmlElement(nillable = true)
    protected List<CiudadanoDto> ciudadanoList;
    protected Integer codigoTipoIdentificacion;
    protected String nombreTipoIdentificacion;
    @XmlElement(nillable = true)
    protected List<UsuarioDto> usuarioList;

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
     * Obtiene el valor de la propiedad codigoTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTipoIdentificacion(Integer value) {
        this.codigoTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTipoIdentificacion() {
        return nombreTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad nombreTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTipoIdentificacion(String value) {
        this.nombreTipoIdentificacion = value;
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
