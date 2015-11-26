
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ciudadanoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ciudadanoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCiudadano" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoMunicipio" type="{http://services.ecos.edu.uniandes.co/}municipioDto" minOccurs="0"/>
 *         &lt;element name="codigoNacionalidad" type="{http://services.ecos.edu.uniandes.co/}nacionalidadDto" minOccurs="0"/>
 *         &lt;element name="codigoOperador" type="{http://services.ecos.edu.uniandes.co/}operadorDto" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://services.ecos.edu.uniandes.co/}tipoIdentificacionDto" minOccurs="0"/>
 *         &lt;element name="codigoTipoPersona" type="{http://services.ecos.edu.uniandes.co/}tipoPersonaDto" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicionIdentificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="habilitadoCiudadano" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoFijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ciudadanoDto", propOrder = {
    "celular",
    "codigoCiudadano",
    "codigoMunicipio",
    "codigoNacionalidad",
    "codigoOperador",
    "codigoTipoIdentificacion",
    "codigoTipoPersona",
    "correo",
    "direccion",
    "fechaExpedicionIdentificacion",
    "habilitadoCiudadano",
    "identificacion",
    "primerApellido",
    "primerNombre",
    "segundoApellido",
    "segundoNombre",
    "telefonoFijo",
    "tramiteList"
})
public class CiudadanoDto {

    protected String celular;
    protected Integer codigoCiudadano;
    protected MunicipioDto codigoMunicipio;
    protected NacionalidadDto codigoNacionalidad;
    protected OperadorDto codigoOperador;
    protected TipoIdentificacionDto codigoTipoIdentificacion;
    protected TipoPersonaDto codigoTipoPersona;
    protected String correo;
    protected String direccion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExpedicionIdentificacion;
    protected short habilitadoCiudadano;
    protected String identificacion;
    protected String primerApellido;
    protected String primerNombre;
    protected String segundoApellido;
    protected String segundoNombre;
    protected String telefonoFijo;
    @XmlElement(nillable = true)
    protected List<TramiteDto> tramiteList;

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCiudadano.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCiudadano() {
        return codigoCiudadano;
    }

    /**
     * Define el valor de la propiedad codigoCiudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCiudadano(Integer value) {
        this.codigoCiudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioDto }
     *     
     */
    public MunicipioDto getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define el valor de la propiedad codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioDto }
     *     
     */
    public void setCodigoMunicipio(MunicipioDto value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link NacionalidadDto }
     *     
     */
    public NacionalidadDto getCodigoNacionalidad() {
        return codigoNacionalidad;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link NacionalidadDto }
     *     
     */
    public void setCodigoNacionalidad(NacionalidadDto value) {
        this.codigoNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOperador.
     * 
     * @return
     *     possible object is
     *     {@link OperadorDto }
     *     
     */
    public OperadorDto getCodigoOperador() {
        return codigoOperador;
    }

    /**
     * Define el valor de la propiedad codigoOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadorDto }
     *     
     */
    public void setCodigoOperador(OperadorDto value) {
        this.codigoOperador = value;
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
     * Obtiene el valor de la propiedad codigoTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link TipoPersonaDto }
     *     
     */
    public TipoPersonaDto getCodigoTipoPersona() {
        return codigoTipoPersona;
    }

    /**
     * Define el valor de la propiedad codigoTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPersonaDto }
     *     
     */
    public void setCodigoTipoPersona(TipoPersonaDto value) {
        this.codigoTipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpedicionIdentificacion() {
        return fechaExpedicionIdentificacion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpedicionIdentificacion(XMLGregorianCalendar value) {
        this.fechaExpedicionIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitadoCiudadano.
     * 
     */
    public short getHabilitadoCiudadano() {
        return habilitadoCiudadano;
    }

    /**
     * Define el valor de la propiedad habilitadoCiudadano.
     * 
     */
    public void setHabilitadoCiudadano(short value) {
        this.habilitadoCiudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoFijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     * Define el valor de la propiedad telefonoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoFijo(String value) {
        this.telefonoFijo = value;
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
