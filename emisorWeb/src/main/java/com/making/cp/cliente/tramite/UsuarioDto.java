
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarioDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRol" type="{http://services.ecos.edu.uniandes.co/}rolDto" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://services.ecos.edu.uniandes.co/}tipoIdentificacionDto" minOccurs="0"/>
 *         &lt;element name="codigoUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeroApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioDto", propOrder = {
    "codigoRol",
    "codigoTipoIdentificacion",
    "codigoUsuario",
    "correoUsuario",
    "identificacionUsuario",
    "primerNombreUsuario",
    "primeroApellidoUsuario",
    "segundoApellidoUsuario",
    "segundoNombreUsuario"
})
public class UsuarioDto {

    protected RolDto codigoRol;
    protected TipoIdentificacionDto codigoTipoIdentificacion;
    protected Integer codigoUsuario;
    protected String correoUsuario;
    protected String identificacionUsuario;
    protected String primerNombreUsuario;
    protected String primeroApellidoUsuario;
    protected String segundoApellidoUsuario;
    protected String segundoNombreUsuario;

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
     * Obtiene el valor de la propiedad codigoTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionDto }
     *     
     */
    public TipoIdentificacionDto getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionDto }
     *     
     */
    public void setCodigoTipoIdentificacion(TipoIdentificacionDto value) {
        this.codigoTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Define el valor de la propiedad codigoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoUsuario(Integer value) {
        this.codigoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    /**
     * Define el valor de la propiedad correoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoUsuario(String value) {
        this.correoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    /**
     * Define el valor de la propiedad identificacionUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionUsuario(String value) {
        this.identificacionUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreUsuario() {
        return primerNombreUsuario;
    }

    /**
     * Define el valor de la propiedad primerNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreUsuario(String value) {
        this.primerNombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad primeroApellidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeroApellidoUsuario() {
        return primeroApellidoUsuario;
    }

    /**
     * Define el valor de la propiedad primeroApellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeroApellidoUsuario(String value) {
        this.primeroApellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoUsuario() {
        return segundoApellidoUsuario;
    }

    /**
     * Define el valor de la propiedad segundoApellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoUsuario(String value) {
        this.segundoApellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombreUsuario() {
        return segundoNombreUsuario;
    }

    /**
     * Define el valor de la propiedad segundoNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombreUsuario(String value) {
        this.segundoNombreUsuario = value;
    }

}
