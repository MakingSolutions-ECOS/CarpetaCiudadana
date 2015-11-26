
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitudTramiteDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudTramiteDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadano" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" minOccurs="0"/>
 *         &lt;element name="tramiteDto" type="{http://services.ecos.edu.uniandes.co/}tramiteDto" minOccurs="0"/>
 *         &lt;element name="urlGetArchivoRepo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudTramiteDto", propOrder = {
    "ciudadano",
    "tramiteDto",
    "urlGetArchivoRepo"
})
public class SolicitudTramiteDto {

    protected CiudadanoDto ciudadano;
    protected TramiteDto tramiteDto;
    protected String urlGetArchivoRepo;

    /**
     * Obtiene el valor de la propiedad ciudadano.
     * 
     * @return
     *     possible object is
     *     {@link CiudadanoDto }
     *     
     */
    public CiudadanoDto getCiudadano() {
        return ciudadano;
    }

    /**
     * Define el valor de la propiedad ciudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadanoDto }
     *     
     */
    public void setCiudadano(CiudadanoDto value) {
        this.ciudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad tramiteDto.
     * 
     * @return
     *     possible object is
     *     {@link TramiteDto }
     *     
     */
    public TramiteDto getTramiteDto() {
        return tramiteDto;
    }

    /**
     * Define el valor de la propiedad tramiteDto.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteDto }
     *     
     */
    public void setTramiteDto(TramiteDto value) {
        this.tramiteDto = value;
    }

    /**
     * Obtiene el valor de la propiedad urlGetArchivoRepo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlGetArchivoRepo() {
        return urlGetArchivoRepo;
    }

    /**
     * Define el valor de la propiedad urlGetArchivoRepo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlGetArchivoRepo(String value) {
        this.urlGetArchivoRepo = value;
    }

}
